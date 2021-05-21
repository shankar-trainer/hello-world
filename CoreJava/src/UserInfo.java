
public class UserInfo {

	private int userId;
	private  String userName;
	private  final String country="india";
	
	@Override
	public String toString() {
		return "UserInfo [userId=" + userId + ", userName=" + userName + ", country=" + country + "]";
	}

	public static void main(String[] args) {
		UserInfo info=new UserInfo();
		info.userName="a kumar";
		info.userId=878778;
		//info.country="";

		System.out.println(info);
	}
}
