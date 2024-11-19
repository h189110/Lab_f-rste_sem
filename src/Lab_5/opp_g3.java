package Lab_5;
import static javax.swing.JOptionPane.*;
public class opp_g3 {
//https://github.com/dat100hib/dat100public/blob/master/programmering/jplab5/JP5.md
	public static void main(String[] args) {
		
		String breddeStr = showInputDialog("Bredde:");
		String hoydeStr = showInputDialog("Høyde:");

		int a = areal(lesInnTall(breddeStr),lesInnTall(hoydeStr));

		showMessageDialog(null,"Areal: " + a);
	}

	private static int areal(int bredde, int hoyde) {

		int flateareal = bredde * hoyde;

		return flateareal;
	

	}
	private static int lesInnTall(String message) {
		
		int tall = Integer.parseInt(message);
		do {
			String breddeStr = showInputDialog("skriv inn et positivt tall:");
			tall = Integer.parseInt(breddeStr);
		} while( tall<0);
		return tall;
	}

}
