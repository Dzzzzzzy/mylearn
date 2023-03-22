/*
 * @Author: Dzzzzzzy
 * @Date: 2023-02-10 15:02:47
 */
package datastructure;

public class Test{
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int numAIndex = a.length() - 1;
        int numBIndex = b.length() - 1;
        int temp = 0;
        int carry = 0;
        while (numAIndex >= 0 && numBIndex >= 0) {
            temp =  Integer.parseInt(String.valueOf(a.charAt(numAIndex))) + Integer.parseInt(String.valueOf(b.charAt(numBIndex))) + carry;
            carry = 0;
            if (temp > 1) {
                temp %= 2;
                carry = 1;
            }
            sb.append(temp);
            numAIndex--;
            numBIndex--;
        }
        while (numAIndex >= 0) {
            if (carry == 1) {
                temp = carry + Integer.parseInt(String.valueOf(a.charAt(numAIndex--)));
                if (temp == 2) {
                    temp = 0;
                    carry = 1;
                } else {
                    carry = 0;
                }
                sb.append(temp);
                continue;
            }
            sb.append(a.charAt(numAIndex--));
        }
        while (numBIndex >= 0) {
            if (carry == 1) {
                temp = carry + Integer.parseInt(String.valueOf(b.charAt(numBIndex--)));
                if (temp == 2) {
                    temp = 0;
                    carry = 1;
                } else {
                    carry = 0;
                }
                sb.append(temp);
                continue;
            }
            sb.append(b.charAt(numBIndex--));
        }
        if (carry == 1) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("1001", "11"));
    }
}