package Practical6;

import java.io.*;

public class practical5 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Prince\\Documents\\Java Practicals\\src\\Practical6\\sample.txt");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name: ");
            String name = br.readLine();

            fos.write(name.getBytes());

            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("I/O Error");
        }
    }
}
