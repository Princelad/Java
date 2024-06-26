import java.util.*;

public class Main{
    public static void main(String[] args){
        int var;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value : ");
        var = scan.nextInt();    
        // System.out.println(var+" is the value of the var");
        System.out.printf("\"%d is the value of var\"\n",var);
        float var1 = var;
        System.out.printf("\"%f is the value of var\"",var1);

        scan.close();
    }
}