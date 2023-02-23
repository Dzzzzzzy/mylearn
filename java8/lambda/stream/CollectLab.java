/*
 * @Author: dongzhenyang1 dongzhenyang1@jd.com
 * @Date: 2023-02-20 10:27:25
 * @LastEditors: dongzhenyang1 dongzhenyang1@jd.com
 * @LastEditTime: 2023-02-20 11:15:35
 * @FilePath: /mylearn/java8/lambda/stream/CollectLab.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package java8.lambda.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8.lambda.POJO.Student;

public class CollectLab {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(new Student("路飞", 22, 175),
                new Student("红发", 40, 180),
                new Student("白胡子", 50, 185)).collect(Collectors.toList());
        System.out.println(studentList);
    }
}
