package code;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class CSV {
    public static void main(String[]args) throws FileNotFoundException{
        PrintWriter pw = new PrintWriter(new File("test.csv"));
        StringBuilder sb = new StringBuilder();
        sb.append("id");
        sb.append(',');
        sb.append("Name");
        sb.append('\n');

        sb.append("1");
        sb.append(',');
        sb.append("Prashant Ghimire");
        sb.append('\n');

        pw.write(sb.toString());
        pw.close();
        System.out.println("done!");
    }
}