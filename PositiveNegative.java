import java.util.Scanner;
public class PostiveNegative {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Number");
        int number = sc.nextInt();
        if(number > 0) {
            System.out.println("Positive");
        }
        else  {
            System.out.println("Negative");

        }

    }
}
