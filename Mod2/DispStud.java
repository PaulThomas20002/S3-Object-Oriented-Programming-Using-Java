/* Assign and print the roll number, phone number and address of two students having names Sam and John 
respectively by creating two objects of class Student.
Dated : 17/12/2021
Time : Period - 3 */
class student{
   
    student(String name, int roll_no, String address, int phnnum){
       
        System.out.println(name+"\t"+roll_no+"\t"+address+"\t"+phnnum);
    }
    
}

class DispStud
{
    public static void main(String []args){
        
        student o1 = new student("Sam",3,"America",13434234);
        student o2 = new student("John",2, "India",91834492);
    }
}
