
<p align="center">
  <img src="./giovaTC_logo.png" alt="giovaTC logo" width="160"/>
</p>

<h1 align="center">💎 DiamondPrinter – Programa Java para imprimir un rombo en consola</h1>

<p align="center">
  <b>Proyecto Java (IntelliJ) que imprime un rombo con asteriscos (*) en la consola.</b><br>
  Incluye versiones <b>rellena</b> y <b>hueca</b> del rombo.<br>
  <i>Autor: giovaTC</i>
</p>

---

<h2>🧠 Descripción</h2>

El programa lee un número entero <code>n</code> desde consola (por defecto 4).  
Genera un rombo relleno y uno hueco según el tamaño especificado.

---

<h2>📄 Código Java completo</h2>

```java
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
                System.out.print("*");
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
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void printChars(char ch, int count) {
        for (int i = 0; i < count; i++) System.out.print(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño n (>=1). Presiona Enter para usar 4: ");
        String line = sc.nextLine().trim();
        int n;
        if (line.isEmpty()) {
            n = 4;
        } else {
            try {
                n = Integer.parseInt(line);
                if (n < 1) {
                    System.out.println("n debe ser >= 1. Usando 4 por defecto.");
                    n = 4;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Usando 4 por defecto.");
                n = 4;
            }
        }
        System.out.println("\n--- Rombo relleno (n = " + n + ") ---");
        printFilledDiamond(n);
        System.out.println("\n--- Rombo hueco (n = " + n + ") ---");
        printHollowDiamond(n);
        sc.close();
    }
}
```

---

<h2>🧩 Ejemplo de ejecución</h2>

```
Introduce el tamaño n (>=1). Presiona Enter para usar 4: 4

--- Rombo relleno (n = 4) ---
   *
  ***
 *****
*******
 *****
  ***
   *

--- Rombo hueco (n = 4) ---
   *
  * *
 *   *
*     *
 *   *
  * *
   *
```

---

<h2>⚙️ Requisitos</h2>
<ul>
  <li>Java 17 o superior</li>
  <li>IntelliJ IDEA (recomendado)</li>
</ul>

---

<h2>📜 Licencia</h2>
<p>Proyecto bajo licencia MIT – libre para uso y modificación.</p>

<p align="center">
  💬 <i>Autor: giovaTC – Generado con ChatGPT (GPT‑5)</i>
</p>
