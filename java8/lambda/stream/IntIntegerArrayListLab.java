/*
 * @Author: dongzhenyang1 dongzhenyang1@jd.com
 * @Date: 2023-03-03 20:19:12
 * @LastEditors: dongzhenyang1 dongzhenyang1@jd.com
 * @LastEditTime: 2023-03-05 15:59:26
 * @FilePath: /mylearn/java8/lambda/stream/IntIntegerArrayListLab.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package java8.lambda.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntIntegerArrayListLab {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};

        // int[]转List boxed:装箱，将基本类型转成包装类
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(list);

        // List转int[]
        int[] arr2 = list.stream().mapToInt(Integer::intValue).toArray();

        // int[]转Integer[]
        Integer[] integerArr = Arrays.stream(arr2).boxed().toArray(Integer[]::new);
        for (Integer integer : integerArr) {
            System.out.println(integer);
        }

        // Integer[]转int[]
        int[] arr3 = Arrays.stream(integerArr).mapToInt(Integer::intValue).toArray();

        // List转Integer[]
        Integer[] integerArr2 = list.toArray(new Integer[0]);

        // Integer[]转List
        List<Integer> list2 = Arrays.asList(integerArr2);

    }
    
}
