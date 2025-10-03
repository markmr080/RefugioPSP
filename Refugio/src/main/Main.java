package main;

import java.util.ArrayList;

import java.util.Scanner;

public class Main {
	
	
	public static void main (String [] args) {
		ArrayList<Gato> g = new ArrayList<Gato>();
		ArrayList<Perro> p = new ArrayList<Perro>();
		Scanner sc = new Scanner(System.in);
		String nombre;
		int edad;
		int tamañoBigotes;
		String raza;
		
		int menu = 3;
		
		while (menu != 0) {			
			System.out.println("1- Introduce un animal");
			System.out.println("2- Mostrar todos los datos de animales");
			System.out.println("0- Salir");
			
			menu= sc.nextInt();
			
			if (menu ==1) {						
				System.out.println("1- Introducir un gato");
				System.out.println("2- Introducir un perro");								
				int gaPe= sc.nextInt();
	
					if(gaPe ==1) {
						System.out.println("Dale un nombre");
						nombre = sc.next();
						System.out.println("Dale una edad");
						edad = sc.nextInt();
						System.out.println("Introduce el tamaño de los bigotes");
						tamañoBigotes= sc.nextInt();
						Gato gat = new Gato(nombre, edad, tamañoBigotes);
						g.add(gat);
					}else if (gaPe == 2) {
						System.out.println("Dale un nombre");
						nombre = sc.next();
						System.out.println("Dale una edad");
						edad = sc.nextInt();
						System.out.println("Introduce la raza");
						raza= sc.next();
						Perro per = new Perro(nombre , edad, raza);
						p.add(per);						
					}
				}			
			if (menu == 2) {
				System.out.println("1- Ver Gatos");
				System.out.println("2- Ver Perros");	
				int gaPe = sc.nextInt();	
				
				if  (gaPe == 1) {
					for(int i= 0; i<g.size(); i++) {
						System.out.println(g.get(i));
					}					
				}else if (gaPe == 2) {
					for(int i= 0; i<p.size(); i++) {
						System.out.println(p.get(i));
						}
					}				
				}			
			if (menu == 0) {
				return;
			}				
		}		
	}
}

