# Java Assignment 1: Practice for Classes 1–3

This assignment has **15 short exercises** on what you've learned so far: variables, data types, operators, Strings, arrays, `ArrayList`, `HashMap` and `HashSet`. It is checked automatically every time you push your code to GitHub.

**Deadline:** _\<your instructor will fill this in\>_
**Score:** 1 point per exercise, 15 points total.

| File | Exercises | Topics |
| --- | --- | --- |
| `assignment/PartA.java` | A1–A5 | Variables, casting, operators, constants |
| `assignment/PartB.java` | B1–B5 | String methods, `Integer.parseInt`, `String.format` |
| `assignment/PartC.java` | C1–C5 | Arrays, `ArrayList`, `HashSet`, `HashMap` |

Each exercise is a method with a description and examples. Replace the line marked `// TODO` with your code. **Use `return`, not `System.out.println`.** The checker looks at what your method gives back.

**Before you start:** do the ungraded drills in [`PRACTICE.md`](PRACTICE.md). They practise exactly the skills this assignment needs.

---

## Step 1: Get your own copy on GitHub

1. Sign in to [github.com](https://github.com). Create a free account if you don't have one; if you did the Python assignment, use the same account.
2. Open the assignment link your instructor shared. Click **Use this template** → **Create a new repository**.
3. Fill in the form:
   - **Repository name:** `java-assignment-1-<yourname>`, e.g. `java-assignment-1-amina`
   - **Visibility:** **Private**
   - Click **Create repository**.
4. Give your instructor access: **Settings → Collaborators → Add people**, then type your instructor's GitHub username.
5. Copy your repository's address: green **Code** button → **HTTPS** → copy.

## Step 2: Connect Git to GitHub (skip if you did this for Python)

```bash
git config --global user.name "Your Name"
git config --global user.email "you@example.com"
```

| OS | Install the GitHub CLI |
| --- | --- |
| Windows | `winget install --id GitHub.cli -e` |
| macOS | `brew install gh` |
| Ubuntu / Debian | `sudo apt install gh` |
| Fedora | `sudo dnf install gh` |

Reopen your terminal, then:

```bash
gh auth login        # GitHub.com → HTTPS → Yes → Login with a web browser
gh auth setup-git
gh auth status       # should say: Logged in to github.com
```

## Step 3: Clone your repository

```bash
cd ~/java-intro
git clone https://github.com/<your-username>/java-assignment-1-<yourname>.git
cd java-assignment-1-<yourname>
code .
```

Check Java is ready: `java -version` and `javac -version` should both say **25**.

## Step 4: Do the exercises and check them on your computer

From the repository's **main folder** (the one containing this README), run these two commands. They are the same on Windows, macOS and Linux:

```bash
javac -d out assignment/*.java checker/*.java
java -cp out Checker
```

- `javac -d out ...` compiles your code and the checker into a folder called `out`.
- `java -cp out Checker` runs the checker from that folder.

At the start, every exercise says `FAIL`. That is expected. Each one you finish turns into `PASS`, and the last line shows your score, e.g. `Score: 7/15`. A `FAIL` line tells you what was expected and what your method returned.

**Important:** if *any* file has a compile error, `javac` stops and **nothing** is checked. Fix the error it reports (file name and line number), then run both commands again. If you're stuck on an exercise, leave its `return` line as it was so the rest still compiles.

**Tip:** to try one method by hand, use `jshell`:

```text
jshell assignment/PartA.java
jshell> PartA.formatDuration(125)
$2 ==> "2 min 5 s"
jshell> /exit
```

## Step 5: Save (commit) and submit (push)

Commit **after you finish each part**, so you have at least 3 commits by the end.

```bash
git status                                  # see which files changed
git add assignment/PartA.java               # stage the file you changed
git commit -m "Complete Part A exercises"   # save a snapshot
git push                                    # upload to GitHub = submit
```

Repeat for Parts B and C. Every `git push` sends your latest work. Your instructor grades the last commit you pushed **before the deadline**. Check your history with `git log --oneline`.

## Step 6: See your score on GitHub

1. Open your repository on github.com and click the **Actions** tab.
2. Click the latest **Check answers** run. Wait for the green ✓ or red ✗ (about 1 minute).
3. Click the **check** job, then open the **Run the checks and show the score** step to see each exercise and your score.

A red ✗ only means some exercises aren't passing yet. Fix them, commit, push again, and a new run starts. If the **Compile** step is red, your code has a compile error: read the message there.

---

## Rules

- **Don't edit anything in `checker/` or `.github/`.** Your instructor grades with an original copy of the checker.
- **Don't rename methods or change their parameters.** The checker calls them by name.
- **Your own work.** You may use class notes and the Java documentation. Discuss ideas with classmates, but don't copy code.
- **Don't commit the `out/` folder.** The included `.gitignore` already skips it.

## Troubleshooting

| Problem | Fix |
| --- | --- |
| `error: file not found: assignment/*.java` | You're in the wrong folder. `cd` into the repository's main folder (it contains `README.md`). |
| `error: cannot find symbol` | Check the spelling and capitals of the name it shows. Add the missing `import` if it's `ArrayList`, `HashMap`, `HashSet` or `Arrays`. |
| `error: missing return statement` | Every method must `return` a value of its type. |
| `error: incompatible types` | You're returning the wrong type, e.g. an `int` where a `String` is expected. |
| `Error: Could not find or load main class Checker` | Run the `javac` command first, and type `java -cp out Checker` exactly. |
| `FAIL ... crashed with NullPointerException` | Your method still returns `null`, or uses a `null` value. |
| `FAIL ... crashed with ArrayIndexOutOfBoundsException` | An index is too big. The last index is `length - 1`. |
| Prices show `65,00` instead of `65.00` | The checker handles this. Make sure you used `%.2f`. |
| `git push` rejected: *fetch first* | Run `git pull`, then `git push`. |
| `git push` asks for a password | Redo Step 2: `gh auth login` then `gh auth setup-git`. |
