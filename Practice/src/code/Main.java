package code;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	 private static Pattern timePat = Pattern.compile("\\d{1,2}:\\d{1,2}");
	    
	   
	    private static Pattern longNumber = Pattern.compile("(?<=[^:]|^)\\d{2,}(?=[^:]|$)");

	    public static String rToLNumberRepair(String input){
	        return reverseIt(reverseIt(input, timePat), longNumber);
	    }
	    
	    private static String reverseIt(String input, Pattern p){
	        int position = 0;
	        int length = input.length();
	        String newString = "";
	        
	        Matcher matcher = p.matcher(input);
	        
	        while(matcher.find()){
	            int start = matcher.start();
	            int end = matcher.end();
	            
	            if(start > 0)
	         
	            for(int i = end - 1; i >= start; i--){
	                newString += input.charAt(i);
	            }
	            
	            position = end;
	        }
	        
	        if(position < length)
	            newString += input.substring(position, length);
	        
	        return newString;
	}
	





}
