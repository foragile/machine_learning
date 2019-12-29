import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<Integer, String>(Collections.reverseOrder());
        map.put(2, "a");
        map.put(1, "b");
        map.put(3, "c");
        System.out.println(map);
    }
}
