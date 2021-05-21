package cuenta;

public class Cuenta{

    private String titular;
    private double cantidad;

    public Cuenta(String titular){

        this.titular = titular;
        cantidad = 0;
    }

    public Cuenta(String titular, double cantidad){
        this.titular = titular;
        if (cantidad < 0) {
            this.cantidad = 0;
        }
        else {
            this.cantidad = cantidad;
        }
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getCantidad(){
        return cantidad;
    }

    public void setCantidad(double cantidad){
        this.cantidad = cantidad;
    }

    public void ingrearCantidad(double cantidad){

        if(cantidad  > 0){
            this.cantidad += cantidad;
        }
    }

    public void retirarCantidad(double cantidad){

        if(this.cantidad - cantidad < 0){
            this.cantidad = 0;
        }
        else{
            this.cantidad -= cantidad;
        }
    }
    //Este metodo devuelve toda la infromacion del objeto
    public String toString(){
        return "Titular " + titular  + " cantidad " + cantidad;
    }

}