package cs61b.ch5.Map61B;

import java.util.Comparator;
import java.util.List;

public class MapHelper {
    public static <K, V> V get(Map61B<K, V> map61B, K key) {
        if (map61B.containsKey(key)) {
            return map61B.get(key);
        }
        return null;
    }

    public static <K extends Comparable<K>, V> K maxKey(Map61B<K, V> map61B) {
        List<K> keys = map61B.keys();
        K largest = keys.get(0);
        for (K key : keys) {
            if (key.compareTo(largest) > 0) {
                largest = key;
            }
        }
        return largest;

    }
}
