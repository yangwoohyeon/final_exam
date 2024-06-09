public class BoxTest {
    public static void main(String[] args) {
        Box<String> box = new Box<String>();
        box.set("hello");
        System.out.println(box.get());
    }
}
