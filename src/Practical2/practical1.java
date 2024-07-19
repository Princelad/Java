import java.util.Scanner;

public class practical1 {
    static String frontTimes(String str, int num) {
        String newstring = "";

        for(int i = 0; i < num; i++) {
            newstring += str.substring(0, 3);
        }
        return newstring;
    }

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)) {

            System.out.print("Enter the string : ");
            String str = scan.nextLine();
            System.out.print("Enter the number : ");
            int n = scan.nextInt();

            System.out.println(frontTimes(str, n));

            scan.close();
            System.out.println("This Practical is made by 23CS037 - Prince lad ");
        }
    }
}
