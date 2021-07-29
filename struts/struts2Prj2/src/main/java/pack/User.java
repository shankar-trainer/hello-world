package pack;

import com.opensymphony.xwork2.ActionSupport;

public class User extends ActionSupport {
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String target = ERROR;

	@Override
	public String execute() throws Exception {
		if (id == 0 )
			addFieldError("id", getText("id.required"));
		else if (name.equals(""))
			addFieldError("name", getText("name.required"));

		else
			target = SUCCESS;
		return target;

	}

}
