 interface Phone1 {
    void call();
    //    public abstract void call();
    String country = "india";
//    public static final String country;
}

interface SmartPhone {
    void message();
    void internet();
    void videoPlay();
    void audioPlay();
}
// multiple inheritance
interface MyPhone extends Phone1,SmartPhone {
  void playGame();
}
