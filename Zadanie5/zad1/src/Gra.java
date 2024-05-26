import java.util.Scanner;

public class Gra {
    private int num;
    private int lowerNum;
    private int upperNum;
    private int userNum;

    public void start() {
        Scanner scanner = new Scanner(System.in);
        this.lowerNum = scanner.nextInt();
        this.upperNum = scanner.nextInt();
        this.num = (int)(Math.random() * this.upperNum) + this.lowerNum;
        System.out.println("Jaka jest liczba?");
        for (int i = 0; i < 5; i++) {
            this.userNum = scanner.nextInt();
            if (this.userNum == this.num) {
                System.out.println("Wygrałeś");
                break;
            }
            else if (this.userNum > this.num) {
                System.out.println("za duża");
            }
            else {
                System.out.println("za mała");
            }
            if (i == 5) System.out.println("Porażka. Liczba: " + this.num);
        }
    }
}
