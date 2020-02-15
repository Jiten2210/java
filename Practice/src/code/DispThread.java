package code;
/**
 * 
 */

/**
 * @author Jitu
 *
 */
public class DispThread extends Thread{
	/* (non-Javadoc)
	 * @see java.lang.Thread#run()
	 */
	
	String msg;
	
	@Override
	public void run() {
		
		/*for (int i = 0; i < 1000; i++) {
			
			System.out.println(msg);
		}*/
		// TODO Auto-generated method stub
		super.run();
	}
	
	public DispThread(String m) {
		msg =m;
		System.out.println(msg);
		// TODO Auto-generated constructor stub
	}

}
