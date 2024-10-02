//var mysql=require('mysql');
import mysql from 'mysql';
//var express=require('express')
const connection=mysql.createConnection(
    {
        host:'localhost',
        user:'root',
        password:'mysql',
        database:'coforge'
    }
);
connection.connect((err)=>{
    if(err)
       throw err;   
});  

export default connection;