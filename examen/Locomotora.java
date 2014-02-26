package examen;

import java.util.Scanner;


public class Locomotora {
	public NodoLocomotora inicio=null;
	
	
	
	public void control(){
		
		this.insertarFinal("Vapor",4,50);
		this.insertarFinal("gasolina", 5, 70);
		this.insertarFinal("Diesel", 6, 100);
		this.insertarFinal("contenedores",1,4);
		this.insertarFinal("Pasajeros", 1, 50);
		this.insertarFinal("carga", 1, 2);
		this.insertarFinal("automoviles", 1, 8);
		this.insertarFinal("Cola", 1, 1);
		
	}	

	
	public void insertarFinal(String nombre,Integer peso, Integer pesoMaximo) {
		NodoLocomotora nuevo = new NodoLocomotora(nombre,peso,pesoMaximo);
		if (inicio == null) {
			inicio = nuevo;
		} else {
			NodoLocomotora aux = inicio;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
			aux = nuevo;
		}

	}



public void imprimir() {
	NodoLocomotora aux = inicio;
	while (aux != null) {
		System.out.printf("El numero es: %.0f %n ", aux.getNombre());
		aux = aux.getSiguiente();
	}
	System.out.printf("%n ");

}
	
}
