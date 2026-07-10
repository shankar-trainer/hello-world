record User(int id, String name, float salary){
}
// record is final class
// all fields are final
// generate constructor , tostring , getter,  equals n hashcode

class UserTest{

    public static void main(String[] args) {
//        User user=new User(10001,"ram kumar",20000);
        var user=new User(10001,"ram kumar",20000);
//        User user1=new User(10001,"ram kumar",20000);
        var user1=new User(10001,"ram kumar",20000);
        System.out.println(user);
        System.out.println(user.id()+", name "+user.name()+" salary "+user.salary());

        System.out.println(user.equals(user1));
    }
}



