class User{
    constructor(id,name,age){
        this.id=id;
        this.name=name; 
        this.age=age;
    }

    getUserInfo(){
       console.log(`id is ${this.id}`);
       console.log('name is '+this.name);
       console.log('age is '+this.age);
   }
}
user=new User(1001,"parkash partap",67);
console.log("id is "+user.id)
user.getUserInfo();

class Manager  extends User{
    constructor(location, state, id,name,age){
        super(id,name,age);
        this.location=location;
        this.state=state;
    }
    getUserInfo(){
     super.getUserInfo();
     console.log('\tlocation '+this.location);
     console.log('\tstate '+this.state);
    }
}
manager=new Manager('new delhi','delhi',9001,'pankaj kumar',33);
console.log('\nmanager data \n')
manager.getUserInfo();
