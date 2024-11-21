package Lab_6;

public class Opp_G1 {
	int sidelengde;
	
	public Opp_G1(int side) {
		sidelengde=side;
	}
	public static int areal(int side) { //metode for og regne ut arealet på kvadratet
		return side * side;
	}
	public static int omkrets(int side) { //regne ut omkrets ved og summe alle fire sider
		return side*4;
	}
	public static int diagonal(int side) { //diagonalen er like lang som side lengde på et kvadrat
		return side;
	}
	public static void tegn(int side) {
		for(int i = 0;i<side;i++ ) {
			for(int v = 0; v<side;v++) { // lager kvadratet med samme teknikk som og lese av en array
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	public static void main(String[]args) {
		Opp_G1 V1 = new Opp_G1(3);
		Opp_G1 V2 = new Opp_G1(4);
		Opp_G1 V3 = new Opp_G1(5);
		
		System.out.println("arealet på figur V1 er: " + areal(V1.sidelengde) + "\n" + " den har en omkrets på: " + omkrets(V1.sidelengde) + "\n"
				+ "og diagonalen er på: "+diagonal(V1.sidelengde)+ " og figuren ser ut som dette:" +"\n");
		tegn(V1.sidelengde);
		System.out.println("arealet på figur V2 er: " + areal(V2.sidelengde) + "\n" + " den har en omkrets på: " + omkrets(V2.sidelengde) + "\n"
				+ "og diagonalen er på: "+diagonal(V2.sidelengde)+ " og figuren ser ut som dette:" +"\n");
		tegn(V2.sidelengde);
		System.out.println("arealet på figur V3 er: " + areal(V3.sidelengde) + "\n" + " den har en omkrets på: " + omkrets(V3.sidelengde) + "\n"
				+ "og diagonalen er på: "+diagonal(V3.sidelengde)+ " og figuren ser ut som dette:" +"\n");
		tegn(V3.sidelengde);
		// alternatively could be done in a loop to make the code more compact.
	}
	
}
