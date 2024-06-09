public class ColoredRectangle extends Rectangle2{
    String color;
    public ColoredRectangle(int x, int y, int width, int height, String color){
        super(x,y,width,height);
        this.color=color;
    }

    public static void main(String[] args){
        ColoredRectangle coloredRectangle = new ColoredRectangle(10,10,20,20,"red");
    }
}
