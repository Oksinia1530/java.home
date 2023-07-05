package ru.averinaoy.api.lesson1;

import java.util.Scanner;

public class Program{
    
    static Scanner scanner = new Scanner(System.in);

        public static void main(String[]args){

            boolean f = true;
        while(f){
            System.out.println("Specify the task number:");
            System.out.println("1 - Task 1");
            System.out.println("2 - Task 2");
            System.out.println("3 - Task 3");
            System.out.println("0 - Terminate the application");
            System.out.println("================================");
            int no = Integer.parseInt(scanner.nextLine());

            switch(no){
                case 3:
                    task3("Welcome to the Java course");
                    break;
                case 1:
                    printName();
                    break;

                case 2:
                    int[] array2 = {1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1};
                    System.out.printf("Maximum consecutive units: %d\n", task2(array2));
                    int[] array3 = {1, 0, 1, 1, 1, 0, 0, 1, 1};
                    System.out.printf("Maximum consecutive units: %d\n", task2(array3));       
                    break;
                
                case 0:
                    System.out.println("Terminate the application.");
                    f = false;
                    break;
                
                default:
                    System.out.println("You entered an invalid task number.\nPlease try again.");
                break;

            }
           //  printName();
           // int[] array2 = {1,0,1,1,1,0,0,1,1};
           // System.out.printf("max - %d\n", task2(array2));
           // int[] array3 = {1,0,1,1,1,1,1,1,0,0,1,1};
           //System.out.printf("max - %d\n", task2(array3));
          // task3("Welcome to the Java course");
        }
        }

        static void printName(){
            int i = 13;
            // Scanner scanner = new Scanner(System.in);
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.println("Hello, " + name + "!");
            System.out.printf("Hello, %s ! %d\n", name, i);
        }

        static void task3(String str){
            for (int i = 0, j = 10; i < j; i++, j--){
            System.out.printf("i=%d - j=%d\n", i, j);
        }


        String[] words = str.split(" ");

        for (int i = words.length - 1; i >= 0 ; i--){
                //System.out.print(words[i] + " ");
                System.out.printf("%s ", words[i]);
        }
        System.out.println();
    }

        static int task2(int[] inputArray){
            int [] array = new int[5];
            array[0] = 1;
            // array[1] = 0;
            array[2] = 1;
            // array[3] = 0;
            // array[4] = 0;

            // int[] array2 = {1,0,1,1,1,0,0,1,1};
            int max = 0;
            int counter = 0;
            for(int e : inputArray){
                if (e == 1){
                    counter++; // counter = counter +1;
                }
                else{
                    if(counter > max){
                        max = counter;
                    }
                    counter = 0;

                }
            }
            return max;
           //  System.out.printf("max - %d\n", max);

        }
}