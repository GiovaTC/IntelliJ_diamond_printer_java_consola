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

    public static void printHollowDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            int spaces = n - i;
            printChars(' ', spaces);
            if (i == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                int innerSpaces = 2 * i - 3;
                printChars(' ', innerSpaces);
                System.out.println("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            int spaces = n - i;
            printChars(' ', spaces);
            if (i == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                int innerSpaces = 2 * i - 3;
                printChars(' ', innerSpaces);
                System.out.println("*");
            }
            System.out.println();
        }
    }

    private static void printChars(char ch, int count) {
        for (int i = 0; i < count; i++) System.out.print(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño n (>=1). presiona ENTER para usar 4: ");
        String line = sc.nextLine().trim();
        int n;
        if (line.isEmpty()) {
            n = 4;
        } else {
            try {
                n = Integer.parseInt(line);
                if (n < 1) {
                    System.out.println("n debe ser >= 1 . usando 4 por defecto.");
                    n = 4;
                }
            } catch ( NumberFormatException e) {
                System.out.println("entrada inválida. usando 4  por defecto.");
                n = 4;
            }
        }
        System.out.println("\n--- rombo relleno (n = " + n + ") ---");
        printFilledDiamond(n);
        System.out.println("\n--- rombo hueco (n = " + n + ") ---");
        printHollowDiamond(n);
        sc.close();
    }
}