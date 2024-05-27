import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("basedir");
        File[] dirs = file.listFiles();
        int[] num = new int[dirs.length];
        String[] filePaths;
        for (int i = 0; i < dirs.length; i++) {
            filePaths = dirs[i].list();
            if (filePaths != null)
                num[i] = filePaths.length;
        }
        int maxNum = Integer.MIN_VALUE;
        int maxIndex = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (maxNum < num[i]){
                maxNum = num[i];
                maxIndex = i;
            }
        }
        System.out.println(dirs[maxIndex].getName());
    }
}