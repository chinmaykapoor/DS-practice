import java.util.*;
class sentrev{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String arr[]=s1.split(" ");
    String s="";
    for(int i=arr.length-1;i>=0;i--)
    {
        s=s+arr[i]+" ";
    }
    System.out.println(s);
}
}