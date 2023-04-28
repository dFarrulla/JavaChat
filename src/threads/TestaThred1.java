package threads;

public class TestaThred1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesenhaMapa dMapa = new DesenhaMapa();
		Thread tMapa = new Thread((Runnable) dMapa);
		
		BarraProgresso bProg = new BarraProgresso();

	}

}
