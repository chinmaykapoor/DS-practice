import java.util.*;
class anagram{
    public static void main(String[] args)
    {
        String s1="LISTEN";
        String s2="SIfdfdfLENT";

        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

       // System.out.println(arr1);
      //  System.out.println(arr2);
        if(Arrays.equals(arr1,arr2))
        {
           System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }
    }
}