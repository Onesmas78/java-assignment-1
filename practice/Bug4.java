// Bug 4: should print [72, 91] then 2 — it won't compile.
public class Bug4 {
    public static void main(String[] args) {
        ArrayList<int> marks = new ArrayList<>();
        marks.add(72);
        marks.add(91);
        System.out.println(marks);
        System.out.println(marks.length);
    }
}
