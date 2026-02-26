import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        System.out.println(map.put(1, "first"));
        System.out.println(map.put(2, "second"));
        System.out.println(map.put(3, "third"));

        for (Map.Entry<Integer, String> i : map.entrySet()) {
            System.out.println(i.getKey());
            System.out.println(i.getValue());
        }
    }
}
