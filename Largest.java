import java.util.Scanner;
public class Largest
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter number of elements");
int n=s.nextInt();
System.out.println("enter array elements");
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
arr[i]=s.nextInt();
}
int temp;  
for (int i = 0; i <n; i++)   
        {  
            for (int j = i + 1; j <n; j++)   
            {  
                if (arr[i] > arr[j])   
                {  
                    temp = arr[i];  
                    arr[i] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        } 
System.out.println("Largest- " + arr[n-1]);  
System.out.println("Second- " + arr[n-2]);  
} 
}
 