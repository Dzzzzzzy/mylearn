/*
 * @Author: dongzhenyang1 dongzhenyang1@jd.com
 * @Date: 2023-03-05 16:11:58
 * @LastEditors: dongzhenyang1 dongzhenyang1@jd.com
 * @LastEditTime: 2023-03-05 18:05:40
 * @FilePath: /mylearn/java8/collection/ArrayListLab.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
// 参考列表：https://www.runoob.com/java/java-arraylist.html
package java8.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class ArrayListLab {

    private static ArrayList<Integer> originalList = new ArrayList<Integer>() {{
        add(1);
        add(2);
        add(3);
    }};
    
    public static void main(String[] args) {
        // addFunctionLab();
        // addAllFunctionLab();
        // clearFunctionLab();
        // removeFunctionLab();
        // removeAllFunctionLab();
        removeIfFunctionLab();
        // sizeFunctionLab();
        // isEmptyFunctionLab();
        // subListFunctionLab();
        // setFunctionLab();
        // getFunctionLab();
        // indexOfFunctionLab();
        // lastIndexOfFunctionLab();
        // sortFunctionLab();
        // toArrayFunctionLab();
        // toStringFunctionLab();
        // containsFunctionLab();
        // containsAllFunctionLab();
        // retainAllFunctionLab();
    }

    /**
     * ArrayList初始化的几种方式
     */
    private static void initWay() {
        // ArrayList初始化方式一
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        
        // ArrayList初始化方式二 生成匿名内部类进行初始化
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>() {{
            add(1);
            add(2);
            add(3);
        }};

        // ArrayList初始化方式三
        ArrayList<Integer> arrayList3 = new ArrayList<>();
        arrayList3.add(1);
        arrayList3.add(2);
    }

    /**
     * arraylist.add(int index，E element)
     * index-可选，表示element要插入的位置
     * element-要插入的元素
     */
    private static void addFunctionLab() {
        originalList.add(2, 666);
        System.out.println(originalList);
    }

    /**
     * arraylist.addAll(int index, Collection c)
     * index-可选，表示集合要插入的位置，没填就插入尾部
     * c-要插入集合
     */
    private static void addAllFunctionLab() {
        Set<Integer> tempSet = new HashSet<Integer>(){{
            add(4);
            add(5);
            add(6);
        }};
        originalList.addAll(1, tempSet);
        System.out.println(originalList);
    }

    /**
     * clear()
     * 删除数组中的全部元素
     */
    private static void clearFunctionLab() {
        System.out.println(originalList);
        originalList.clear();
        System.out.println(originalList);
    }

    /**
     * 删除指定元素 || 删除指定索引位置元素
     * 如果指定元素出现多次，则删除第一次出现的元素
     */
    private static void removeFunctionLab() {
        // originalList.remove(1);
        originalList.add(1);
        originalList.remove(new Integer(1));
        System.out.println(originalList);
    }

    /**
     * arraylist.removeAll(Collection c);
     * 删除指定集合中的动态数组元素
     * 删除成功返回true
     * 动态数组元素类型与指定集合元素类型不兼容，抛出ClassCastException
     * 动态数组包含null元素，指定集合不允许有null元素，抛出NullPointerException
     */
    private static void removeAllFunctionLab() {
        originalList.add(4);
        originalList.add(5);
        originalList.add(6);
        originalList.add(null);
        ArrayList<Integer> deleteArrayList = new ArrayList<>(Arrays.asList(1, 2, 9));
        System.out.println(originalList);
        originalList.removeAll(deleteArrayList);
        System.out.println(originalList);
    }

    /**
     * arraylist.removeIf(Predicate<E> filter)
     * 删除所有满足特定条件的数组元素
     * filter-过滤器，判断元素是否要删除
     * 如果元素被删除返回true
     */
    private static void removeIfFunctionLab() {
        ArrayList<String> sites = new ArrayList<>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Runoobgle");
        sites.add("Taobao");
        System.out.println(sites);
        sites.removeIf(e -> e.contains("gle"));
        System.out.println(sites);
    }

    /**
     * 返回集合元素个数
     */
    private static void sizeFunctionLab() {
        System.out.println(originalList.size());
    }

    /**
     * 判断集合是否为空
     */
    private static void isEmptyFunctionLab() {
        System.out.println(originalList.isEmpty());
    }

    /**
     * arraylist.subList(int fromIndex, int toIndex)
     * fromIndex-起始索引，包含
     * toIndex-结束索引-不包含
     */
    private static void subListFunctionLab() {
        originalList.add(4);
        originalList.add(5);
        originalList.add(6);
        System.out.println(originalList);
        System.out.println(originalList.subList(1, 4));
    }

    /**
     * arraylist.set(int index, E element)
     * index-索引位置
     * element-将在index位置替换进去的元素
     * return-返回之前index位置的元素
     */
    private static void setFunctionLab() {
        System.out.println(originalList);
        System.out.println(originalList.set(0, 66));
        System.out.println(originalList);
    }

    /**
     * 返回指定索引位置的元素
     */
    private static void getFunctionLab() {
        System.out.println(originalList);
        System.out.println(originalList.get(2));
    }

    /**
     * arraylist.indexOf(Object obj)
     * 返回obj元素在集合中第一次出现的索引，没找到返回-1
     */
    private static void indexOfFunctionLab() {
        originalList.add(2);
        System.out.println(originalList);
        System.out.println(originalList.indexOf(2));
    }

    /**
     * arraylist.lastIndexOf(Object obj)
     * 返回obj元素在集合中最后一次出现的索引，没找到返回-1
     */
    private static void lastIndexOfFunctionLab() {
        originalList.add(2);
        System.out.println(originalList);
        System.out.println(originalList.lastIndexOf(2));
    }

    /**
     * 对指定集合进行排序
     */
    private static void sortFunctionLab() {
        System.out.println(originalList);
        originalList.sort(Comparator.reverseOrder());
        System.out.println(originalList);
        Collections.sort(originalList);
        System.out.println(originalList);
    }

    /**
     * arraylist.toArray(T[] arr)
     * arr-可选，用于存储元素的数组，不传则返回Object类型的数组
     */
    private static void toArrayFunctionLab() {
        System.out.println(originalList);
        Integer[] integerArr = new Integer[originalList.size()];
        originalList.toArray(integerArr);
        System.out.println(originalList.toArray());
        for (Integer integer : integerArr) {
            System.out.println(integer);
        }
    }

    /**
     * 将集合转换成String
     */
    private static void toStringFunctionLab() {
        System.out.println(originalList);
        System.out.println(originalList.toString());
    }

    /**
     * arraylist.contains(Object obj)
     * 判断集合中是否包含obj元素，有则返回true，否则返回false
     */
    private static void containsFunctionLab() {
        System.out.println(originalList);
        System.out.println(originalList.contains(4));
    }

    /**
     * 判断集合中是否包含动态集合中的全部元素，是则返回true，否则返回false
     */
    private static void containsAllFunctionLab() {
        originalList.add(4);
        originalList.add(6);
        originalList.add(5);
        System.out.println(originalList);
        ArrayList<Integer> tempArrayList = new ArrayList<>();
        tempArrayList.add(1);
        tempArrayList.add(6);
        System.out.println(originalList.containsAll(tempArrayList));
    }

    /**
     * arraylist.retainAll(Collection c);
     * c-需要保留的集合元素
     * 如果指定的集合中的元素与动态集合c中的元素不兼容，则抛出 ClassCastException
     * 如果指定集合包含null元素，动态集合不允许有null元素，抛出NullPointerException
     */
    private static void retainAllFunctionLab() {
        originalList.add(4);
        originalList.add(6);
        originalList.add(5);
        originalList.add(6);
        originalList.add(null);
        ArrayList<Integer> retainList = new ArrayList<>();
        retainList.add(1);
        retainList.add(6);
        retainList.add(null);
        System.out.println(originalList);
        System.out.println(originalList.retainAll(retainList));
        System.out.println(originalList);
    }

}
