package designPattern.creational.abstractFactory;

interface GUIFactory{
    Button createButton();
    Checkbox createCheckBox();
}

public class LightThemeFactory  implements  GUIFactory{
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new LightCheckBox();
    }
}
class DarkThemeFactory  implements  GUIFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new DarkCheckBox();
    }
}
class Application{
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory){
        button=factory.createButton();
        checkbox=factory.createCheckBox();
    }
    void render(){
        button.paint();
        checkbox.paint();
    }

    public static void main(String[] args) {
        GUIFactory factory=new LightThemeFactory();
        Application application=new Application(factory);
        application.render();

        factory=new DarkThemeFactory();
        application=new Application(factory);
        application.render();

    }
}