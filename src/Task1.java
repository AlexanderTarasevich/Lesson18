import java.util.ArrayList;
import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(11);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.add(17);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(10);

        Optional<Integer> result =arrayList.stream().distinct().filter(number -> number % 2 == 0).reduce((s1, s2) -> s1 + s2);

        System.out.println(result);
    }
}
