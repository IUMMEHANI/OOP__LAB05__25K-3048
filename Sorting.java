package Arrays;
import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        String[] names = {"Hamna", "Sarim", "Kainat", "Hani", "Nida"};
        // Sorting the array (lexicographically)
        Arrays.sort(names);
        // Print sorted array
        System.out.println("Sorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
