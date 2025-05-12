import java.io.FileInputStream;
import java.io.IOException;

public class Main{
    public static void main(String[] args){
        try{
            FileInputStream fos = new FileInputStream("/home/sumedhk/SEM_4/AdvanceJava/AOOC/EXPERIMENT_7/sample.txt");
            int i;

            while((i = fos.read()) != -1)
                System.out.print((char)i);
            
            fos.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
