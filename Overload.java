class Shape{
    double area(double r){
    return 3.14*r*r;
}
double area(double length , double breadth){
    return length*breadth;
}
}
public class Overload {
    public static void main(String[] args) {
        Shape obj=new Shape();
        System.out.println("area of circle:"+obj.area(5.66));
        System.out.println("area of rectangle:"+obj.area(3.45,6.54));

    }
    
}
