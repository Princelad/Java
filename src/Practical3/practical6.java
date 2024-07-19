
import java.util.Scanner;

class Complex {
    private int real, imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public Complex addComplexNumber(Complex n) {
        Complex temp = new Complex(0, 0);
        temp.setReal(real + n.getReal());
        temp.setImaginary(imaginary + n.getImaginary());
        return temp;
    }

    public Complex subComplexNumber(Complex n) {
        Complex temp = new Complex(0, 0);
        temp.setReal(real - n.getReal());
        temp.setImaginary(imaginary - n.getImaginary());
        return temp;
    }

    public Complex mulComplexNumber(Complex n) {
        Complex temp = new Complex(0, 0);
        temp.setReal((real * n.getReal()) - (imaginary * n.getImaginary()));
        temp.setImaginary((imaginary * n.getReal()) + (real * n.getImaginary()));
        return temp;
    }

    public void displayNumber() {
        System.out.println(real + " + i " + imaginary);
    }
}

public class practical6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter real part of first number : ");
        int real1 = scan.nextInt();
        System.out.print("Enter imaginary part of first number : ");
        int imaginary1 = scan.nextInt();
        System.out.print("Enter real part of second number : ");
        int real2 = scan.nextInt();
        System.out.print("Enter imaginary part of second number : ");
        int imaginary2 = scan.nextInt();

        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);
        Complex temp;

        temp = c1.addComplexNumber(c2);
        System.out.print("Addition of both numbers : ");
        temp.displayNumber();

        temp = c1.subComplexNumber(c2);
        System.out.print("Subtraction of both numbers : ");
        temp.displayNumber();

        temp = c1.mulComplexNumber(c2);
        System.out.print("Multiplication of both numbers : ");
        temp.displayNumber();

        scan.close();
    }
}
