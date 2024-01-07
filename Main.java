import java.util.Scanner;

import java.util.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int number;
        int even = 0;
        int odd = 0;
        do{
            System.out.println("Enter the number:");
            number = sc.nextInt();
            if (number%2==0){
                even += number;
            }else {
                odd +=number;
            }
            System.out.println("1 or 0");
            choice = sc.nextInt();
        }
        while (choice==1);
        System.out.println("even:" + even);
        System.out.println("odd:" + odd);





    }
}
