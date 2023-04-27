/*
 * @Author: dongzhenyang1 dongzhenyang1@jd.com
 * @Date: 2023-02-24 11:11:20
 * @LastEditors: Please set LastEditors
 * @LastEditTime: 2023-03-27 14:59:46
 * @FilePath: /mylearn/java8/trycatch/ReturnLab1.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
// 参考: https://www.cnblogs.com/lanxuezaipiao/p/3440471.html
package java8.trycatch;

import java.util.HashMap;
import java.util.Map;

public class ReturnLab1 {

    public static void main(String[] args) {
        System.out.println(function1());
        System.out.println("==============");
        System.out.println(function2());
        System.out.println("==============");
        System.out.println(function4());
        System.out.println("==============");
        System.out.println(function5().get("key1"));
        System.out.println("==============");
        System.out.println(function6());
    }

    private static int function1() {
        int num = 100;
        try {
            System.out.println("try print");
            return num += 10;
        } catch (Exception e) {
            System.out.println("catch print");
        } finally {
            System.out.println("finally print");
            if (num > 100) {
                System.out.println("num > 100, num = " + num);
            }
        }
        return num;
    }

    private static String function2() {
        try {
            System.out.println("try print");
            return function3();
        } finally {
            System.out.println("finally print");
        }
    }

    private static String function3() {
        System.out.println("function3 print");
        return "function3 returnValue";
    }

    // try中return num，num返回之前在finally中改变其值，num - 基本类型
    private static int function4() {
        int num = 100;
        try {
            System.out.println("try print");
            return num += 60;
        } catch (Exception e) {
            System.out.println("catch print");
        } finally {
            System.out.println("finally print");
            if (num > 100) {
                System.out.println("num > 100, num = " + num);
            }
            num = 180;
        }
        return 200;
    }

    private static Map<String, String> function5() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        try {
            map.put("key1", "value_try");
            return map;
        } catch (Exception e) {
            map.put("key1", "value_catch");
        } finally {
            map.put("key1", "value_finally");
            map = null;
        }
        return map;
    }

    private static int function6() {
        try {
            int i = 12 / 0;
        } catch (Exception e) {
            System.out.println("catch");
        }
        return 666;
    }

}
