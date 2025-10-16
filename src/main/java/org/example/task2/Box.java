package org.example.task2;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        if (length <= 0) {
            System.out.println("Некоректне значення довжини. Повинно бути більше нуля.");
        } else {
            this.length = length;
        }
    }

    private void setWidth(double width) {
        if (width <= 0) {
            System.out.println("Некоректне значення ширини. Повинно бути більше нуля.");
        } else {
            this.width = width;
        }
    }

    private void setHeight(double height) {
        if (height <= 0) {
            System.out.println("Некоректне значення висоти. Повинно бути більше нуля.");
        } else {
            this.height = height;
        }
    }

    public double getSurfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double getLateralSurfaceArea() {
        return 2 * height * (length + width);
    }

    public double getVolume() {
        return length * width * height;
    }
}