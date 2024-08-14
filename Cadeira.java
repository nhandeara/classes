package Classes_;

public class Cadeira {
	String cor;
	String material;
	String girar;
	String subir;
	String descer;

	public String getCor() {
		return cor;		
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getGirar () {
		return "girando";
	}
	public String getSubir () {
		return "subindo";
	}
	public String getDescer () {
		return "descendo";
	}
	}


