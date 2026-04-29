import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Filter Method Example:");
        // Example 1.1: Convert strings to uppercase
        System.out.println("Example 1: Uppercase transformation");
        String[] words = {"hello", "world", "java", "programming"};
        
        Filter<String> toUpper = new Filter<String>() {
            @Override
            public String apply(String o) {
                return o.toUpperCase();
            }
        };
        
        String[] upperWords = CollectionUtils.filter(words, toUpper);
        
        System.out.print("Original: ");
        printArray(words);
        System.out.print("Filtered: ");
        printArray(upperWords);
        
        System.out.println();
        
        // Example 1.2: Double numbers
        System.out.println("Example 2: Double numbers");
        Integer[] numbers = {1, 2, 3, 4, 5};
        
        Filter<Integer> doubleIt = new Filter<Integer>() {
            @Override
            public Integer apply(Integer o) {
                return o * 2;
            }
        };
        
        Integer[] doubled = CollectionUtils.filter(numbers, doubleIt);
        
        System.out.print("Original: ");
        printArray(numbers);
        System.out.print("Filtered: ");
        printArray(doubled);
        
        System.out.println();
        
        System.out.println("Count Elements Examples");
        
        // Example 2.1: Count fruits
        System.out.println("Example 1: Counting fruits");
        String[] fruits = {"apple", "banana", "apple", "cherry", "banana", "apple"};
        Map<String, Integer> fruitCounts = CollectionUtils.countElements(fruits);
        
        System.out.print("Array: ");
        printArray(fruits);
        System.out.println("Counts:");
        printMap(fruitCounts);
        
        System.out.println();
        
        // Example 2.2: Count numbers
        System.out.println("Example 2: Counting numbers");
        Integer[] numbersWithDuplicates = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5};
        Map<Integer, Integer> numberCounts = CollectionUtils.countElements(numbersWithDuplicates);
        
        System.out.print("Array: ");
        printArray(numbersWithDuplicates);
        System.out.println("Counts:");
        printMap(numberCounts);
        
        System.out.println();
        
    
    }
    
    // Helper method to print arrays nicely
    public static <T> void printArray(T[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    // Helper method to print maps nicely
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("  " + entry.getKey() + " → " + entry.getValue());
        }
    }
}
