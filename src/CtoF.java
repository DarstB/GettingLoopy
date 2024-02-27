import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean done = false;
        String trash;
        double celsius = 0;
        double fahren = 0;

        System.out.print("Enter the temperature in Celsius: ");
        do {
            if(in.hasNextDouble()) {
                celsius = in.nextDouble();
                done = true;
                in.nextLine();
            }
            else {
                trash = in.nextLine();
                System.out.print("The input " + trash + " is not a valid input. Try again: ");
            }
        } while(!done);

        fahren = (celsius * 9/5) + 32;
        System.out.println("The temperature in Fahrenheit is: " + fahren);
    }
}
