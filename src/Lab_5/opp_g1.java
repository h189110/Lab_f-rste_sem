package Lab_5;

public class opp_g1 {
// https://github.com/dat100hib/dat100public/blob/master/programmering/jplab5/JP5.md
	public static void main(String[] args) {
		int[] tabell = {1, 3, 4, 7, 9, 10};
		
		System.out.println(tabell[2]);
		tabell[2] = 7;
		System.out.println(tabell[2]);
		skrivUt(tabell);
		skrivUtUt(tabell);
		System.out.println(finnes(tabell, 2));
		System.out.println(finnes(tabell, 3));
		skiftfortegn(tabell);
		
		

	}
	public static void skrivUt(int[] tabell) {
		for(int i = 0; i<tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}
	public static void skrivUtUt(int[] tabell){
		for (int elem : tabell) {
			System.out.println(elem);
		}
	}
	public static boolean finnes(int[] tabell, int tall) {
		for (int elem : tabell) {
			if(elem == tall) {
				return true;
			}
		}
		return false;
	}
	public static int[] skiftfortegn(int[] tabell) {
		int[] tacobell = new int[tabell.length];
		for(int i = 0; i<tabell.length;i++) {
			tacobell[i] = tabell[i] * -1;
		}
		return tacobell;
	}

}
