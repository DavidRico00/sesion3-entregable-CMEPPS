package pkg;

public class Cuenta {
	
	private float saldo;
	private String nombre, numCuenta;
	
	public Cuenta(float saldo, String numCuenta, String nombre) {
		super();
		this.saldo = saldo;
		this.nombre = nombre;
		this.numCuenta = numCuenta;
	}

	public void reintegro(float f) {
		if(this.saldo>-500f)
			this.saldo -= f;		
	}

	public void ingreso(float f) {
		this.saldo += f;	
	}

	public Float getSaldo() {
		return this.saldo;
	}

	

}
