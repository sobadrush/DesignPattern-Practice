package org.roger.pattern.prototype;

/**
 * @author RogerLo
 * @date 2022/5/8
 */
public class Circle implements Shape {

    private double radius = 3.0d;

    @Override
    public Object clone() {
        Circle obj = null;
        try {
            System.err.println("clone 圓型");
            obj = (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("clone 圓型失敗...");
        }
        return obj;
    }

    @Override
    public double calcArea() {
        System.out.println("I'm Circle.calcArea");
        return Math.pow(this.radius, 2) * Math.PI;
    }

}
