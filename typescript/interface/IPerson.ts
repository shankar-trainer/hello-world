interface Iperson{
  fname:string;
  lname:string;
  info():string;
}

var person:Iperson={
  fname:'mohan',
  lname:"kumar",
  info():string{
     return "hello world";
  }
}

class MyPerson implements Iperson
{
  fname:string;
  lname:string;
  age:number;
  constructor(fname:string,lname:string,age:number){
       this.fname='suresh';
       this.lname='sarkar';
       this.age=20;
  }

  info():string{
     return "hello world...";
  }
}

var myp=new MyPerson('ram','kumar',30);
myp.info();
console.log(myp.info());
console.log('myperson fname '+myp.fname)
console.log('my person lname '+myp.lname)

console.log(person.fname);
console.log(person.lname);
console.log(person.info());
