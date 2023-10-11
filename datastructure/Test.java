/*
 * @Author: Dzzzzzzy
 * @Date: 2023-02-10 15:02:47
 */
package datastructure;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import java8.collection.Person;

public class Test{

    private String name;

    private Integer age;

    public static void main(String[] args) throws ParseException {
        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(Test.class);
            for (PropertyDescriptor propertyDescriptor : beanInfo.getPropertyDescriptors()) {
                System.out.println(propertyDescriptor.getName());
                System.out.println("  " + propertyDescriptor.getReadMethod());
                System.out.println("  " + propertyDescriptor.getWriteMethod());
            }
            Method method = beanInfo.getPropertyDescriptors()[1].getWriteMethod();
            Test test = new Test();
            System.out.println(test);
            method.invoke(test, "haha");
            System.out.println(test);

        } catch (Exception e) {

        }

    }

    private void sayHello() {
        System.out.println("hello world");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Test [name=" + name + ", age=" + age + "]";
    }
    
}