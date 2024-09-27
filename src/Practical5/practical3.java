package Practical5;

public class practical3 {

    static void userDefinedError() throws Exception {
        throw new Exception("User-defined error");
    }

    public static void main(String[] args) {
        try {
            userDefinedError();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
} 