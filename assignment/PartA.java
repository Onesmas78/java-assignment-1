/**
 * Part A — Variables, data types and operators (Java Classes 1–3)
 *
 * Replace each "TODO" line with your code. Every method must RETURN its
 * answer (do not print it). Do not change method names or parameters.
 *
 * Check your work any time (from the repository's main folder):
 *     javac -d out assignment/*.java checker/*.java
 *     java -cp out Checker
 */
public class PartA {

    /**
     * A1. Convert a temperature from Celsius to Fahrenheit.
     * Formula: F = C × 9 / 5 + 32
     *
     * celsiusToFahrenheit(100)  → 212.0
     * celsiusToFahrenheit(0)    → 32.0
     * celsiusToFahrenheit(37)   → 98.6
     */
    public static double celsiusToFahrenheit(double celsius) {
        return 0; // TODO
    }

    /**
     * A2. Turn a number of seconds into minutes and seconds.
     * Use integer division (/) and remainder (%).
     *
     * formatDuration(125) → "2 min 5 s"
     * formatDuration(60)  → "1 min 0 s"
     * formatDuration(59)  → "0 min 59 s"
     */
    public static String formatDuration(int totalSeconds) {
        return ""; // TODO
    }

    /**
     * A3. Return the exact average of three whole numbers.
     * Careful: 7 / 2 is 3 in Java, not 3.5!
     *
     * averageOfThree(70, 80, 95) → 81.666666...
     * averageOfThree(1, 2, 2)    → 1.666666...
     */
    public static double averageOfThree(int a, int b, int c) {
        return 0; // TODO
    }

    /**
     * A4. Add 16% VAT to a price and round to 2 decimal places.
     * - Declare the rate as a constant: final double VAT_RATE = 0.16;
     * - Hint for rounding: Math.round(x * 100) / 100.0
     *
     * priceWithVat(100)   → 116.0
     * priceWithVat(65)    → 75.4
     * priceWithVat(99.99) → 115.99
     */
    public static double priceWithVat(double price) {
        return 0; // TODO
    }

    /**
     * A5. A person can vote if they are 18 or older AND have an ID.
     * Return true or false using comparison and logical operators
     * (no if statement needed).
     *
     * canVote(21, true)  → true
     * canVote(18, true)  → true
     * canVote(17, true)  → false
     * canVote(30, false) → false
     */
    public static boolean canVote(int age, boolean hasId) {
        return false; // TODO
    }
}
