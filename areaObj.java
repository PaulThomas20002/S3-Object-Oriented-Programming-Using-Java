class box
{
    double width, height, length;
    box()
    {
        width = 10.25;
        height = 11.55;
        length = 25.25;
    }
    double volume()
    {
        return height * width * length;
    }
}
 class areaObj
 {
     public static void main(String []args)
     {
         box b = new box();
         double vol = b.volume();
         System.out.println(vol);
     }
 }
