package org.roger.pattern.prototype;

import java.util.Arrays;

/**
 * 原型模式
 * ref. http://c.biancheng.net/view/1343.html
 */
public class App {
    public static void main(String[] args) {
        Shape circle = PrototypeManager.getShape("circle");
        System.out.println("circle.calcArea() = " + circle.calcArea());

        Circle circle2 = (Circle) circle.clone();
        System.out.println("circle2 = " + circle2);
    }
}
