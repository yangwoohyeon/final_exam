public class Child extends Parent{
    public void print(){
        super.print();
        System.out.println("자식의 print()");
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.print();
    }
}
