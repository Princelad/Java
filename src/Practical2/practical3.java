import java.util.Scanner;

public class practical3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double var = sc.nextDouble();

        int x = (int)var;

        short y = (short)((var-x)*1000);

        System.out.println("\nthe value is : "+x+"."+y);

        sc.close();

        System.out.println("This Practical is made by 23CS037 - Prince lad ");
    }
}
