package Classes_;

public class ObjetoAviao {


	public static void main(String[] args) {
		
			Aviao aviao1 = new Aviao();
			//OBJETO 1
			aviao1.setcompanhia("go");
			aviao1.setpoltrona("Laranja");
			aviao1.setpassageiro(40);
			aviao1.setCor("branco");
			//Chamando o método get() para apresentar os objetos
			System.out.println("----Objeto----");
			System.out.println(aviao1.getCompanhia());
			System.out.println(aviao1.getPoltrona());
			System.out.println(aviao1.getPassageiro());
			System.out.println(aviao1.getCor());
	
}
}