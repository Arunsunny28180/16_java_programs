import java.io.BufferedReader;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1Buff {
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
        System.out.println("Array Elements are : ");
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
}