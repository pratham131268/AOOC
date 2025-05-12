import java.io.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        if(args.length == 0){
            System.out.println("Please Provide the File Name");
            return;
        }

        String file_name = args[0];
        File file = new File(file_name);
        Scanner scanner = new Scanner(System.in);

        try{
            if(file.exists()){
                System.out.println("File Exists. Displaying Contents:\n");

                BufferedReader br = new BufferedReader(new FileReader(file));
                String line;
                while((line = br.readLine()) != null)
                    System.out.println(line);
                br.close();

                System.out.print("\n Do you want to add data to end of the file: ? (yes/no): ");
                String response = scanner.nextLine();

                if(response.equalsIgnoreCase("yes")){
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
                    System.out.println("Enter data for append (exit to finish)");

                    while(true){
                        String inp = scanner.nextLine();
                        if(inp.equalsIgnoreCase("exit"))
                            break;
                        bw.write(inp);
                        bw.newLine();
                    }
                    bw.close();
                    System.out.println("Data appended Successfully");
                }
            }
            else{
                System.out.println("File doesn't exits. Creating new file: " + file_name);
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                System.out.println("Enter data to write (type 'exit' to finish)");

                while(true){
                    String inp = scanner.nextLine();
                    if(inp.equalsIgnoreCase("exit"))
                        break;
                    bw.write(inp);
                    bw.newLine();
                }
                bw.close();
            }
          }catch(IOException e){
              System.out.println("Caught Exception: " + e.getMessage());
          }
        finally{
            scanner.close();
        }
    }
}
