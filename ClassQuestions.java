package Arrays;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class ClassQuestions {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        // Union
        Set<Integer> unionSet = new HashSet<>();
        for (int num : arr1) {
            unionSet.add(num);
        }
        for (int num : arr2) {
            unionSet.add(num);
        }
        System.out.println("Union: " + unionSet);
        // Intersection
        Set<Integer> intersectionSet = new HashSet<>();
        for (int num : arr1) {
            intersectionSet.add(num);
        }
        intersectionSet.retainAll(Arrays.asList(4, 5, 6, 7, 8));
        System.out.println("Intersection: " + intersectionSet);
    }
}
