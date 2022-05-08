package org.roger.pattern.prototype;

public interface Shape extends Cloneable {
    Object clone();
    double calcArea();
}
