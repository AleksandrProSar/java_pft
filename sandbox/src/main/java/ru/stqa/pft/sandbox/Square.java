package ru.stqa.pft.sandbox;

public class Square {

    public double l;

    public Square(double l) { // добавляем конструктор
       this.l = l;
    }

    public  double area() {
        return this.l * this.l;
    }
}
