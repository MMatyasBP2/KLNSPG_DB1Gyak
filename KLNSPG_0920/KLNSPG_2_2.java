import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class KLNSPG_2_2 {
    private static final Pattern COMMA = Pattern.compile(",");
	public static void main(String[] args) {
		int db = 0, szum = 0, i = 0, szam = 0;
	    try {
	    	BufferedWriter myReader =
                    new BufferedWriter(new FileWriter("martinak.txt"));
	        Scanner s = new Scanner (System.in);
	        String str = s.nextLine();
			db = Integer.parseInt(str);
			int[] szamok = new int[db];
			//String line;
	        System.out.println("Adatok szama = " + db);
	        while (i < db) {
                    try {
                    	str = s.nextLine();
            			szam = Integer.parseInt(str);
                        szum += szam;
                        System.out.println((i+1) + ".adat = " + szam);
                    } catch (NumberFormatException ex) {
                        System.err.println(szam + " nem egy szam");
                    }
                    i++;
                }
			myReader.close();
			s.close();
            } catch (Exception e) {
				System.out.println("Hiba.");
				e.printStackTrace();
			  }
	        System.out.println("Osszeg: " + szum);
	      } 
}
