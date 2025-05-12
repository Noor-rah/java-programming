import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            printSpaces(n - i);
            printNumbers(i);
            System.out.println();
        }
    }

    public static void printSpaces(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(" ");
        printSpaces(n - 1);
    }

    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n);
        printNumbers(n - 1);
        if (n != 1) System.out.print(n );
    }
}