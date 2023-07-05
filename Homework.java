package ru.averinaoy.api.lesson1;

import java.util.Scanner;

public class Homework{

     static Scanner scanner = new Scanner(System.in);

        /**
      * @param args
      */
     public static void main(String[]args){

            boolean f = true;
        while(f){
            System.out.println("What action do you want to take?");
            System.out.println("1 - Calculate the sum of numbers"); // Вычислить n-ое треугольного число (сумма чисел от 1 до n)
            System.out.println("2 - Calculate the result of multiplying numbers"); // n! (произведение чисел от 1 до n)
            System.out.println("3 - Print all prime numbers from 1 to 1000"); // Вывести все простые числа от 1 до 1000
            System.out.println("4 -  Calculator"); //Реализовать простой калькулятор
            System.out.println("0 - Terminate the application");
            System.out.println("================================");
            int no = Integer.parseInt(scanner.nextLine());

          switch(no){
                case 1:
                    TriangleSum();
                    break;
                case 2:
                    TriangleMulti();
                    break;

                case 3:
                    PrimeNum();
                    break;
               case 4:
                    Calculator();
                    break;
                
               case 0:
                    System.out.println("Terminate the application.");
                    f = false;
                    break;
                
                default:
                    System.out.println("You entered an invalid task number.\nPlease try again.");
                break;

            }
        }
     }
    

 static void PrimeNum() {

        for (int j = 2; j <= 1000; j++) {
            boolean a = false;

            for (int i = 2; i * i <= j; i++) {
                a = (j % i == 0);
                if (a) {
                    break;
                }
            }
            if (!a) {
                System.out.print(j + " ");
            }

        }
     }



         static void TriangleSum() {
     Scanner scanner = new Scanner(System.in);
         System.out.print("Enter n: ");
        int n = scanner.nextInt();
         int sum = 0;
         for (int i = 1; i <= n; i++) {
             sum += i;
         }
        
         System.out.println("Sum of numbers from 1 to " + n + " is " + sum);
     }

     static void TriangleMulti(){
     Scanner scanner = new Scanner(System.in);
     System.out.print("Enter n: ");
         int n = scanner.nextInt();
         int fi = 1;
         for (int i = 1; i <= n; i++) {
            fi *= i;
         }
        
         System.out.println("Multiplication of numbers from 1 to " + n + " is " + fi);
 }
 

static void Calculator(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter A: ");
    int a = scanner.nextInt();
    System.out.print("Enter B: ");
    int b = scanner.nextInt();
    System.out.print("Enter a mathematical operation - +, -, *, / ");
    char symbol = scanner.next().charAt(0);
     int result;
     
    switch(symbol){

        case '+': result = a + b;
             break;
        case '-': result = a - b;
             break;
        case '*': result = a * b;
             break;
        case '/': result = a / b;
             break;
        default:  System.out.printf("Enter correct a mathematical operation");
            return;
 }
      System.out.print("\nAssessment result:\n");
      System.out.printf(a + " " + symbol + " " + b + " = " + result);
   }

}
