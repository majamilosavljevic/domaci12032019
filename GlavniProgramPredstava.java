package domaci_12032019;

public class GlavniProgramPredstava {

	public static void main(String[] args) {

		Pozoriste p1 = new Pozoriste("Madlenianum");
		Predstava pr1 = new Predstava("Ana Karenjina", p1);

		Glumac g1 = new Glumac("Pera Peric", p1, "Vronski");
		Glumac g2 = new Glumac("Jana Janic", p1, "Ana Karenjina");

		pr1.addEmployees(g1);
		pr1.addEmployees(g2);

		System.out.println(pr1);

	}

}
