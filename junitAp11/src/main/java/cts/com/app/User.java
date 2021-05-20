package cts.com.app;

public class User {

	private int userId;
	private String fname;
	private String lname;

	public User(int userId, String fname, String lname) {
		super();
		this.userId = userId;
		this.fname = fname;
		this.lname = lname;
	}

	public int getUserId() {
		return userId;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		result = prime * result + userId;
		return result;
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
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (lname == null) {
			if (other.lname != null)
				return false;
		} else if (!lname.equals(other.lname))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
*/
	
}
