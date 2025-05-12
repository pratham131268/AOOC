import java.util.Scanner;

public class AlphabeticalOrder{
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String[] names = new String[10];

    System.out.println("Enter 10 Names: ");
    for(int i = 0; i < 10; i++){
        System.out.printf("Name[%d]: ", i);
        names[i] = scanner.nextLine();
    }

    for(int i = 0; i < 9; i++){
        for(int j = i + 1; j < 10; j++){
            if(names[i].compareTo(names[j]) > 0){
                String temp = names[i];
                names[i] = names[j];
                names[j] = temp;
            }
        }
    }

    System.out.println("Names in Alphabetical order:");
    for(String name: names)
        System.out.println(name);

       scanner.close();
    }
}
