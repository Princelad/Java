public class Main {
    public static void main(String[] args) {
        int[][] arr = { {1}, {1, 2}, {1, 2, 3, 4, 5} };

        for(int i = 0; i < 3; i++) {
            System.out.printf("The length of the element %d is : %d\n", (i+1), arr[i].length);
        }
    }    
}
