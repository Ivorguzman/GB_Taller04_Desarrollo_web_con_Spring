package Servicios.model;

public class PaisCapital {

	private String pais;
	private String capital;


	public PaisCapital(String pais, String capital) {
		this.pais = pais;
		this.capital = capital;
	}

	public PaisCapital( ) {
		System.out.println(this.pais);
		System.out.println(this.capital);
	}




	public String getPais() {
		
		return this.pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getCapital() {
		return this.capital;
	}


	public void setCapital(String capital) {
		this.capital = capital;
	}




}
