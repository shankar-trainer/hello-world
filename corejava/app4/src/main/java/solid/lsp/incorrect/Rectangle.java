package solid.lsp.incorrect;

public class Rectangle {

    protected  float width;
    protected   float height;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    public float area(){
        return  width*height;
    }
}
