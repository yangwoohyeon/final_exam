public class EqualsTest {
    public static void main(String[] args) {
        woohyeon w = new woohyeon("안녕");
        woohyeon w1 = new woohyeon("안녕");
        String n = "안녕" ;
        String n1 = "안녕";
        System.out.println(w.equals(w1));
        System.out.println(n.equals(n1));
    }
}
