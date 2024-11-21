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
	return null;
	}
	public static void setInnPeng(Opp_G2[] konti, int konto, int sum) {
		finnkonto(konti, konto).setSaldo(sum+finnkonto(konti, konto).getSaldo());
	}
	public static void taUtPeng(Opp_G2[] konti, int konto, int sum) {
		finnkonto(konti, konto).setSaldo(sum-finnkonto(konti, konto).getSaldo());
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
		
	}
}
