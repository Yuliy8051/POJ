import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = pobierz(scanner);
        int b = pobierz(scanner);
        int c = 0;
        char operation;
        System.out.println("Wybierz: +, -, *, /");
        operation = scanner.nextLine().charAt(0);
        if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            throw new IllegalArgumentException("Wrong symbol!");
        }
        switch (operation){
            case '+':
                c = a + b;
                break;
            case '-':
                c = a - b;
                break;
            case '*':
                c = a * b;
                break;
            case '/':
                try {
                    c = a / b;
                }catch (ArithmeticException e){
                    e.printStackTrace();
                }
                break;
        }
        System.out.println(c);
    }
    public static int pobierz (Scanner scanner) {
        try{
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
            return pobierz(scanner);
        }

    }
}