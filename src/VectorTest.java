import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector vc = new Vector();
        vc.add("String");
        vc.add(1);
        vc.add(new Integer(10));

        String s = (String)vc.get(0);
        System.out.println(s);
        int a = (Integer)vc.get(2);
        System.out.println(a);
    }
}
