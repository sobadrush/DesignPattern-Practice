package org.roger.pattern.prototype;

/**
 * @author RogerLo
 * @date 2022/5/8
 */
public class Square implements Shape {

    private double edgeLength = 3.0d;

    @Override
    public Object clone() {
        Square obj = null;
        try {
            obj = (Square) super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("clone 方形失敗...");
        }
        return obj;
    }

    @Override
    public double calcArea() {
        System.out.println("I'm Square.calcArea");
        return Math.pow(this.edgeLength, 2);
    }

}
