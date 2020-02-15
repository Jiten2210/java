package code;
/**
 * 
 */

/**
 * @author Jitu
 *
 */
public class ThreadTest {
	public static void main(String[] args) {
		DispThread d1 = new DispThread("Hello");
		DispThread d2 = new DispThread("Jitu");
		d1.start();
		d2.start();
	}

}
