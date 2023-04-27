/*
 * @Author: Dzzzzzzy
 * @Date: 2023-02-10 15:02:47
 */
package datastructure;

public class Test{

    public static int mySqrt(int x) {
        // 背景知识，连续个奇数的和为平方数
        // 1+3+5=9=3^2
        int count = 0;
        int sum = 0;
        int oddNum = 1;
        while(x >= 0) {
            x -= oddNum;
            oddNum += 2;
            count++;
        }
        return count - 1;
    }
    
    

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395600));
        String s = null;
        if (1 == 2) {
            s = "safasf";
        }
        if (s == null) {
            System.out.println(123);
        } else {
            System.out.println(345);
        }
    }
}