import java.util.List;

public class WildCard {
    public static double sumOfList(List <? extends Number> list){
        double sum=0.0;
        for(Number n : list){
            sum+=n.doubleValue();
        }
        return sum;
    }

    public static double sumOfList2(List <?> list){
        double sum=0.0;
        for(Object elem : list){
            sum+=(double)elem;
        }
        return sum;
    }
}
