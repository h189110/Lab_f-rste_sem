package Lab_5;

public class Opp_B2 {
	// https://github.com/dat100hib/dat100public/blob/master/programmering/jplab5/JP5.md
	public static void main(String[] args) {
		boolean[][] aud = 
			{ 
			  { false, false, false, false}, // rad 0
			  { false, false, true,  false}, // rad 1
			  { true,  false, true,  true }, // rad 2
			  { true,  true,  true,  true }, // rad 3
		};
		
		System.out.println(antLedigPlass(aud));
		System.out.println(prosentLedig(aud) + "%");
		førsteLedig(aud);
		System.out.println(smittevern(aud));
	}
	public static int antLedigPlass(boolean[][] aud) {
		int plasser = 0;
		for( int i = 0; i<aud.length;i++) {// teller nedover rader
			for( int v = 0; v<aud[i].length;v++) { // teller langs koloner
				
				if(aud[i][v] == false) { // false = ledig plass teller opp plasser ved false
					plasser++;
				}
			}
		}
		return plasser;
	}
	public static int prosentLedig(boolean[][] aud) {
		int teller= 0; // for og dra ut total plasser
		for( int i = 0; i<aud.length;i++) {// teller nedover rader
			for( int v = 0; v<aud[i].length;v++) { // teller langs koloner
			
				teller++; 
			}
		}
		int pros =(int) (((double)antLedigPlass(aud)/teller)*100); // (total ledige plasser - total plasser / antallplasser) * 100 for og få prosent ledige
		return pros;
}
	public static void førsteLedig(boolean[][] aud) {
		outerloop: 
		for( int i = 0; i<aud.length;i++) {// teller nedover rader
			for( int v = 0; v<aud[i].length;v++) { // teller langs koloner
				if ( aud[i][v] == false) {
					System.out.println("første ledige plass er rad: " +i+" på posisjon: "+v);
					break outerloop; // breaks outermost loop as space is found
				}
			}
		}
	}
	public static boolean smittevern(boolean[][] aud) {
		for( int i = 0; i<aud.length;i++) {// teller nedover rader
			for( int v = 0; v<aud[i].length;v++) {// teller langs koloner
				if (aud[i][v]&&aud[i+1][v+1]) { // checks values to see if 2 or more spaces between
					return false;
				}
			}
		}
		return true;
	}
}