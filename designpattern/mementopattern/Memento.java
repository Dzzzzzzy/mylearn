package designpattern.mementopattern;

// 备忘录模式： https://www.runoob.com/design-pattern/memento-pattern.html

public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

}
