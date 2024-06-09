public class ShapeTest {
    public static void main(String[] args) {
        Shape4 shape4 = new Shape4();
        Shape4 s=new Rectangle4();
        Rectangle4 r = new Rectangle4();
        r=(Rectangle4)shape4;
        s.x=1;

        //s.width;
        ((Rectangle4)s).width=1;
    }
}
