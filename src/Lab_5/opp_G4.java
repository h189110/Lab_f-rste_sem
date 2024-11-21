package Lab_5;

public class opp_G4 {

	public static void main(String[] args) {
		skrivUt(15);
	}
	public static void skrivUt(int grad) {
		double rad = (Math.PI * grad) / 180;
		double sin = Math.sin(rad);
		double cos = Math.cos(rad);
		
		String res = String.format("x i grader  x i radianer    sin(x)    cos(x)\n"
				+ "%-12d %-18.6f %-12.6f %-12.6f" ,grad, rad, sin, cos);
		System.out.print(res);
	}
}
