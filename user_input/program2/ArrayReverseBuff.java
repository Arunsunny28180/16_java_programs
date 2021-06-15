import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayReverseBuff {
    public static void main(String[] args) 
    throws IOException
    {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of the array : ");
        int size=Integer.parseInt(reader.readLine());
        int[] arr=new int[size];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size; i++) {
            arr[i]=Integer.parseInt(reader.readLine());
        }
        System.out.println("Array in reverse order : ");
        for (int i = size-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}