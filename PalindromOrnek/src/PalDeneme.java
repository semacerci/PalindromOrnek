import java.util.Arrays;
import java.util.Scanner;

public class PalDeneme {

	public static void main(String[] args) {
		String kelime;

		Scanner ss = new Scanner(System.in);
		System.out.println("bir metin gir");
		kelime = ss.nextLine();
		

		char karakter[] = kelime.toCharArray();
		char[] terstenKarakter = new char[karakter.length];
	
		int j = 0;
		for (int i = karakter.length - 1; i >= 0; i--) {
			//System.out.println(karakter[i]);
			terstenKarakter[j] = karakter[i];
			j++;
		}
		
		if (Arrays.equals(karakter, terstenKarakter)) {
			System.out.println(kelime + " palindrom bir kelimedir");
		}
		else {
			System.out.println(kelime + " palindrom bir kelime değildir");
		}
		
		/*boolean palindrom = true;
		for(int k = 0; k<karakter.length; k++) {
			if(karakter[k] != terstenKarakter[k]) {
				palindrom = false;
				break;
			}
		}
		
		if (palindrom) {
			System.out.println(kelime + " palindrom bir kelimedir");
		} else {
			System.out.println(kelime + " palindrom bir kelime değildir");
		}*/
	}

}

