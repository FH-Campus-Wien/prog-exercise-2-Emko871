package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {
    Scanner scan = new Scanner(System.in);
    //todo Task 1
    public void largestNumber(){
        // input your solution here
        int count = 1;
        System.out.print("Number " + count + ": ");
        double number = scan.nextDouble();
        double highest = number;

        while(number > 0){
            count++;
            System.out.print("Number " + count + ": ");
            number = scan.nextDouble();
            if(number > highest)
                highest = number;
        }
        if(count == 1 && number <= 0)
            System.out.println("No number entered.");
        else if(count > 1 && number <= 0)
            System.out.println("The largest number is " + String.format("%.2f", highest));
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        int count = 1;
        int number = scan.nextInt();
        if(number>0) {
            System.out.print("n: ");
            for (int i = 0; i < number; i++) {
                for (int j = 0; j < number; j++) {
                    if (i >= j)
                        System.out.print(count++ + " ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("n: Invalid number!");

    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        int rows = 6;

        for (int i = 1; i <= rows; i++) {
            for (int j = i+1; j <= rows; j++)
                System.out.print(" ");

            for(int k = 1; k < i*2; k++)
                System.out.print("*");

            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        System.out.print("h: ");
        int h = scan.nextInt();
        System.out.print("c: ");
        char c = scan.next().charAt(0);

        if (h%2 != 0){
            for (int i = 1; i <= h/2 + 1; i++){
                for(int j = h/2; j >= i; j--)
                    System.out.print(" ");

                for(int k = i; k > 0; k--)
                    System.out.print((char)(c-k+1));

                for (int l = 1; l<i; l++)
                    System.out.print((char)(c - l));
                System.out.println();
            }
            for (int i = h/2; i > 0; i--) {
                for (int j = h / 2; j >= i; j--)
                    System.out.print(" ");

                for (int k = i; k > 0; k--)
                    System.out.print((char) (c-k +1));

                for (int l = 1; l < i; l++)
                    System.out.print((char) (c-l));

                System.out.println();
            }
        }
        else
            System.out.println("Invalid number!");
    }

    //todo Task 5
    public void marks(){
        // input your solution here
        int negative = 0;
        double average = 0;
        int count = 1;
        int sum = 0;
        System.out.print("Mark " + count + ": ");
        int input = scan.nextInt();

        if(input==5)
            negative++;

        while(input > 0){
            if(input<=5){
                count++;
                sum = sum + input;
                System.out.print("Mark " + count + ": ");
                input = scan.nextInt();
                if(input==5)
                    negative++;
            }
            else{
                System.out.println("Invalid mark!");
                System.out.print("Mark " + count + ": ");
                input = scan.nextInt();
            }
        }
        if(input==0 && count > 1){
            count--;
            average = (double)sum / (double)count;
            System.out.println("Average: " + String.format("%.2f", average));
            System.out.println("Negative marks: " + negative);
        }
        else if(input==0 && count==1){
            System.out.println("Average: " + String.format("%.2f", average));
            System.out.println("Negative marks: " + negative);
        }

    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        int subtotal;
        int sum;
        System.out.print("n: ");
        int number = scan.nextInt();

        while (number != 1 && number != 4) {
            sum = 0;
            while (number != 0) {
                subtotal = number % 10;
                sum = sum + (subtotal * subtotal);
                number = number / 10;
            }
            number = sum;
        }
        if(number==1)
            System.out.println("Happy number!");
        else if (number == 4) {
            System.out.println("Sad number!");
        }

    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}