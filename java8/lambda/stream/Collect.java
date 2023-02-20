package java8.lambda.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8.lambda.POJO.Student;

public class Collect {
    public static void main(String[] args) {
        List<Student> studentList = Stream.of(new Student("路飞", 22, 175),
                new Student("红发", 40, 180),
                new Student("白胡子", 50, 185)).collect(Collectors.toList());
        System.out.println(studentList);
    }
}
