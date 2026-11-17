/**
 * Part B — Strings (Java Class 3)
 *
 * Replace each "TODO" line with your code. Every method must RETURN its
 * answer (do not print it). Do not change method names or parameters.
 *
 * Useful String methods: trim(), toUpperCase(), toLowerCase(), length(),
 * charAt(i), substring(start, end), repeat(n), equals(...)
 */
public class PartB {

    /**
     * B1. Return a person's initials in capitals, each followed by a dot.
     * Names may have extra spaces around them and may be lowercase.
     * Hint: substring(0, 1) gives the first letter as a String.
     *
     * initials("amina", "wanjiru")    → "A.W."
     * initials("  brian ", "Otieno")  → "B.O."
     */
    public static String initials(String firstName, String lastName) {
        return ""; // TODO
    }

    /**
     * B2. Remove spaces from both ends, make it uppercase, and add "!".
     *
     * shout("  hello there ") → "HELLO THERE!"
     * shout("java")           → "JAVA!"
     */
    public static String shout(String message) {
        return ""; // TODO
    }

    /**
     * B3. Hide all but the last 4 digits of a phone number with '*'.
     * Hint: "*".repeat(3) gives "***"
     *
     * maskPhone("0712345678")   → "******5678"
     * maskPhone("254712345678") → "********5678"
     */
    public static String maskPhone(String phone) {
        return ""; // TODO
    }

    /**
     * B4. Both inputs are numbers typed as text (they may have spaces
     * around them). Convert them to int and return their sum.
     * Hint: Integer.parseInt(...) — and trim() first!
     *
     * addNumbers("21", "4")    → 25
     * addNumbers(" 7 ", "-10") → -3
     */
    public static int addNumbers(String a, String b) {
        return 0; // TODO
    }

    /**
     * B5. Build one receipt line. Prices always show 2 decimal places.
     * Hint: String.format works exactly like printf, but RETURNS the text:
     *       String.format("%d x %s", 3, "Bread") → "3 x Bread"
     *
     * receiptLine("Bread", 3, 65)    → "3 x Bread @ KES 65.00 = KES 195.00"
     * receiptLine("Milk", 2, 59.5)   → "2 x Milk @ KES 59.50 = KES 119.00"
     */
    public static String receiptLine(String item, int quantity, double unitPrice) {
        return ""; // TODO
    }
}
