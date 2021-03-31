package CapgeminiAssignment;

class Rectangle extends Shapess {
    @Override
    public String draw() {
    	System.out.println("This is rectangle");
		return "Rectangle";}
}

class Line extends Shapess{
    @Override
    public String draw() {
    	System.out.println("This is line");
		return "Straight line";}
}

class Cube extends Shapess {
    @Override
    public String draw() {
    	System.out.println("This is circle");
		return "circle";}
}


abstract class Shapess {

    public abstract String draw();
}

public class Assignment2Q5 {

    public static void main(String args[]) {
        Shapess shapes = new Line();
        shapes.draw();
        shapes = new Rectangle();
        shapes.draw();
        shapes = new Cube();
        shapes.draw();
    }
}
