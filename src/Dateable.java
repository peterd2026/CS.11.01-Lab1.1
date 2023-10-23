import java.util.Scanner;
public class Dateable {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter your age: ");
        
                int age = scanner.nextInt();
        
                int youngestAge = (7 + (age / 2));
        
                System.out.println("The age of the youngest person you can date is: " + youngestAge);
            }
        }
