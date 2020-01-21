class rotatstring{
    public static void rotate(String str1,String str2)
    {
        String clock="";
        String aclock="";
        int l=str2.length();
        clock=clock+str2.substring(2)+str2.substring(0,2);
        aclock=aclock+str2.substring(0,l-2)+str2.substring(l-2,l);
        if(str1.equals(clock)||str1.equals(aclock))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
    public static void main(String[] args)
    {
        String str1="student";
        String str2="ntstude";

        rotate(str1,str2);
    }
}