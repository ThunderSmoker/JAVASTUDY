import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListOperations {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));

        // Add elements
        numbers.add(4);
        numbers.add(6);
        System.out.println("ArrayList after adding elements: " + numbers);

        // Delete element
        numbers.remove(1);
        System.out.println("ArrayList after removing element: " + numbers);

        // Search element
        int index = numbers.indexOf(8);
        System.out.println("Index of element 8: " + index);

        // Fill elements
        Collections.fill(numbers, 0);
        System.out.println("ArrayList after filling with 0: " + numbers);

        // Sort in ascending order
        Collections.sort(numbers);
        System.out.println("ArrayList after sorting in ascending order: " + numbers);

        // Sort in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("ArrayList after sorting in descending order: " + numbers);
    }
}

