package main;

public class Perro extends Animal{
	
	
	private String raza;

	Perro(String nombre, int edad, String raza) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
		this.raza = raza;
	}
	
	
	public void ladrar() {
		
		
		
	}


	@Override
	public String toString() {
		return " (" + super.toString() + ", raza=" + raza + ")";
	}


	


	
	
	
	

}
