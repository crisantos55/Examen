package examen;

import java.util.Scanner;

public class Tren {
	public NodoTren inicio=null;
	
	
	public Integer scaner() {
		Scanner a = new Scanner(System.in);
		Integer cadena = a.nextInt();
		//a.reset();
		return cadena;

	}
	
	public void armarTren(){
		System.out.println("Numero de pasajeros\n\n");
		Integer pasajeros=this.scaner();
		System.out.println("Numero de toneladas a cargar 2\n\n");
		Integer toneladasCargar=this.scaner();
		System.out.println("Numero de automoviles");
		Integer autos=this.scaner();
		this.armar(pasajeros, toneladasCargar, autos);
	}
	
	public void armar(Integer pasajeros,Integer toneladasCargar, Integer autos){
		//System.out.println(pasajeros);
		//Tren tren=new Tren();
		Locomotora dis= new Locomotora();
		dis.control();
		//System.out.println("jkj");
		//dis.imprimir();
		Integer num=this.decidir(pasajeros, toneladasCargar, autos);
		NodoLocomotora nue=this.buscarLocomotora(dis, num);
		this.insertarFinal(nue);
		NodoLocomotora aux=dis.inicio;
		aux=aux.getSiguiente();
		aux=aux.getSiguiente();
		aux=aux.getSiguiente();
		aux=aux.getSiguiente();
		

		
		for(int i=0;i<this.pasajeros(pasajeros);i++){
			this.insertarFinal(aux);
		}
		aux=aux.getSiguiente();
	
		for(int i=0;i<this.carga(toneladasCargar);i++){
			this.insertarFinal(aux);
			
		}
		aux=aux.getSiguiente();
		
		for(int i=0;i<this.autos(autos);i++){
			this.insertarFinal(aux);
		}
		aux=aux.getSiguiente();
		this.insertarFinal(aux);
		
	}
	
	
	public void imprime() {
		NodoTren aux = inicio;
		
		//System.out.println(aux);
		while (aux != null) {
			System.out.println(aux.a.getNombre());
		//	System.out.println(aux.a.Nombre);
			aux = aux.getSiguiente();
		}
		System.out.printf("%n ");

	}
		
	
	
	public void insertarFinal(NodoLocomotora a) {
		NodoTren nuevo = new NodoTren(a);
		if (inicio == null) {
			inicio = nuevo;
		} else {
			NodoTren aux = inicio;
			while (aux.getSiguiente() != null) {
				aux = aux.getSiguiente();
			}
			aux.setSiguiente(nuevo);
			aux = nuevo;
		}

	}

	
	public NodoLocomotora buscarLocomotora(Locomotora dis,Integer num){
		//System.out.println(num);
		NodoLocomotora aux=dis.inicio;
		if(num<=aux.getPesoMaximo()){
			return aux;}
		else{			
			aux=aux.getSiguiente();
			if(num<=aux.getPesoMaximo()){
				
				return aux;
			}else{
			aux=aux.getSiguiente();
				return aux;
			}
		}
	}
	
	
	public Integer pasajeros(Integer pasajeros){
		
		Integer aux=pasajeros%50;
	if(aux==0){
		return pasajeros/50;
	}else{
		return pasajeros/50+1;
	}

		
	}
	
	public Integer carga(Integer carga){
		Integer aux=carga%2;
		if(aux==0){
			return carga/2;
		}else{
			return carga/2+1;
		}
		
		
	}
	
	
	public Integer autos(Integer autos){
		Integer aux=autos%8;
		if(aux==0){
			return autos/8;
		}else{
			return autos/8+1;
		}
		
		
	}
	
	public Integer decidir(Integer p, Integer c, Integer a){
		Integer pasajeros=this.pasajeros(p);
		Integer carga=this.carga(c);
		Integer aut=this.autos(a);
		Integer pesoTotal=pasajeros+carga+aut+1;
		return pesoTotal;
	}
	
	

}
