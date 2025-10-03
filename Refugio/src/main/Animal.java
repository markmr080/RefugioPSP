package main;



public class Animal {
private String nombre;
private int edad;


Animal (String nombre, int edad) {
	this.nombre=nombre;
	this.edad = edad;
	
	
	
}

public void mostrarDatos() {
	
	System.out.println(nombre + " tiene " + edad + " años");
	
	
}

@Override
public String toString() {
	return "nombre=" + nombre + ", edad=" + edad;
}


}
