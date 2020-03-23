package firstCommit;


public class TestGit {
	public static void main(String[] args)
	{
		System.out.println("Hello Git ! Denumirea proiectului de licență este  *Soluție informatică pentru încurajarea adoptării unui stil de viață sănătos* ");
		Licenta.Utilizator newUser=new Licenta.Utilizator(20, 60, 170);
		double bmrUtilizator=newUser.calculeazaBmrFormulaHarrisBenedict();
		System.out.println("Rezultatul este " + bmrUtilizator);
	}
	

}
