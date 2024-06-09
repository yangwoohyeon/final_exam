public class ShapeTest3 {
    public static void printLocation(Shape s){
        System.out.println(s.x+" "+s.y);
    }

    public static void main(String[] args) {
        Rectangle s1 = new Rectangle();
        Circle s3 = new Circle();

        printLocation(s1);

    }
}
