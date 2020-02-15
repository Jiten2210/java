package code;
/**
 * 
 */

/**
 * @author Jitu
 *
 */

	public class SleepMessages {
	    public static void main(String args[])
	        throws InterruptedException {
	        String importantInfo[] = {"JITU","GAURAV", "SUMIT","DEEPAK"};

	        for (int i = 0;  i < importantInfo.length; i++) {
	            Thread.sleep(4000);
	            System.out.println(importantInfo[i]);
	        }
	    }
	}


