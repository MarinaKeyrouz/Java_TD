package td2;

import java.io.IOException;

class Fille extends Mere {
	//Exercice 1
//	public static int meth() {
//		return 24;
//	}

//	// Exercice 1.2
//	public int meth = 24;
//	
//	// Exercice 2:
	void miage() { 
		System.out.println("Miage");
	}

	public void a() { //Redefinition
		System.out.println("Fille_a");
	}

	protected void b(Fille fille) { //Redefinition
		System.out.println("Fille_b(Fille)");
	}

	public void c(Mere mere) { //Surcharge
		System.out.println("Fille_c(Mere)");
	}

	void c(Fille b) { //Surcharge
		System.out.println("Fille_c(Fille)");
	}

	static void d() { //Redefinition
		System.out.println("static Fille_d");
	}

	static void d(Mere mere) { //Surcharge
		System.out.println("Fille_d(Mere)");
	}
	//Redefinition
	protected void e() { //private to protected parceque dans mere la methode est protected, so we cant have it here as private
		System.out.println("Fille_e");
	}
	//Redefinition
	protected void f() {
		System.out.println("Fille_f");
	}
/**
 * 
 */
	//Surcharge
	String g() {
		System.out.println("Fille_g");
		return "c";
	}
	//Redefinition
	int h() {
		System.out.println("Fille_h"); 
		return 2; //return 2 a la place de "c"
		} //on doi avoir int et pas char comme dans la classe Mere
//Redefinition
	public void i() { //change from int to void because we need to have the same as ce qu'on a dans la classe Mere
		System.out.println("Fille_i");
//		return 3;
	}
//Redefinition
	void j() throws IOException {
		System.out.println("Fille_j");
	}
//Redefinition
	void k() throws IOException { //Here we need to have the same Exception that we have dans la classe Mere
		System.out.println("Fille_k");
	}
	//Redefinition

	void l() {
		System.out.println("Fille_l");
	}
	//Redefinition

	void m() throws IOException, IllegalArgumentException {
		System.out.println("Fille_m");
	}
}