package main;

public class Gato extends Animal{
	
	

	private int longitudBigotes;
	
	Gato(String nombre, int edad, int longitudBigotes) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
		this.longitudBigotes=longitudBigotes;
		
		
	}
	

	public void maullar() {
		
		System.out.println("miau miau");
	}
	

	@Override
	public String toString() {
		return " (" + super.toString() + ", longitud Bigotes=" + longitudBigotes + ")" ;
	}
	

}
