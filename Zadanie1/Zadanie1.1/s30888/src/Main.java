import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));
//
//        Scanner nr1 = new Scanner(System.in);
//
//        float num = nr1.nextFloat();
//
//        System.out.println((9.0f / 5.0f) * num + 32); // sout

//        float mile = 1.609f;
//        System.out.println("Miles\tKilometers");
//        for (int i = 1; i < 11; i++) {
//            System.out.println(i + "\t\t" + i * mile);
//        }

//        int num;
//        Scanner nr2 = new Scanner(System.in);
//        num = nr2.nextInt();
//        if (num == 1) System.out.println("Poniedziałek");
//        else if (num == 2) System.out.println("Wtorek");
//        else if (num == 3) System.out.println("Środa");
//        else if (num == 4) System.out.println("Czwartek");
//        else if (num == 5) System.out.println("Piątek");
//        else if (num == 6) System.out.println("Sobota");
//        else if (num == 7) System.out.println("Niedziela");

//        Scanner scan = new Scanner(System.in);
//        int AmountOfOperations = scan.nextInt();
//        char[] Array = new char[AmountOfOperations];
//        for (int i = 0; i < AmountOfOperations; i++) {
//            Array[i] = scan.next().charAt(0);
//        }
//        for (int i = 0; i < AmountOfOperations; i++) {
//            System.out.println(Array[i]);
//        }

//        Scanner scan = new Scanner(System.in);
//        int AmountOfElements = scan.nextInt();
//        int[] Array = new int[AmountOfElements];
//        Array[0] = scan.nextInt();
//        if (Array[0] % 2 == 0) Array[1] = Array[0] + 2;
//        else Array[1] = Array[0] + 1;
//        for (int i = 2; i < AmountOfElements; i++) {
//            Array[i] = Array[i-1] + 2;
//        }
//        for (int i = 0; i < AmountOfElements; i++) {
//            System.out.println(Array[i]);
//        }
//        int minValue = TheSmallestElement(Array);
//        System.out.println("Min: " + minValue);
//        int maxValue = TheLargestElement(Array);
//        System.out.println("Max: " + maxValue);
//        int sum = TheSumOfElements(Array);
//        System.out.println("Sama: " + sum);
//        float Average = TheAverageValue(Array);
//        System.out.println("Średnia: " + Average);
//        int index = TheIndexOfMedian(Array);
//        if (AmountOfElements % 2 == 1) System.out.println("Mediana: " + Array[TheIndexOfMedian(Array)]);
//        else System.out.println("Mediana: " + Array[index] + " " + Array[index + 1]);


        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int NWD = Euclides(num1, num2);
        System.out.println(NWD);
    }

    public static int TheSmallestElement (int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }
        return min;
    }
    public static int TheLargestElement (int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        return max;
    }
    public static int TheSumOfElements (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static float TheAverageValue (int[] arr) {
        int Average = 0;
        for (int i = 0; i < arr.length; i++) {
            Average += arr[i];
        }
        Average /= arr.length;
        return Average;
    }
    public static int TheIndexOfMedian (int[] arr) {
        return arr.length/2;
    }

    public static int Euclides (int num1, int num2) {
        int NWD = 0;
        while (true) {
            if (num1 == 0 || num2 == 0) break;
            else if (num1 > num2) num1 %= num2;
            else num2 %= num1;
        }
        if (num1 == 0) NWD = num2;
        else NWD = num1;
        return NWD;
    }
}