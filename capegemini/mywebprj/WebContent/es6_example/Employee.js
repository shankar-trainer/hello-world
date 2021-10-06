class Employee{
    constructor(id,name,salary){
        this.id=id;
        this.name=name;
        this.salary=salary
    }
    show(){
      console.log(`id is ${this.id}`)
      console.log('name is ' +this.name)
      console.log(`salary is ${this.salary}`)
    }
}
class Manager extends Employee{
    constructor(id,name,salary,location,city){
        super(id,name,salary);
        this.location=location;
        this.city=city;
    }
    show(){
        console.log('manager detail')
        super.show();
      console.log('location '+this.location)
      console.log('city is ' +this.city)
    }
}

emp=new Employee(1001,'ram kumar', 35000)
emp.show()
manager=new Manager(1009,'suresh kumar',79000,'laxminagar','delhi')
manager.show();