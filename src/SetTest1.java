import java.util.HashSet;
import java.util.Set;

public class SetTest1 {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        s1.add("a");
        s1.add("b");
        s1.add("c");
        s2.add("a");
        s2.add("d");
        Set<String> union = new HashSet<String>(s1);
        union.addAll(s2);
        Set<String> intersection = new HashSet<String>(s1);
        intersection.retainAll(s2);
        System.out.println("합집합 "+union);
        System.out.println("교집합 "+intersection);
    }
}
