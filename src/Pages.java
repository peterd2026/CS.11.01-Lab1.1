import java.util.Scanner;
public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        
        int age = scanner.nextInt();
        
        int pagesToRead = 100 - age;
        
        System.out.println("The minimal number of pages to read is: " + pagesToRead);
    }
}
