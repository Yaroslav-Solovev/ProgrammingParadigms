package HW_Les_2;

import java.util.Scanner;

public class task_1{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Введите число: ");
        int n = scanner.nextInt(); // На вход подается число n
        int result = 0;
        for (int i = 1; i <= n; i++){ // Cкрипт, который выводит на экран таблицу умножения всех чисел от 1 до n
            for (int j = 1; j < 10; j++){
                result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }  
        }
    }
} 