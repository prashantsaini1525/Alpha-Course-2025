# Binary to Decimal Conversion

Binary numbers use base‑2, meaning each digit represents a power of 2. Converting a binary number to a decimal (base‑10) number involves multiplying each binary digit by the corresponding power of 2 and then summing all these products.

## Conversion Formula

For a binary number \( b_n b_{n-1} \ldots b_1 b_0 \):

\[
\text{Decimal} = b_n \times 2^n + b_{n-1} \times 2^{n-1} + \cdots + b_1 \times 2^1 + b_0 \times 2^0
\]

- \( b_i \) is the binary digit (either 0 or 1) at position \( i \) (with \( b_0 \) being the rightmost digit).
- \( 2^i \) is the power of 2 corresponding to that position.

## Step-by-Step Conversion Process

1. **Write down the binary number.**  
   For example, consider the binary number **1010**.

2. **Label each digit with its corresponding power of 2.**  
   Starting from the right (least significant digit):
   - The rightmost digit is \( b_0 \) and corresponds to \( 2^0 \).
   - The next digit to the left is \( b_1 \) and corresponds to \( 2^1 \), and so on.

3. **Multiply each digit by its corresponding power of 2.**  
   For the binary number 1010 (from left to right):  
   - \( 1 \times 2^3 = 1 \times 8 = 8 \)
   - \( 0 \times 2^2 = 0 \times 4 = 0 \)
   - \( 1 \times 2^1 = 1 \times 2 = 2 \)
   - \( 0 \times 2^0 = 0 \times 1 = 0 \)

4. **Sum all the products to get the decimal number.**  
   \( 8 + 0 + 2 + 0 = 10 \)

Thus, **1010 in binary is 10 in decimal**.

## Conversion Table: Binary (0 to 10) Examples

| Binary | Calculation                                                                          | Decimal |
|--------|--------------------------------------------------------------------------------------|---------|
| 0      | \(0 \times 2^0 = 0\)                                                                 | 0       |
| 1      | \(1 \times 2^0 = 1\)                                                                 | 1       |
| 10     | \(1 \times 2^1 + 0 \times 2^0 = 2 + 0 = 2\)                                          | 2       |
| 11     | \(1 \times 2^1 + 1 \times 2^0 = 2 + 1 = 3\)                                          | 3       |
| 100    | \(1 \times 2^2 + 0 \times 2^1 + 0 \times 2^0 = 4 + 0 + 0 = 4\)                       | 4       |
| 101    | \(1 \times 2^2 + 0 \times 2^1 + 1 \times 2^0 = 4 + 0 + 1 = 5\)                       | 5       |
| 110    | \(1 \times 2^2 + 1 \times 2^1 + 0 \times 2^0 = 4 + 2 + 0 = 6\)                       | 6       |
| 111    | \(1 \times 2^2 + 1 \times 2^1 + 1 \times 2^0 = 4 + 2 + 1 = 7\)                       | 7       |
| 1000   | \(1 \times 2^3 + 0 \times 2^2 + 0 \times 2^1 + 0 \times 2^0 = 8 + 0 + 0 + 0 = 8\)    | 8       |
| 1001   | \(1 \times 2^3 + 0 \times 2^2 + 0 \times 2^1 + 1 \times 2^0 = 8 + 0 + 0 + 1 = 9\)    | 9       |
| 1010   | \(1 \times 2^3 + 0 \times 2^2 + 1 \times 2^1 + 0 \times 2^0 = 8 + 0 + 2 + 0 = 10\)   | 10      |

## Additional Examples

### Example: Converting 1101 to Decimal

1. **Assign powers of 2 (from right to left):**  
   - \( 1 \times 2^3 = 1 \times 8 = 8 \)
   - \( 1 \times 2^2 = 1 \times 4 = 4 \)
   - \( 0 \times 2^1 = 0 \times 2 = 0 \)
   - \( 1 \times 2^0 = 1 \times 1 = 1 \)

2. **Sum the results:**  
   \( 8 + 4 + 0 + 1 = 13 \)

So, **1101 in binary is 13 in decimal**.

## Conclusion

Converting binary to decimal involves multiplying each binary digit by the corresponding power of 2 and adding the results. With practice, this process becomes quick and intuitive. Use the provided table and examples as a reference until you master binary-to-decimal conversion.

*Happy converting!*
