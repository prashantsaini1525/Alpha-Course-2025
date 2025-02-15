# Decimal to Binary Conversion: 0 to 10 with Solutions

This guide demonstrates how to convert decimal numbers (base‑10) from 0 to 10 into binary (base‑2) using the division-by-2 method. Each conversion is explained step by step.

## Conversion Table

| Decimal | Binary | Brief Explanation                                                                                            |
|---------|--------|--------------------------------------------------------------------------------------------------------------|
| 0       | 0      | 0 ÷ 2 = 0 remainder **0**.                                                                                   |
| 1       | 1      | 1 ÷ 2 = 0 remainder **1**.                                                                                   |
| 2       | 10     | 2 ÷ 2 = 1 remainder **0**; 1 ÷ 2 = 0 remainder **1**.                                                        |
| 3       | 11     | 3 ÷ 2 = 1 remainder **1**; 1 ÷ 2 = 0 remainder **1**.                                                        |
| 4       | 100    | 4 ÷ 2 = 2 remainder **0**; 2 ÷ 2 = 1 remainder **0**; 1 ÷ 2 = 0 remainder **1**.                             |
| 5       | 101    | 5 ÷ 2 = 2 remainder **1**; 2 ÷ 2 = 1 remainder **0**; 1 ÷ 2 = 0 remainder **1**.                             |
| 6       | 110    | 6 ÷ 2 = 3 remainder **0**; 3 ÷ 2 = 1 remainder **1**; 1 ÷ 2 = 0 remainder **1**.                             |
| 7       | 111    | 7 ÷ 2 = 3 remainder **1**; 3 ÷ 2 = 1 remainder **1**; 1 ÷ 2 = 0 remainder **1**.                             |
| 8       | 1000   | 8 ÷ 2 = 4 remainder **0**; 4 ÷ 2 = 2 remainder **0**; 2 ÷ 2 = 1 remainder **0**; 1 ÷ 2 = 0 remainder **1**.  |
| 9       | 1001   | 9 ÷ 2 = 4 remainder **1**; 4 ÷ 2 = 2 remainder **0**; 2 ÷ 2 = 1 remainder **0**; 1 ÷ 2 = 0 remainder **1**.  |
| 10      | 1010   | 10 ÷ 2 = 5 remainder **0**; 5 ÷ 2 = 2 remainder **1**; 2 ÷ 2 = 1 remainder **0**; 1 ÷ 2 = 0 remainder **1**. |

## Detailed Step-by-Step Examples

### Example 1: Converting 4 to Binary

1. **Divide 4 by 2:**  
   - Quotient = 2  
   - Remainder = 0  
2. **Divide 2 by 2:**  
   - Quotient = 1  
   - Remainder = 0  
3. **Divide 1 by 2:**  
   - Quotient = 0  
   - Remainder = 1  

**Reading remainders from bottom to top:** 1 0 0  
Thus, **4 in decimal is 100 in binary**.

---

### Example 2: Converting 10 to Binary

1. **Divide 10 by 2:**  
   - Quotient = 5  
   - Remainder = 0  
2. **Divide 5 by 2:**  
   - Quotient = 2  
   - Remainder = 1  
3. **Divide 2 by 2:**  
   - Quotient = 1  
   - Remainder = 0  
4. **Divide 1 by 2:**  
   - Quotient = 0  
   - Remainder = 1  

**Reading remainders from bottom to top:** 1 0 1 0  
Thus, **10 in decimal is 1010 in binary**.

---

## Conclusion

Using the division-by-2 method, you can convert any decimal number to binary by repeatedly dividing the number by 2, recording the remainders, and then reading those remainders in reverse order. This file has provided both a conversion table for numbers 0 to 10 and detailed examples for key numbers.

*Happy converting!*
