// Bug 5: compiles, but crashes when run. Should print: Last mark: 64
public class Bug5 {
    public static void main(String[] args) {
        int[] marks = {72, 55, 89, 64};
        int last = marks[marks.length];
        System.out.println("Last mark: " + last);
    }
}
