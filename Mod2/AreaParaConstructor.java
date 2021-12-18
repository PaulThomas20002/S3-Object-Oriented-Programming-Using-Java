class box
{
    double width, height, length;
    box(double a, double b, double c)
    {
        width = a;
        height = b;
        length = c;
    }
    double volume()
    {
        return height * width * length;
    }
}
 class AreaParaConstructor
 {
     public static void main(String []args)
     {
         box b = new box(10.25, 11.55, 25.25);
         double vol = b.volume();
         System.out.println(vol);
     }
 }
