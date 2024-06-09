import java.util.HashSet;

public class HashTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        String[] arr={"1","2","3","2"};
        for(String s:arr){
            if(!set.add(s)){
                System.out.println("중복된 수 : "+s);
            }
        }

        System.out.println(set.size()+"중복되지 않은 수 "+ set);

    }
}
