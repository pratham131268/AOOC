class Static{
    static int count = 0;

    static{
        System.out.println("static block executed.");
        count = 100;
    }

    static void showCount(){
        System.out.println("Count: "+ count);
    }

    void increment(){
        count++;
    }
}

public class StaticDemo{
    public static void main(String[] args){
        Static.showCount();

        Static obj1 = new Static();
        obj1.increment();

        Static obj2 = new Static();
        obj2.increment();

        Static.showCount();
    }
}
