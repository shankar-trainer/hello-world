old mongodb  before 4
mongod.exe --storageEngine=mmapv1
then another shell 
 mongo.exe
 
mkdir e:\data\db

from 4 
mkdir e:\data\db

mongod.exe

then mongo.exe or mongoshell (better)

MMAPV1: This is the original storage engine for MongoDB, introduced in the first release, but from version 4.0 it is deprecated. 


Database

	Database is a physical container for collections. Each database gets its own set of files on
	the file system. A single MongoDB server typically has multiple databases.

Collection

	Collection is a group of MongoDB documents. It is the equivalent of an RDBMS table. 
	A collection exists within a single database. 
	Collections do not enforce a schema. 
	Documents within a collection can have different fields. 
	Typically, all documents in a collection are of	similar or related purpose.

Document

	A document is a set of key-value pairs. Documents have dynamic schema. Dynamic
	schema means that documents in the same collection do not need to have the same set
	of fields or structure, and common fields in a collection's documents may hold different
	types of data


	RDBMS 				MongoDB
	Database 			Database
	Table 				Collection
	Tuple/Row 			Document
	column 				Field
	Table Join 			Embedded Documents
	Primary Key			Primary Key (Default key _id provided by
						  mongodb itself)

	Database Server 	and Client
	Mysqld/Oracle 				mongod
	mysql/sqlplus 				mongo

https://fastdl.mongodb.org/win32/mongodb-win32-x86_64-2008plus-ssl-4.0.5.zip

D:\app\mongodb-win32-x86_64-2008plus-ssl-4.0.5\mongodb-win32-x86_64-2008plus-ssl-4.0.5\bin>

md  c:\data\db

D:\app\mongodb-win32-x86_64-2008plus-ssl-4.0.5\mongodb-win32-x86_64-2008plus-ssl-4.0.5\bin>mongod.exe -dbpath c:\data\db

D:\app\mongodb-win32-x86_64-2008plus-ssl-4.0.5\mongodb-win32-x86_64-2008plus-ssl-4.0.5\bin>mongo.exe
install MongoDB driver for nodejs
npm install mongodb -g
npm link mongodb
----------------------------------------------------------
D:\app
 use DATABASE_NAME is used to create database
> use mydb
	switched to db mydb
To check your currently selected database, use the command db

> db      -- show current database 
mydb
databases list, use the command show dbs.

> show dbs -- show all database 
> db.stud.insert({"id":1001,"name":"ram kumar"});
 db.stud.find()

=== to list all tables 
db.getCollectionNames() or show collections

db.dropDatabase() -- drop current database 
db.COLLECTION_NAME.drop() -- drop collection

-------------------------------------------------------------

Your created database (mydb) is not present in list. To display database, you need to
insert at least one document into it.
>db.movie.insert({"name":"tutorials point"})
>show dbs
local 0.78125GB
mydb 0.23012GB
test 0.23012GB

The dropDatabase() Method
	MongoDB db.dropDatabase() command is used to drop a existing database.
	
	Syntax
	Basic syntax of dropDatabase() command is as follows:
	db.dropDatabase()
	
	This will delete the selected database. If you have not selected any database, then it will
	delete default 'test' database.

_id field is reserved for primary key in mongodb, and that should be a unique value. If you don't set anything to _id it will automatically fill it with "MongoDB Id Object". But you can put any unique info into that field.
The other way is to create Indexes for your collection and make sure that they are unique.

A unique index ensures that the indexed fields do not store duplicate values; i.e. enforces uniqueness for the indexed fields. By default, MongoDB creates a unique index on the _id field during the creation of a collection

Create a Unique Index
To create a unique index, use the db.collection.createIndex() method with the unique option set to true.

db.collection.createIndex( <key and index type specification>, { unique: true } )
Unique Index on a Single Field
For example, to create a unique index on the user_id field of the members collection, use the following operation in the mongo shell:

db.members.createIndex( { "user_id": 1 }, { unique: true } )
Unique Compound Index

You can also enforce a unique constraint on compound indexes. If you use the unique constraint on a 
compound index, then MongoDB will enforce uniqueness on the combination of the index key values.

For example, to create a unique index on groupNumber, lastname, and firstname fields of the members collection, use the following operation in the mongo shell:

db.members.createIndex( { groupNumber: 1, lastname: 1, firstname: 1 }, { unique: true } )
The created index enforces uniqueness for the combination of groupNumber, lastname, and firstname values.

For another example, consider a collection with the following document:

{ _id: 1, a: [ { loc: "A", qty: 5 }, { qty: 10 } ] }
Create a unique compound multikey index on a.loc and a.qty:

db.collection.createIndex( { "a.loc": 1, "a.qty": 1 }, { unique: true } )
The unique index permits the insertion of the following documents into the collection since the index enforces uniqueness for the combination of a.loc and a.qty values:

db.collection.insert( { _id: 2, a: [ { loc: "A" }, { qty: 5 } ] } )
db.collection.insert( { _id: 3, a: [ { loc: "A", qty: 10 } ] } )



-------------------------------------------
One-to-One Relationship
db.artists.insert(
    {
        _id : 2,
        artistname : "Prince",
        address :   {
                        street : "Audubon Road",
                        city : "Chanhassen",
                        state : "Minnesota",
                        country : "United States"
                    }
    }
)
One-to-Many Relationship
db.artists.insert(
    {
        _id : 3,
        artistname : "Moby",
        albums : [
                    {
                        album : "Play",
                        year : 1999,
                        genre : "Electronica"
                    }, 
                    {
                        album : "Long Ambients 1: Calm. Sleep.",
                        year : 2016,
                        genre : "Ambient"
                    }
                ]
    }
)

Document Referenced Relationships

You can use a document reference to create a relationship. Rather than embedding the child document into the parent document (like we did above), you separate the child document out into to its own stand alone document.

So we could do this:

Parent Document
db.artists.insert(
    {
        _id : 4,
        artistname : "Rush"
    }
)
Child Documents
We'll insert 3 child documents — one for each band member:

db.musicians.insert(
    {
        _id : 9,
        name : "Geddy Lee",
        instrument : [ "Bass", "Vocals", "Keyboards" ],
        artist_id : 4
    }
)
db.musicians.insert(
    {
        _id : 10,
        name : "Alex Lifeson",
        instrument : [ "Guitar", "Backing Vocals" ],
        artist_id : 4
    }
)
db.musicians.insert(
    {
        _id : 11,
        name : "Neil Peart",
        instrument : "Drums",
        artist_id : 4
    }
)
Querying the Relationship
After inserting the above two documents, you can use $lookup to perform a left outer join on the two collections.

This, in conjunction with the aggregate() method, and $match to specify the specific artist you're interested in, will return parent and child documents in one.

db.artists.aggregate([
    {
      $lookup:
        {
          from: "musicians",
          localField: "_id",
          foreignField: "artist_id",
          as: "band_members"
        }
   },
   { $match : { artistname : "Rush" } }
]).pretty()
Result:

{
	"_id" : 4,
	"artistname" : "Rush",
	"band_members" : [
		{
			"_id" : 9,
			"name" : "Geddy Lee",
			"instrument" : [
				"Bass",
				"Vocals",
				"Keyboards"
			],
			"artist_id" : 4
		},
		{
			"_id" : 10,
			"name" : "Alex Lifeson",
			"instrument" : [
				"Guitar",
				"Backing Vocals"
			],
			"artist_id" : 4
		},
		{
			"_id" : 11,
			"name" : "Neil Peart",
			"instrument" : "Drums",
			"artist_id" : 4
		}
	]
}
You can see that the first two fields are from the artists collection, and the rest of it is from the musicians collection.

So if you only query the artists collection by itself:

db.artists.find( { artistname : "Rush" } )
You'd only get this:

{ "_id" : 4, "artistname" : "Rush" }
No related data is returned.

When to use Embedded Documents vs Referenced Documents
Both methods of creating relationships have their pros and cons. There are times you might use embedded documents, and other times you'll use referenced documents.

When to use Embedded Relationships
One of the main benefits of using the embedded relationship method is performance. When the relationship is embedded within the document, queries will run faster than if they were spread out over multiple documents. MongoDB only needs to return the one document, rather than joining multiple documents in order to retrieve the relationships. This can provide a major performance boost — especially when working with lots of data.

Embedded relationships also make queries easier to write. Rather than writing complex queries that join many documents via their unique identifier, you can return all related data within a single query.

When to use Referenced Relationships
For data that needs to be repeated across many documents, it can be helpful to have them in their own separate document. This can reduce errors and help in keeping the data consistent (while bearing in mind that multiple-document updates are not atomic).

Using the above example, one musician could be a member (or ex-member) of many bands. Some might also produce albums for other artists, teach students, run clinics, etc. Also, a lot of data could be stored against each musician. So having a separate document for each musician makes sense in this case.

------------------------------------------------------ 
remove all 
The argument to remove() is a filter document, so passing in an empty document means 'remove all':

db.user.remove({})
==========================   problem in 3.0 vers
current 4.0

 npm uninstall mongodb --save
 npm install mongodb@2.2.33 --save
================================= 
var MongoClient = require('mongodb').MongoClient;  
var url = "mongodb://localhost:27017/MongoDatabase";  
MongoClient.connect(url, function(err, db) {  
if (err) throw err;  
console.log("Database created!");  
db.close();  
});  
-----------------------------------------
var MongoClient = require('mongodb').MongoClient;  
var url = "mongodb://localhost:27017/MongoDatabase";  
MongoClient.connect(url, function(err, db) {  
if (err) throw err;  
db.createCollection("employees", function(err, res) {  
if (err) throw err;  
console.log("Collection is created!");  
db.close();  
});  
});  
-----------------------------------
var MongoClient = require('mongodb').MongoClient;  
var url = "mongodb://localhost:27017/MongoDatabase";  
MongoClient.connect(url, function(err, db) {  
if (err) throw err;  
var myobj = { name: "Ajeet Kumar", age: "28", address: "Delhi" };  
db.collection("employees").insertOne(myobj, function(err, res) {  
if (err) throw err;  
console.log("1 record inserted");  
db.close();  
});  
});  
----------------------------------
> db
MongoDatabase
> db.employees.find()

==================================
for installer 
Start the MongoDB service.
net start MongoDB

Stop or remove the MongoDB service as needed.
To stop the MongoDB service use the following command:

net stop MongoDB
