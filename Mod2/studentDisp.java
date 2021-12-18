/*Create a class named Student with string variable name and integer variable roll_no. Assign the value of roll_no as 2 and that of names as John by creating and object of the 
class student
Dated : 17/12/2021
Time : Period -3 */


class student{
    String name;
    int roll_no;
    student(String n, int r){
        name=n;
        roll_no = r;
        System.out.println(name+"\t"+roll_no);
    }
    
}

class studentDisp{
    public static void main(String []args){
        student o = new student("John",2);
    }
}
