public class Main {
    public static void main(String[] args) {
        // Loop counting up by 1 from 0 to 30
        for (int cnt = 0; cnt <= 30; cnt++) {
            System.out.println(cnt);
        }

        System.out.println("\nNew Loop");
        // Loop counting down by 1 from 30 to 0
        for (int cnt = 30; cnt >= 0; cnt--) {
            System.out.println(cnt);
        }

        System.out.println("\nNew Loop");
        // Loop counting up by 3 from 0 to 18
        for (int cnt = 0; cnt <= 18; cnt += 3) {
            System.out.println(cnt);
        }

        System.out.println("\nNew Loop");
        // Loop counting down by 2 from 10 to 0
        for (int cnt = 10; cnt >= 0; cnt -= 2) {
            System.out.println(cnt);
        }

        System.out.println("\nNew Loop");
        // Loop *
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nNew Loop");
        // Loop *
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nNew Loop");
        // Loop *
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}