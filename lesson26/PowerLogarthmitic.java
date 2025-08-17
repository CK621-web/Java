package lesson26;

import java.util.Scanner;

public class PowerLogarthmitic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("enter the base(x): ");
        int x = scn.nextInt();

        System.out.print("Enter the eponent (n):");
        int n = scn.nextInt();

        int xpn = power(x, n);

        System.out.println("Result: " + xpn);

    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int xpnb2 = power(x, n / 2);

        int xn = xpnb2 * xpnb2;

        if (n % 2 == 1) {
            xn = xn * x;
        }
        return xn;
    }
}
