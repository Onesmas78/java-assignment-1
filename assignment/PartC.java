import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Part C — Arrays, ArrayList, HashMap and HashSet (Java Class 3)
 *
 * Replace each "TODO" line with your code. Every method must RETURN its
 * answer (do not print it). Do not change method names or parameters.
 *
 * You may use the for-each loop we used in class:
 *     for (int n : numbers) { ... }
 */
public class PartC {

    /**
     * C1. Return the LAST number in the array (the array is never empty).
     *
     * lastElement(new int[]{4, 8, 15}) → 15
     * lastElement(new int[]{42})       → 42
     */
    public static int lastElement(int[] numbers) {
        return 0; // TODO
    }

    /**
     * C2. Return a NEW array with the same numbers in ascending order.
     * The original array must NOT change.
     * Hint: Arrays.copyOf(numbers, numbers.length) makes a copy,
     *       then Arrays.sort(...) sorts it.
     *
     * sortedCopy(new int[]{3, 1, 2}) → [1, 2, 3]   (original still [3, 1, 2])
     */
    public static int[] sortedCopy(int[] numbers) {
        return null; // TODO
    }

    /**
     * C3. Return the total of all numbers in the array (0 if it is empty).
     * Use the for-each loop and the accumulator pattern from class.
     *
     * sum(new int[]{72, 55, 89}) → 216
     * sum(new int[]{})           → 0
     */
    public static int sum(int[] numbers) {
        return 0; // TODO
    }

    /**
     * C4. Return how many DIFFERENT items are in the list.
     * Hint: a HashSet ignores values it already has.
     *
     * uniqueCount(["Nairobi", "Mombasa", "Nairobi"]) → 2
     * uniqueCount([])                                → 0
     */
    public static int uniqueCount(ArrayList<String> items) {
        return 0; // TODO
    }

    /**
     * C5. Count how many times each word appears in a sentence.
     * - Count words in lowercase ("The" and "the" are the same word).
     * - Words are separated by single spaces.
     * Hint: sentence.toLowerCase().split(" ") gives a String[] of words.
     *       Then use the counting pattern from class:
     *       counts.put(word, counts.getOrDefault(word, 0) + 1);
     *
     * wordCount("the cat and the hat") → {the=2, cat=1, and=1, hat=1}
     */
    public static HashMap<String, Integer> wordCount(String sentence) {
        return null; // TODO
    }
}
