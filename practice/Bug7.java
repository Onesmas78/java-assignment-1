import java.util.Scanner;

// Bug 7: compiles and runs, but never lets you type your city.
// Run it, type an age and press Enter, and watch what happens.
public class Bug7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Age: ");
        int age = input.nextInt();
        System.out.print("City: ");
        String city = input.nextLine();
        System.out.println(age + " years old, from " + city);
    }
}
