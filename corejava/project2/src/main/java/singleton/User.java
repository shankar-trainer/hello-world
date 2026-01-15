package singleton;

public class User {
    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                '}';
    }

    private User(){}
    private static User user;
    public static User getUser(){
        if(user==null)
            user=new User();
        return user;
    }
    private int userId;
    private  String  userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

/*

Singleton pattern
it will allow to share single object everywhere

singleton connection

 */
