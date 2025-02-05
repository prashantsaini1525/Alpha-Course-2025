
# Example Walkthrough

### Example 1: Prime Number Check for 29

Let’s go through an example. Suppose the user inputs `29`.

1. The program checks if `29 <= 1`, which is **false**, so it moves to the next condition.
2. It checks if `29 == 2`, which is also **false**, so it moves to the loop.
3. The `for` loop starts at `i = 2` and goes up to `Math.sqrt(29)` (which is approximately `5.39`, so the loop will check up to `i = 5`).
4. The program checks if `29 % 2 == 0`, which is **false**, then checks `29 % 3 == 0`, `29 % 4 == 0`, and `29 % 5 == 0`, all of which are **false**.
5. Since no divisor was found, `isPrime` remains **true**, and the program prints "`29 is a Prime Number`".

### Example 2: Non-Prime Number Check for 30

Now, let’s take an example with a non-prime number, like `30`.

1. The program checks if `30 <= 1`, which is **false**, so it moves to the next condition.
2. It checks if `30 == 2`, which is also **false**, so it moves to the loop.
3. The `for` loop starts at `i = 2` and goes up to `Math.sqrt(30)` (which is approximately `5.47`).
4. The program checks if `30 % 2 == 0`, which is **true**. Since a divisor is found, `isPrime` is set to **false**, and the loop breaks.
5. The program prints "`30 is not a Prime Number`".
