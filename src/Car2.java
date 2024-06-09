public class Car2 {
    private String model;
    public Car2(String model){
        this.model=model;
    }

    public boolean equals(Object c){
        if(c instanceof Car2){
            return model.equals(((Car2)c).model);
        }
        else{
            return false;
        }
    }
    public String toString(){
        return "모델 "+model;
    }

}
