/*
 * @Author: dongzhenyang1 dongzhenyang1@jd.com
 * @Date: 2023-02-23 09:45:48
 * @LastEditors: dongzhenyang1 dongzhenyang1@jd.com
 * @LastEditTime: 2023-02-23 09:51:25
 * @FilePath: /mylearn/designpattern/mementopattern/MementoPatternDemo.java
 * @Description: 这是默认设置,请设置`customMade`, 打开koroFileHeader查看配置 进行设置: https://github.com/OBKoro1/koro1FileHeader/wiki/%E9%85%8D%E7%BD%AE
 */
package designpattern.mementopattern;

public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("state #1");
        originator.setState("state #2");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("state #4");

        System.out.println("Current State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved State: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved State: " + originator.getState());
    }
    
}
