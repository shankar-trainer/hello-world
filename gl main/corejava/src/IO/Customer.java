package IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

public class Customer implements Externalizable{
	private transient int pid;
	private String pname;
	private String address;
	static  String country="India";
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int pid, String pname, String address) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.address = address;
	}

	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
	    char pname1[]=pname.toCharArray();
	    char pname2[]=new  char[pname1.length];
	    
	      for (int i = 0; i < pname1.length; i++) {
	    	  char c=pname1[i];
	    	  int p=c;
	    	  p=p+4;
	    	  
	    	  c=(char)p;
	    	  pname2[i]=(char)c;
		}
		out.writeUTF(pname2.toString());
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		
	String 	s=in.readUTF();
	char pname1[]=s.toCharArray();
    char pname2[]=new  char[pname1.length];
	
	for (int i = 0; i < s.length(); i++) {
  	  int c=pname1[i];
  	  c=c-4;
  	  pname2[i]=(char)c;
	}
	pname=pname2.toString();
		
	}
	
}




