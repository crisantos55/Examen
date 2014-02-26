package examen;

public class NodoLocomotora {
	public String Nombre;
	public Integer peso;
	public Integer pesoMaximo;
	public NodoLocomotora siguiente;
	
	
	
	
	public String getNombre() {
		return Nombre;
	}




	public void setNombre(String nombre) {
		Nombre = nombre;
	}




	public Integer getPeso() {
		return peso;
	}




	public void setPeso(Integer peso) {
		this.peso = peso;
	}




	public Integer getPesoMaximo() {
		return pesoMaximo;
	}




	public void setPesoMaximo(Integer pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}




	public NodoLocomotora getSiguiente() {
		return siguiente;
	}




	public void setSiguiente(NodoLocomotora siguiente) {
		this.siguiente = siguiente;
	}




	public NodoLocomotora(String nombre, Integer peso, Integer pm){
		this.Nombre=nombre;
		this.peso=peso;
		this.pesoMaximo=pm;
	}

}
