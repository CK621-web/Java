package lesson3;

import java.util.Scanner;

//In this activity, create a grading system using control statements. Follow the following rules to create the grading system - For marks greater than 90, print “O”. For marks greater than 80 and less than equal to 90, print “A+”. For marks greater than 70 and less than equal to 80, print “A”. For marks greater than 60 and less than equal to 70, print “B”. For marks less than 60, print “C”.
public class Activity3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();

        if (marks > 90) {
            System.out.println("O");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("A+");
        }

        else if (marks > 70 && marks <= 80) {
            System.out.println("A");
        }

        else if (marks > 60 && marks <= 70) {
            System.out.println("B");
        }

        else if (marks <= 60) {
            System.out.println("C");
        } else {
            System.out.println("invalid input");

        }
        sc.close();
    }
}
