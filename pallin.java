import java.util.*;
class pallin{
    public static void main (String[] args)
    {
     Scanner sc=new Scanner(System.in);
     String s1=sc.next();
     int n=s1.length()-1;
     int count=0;
     for(int i=0;i<n;i++)
     {
         if(s1.charAt(i)==s1.charAt(n-i))
         {
             count=1;
         }
         else{
             count=0;
             break;
         }
         
     }   
     if(count==1)
     {
         System.out.println(s1 +" is pallindrome");
     }
     else
     {
         System.out.println(s1 +" is not");
     }
    }
}