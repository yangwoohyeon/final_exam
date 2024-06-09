public class Employee {
    private Date birthday;
    private String name;

    public Employee(String name, Date birthday){
        this.name=name;
        this.birthday=birthday;
    }

    public String toString(){
        return name+"  "+birthday;
    }
}
