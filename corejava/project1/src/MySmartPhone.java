class MySmartPhone implements Phone1, SmartPhone,MyPhone{

    @Override
    public void playGame() {
        System.out.println("can play game");
    }

    @Override
    public void call() {
        System.out.println("can call");
    }

    @Override
    public void message() {
        System.out.println("can message");
    }

    @Override
    public void internet() {
        System.out.println("use internet");
    }

    @Override
    public void videoPlay() {
        System.out.println("can play video ");
    }

    @Override
    public void audioPlay() {
        System.out.println("can play audio ");
    }

    public static void main(String[] args) {
        MySmartPhone smartPhone=new MySmartPhone();
        smartPhone.audioPlay();
        smartPhone.videoPlay();
        smartPhone.call();
        smartPhone.message();
        smartPhone.audioPlay();
        smartPhone.internet();
        System.out.println("country "+Phone1.country);
        //Phone1.country="";// error

    }
}