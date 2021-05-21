package vehiculo;

public class Vehiculo{

    private int numRuedas;
    private float velocidadMaxima;
    private float velocidadActual;
    private float peso;

    public Vehiculo(int numRuedas, float velocidadMaxima, float velocidadActual, float peso){
        this.numRuedas = numRuedas;
        this.velocidadMaxima = velocidadMaxima;
        this.velocidadActual = velocidadActual;
        this.peso = peso;
    }

    public int getNumRuedas(){
		return numRuedas;
    }
    
	public void setNumeroRuedas(int numRuedas){
		this.numRuedas = numRuedas;
    }
    
	public float getVelocidadMaxima(){
		return velocidadMaxima;
    }
    
	public void setVelocidadMaxima(float velocidadMaxima){
		this.velocidadMaxima = velocidadMaxima;
    }
    
	public float getVelocidadActual(){
		return velocidadActual;
    }
    
	public void setVelocidadActual(float velocidadActual){
		this.velocidadActual = velocidadActual;
    }
    
	public float getPeso(){
		return peso;
    }
    
	public void setPeso(float peso){
		this.peso = peso;
    }
    
    public boolean esIgual(Vehiculo vehiculo){

        if(numRuedas == vehiculo.getNumRuedas() && velocidadMaxima == vehiculo.getVelocidadMaxima() &&
            velocidadActual == vehiculo.getVelocidadActual() && peso == vehiculo.getPeso()){
                return true;
            }
        return false;
    }

    public void copia(Vehiculo vehiculo){

        /*el numero de ruedas del vehiculo que entra, 
        el numRuedas 'global' le asigno ese numero de ruedas del vehiculo que entra*/
        numRuedas = vehiculo.getNumRuedas();
        velocidadMaxima = vehiculo.getVelocidadMaxima();
        velocidadActual = vehiculo.getVelocidadActual();
        peso = vehiculo.getPeso();
    }

}