public interface Phone {
    //void call();
    public abstract void call();

    //public static final String country="India";
    String country = "India";
}

interface PlainMobile {
    void call();

    void sms();
}

interface SmartPhone {
    void call();
    void sms();
    void videoPlay();
    void audioPlay();
    void internetSurfing();
    void internetBanking();
}

abstract class MyPhone {
    private int id;
    private String model;
    private float cost;

    abstract void phoneInfo();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}

class MySmartPhone extends MyPhone implements SmartPhone, Phone, PlainMobile {

    @Override
    void phoneInfo() {
        System.out.println("phone data");
        System.out.println("\tid " + getId());
        System.out.println("\tid " + getModel());
        System.out.println("\tid " + getCost());
    }

    @Override
    public void call() {
        System.out.println("MySmartPhone can call");
    }

    @Override
    public void sms() {
        System.out.println("MySmartPhone can sms");
    }

    @Override
    public void videoPlay() {
        System.out.println("MySmartPhone can videoPlay");
    }

    @Override
    public void audioPlay() {
        System.out.println("MySmartPhone can audioPlay");
    }

    @Override
    public void internetSurfing() {
        System.out.println("MySmartPhone can internetSurfing");
    }

    @Override
    public void internetBanking() {
        System.out.println("MySmartPhone can internetBanking");
    }
}

class MySmartPhoneMain {
    public static void main(String[] args) {
        MySmartPhone mySmartPhone = new MySmartPhone();
        mySmartPhone.setId(67767676);
        mySmartPhone.setModel("Nokia");
        mySmartPhone.setCost(45000);
        System.out.println(" My smart phone  information");
        mySmartPhone.phoneInfo();
        System.out.println("country name " + Phone.country);
        //  Phone.country="";
        mySmartPhone.call();
        mySmartPhone.sms();
        mySmartPhone.audioPlay();
        mySmartPhone.videoPlay();
        mySmartPhone.internetBanking();
        mySmartPhone.internetSurfing();

    }
}



/*
all variables are by default public static and final
all methods are by default public abstract
multiple inheritance feature

a class can extend only class
an interface can extends multiple interfaces

a class can extend only class but can implements multiple interfaces


 */
