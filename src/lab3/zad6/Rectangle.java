package lab3.zad6;

public class Rectangle implements Cloneable{

    private String width;
    private String height;

    public Rectangle(String width, String height) {
        this.width = width;
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    protected Object clone() throws CloneNotSupportedException {
        return new Rectangle(this.height, this.width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width='" + width + '\'' +
                ", height='" + height + '\'' +
                '}';
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setHeight(String height) {
        this.height = height;
    }
}
