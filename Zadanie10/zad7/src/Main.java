import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student patryk = new Student("Patryk", "Andrzejewski", "s30296");
        Student witold = new Student("Witold", "Anisimow ", "s32007");
        Student szymon = new Student("Szymon", "Baniewicz ", "s27087");
        Student[] students = {patryk, witold, szymon};
        Arrays.sort(students);
        for (Student student : students){
            System.out.println(student);
        }
    }
}