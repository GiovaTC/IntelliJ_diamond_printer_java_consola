import java.util.Scanner;

public class DiamondPrinter {

    public static void printFilledDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            int stars = 2 * i - 1;
            printChars(' ', spaces);
            printChars('*', stars);
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            int spaces = n - i;
            int stars = 2 * i - 1;
            printChars(' ', spaces);
            printChars('*', stars);
            System.out.println();
        }

    }

    private static void printChars(char ch, int count) {
        for (int i = 0; i < count; i++) System.out.print(ch);
    }

    public static void main(String[] args) {}
}