/*create a abstract class shape having abstract method draw() extends two class rectangle and circle from shape and
implement the methode for displaying the message drawing rectangle and drawing circle*/

abstract class shape{
    abstract void draw();
}
class rectangle extends shape{
    void draw(){
        System.out.println("Drawing rectangle");
    }
}
class circle extends shape{
    void draw(){
        System.out.println("Drawing circle");
    }
}
class abstractEx1{
    
    public static void main(String []args){
        rectangle o = new rectangle();  //o object of rectangle created
        o.draw();
        circle b = new circle();        // b object of circle created
        b.draw();
    }
}
