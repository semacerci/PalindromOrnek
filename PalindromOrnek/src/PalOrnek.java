import java.util.Iterator;
import java.util.Scanner;
/*for (int i = 0; i < karakterDizi.length; i++) {
	System.out.println(karakterDizi[i]);
}
System.out.println("Kelimeniz " + gkelime.length() + " harflidir.");*/

public class PalOrnek {

	public static void main(String[] args) {
		String gkelime;
		String tersKelime="";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("lütfen bir kelime gir:");

		 gkelime = sc.nextLine();
		 char karakterDizi[]=gkelime.toCharArray();
         char karakterDizi1[]=tersKelime.toCharArray();
	
         
		for (int j = gkelime.length() -1 ; j >= 0; j--) {

			tersKelime+=gkelime.charAt(j);
		}
		if (gkelime.equals(tersKelime)) {
			System.out.println(gkelime+" "+"kelimesi Palindrom Bir Kelime");
		} else {
			System.out.println(tersKelime+" "+"kelimesi Palindrom Deðil");
		}
	}

}
