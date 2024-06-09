public class ShapeTest2 {

    private static Shape4 arrayOfShape[];

    public static void main(String[] args) {
        init();
        drawAll();
    }
    public static void init(){
        arrayOfShape=new Shape4[3];
        arrayOfShape[0]=new Shape4();
        arrayOfShape[1]=new Rectangle4();
        arrayOfShape[2]=new Shape4();
    }

    public static void drawAll(){
        for(int i=0; i<arrayOfShape.length; i++){
            arrayOfShape[i].draw();
        }
    }
}
