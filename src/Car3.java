public class Car3 {
    private String model;

    public Car3(String model){this.model=model;}

    public boolean equals(Object obj){
        if(obj instanceof Car3){
            return model.equals(((Car3)obj).model);
        }
        else{
            return false;
        }
    }

}
