import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(1,3);
        arr.remove(2);

        Iterator e = arr.iterator();

        while(e.hasNext()){
            int x = (Integer)e.next();
            System.out.println(x);
        }

        List<String> ls = Arrays.asList("one","two","three");

    }
}
