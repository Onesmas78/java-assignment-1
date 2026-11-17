// Bug 3: should print "Average: 2.5" — it won't compile, and the maths is wrong too.
public class Bug3 {
    public static void main(String[] args) {
        int total = 10;
        int count = 4;
        int average = total / count;
        double exact = total / count;
        String label = 'Average: ';
        System.out.println(label + exact);
    }
}
