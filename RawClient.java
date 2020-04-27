package javatraining.oletsky.strategyrefactoring;

public class RawClient {
    public static void main(String[] args) {
        ConcreteRealization real = new ConcreteRealization();
        real.setData("AAAA");
        real.doThis(1);
    }

}
