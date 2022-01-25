/*2.Write a Java Program to print
even numbers,odd numbers from a given
array of 10 integers*/

class oddevenprint{
public static void main(String []args){

    int i,j=0,k=0;
    int[] a={11,17,7,1,6,3,4,10,13,18};
    int[] o=new int[10];
    int[] e=new int[10];
    for(i=0;i<10;i++){
    if(a[i]%2==0){
        o[j]=a[i];
        j++;
        }
    else{
        e[k]=a[i];
        k++;
        }
    }
System.out.println("The even numbers are: ");

for(i=0;i<k;i++){
    System.out.println(e[i]);
    }

System.out.println("The odd numbers are: ");

for(i=0;i<j;i++){
    System.out.println(o[i]);
    }

}
}
