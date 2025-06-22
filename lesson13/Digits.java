package lesson13;

import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num) {
        digitList = new ArrayList<Integer>();

        if (num == 0) {
            digitList.add(0);
        }

        while (num > 0) {
            int lastDigit = num % 10;
            digitList.add(0, lastDigit);
            num /= 10;
        }
    }

    public ArrayList<Integer> getDigitList() {
        return digitList;
    }

    public static void main(String[] args) {
        System.out.println("Testing Digits(0):");
        Digits digits0 = new Digits(0);
        System.out.println("Digit list: " + digits0.getDigitList());
        System.out.println(" ");

        System.out.println("Testing Digits(12345):");
        Digits digits12345 = new Digits(12345);
        System.out.println("Digit list: " + digits12345.getDigitList());
        System.out.println(" ");

        System.out.println("Testing Digits(7):");
        Digits digits7 = new Digits(7);
        System.out.println("Digit list: " + digits7.getDigitList());
        System.out.println(" ");

        System.out.println("Testing Digits(987654321):");
        Digits digitsBig = new Digits(987654321);
        System.out.println("Digit list: " + digitsBig.getDigitList());
        System.out.println(" ");

        System.out.println("Testing Digits(100):");
        Digits digits100 = new Digits(100);
        System.out.println("Digit list: " + digits100.getDigitList());
        System.out.println(" ");
    }
}
