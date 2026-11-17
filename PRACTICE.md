# Technical Practice: Java Classes 1–3

These drills are **not graded**. They train the skills the assignment needs: reading code, predicting what it does, and fixing errors from the compiler's messages. Do them **before** starting the assignment. Your instructor has the answers.

---

## 1. Predict the output (no computer!)

Write down what each snippet prints. Then check yourself: paste a snippet into `jshell`, or put it inside a `main` method and run it.

| # | Code | Your answer |
| --- | --- | --- |
| 1 | `System.out.println(7 / 2);` | |
| 2 | `System.out.println(7 / 2.0);` | |
| 3 | `System.out.println("Sum: " + 2 + 3);` | |
| 4 | `System.out.println(2 + 3 + " is the sum");` | |
| 5 | `int x = 5; int y = x++; System.out.println(x + " " + y);` | |
| 6 | `System.out.println((int) 9.99);` | |
| 7 | `System.out.println('A' + 1);` | |
| 8 | `String s = "Nairobi"; System.out.println(s.substring(2, 5).toUpperCase());` | |
| 9 | `int[] a = {3, 1, 2}; System.out.println(a.length + a[1]);` | |
| 10 | An `ArrayList<Integer>` holds `10, 20, 30`. Then `list.remove(1);` and `System.out.println(list);` | |
| 11 | `m.put("a", 1); m.put("a", 2); System.out.println(m.size() + " " + m.get("a"));` (`m` is a `HashMap<String, Integer>`) | |
| 12 | `String a = "hi"; a.toUpperCase(); System.out.println(a);` | |

---

## 2. Fix the bug

The `practice/` folder has seven broken programs. For each one:

1. Read the comment at the top: it says what the program **should** do.
2. From inside `practice/`, compile it with `javac Bug1.java`, then run it with `java Bug1`. Use these two separate steps, not the `java Bug1.java` shortcut, which skips some of the checks we want to see.
3. Read the error message: the **file name**, the **line number**, and **what Java expected**.
4. Fix it, run it again, and repeat until the output matches the comment.

| File | Type of problem |
| --- | --- |
| `Bug1.java` | Won't compile (2 mistakes) |
| `Bug2.java` | Won't compile (1 mistake) |
| `Bug3.java` | Won't compile, **and** prints the wrong number once it does |
| `Bug4.java` | Won't compile (3 mistakes) |
| `Bug5.java` | Compiles but crashes |
| `Bug6.java` | Compiles but crashes |
| `Bug7.java` | Runs, but skips a question |

**Tip:** the compiler often reports only the first mistake. When you fix it, the next one appears. That is normal, so keep going.

---

## 3. Short answers

Answer in one or two sentences each.

1. What is the difference between the JDK, the JRE and the JVM?
2. What does `javac` produce, and which program runs that output?
3. Why must `public class Receipt` be saved in a file called `Receipt.java`?
4. Why can't you write `ArrayList<int>`? What do you write instead?
5. When would you choose an array instead of an `ArrayList`?
6. What does `HashMap.get` return for a key that isn't there, and how do you avoid problems with it?
7. Why should Strings be compared with `.equals()` instead of `==`?

---

## 4. Mini challenges (write from scratch)

Create each file in `practice/` and run it with `java FileName.java`.

1. **`BmiCalculator.java`**: ask for weight (kg) and height (m) with `Scanner`, then print the BMI to 1 decimal place using `printf`. (BMI = weight ÷ height²)
2. **`Initials.java`**: ask for a full name on one line (e.g. `amina wanjiru`) and print the initials, `A.W.` Hint: `indexOf(" ")` finds the space.
3. **`FruitBasket.java`**: put five fruits in an `ArrayList<String>`, including one repeat. Print the list, its size, and how many *different* fruits there are (use a `HashSet`).
4. **`Countries.java`**: make a `HashMap<String, String>` of four countries and their capitals. Ask for a country and print its capital, or `Unknown`.
