package org.roger.pattern.decoratorPattern;

import java.util.Arrays;

/**
 * @author RogerLo
 * @date 2022/5/8
 */
public class App {

    public static void main(String[] args) {

        Circle normalCircle = new Circle();
        normalCircle.draw();

        System.out.println("===================================");

        RedOutlineDecorator redCircle = new RedOutlineDecorator(new Circle());
        redCircle.draw();

        System.out.println("===================================");

        Rectangle normalRectangle = new Rectangle();
        normalRectangle.draw();

        System.out.println("===================================");

        RedOutlineDecorator redRectangle = new RedOutlineDecorator(new Rectangle());
        redRectangle.draw();
    }

}
