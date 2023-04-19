package Array;
import java.util.Scanner;

class Range{
    
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of Array");
        int size=sc.nextInt();
        int a[]=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Value of array");
            a[i]=sc.nextInt();
        }
  System.out.println("Done5");
        for(int i=0;i<size;i++){
            System.out.println(a[i]+" ");

        }

    }
} 