public class Result extends Test implements Sports{
        int sports_marks;

       public int get_marks(){
            return sports_marks;
        }

      public void set(int m){
            sports_marks = m;
        }

      public void display(){
            System.out.println("Marks for Sub1: " + get_marks_1());
            System.out.println("Marks for Sub2: " + get_marks_2());
            System.out.println("Sports Marks: " + get_marks());
        }

    
}
