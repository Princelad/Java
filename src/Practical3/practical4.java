import java.util.Scanner;

class Date {
    private int Month, Day, Year;

    public Date(int Month, int Day, int Year) {
        this.Month = Month;
        this.Day = Day;
        this.Year = Year;
    }

    public int getMonth() {
        return Month;
    }

    public void setMonth(int Month) {
        this.Month = Month; 
    }

    public int getDay() {
        return Day;
    }

    public void setDay(int Day) {
        this.Day = Day;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void displayDate() {
        System.out.printf("Date : %d / %d / %d ", getMonth(), getDay(), getYear());
    } 
}

public class practical4 {
    public static void mainMenu() {
        System.out.println("Choose an operation : ");
        System.out.println("[1] Set Date");
        System.out.println("[2] Update Month");
        System.out.println("[3] Update Day");
        System.out.println("[4] Update Year");
        System.out.println("[5] Display Date");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Date date = new Date(0, 0, 0);
        int option;
        boolean flag;
        do {
            mainMenu();
            System.out.print("Enter the operation : ");
            option = scan.nextInt();
            switch(option){
                case 1 -> {
                    System.out.print("Enter Month(1-12) : ");
                    int Month = scan.nextInt();
                    date.setMonth(Month);
                    System.out.print("Enter Day(1-31) : ");
                    int Day = scan.nextInt();
                    date.setDay(Day);
                    System.out.print("Enter Year : ");
                    int Year = scan.nextInt();
                    date.setYear(Year);
                }
                case 2 -> {
                    System.out.print("Enter Month(1-12) : ");
                    int Month = scan.nextInt();
                    date.setMonth(Month);
                }
                case 3 -> {
                    System.out.print("Enter Day(1-31) : ");
                    int Day = scan.nextInt();
                    date.setDay(Day);
                }
                case 4 -> {
                    System.out.print("Enter Year : ");
                    int Year = scan.nextInt();
                    date.setYear(Year);
                }
                case 5 -> date.displayDate();
                default -> System.out.println("Choose proper input.");
            }
            System.out.print("Do you want to exit ? 1/0 : ");
            flag = scan.nextBoolean();
        } while (flag);

        scan.close();
    }
}
