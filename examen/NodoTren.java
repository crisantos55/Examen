package examen;

public class NodoTren {

	public NodoLocomotora a;
	public NodoTren siguiente;
	public NodoLocomotora getA() {
		return a;
	}
	public void setA(NodoLocomotora a) {
		this.a = a;
	}
	public NodoTren getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(NodoTren siguiente) {
		this.siguiente = siguiente;
	}
	
	
	public NodoTren(NodoLocomotora a){
		this.a=a;
	}
	
	
}
