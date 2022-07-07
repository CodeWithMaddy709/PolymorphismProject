public class TestPolymorphism {
    public static void printShapeInfo(RectangleFigure shapeObj) {
        System.out.println(
                "Area of Shape info related to " + shapeObj.getClass() + " is " + shapeObj.area());
    }

    public static void main(String[] args) {
        RectangleFigure rectangle, simpleRef;

        BoxFigure box=new BoxFigure(10, 7, 3); 
        rectangle = new RectangleFigure(8, 5);
        simpleRef = rectangle;

        System.out.println("Late Binding method call , Area is: " + simpleRef.area());
        System.out.println("Line 10: Rectangle :\n" + simpleRef);
        System.out.println("Area =" + simpleRef.area());
        simpleRef = box;
        System.out.println("\nLate Binding method call ,Area is:" + simpleRef.area());
        System.out.println("Line 13: Box:\n" + simpleRef);
        System.out.println("Suface Area =" + simpleRef.area() + "; Volume =" + box.volume());
        System.out.println();
        RectangleFigure myRectangle2 = new RectangleFigure(9, 6);
        BoxFigure myBox2 = new BoxFigure(12, 4, 2);
        System.out.println(
                "Calling the method printShapeInfo by passing\ndiffrent Object Type of Super Class and sub class ");
        simpleRef = myRectangle2;
        printShapeInfo(simpleRef);

        simpleRef = myBox2;
        printShapeInfo(simpleRef);

    }

}
