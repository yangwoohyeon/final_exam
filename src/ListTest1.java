import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");

        Iterator e = list.iterator();
        while(e.hasNext()){
            String s = (String)e.next();
            System.out.println(s);
        }
    }
}
