import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class KLSNPG_2_1 {

	private static final Pattern COMMA = Pattern.compile(",");
	public static void main(String[] args) {
		int db = 0, szum = 0, i = 0;
	    try {
	    	BufferedReader myReader =
                    new BufferedReader(new FileReader("vezeteknev.txt"));
	        Scanner s = new Scanner (System.in);
	        String str = s.nextLine();
			db = Integer.parseInt(str);
			String line;
	        System.out.println("Adatok szama = " + db);
	        while ((line = myReader.readLine()) != null) {
                for (String token : COMMA.split(line)) {
                    try {
                        szum += Integer.parseInt(token);
                        System.out.println((i+1) + ".adat = " + token);
                    } catch (NumberFormatException ex) {
                        System.err.println(token + " nem egy szam");
                    }
                    i++;
                }
            }
	        System.out.println("Osszeg: " + szum);
	      } catch (Exception e) {
	        System.out.println("Hiba.");
	        e.printStackTrace();
	      }
	    }
}