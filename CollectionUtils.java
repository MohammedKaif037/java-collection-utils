import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

interface Filter<T> {
    T apply(T o);
}

public class CollectionUtils {

    public static <T> T[] filter(T[] array, Filter<T> filter) {
        @SuppressWarnings("unchecked")
        T[] result = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length);
        for (int i = 0; i < array.length; i++) {
            result[i] = filter.apply(array[i]);
        }
        return result;
    }

    public static <T> Map<T, Integer> countElements(T[] array) {
        Map<T, Integer> counts = new HashMap<>();
        for (T element : array) {
            counts.put(element, counts.getOrDefault(element, 0) + 1);
        }
        return counts;
    }
}
