import java.util.*;
public class sa
{
    public static void main(String arg[])
    {
        int ch=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter values");
            arr[i]=sc.nextInt();
        }
        do{
        System.out.println("Enter Your choice");
        System.out.println("1.Display");
        System.out.println("2.Search");
        System.out.println("3.exit");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                
                    for(int i=0;i<n;i++)
                    {
                        System.out.println("Elements present in your arrays are :"+arr[i]);
                    }
                    break;
            case 2:
               
                    System.out.println("Enter a value to be search:");
                    int search=sc.nextInt();
                    for(int i=0;i<n;i++)
                    {
                        if(arr[i]==search)
                        {
                            System.out.println("element is present in the position of  "+i);
                        }
                    }
                    break;
            case 3:
                
                    System.out.println("Thank You");
                    break;
            default:
                System.out.println("Invalid");
        }
        }while(ch!=3);
        
    }
}
