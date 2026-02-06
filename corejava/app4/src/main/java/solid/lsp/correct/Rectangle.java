package solid.lsp.correct;

public class Rectangle implements  Shape{

    private float width;
    private float height;

    @Override
    public float area() {
        return width*height;
    }

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
}


