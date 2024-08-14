package Classes_;

public class ObjetoAnimal {

	public static void main(String[] args) {
		Animal galinha1 = new Animal();
		Animal vaca1 = new Animal();
		Animal bezerro1 = new Animal();
		Animal cabra1 = new Animal();
		Animal cachorro1 = new Animal();
		Animal coelho1 = new Animal();
		Animal pintinho1 = new Animal();
		
		//OBJETO 1
		galinha1.setCor("Amarela");
		galinha1.setIdade(2);
		galinha1.setPeso(1);
		galinha1.setNome("Cócó");
		
		vaca1.setCor("preto");
		vaca1.setIdade(3);
		vaca1.setPeso(510);
		vaca1.setNome("Mimosa");
		
		bezerro1.setCor("Branco");
		bezerro1.setIdade(1);
		bezerro1.setPeso(50);
		bezerro1.setNome("Thomé");
		
	    cabra1.setCor("marron");
	    cabra1.setIdade(10);
	    cabra1.setPeso(140);
	    cabra1.setNome("Capuccina");
	    
	    
	    cachorro1.setCor("preto");
	    cachorro1.setIdade(2);
	    cachorro1.setPeso(50);
	    cachorro1.setNome("sandy");
	    
	    coelho1.setCor("branco");
	    coelho1.setIdade(1);
	    coelho1.setPeso(2);
	    coelho1.setNome("bola de neve");
	    
	    
	    pintinho1.setCor("amarelo");
	    pintinho1.setIdade(1);
	    pintinho1.setPeso(05);
	    pintinho1.setNome("pikachu");
	    
		//Chamando o método get() para apresentar os objetos
		System.out.println("----Galinha----");
		System.out.println(galinha1.getCor());
		System.out.println(galinha1.getIdade());
		System.out.println(galinha1.getPeso());
		System.out.println(galinha1.getNome());

		System.out.println("----Vaca----");
		System.out.println(vaca1.getCor());
		System.out.println(vaca1.getIdade());
		System.out.println(vaca1.getPeso());
		System.out.println(vaca1.getNome());

		System.out.println("----Bezerro----");
		System.out.println(bezerro1.getCor());
		System.out.println(bezerro1.getIdade());
		System.out.println(bezerro1.getPeso());
		System.out.println(bezerro1.getNome());
		
		System.out.println("----Cabra----");
		System.out.println(cabra1.getCor());
		System.out.println(cabra1.getIdade());
		System.out.println(cabra1.getPeso());
		System.out.println(cabra1.getNome());
		
		System.out.println("----cachorro----");
		System.out.println(cachorro1.getCor());
		System.out.println(cachorro1.getIdade());
		System.out.println(cachorro1.getPeso());
		System.out.println(cachorro1.getNome());
		
		System.out.println("----coelho----");
		System.out.println(coelho1.getCor());
		System.out.println(coelho1.getIdade());
		System.out.println(coelho1.getPeso());
		System.out.println(coelho1.getNome());
		
		System.out.println("----pintinho----");
		System.out.println(pintinho1.getCor());
		System.out.println(pintinho1.getIdade());
		System.out.println(pintinho1.getPeso());
		System.out.println(pintinho1.getNome());
		
	}

}