public class Test extends Student{
    private int sub1;
    private int sub2;

    public int get_marks_1(){
        return sub1;
    }

    public int get_marks_2(){
        return sub2;
    }

    public void set_marks(int s1, int s2){
        this.sub1 = s1;
        this.sub2 = s2;
    }

}
