/*Write a java program to calculate area of a triangle, square and circle using method overloading*/
class area
{
    int length, breadth, side;
    double radius;
    void calcarea(int a, int b)
    {
        length = a;
        breadth = b;
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }
    void calcarea(double a)
    {
        radius = a;
        double area = radius * radius * 3.14;
        System.out.println("Area of Circle = " + area);
    }
    void calcarea(int a)
    {
        side = a;
        int area = side * side;
        System.out.println("Area of Square = " + area);
    }
}
class areaOverload
{
    public static void main (String[] args) 
    {
        area a = new area();
        a.calcarea(2);
        a.calcarea(4, 5);
        a.calcarea(2.5);
    }
}
    
