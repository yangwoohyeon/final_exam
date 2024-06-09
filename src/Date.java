public class Date {
    private int y;
    private int m;
    private int d;

    public Date(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    public String toString(){
        return y+" "+m+" "+d+" ";
    }
}
