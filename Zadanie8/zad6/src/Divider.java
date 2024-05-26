import javax.swing.*;

public class Divider {
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog(null, "Podaj liczbę");
        String divider = JOptionPane.showInputDialog(null, "Podaj dzielnik");
        int result;
        try{
            result = convertToInteger(number)/convertToInteger(divider);
        }catch (ArithmeticException e){
            throw new ArithmeticException("Błąd, nie można dzielić przez zero");
        }
        JOptionPane.showMessageDialog(null, String.format("Wynik dzielenia to %d", result));
    }

    private static int convertToInteger(String number){
        try{
            return Integer.parseInt(number);
        }catch (NumberFormatException e){
            System.out.println("To musi być liczba");
            return convertToInteger(number);
        }
    }
}
