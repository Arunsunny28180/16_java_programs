import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Array in reverse order : ");
        for (int i = size-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}