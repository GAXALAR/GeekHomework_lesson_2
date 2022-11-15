import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("введите операцию");
        System.out.println("1. сложение");
        System.out.println("2. вычитание");
        System.out.println("3. умножение");
        Scanner scanner = new Scanner (System.in);
        int operation=scanner.nextInt();
        System.out.println("enter first number");
        int a = scanner.nextInt();
        System.out.println("enter second number");
        int b = scanner.nextInt();
        int result;
        if(operation == 1) { result = a + b;}
        else if (operation == 2) {result = a - b;}
        else {result = a * b;}
        System.out.println("result = " + result);


    }

}
