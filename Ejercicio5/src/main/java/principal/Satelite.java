package principal;

public class Satelite {
	public double meridiano;
	public double paralelo;
	public double distancia_tierra;

	public Satelite(double m,double p,double d){
		this.meridiano = m;
		this.paralelo = p;
		this.distancia_tierra = d;
	}
	public Satelite(){
		this.meridiano = this.paralelo = this.distancia_tierra = 0;
	}

	public void setPosicion(double m,double p,double d){
		this.meridiano = m;
		this.paralelo = p;
		this.distancia_tierra = d;
	}
	public void printPosicion(){
		System.out.println("El satélite se encuentra en el paralelo "+this.paralelo+ "Meridiano "+this.meridiano+" a una distancia de la tierra de "+this.distancia_tierra+"Kilómetros");
	}

	
	public void VariaAltura(double desplazamiento) {
		this.distancia_tierra = this.distancia_tierra + desplazamiento;
	}
	
	public boolean EnOrbita() {
		if(distancia_tierra == 0)
			return false;
		else
			return true;
	}
	
	public void VariarPosicion(double variap, double variam) {
		this.meridiano = this.meridiano + variam;
		this.paralelo = this.paralelo + variap;
	}
}