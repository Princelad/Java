import java.util.Scanner;

public class practical2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("'9' count : " + array_count9(arr));

        sc.close();
        System.out.println("This Practical is made by 23CS037 - Prince lad ");  
    }

    private static int array_count9(int[] arr) {
        int count = 0;

        for (int j : arr) {
            if (j == 9) {
                count++;
            }
        }

        return count;
    }
}
