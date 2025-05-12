class Student{
    String name;
    int roll_no;

    Student(String n, int r){
        name = n;
        roll_no = r;
    }


}

class Test extends Student{
    int sub1;
    int sub2;

    Test(String name, int roll_no, int s1, int s2){
        super(name, roll_no);
        sub1 = s1;
        sub2 = s2;
    }

}

class Result extends Test{
    double result;
    Result(String name, int roll_no, int s1, int s2){
        super(name, roll_no, s1, s2);
    }
    void show_result(){
        result = (sub1 + sub2)/2;
        System.out.println("Result is : " + result);
    }
    
}

public class StudentInfo{
    public static void main(String[] args){
       Result r = new Result("ABC", 10, 79, 81);
       
       //we can create display method also in class

       System.out.println("-----STUDENT INFO-----");
       System.out.println("Name Is: "+ r.name);
       System.out.println("Roll no: "+ r.roll_no);
       System.out.println("Sub1 marks: "+ r.sub1);
       System.out.println("Sub2 marks: " + r.sub2);
       r.show_result();
    }

}

