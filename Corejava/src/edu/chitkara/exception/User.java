package edu.chitkara.exception;
       // java beans -- encapsulation -- bind code(method)+data(attribute) together
public class User {
    private int id;
    private String name;
    
    public void setId(int id) {
		if(id<=0)
			throw new RuntimeException("invalid id");
			
    	this.id = id;
	}
    public int getId() {
		return id;
	}
    
    public String getName() {
		return name;
	}
    public void setName(String name) {
		if(name.length()<=5)
			throw new  RuntimeException("invalid  name");
    	this.name = name;
	}
     
}
