package java8.lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java8.lambda.POJO.Student;

/**
 * 通过map
 */
public class MapLab {
    
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(3);
        studentList.add(new Student("路飞", 22, 175));
        studentList.add(new Student("红发", 40, 180));
        studentList.add(new Student("白胡子", 50, 185));

        List<String> nameList = studentList.stream()
                .map(stu -> stu.getName())
                .collect(Collectors.toList());
        System.out.println(nameList);
    }

}
