/*
 * @Author: Dzzzzzzy
 * @Date: 2023-03-17 10:19:53
 */
package java8.reflect;

public class ReflectLab {
    
    public static void main(String[] args) {
        try {
            Class<?> clz = Class.forName("java.lang.String");
            String s = (String) clz.newInstance();
            System.out.println(s);
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        
    }

}
