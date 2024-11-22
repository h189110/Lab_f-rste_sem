package Lab_6;

public class Opp_G2 {
	int konto;
	int saldo;
	
	public Opp_G2(int saldoint, int kontonummerint) {
		konto = kontonummerint;
		saldo = saldoint;
	}
	public Opp_G2() {
		konto = 0;
		saldo = 0;
	}
	public int getKonto() {
		return konto;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int sald) {
		this.saldo = sald;
	}
	public static int saldo(Opp_G2[] konti ,int konto) {
		return finnkonto(konti, konto).getSaldo();
		
	}
	public static Opp_G2 finnkonto(Opp_G2[] konti, int kontonmr) {
	for (Opp_G2 v : konti) {
		if(v.getKonto() == kontonmr) {
			return v;
		}
		 
	}
	throw new IllegalArgumentException("Konto med nummer " + kontonmr + " ble ikke funnet.");	
	}
	public static void setInnPeng(Opp_G2[] konti, int konto, int sum) {
		finnkonto(konti, konto).setSaldo(sum+finnkonto(konti, konto).getSaldo());
	}
	public static void taUtPeng(Opp_G2[] konti, int konto, int sum) {
		finnkonto(konti, konto).setSaldo(finnkonto(konti, konto).getSaldo()- sum);
	}
	public static void main(String[]args) {
		Opp_G2 K1 = new Opp_G2();
		K1.konto = 123;
		K1.saldo = 250;
		Opp_G2 K2 = new Opp_G2();
		K2.konto = 234;
		K2.saldo = 350;
		Opp_G2 K3 = new Opp_G2();
		K3.konto = 345;
		K3.saldo = 450;
		
		
		 Opp_G2[] konti = { K1, K2, K3 }; // opprette array med kontoene
		 
		// Testcase 1: Sjekk saldo for konto med nummer 123
	        System.out.println("Saldo på konto 123: " + saldo(konti, 123)); // Skal returnere 250
	        
	     // Testcase 2: Sett inn 100 på konto med nummer 234
	        setInnPeng(konti, 234, 100);
	        System.out.println("Ny saldo på konto 234 etter innskudd: " + saldo(konti, 234)); // Skal returnere 450

	        // Testcase 3: Ta ut 50 fra konto med nummer 345
	        taUtPeng(konti, 345, 50);
	        System.out.println("Ny saldo på konto 345 etter uttak: " + saldo(konti, 345)); // Skal returnere 400
	        
	        // Testcase 4: Prøv å hente saldo for en konto som ikke finnes (forventer unntak)
	        try {
	            System.out.println("Saldo på konto 999: " + saldo(konti, 999)); // Forventer exception
	        } catch (IllegalArgumentException e) {
	            System.out.println(e.getMessage()); // Skal skrive ut feilmeldingen
	        }

	     // Testcase 5: Sett inn 200 på konto 123
	        setInnPeng(konti, 123, 200);
	        System.out.println("Ny saldo på konto 123 etter innskudd: " + saldo(konti, 123)); // Skal returnere 450
	   
	}
}
