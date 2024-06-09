public class BoxTest1 {
    public static void main(String[] args) {
        Box1 box1 = new Box1();
        box1.set("hello world");
        String s = (String)box1.get();
        System.out.println(s);
    }
}
