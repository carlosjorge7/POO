package caja;

public class CajaRegistradora implements ICajaRegistradora{

    private String nombre;
    private Bandeja[] bandejas;
    private double[] tipoMonedas = { 0.01d, 0.02d, 0.05d, 0.1d, 0.2d, 0.5d,
         1d, 2d, 5d, 10d, 20d, 50d, 100d, 200d, 500d };

    public CajaRegistradora(String nombre){

        this.nombre = nombre;
        bandejas = new Bandeja[tipoMonedas.length];
        // Instanciar una bandeja por cada i, asi habra una bandeja para cada tipo de moneda
        for(int i = 0; i < tipoMonedas.length; i++){
            bandejas[i] = new Bandeja(tipoMonedas[i]);
            // bandejas[0] = new Bandeja(tipoMonedas[0]) = new Bandejas(0.01d)
        }
    }

    public String getNombre(){
        return nombre;
    }

    public int getNumTipoMonedas(){
        return bandejas.length;
    }

    private int getPosTipoMoneda(double tipo){

        for(int i = 0; i < bandejas.length; i++){
            if(bandejas[i].getTipo() == tipo){
                return i;
            }
        }
        return -1;
    }

    public int getUnidadesTipoMoneda(double tipo){
       
        int pos = getPosTipoMoneda(tipo);
        if(pos == -1 ){ // el tipo es erroneo
            return -1;
        }
        return bandejas[pos].getCont();
    }

    public boolean meterMonedas(double tipo, int unidades){
        
        int pos = getPosTipoMoneda(tipo);
        if(pos == -1){
            return false;
        }
        bandejas[pos].meterUnidades(unidades);
        return true;
    }


    public boolean monedaValida(double tipo){
         int pos = getPosTipoMoneda(tipo);
         if(pos == -1){
             return false;
         }
         return true;
    }

    public boolean sacarMonedas(double tipo, int unidades){
        
        int pos = getPosTipoMoneda(tipo);
        if(pos == -1){
            return false;
        }
        bandejas[pos].sacarUnidades(unidades);
        return true;
    }
    
    public void vaciarCajaRegistradora(){
        // Vaciar todas y cada una de las bandejas
        for(int i = 0; i < bandejas.length; i++){
            bandejas[i].vaciar();
        }
    }
   
    public double[] getTiposDeMonedas(){
        return tipoMonedas;
    }
    
    public double getSaldo(){
        double sum = 0;
        for(int i = 0; i < bandejas.length; i++){
            sum += bandejas[i].getSaldoBandeja();
        }
        return sum;
    }

    /* Creamos una clase Bandeja */ 
    private class Bandeja{

        private double tipo;
        private int cont = 0; 

        public Bandeja(double tipo){
            this.tipo = tipo;
            cont = 0;
        }

        public double getTipo(){
            return tipo;
        }
        // lleva la cuenta de cuantas monedas hay por bandeja
        public int getCont(){
            return cont;
        }

        public void meterUnidades(int unidades){
            cont += unidades;
        }

        public boolean sacarUnidades(int unidades){
            if(cont >= unidades){
                cont -= unidades;
                return true;
            }
            return false;
        }

        public void vaciar(){
            cont = 0;
        }

        public double getSaldoBandeja(){
            return cont * tipo;
        }

    }
}


