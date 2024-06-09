import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> s = new LinkedList<String>();
        s.add("1");
        s.add("2");
        s.add(1,"1.5");

        Iterator e = s.iterator();
        while(e.hasNext()){
            String a = (String)e.next();
            System.out.println(a);
        }
    }
}
