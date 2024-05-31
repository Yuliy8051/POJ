import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(3);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(5);
        System.out.println(remove(integerList));
        System.out.println(clones(integerList));
    }
    public static List<Integer> clones(List<Integer> list){
        Set<Integer> integerSet = new HashSet<>();
        List<Integer> dublikaty = new ArrayList<>();
        for (Integer list1 : list){
            if (!integerSet.contains(list1))
                integerSet.add(list1);
            else
                dublikaty.add(list1);

        }
        return dublikaty;
    }
    public static Set<Integer> remove(List<Integer> list){
        Set<Integer> integerSet = new HashSet<>();
        integerSet.addAll(list);
        return integerSet;
    }
}