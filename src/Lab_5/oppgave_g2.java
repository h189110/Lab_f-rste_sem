package Lab_5;

public class oppgave_g2 {
 //https://github.com/dat100hib/dat100public/blob/master/programmering/jplab5/JP5.md
	public static void main(String[] args) {
		 double[][] obs = {
 				{1.4,1.7,1.9,2.0},
 				{5.4,7.8,9.8,7.9,3.0},
 				{-1.7,-1.7,-2.8}
 		};
		 skrivUt(obs);
		 System.out.println(obs.length);// sjekker kun den første linjen av arrayen
		 System.out.println(obs[1].length);
		 System.out.println(obs[2].length);
		 System.out.println(finnes(obs, 10.5));
		 System.out.println(finnes(obs, 5.0));
		 byttRad(obs);

	}
	public static void skrivUt(double[][] tabell) {
		for ( int i = 0; i<tabell.length;i++) {
			for( int v = 0; v<tabell[i].length ;v++) {
				System.out.println(tabell[i][v]);
			}
		}
	}
	public static boolean finnes(double[][] obs, double limit) {
		for ( int i = 0; i<obs.length;i++) {
			for( int v = 0; v<obs[i].length ;v++) {
				if (limit < obs[i][v]) {
					return true;
				}
			}
		}
		return false;
	}
	public static double[][] byttRad(double[][] obs){
		 if (obs[0].length == obs[2].length) {
			 double[] temp = new double[obs[0].length];
			 for (int i = 0; i < obs[0].length; i++) {
		            temp[i] = obs[0][i];
			 }
			 for (int i = 0; i < obs[0].length; i++) {
		            obs[0][i] = obs[1][i]; 
		            obs[1][i] = temp[i];
			 }
		 }
		skrivUt(obs);
		return obs;
	}

}
