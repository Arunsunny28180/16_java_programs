import java.util.Scanner;

public class ArrayLength{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        int length=arr.length;
        System.out.println("The number of elements present in the array : "+length);
            }
        
       
    }
