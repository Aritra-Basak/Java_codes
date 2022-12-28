package technicals;
import java.util.*;

/*
 * Java's BitSet class implements a vector of bit values (i.e.: false (0) or true (1)) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of 1 is called a set bit.

Given 2 BitSets, B1 and B2, of size N  where all bits in both BitSets are initialized to 0 , perform a series of M operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.
 * 
 * Input Format

The first line contains 2 space-separated integers, N (the length of both BitSets B1 and B2) and M (the number of operations to perform), respectively.
The M subsequent lines each contain an operation in one of the following forms:

AND <set><set>
OR <set><set>
XOR <set><set>
FLIP  <set><index>
SET <set><index>

In the list above, <set> is the integer 1 or 2 , where 1 denotes B1  and 2 denotes B2.
<index> is an integer denoting a bit's index in the BitSet corresponding to <set>.

For the binary operations AND,OR and XOR, operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. For example:

AND 2 1

2 represents bitSet B2 and 1 represents B1 , so we have to find the AND of B2 with B1

FLIP 2 2

First 2 represents bitSet 2  and the second 2 represents index so we will change the value of index 2 of bitSet B2 to its opposite or complement value.
 * 
 * 
 * 
 * 
 *Sample Input

5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1


Sample Output

0 0
1 0
1 1
1 2 */

public class Solution {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();

    BitSet b1 = new BitSet(n);
    BitSet b2 = new BitSet(n);

    for (int i = 0; i < m; i++) {
      String opcode = sc.next();
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();

      switch(opcode) {
        case "AND":
          if (num1 == 1 && num2 == 2) {
            b1.and(b2);
          } else if (num1 == 2 && num2 == 1) {
            b2.and(b1);
          } else if (num1 == 1 && num2 == 1) {
            b1.and(b1);
          } else if (num1 == 2 && num2 == 2) {
            b2.and(b2);
          }
          break;
        case "OR":
          if (num1 == 1 && num2 == 2) {
            b1.or(b2);
          } else if (num1 == 2 && num2 == 1) {
            b2.or(b1);
          } else if (num1 == 1 && num2 == 1) {
            b1.or(b1);
          } else if (num1 == 2 && num2 == 2) {
            b2.or(b2);
          }
          break;
        case "XOR":
          if (num1 == 1 && num2 == 2) {
            b1.xor(b2);
          } else if (num1 == 2 && num2 == 1) {
            b2.xor(b1);
          } else if (num1 == 1 && num2 == 1) {
            b1.xor(b1);
          } else if (num1 == 2 && num2 == 2) {
            b2.xor(b2);
          }
          break;
        case "FLIP":
          if (num1 == 1) {
            b1.flip(num2);
          } else if (num1 == 2) {
            b2.flip(num2);
          }
          break;
        case "SET":
          if (num1 == 1) {
            b1.set(num2);
          } else if (num1 == 2) {
            b2.set(num2);
          }
          break;
      }
      System.out.println(b1.cardinality() + " " + b2.cardinality());
    }
    }
}
