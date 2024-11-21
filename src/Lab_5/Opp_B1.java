package Lab_5;

	import static javax.swing.JOptionPane.*;
public class Opp_B1 {
	//https://github.com/dat100hib/dat100public/blob/master/programmering/jplab5/JP5.md
	public static void main(String[] args) {
		String dagstr = showInputDialog("skriv inn tidslengden");
		int dager = Integer.parseInt(dagstr);
		
		int[] over = new int[dager];
		for(int i = 1; i<over.length;i++) {
			String tempstr = showInputDialog("skriv inn tempraturen på dag "+i+":");
			int tempr = Integer.parseInt(tempstr);
			over[i] = tempr;
		}
		skrivUt(over);
		
	}
	public static void skrivUt(int[] over) {
		System.out.println("Analyse av temperaturer");
		System.out.println("***********************");
		System.out.println("Skriver inn temperaturene:");
		for(int i =0; i<over.length;i++) {
			System.out.println(i+". dag: " + over[i]);
		}
		System.out.println("gjennonsnitt tempten var: " + gjennomsnitt(over));
		System.out.println("maks tempraturen var: " + max(over));
	}
	public static double gjennomsnitt(int[] over) {
		int sum = 0;
		for(int i = 0; i<over.length;i++) {
			sum += over[i];
		}
		double res = sum / over.length;
		return res;
	}
	public static int max(int[] over) {
		int max=0;
		for(int i = 0; i<over.length;i++) {
			if(over[i] > max)
				max=over[i];
		}
		return max;
	}
}
