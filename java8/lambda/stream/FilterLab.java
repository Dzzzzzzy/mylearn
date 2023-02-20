package java8.lambda.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java8.lambda.POJO.Student;

public class FilterLab {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>(3);
        studentList.add(new Student("路飞", 22, 175));
        studentList.add(new Student("红发", 40, 180));
        studentList.add(new Student("白胡子", 50, 185));

        List<Student> list = studentList.stream()
                .filter(stu -> stu.getHeight() < 180)
                .collect(Collectors.toList());
        System.out.println(list);
    }

}
