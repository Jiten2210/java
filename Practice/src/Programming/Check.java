package Programming;
import java.util.HashMap;

public class Check {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<>();
		hm.put("jitu", "bisht");
		hm.put("jitu", "singh");
		hm.put("alok", "kumar");
		
		if( hm.containsKey("jitu"))
		{
			if("bisht".equalsIgnoreCase(hm.get("jitu")))
					{
				System.out.println("alok");
					}
			
		}
		else
			System.out.println("kumar");
			
		}
	

}
