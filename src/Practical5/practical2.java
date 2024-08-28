package Practical5;

public class practical2 {

    public static void main(String[] args) {
        try{
            int x = 10 / 0;
        } catch(ArithmeticException e){
            System.out.println("Invalid division");
        }

        try{
            int x = Integer.parseInt("HI");
        } catch(NumberFormatException e) {
            System.out.println("Format mismatch");
        }

        try{
            String str = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        }

        try{
            String str = args['1'];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }

        try {
            throw new Exception("MyException[" + args[0] + "]");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            throw new Exception("MyException[prams]");
        } catch (Exception e) {
            System.out.println("Exception encountered");
        } finally {
            System.out.println("Exception handling complete");
        }
    }
}
