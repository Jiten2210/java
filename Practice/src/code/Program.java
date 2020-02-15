package code;

class Program
{
    public static void main(String[] args)
    {
       String s[] =decode();
       System.out.println("emp_id" + ":" + s[0] + "\n" + "year" + ":" + s[1]);

    }
    public static String[] decode()
    {
    	String[] arr = new String[2];
    	arr[0] = "882";
    	arr[1] = "2000";
    	return arr;
    }

}