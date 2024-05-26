import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TaskStar {
    public static void main(String[] args) {
        Map<Integer, String> userData = new HashMap<>();
        userData.put(1, "Вова");
        userData.put(121, "Бобик");
        userData.put(3, "Руслан");
        userData.put(9, "Жорик");
        userData.put(13, "Жасмин");
        userData.put(6, "Ирина");
        userData.put(22, "Анна");
        userData.put(2, "Серега");
        userData.put(5, "Александр");

        List<String> reversedNames = userData.entrySet().stream()
                .filter(entry -> List.of(1, 2, 5, 8, 9, 13).contains(entry.getKey()))
                .filter(entry -> entry.getValue().length() % 2 != 0)
                .map(entry -> new StringBuilder(entry.getValue()).reverse().toString())
                .collect(Collectors.toList());

        if (reversedNames.isEmpty()) {
            System.out.println("Подходящих данных нет!");
        } else {
            System.out.println(reversedNames);
        }
    }
}
