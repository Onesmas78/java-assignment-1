import java.util.HashMap;

// Bug 6: compiles, but crashes when run. Should print: Sugar costs KES 0
public class Bug6 {
    public static void main(String[] args) {
        HashMap<String, Integer> prices = new HashMap<>();
        prices.put("bread", 65);
        prices.put("milk", 60);
        int sugar = prices.get("sugar");
        System.out.println("Sugar costs KES " + sugar);
    }
}
