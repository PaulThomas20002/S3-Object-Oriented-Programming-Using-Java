/*Create a java program to create a class have 3 attribute height , width and length double type. 
create a method and calculate the volume of box using method volume.*/
class box
{
    double width, height, length;
    void setdim(double a, double b, double c)
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
         b.setdim(10.25, 11.55, 25.25);
         double vol = b.volume();
         System.out.println(vol);
     }
 }
