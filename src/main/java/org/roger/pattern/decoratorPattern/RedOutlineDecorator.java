package org.roger.pattern.decoratorPattern;

/**
 * @author RogerLo
 * @date 2022/5/8
 */
public class RedOutlineDecorator extends ShapeDecorator {

    public RedOutlineDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        this.drawOutline();
        super.decoratedShape.draw();
    }

    private void drawOutline() {
        System.out.print("... draw Red outline ... and ");
    }

}
