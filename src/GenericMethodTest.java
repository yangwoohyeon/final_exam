public class GenericMethodTest {
    public static void main(String[] args) {
        Integer[] iArray = { 10, 20, 30, 40, 50 };
        Double[] dArray = { 1.1, 1.2, 1.3, 1.4, 1.5 };
        Character[] cArray = { 'K', 'O', 'R', 'E', 'A' };
        printArray(iArray);
        printArray(dArray);
        printArray(cArray);

    }

    public static <T> void printArray(T[] a){
        for(int i=0; i<a.length; i++){
            System.out.printf("%s ",a[i]);
        }
        System.out.println();
    }
}
