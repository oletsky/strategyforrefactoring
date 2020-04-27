package javatraining.oletsky.strategyrefactoring;

/**
 * @author O.Oletsky
 * This code should be refactored
 */

public class RawRealization {

    private String data;

    public void setData(String data) {
        this.data = data;
    }

    public void doThis (int i) {
        switch (i) {
            case 1: algorithm1(data); break;
            case 2: algorithm2(data); break;
            default: throw new IllegalArgumentException("Wrong argument");
        }
    }

    public void algorithm1(String data) {
        System.out.println("Algorithm 1 realized with "+data);
    }

    public void algorithm2(String data) {
        System.out.println("Algorithm 2 realized with "+data);
    }
}

