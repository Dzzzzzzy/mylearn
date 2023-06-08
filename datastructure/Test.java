/*
 * @Author: Dzzzzzzy
 * @Date: 2023-02-10 15:02:47
 */
package datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import java8.collection.Person;

public class Test{

    // public static void main(String[] args) {
    //     String phrase = "现在下单，4月29日发货";
    //     StringBuilder commitmentPhrase = new StringBuilder(phrase);
    //     commitmentPhrase.insert(5, "承诺");
    //     System.out.println(commitmentPhrase);

    // }

    public static void main(String[] args) {
        TreeMap<Person, String> pdata = new TreeMap<Person, String>();
        pdata.put(new Person("张三", 30), "zhangsan");
        pdata.put(new Person("李四", 20), "lisi");
        System.out.println(pdata.toString());
        pdata.put(new Person("王五", 10), "wangwu");
        pdata.put(new Person("小红", 5), "xiaohong");
        
        // 得到key的值的同时得到key所对应的值
        Set<Person> keys = pdata.keySet();
        for (Person key : keys) {
            System.out.println(key.getAge() + "-" + key.getName());

        }

        List<Person> pList = new ArrayList<>();
        pList.add(new Person("zhangsan", 18));
        pList.add(new Person("lisi", 3));
        for (Person p : pList) {
            System.out.println(p.toString());
        }
    }

}