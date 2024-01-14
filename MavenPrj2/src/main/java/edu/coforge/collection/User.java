package edu.coforge.collection;

import java.util.Objects;

public class User {

	private int id;
	private  String name;
//	
//	@Override
//	public boolean equals(Object obj) {
//	  User user=(User) obj;
//	  if(user instanceof User) {
//		  if((user.id==this.id) &&(user.name==this.name)) {
//			  return true;
//		  }
//	  }
//		return false;
//	}
	
	
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
	
	
}
