package nombres;

public class Nombres{

    private String[] nombres;
    private int cont = 0;

    public Nombres(int tamanio){

        nombres = new String[tamanio];

    }

    public boolean anadir(String nombre){

        if(cont == nombres.length){
            return false;
        }
        else{

            for(int i = 0; i < cont; i++){

                if(nombre.equals(nombres[i])){
                    return false;
                }

            }

            nombres[cont] = nombre;
            cont++;
            return true;
        }
    }

    public boolean eliminar(String nombre){

        boolean encontrado = false;

        for(int i = 0; i < cont && !encontrado; i++){

            if(nombre.equals(nombres[i])){

                encontrado = true;

                for(int j = i; j < cont - 1 ; j++){

                    nombres[j] = nombres[j+1];

                }
                cont--;

            }
            else{
                encontrado = false;
            }
        }

        return encontrado;
    }

    public void vaciar(){
        cont = 0;
    }

    public String getNombre(int posicion){

        if(posicion >= 0 && posicion <= cont){
            return nombres[posicion];

        }
        return null; 
    }

    public int getNumeroNombres(){
        return cont;
    }

    public int getCapacidad(){
        return nombres.length;
    }

    public boolean estaLena(){

        if(cont == nombres.length){
            return true;
        }
        return false;

    }

    public boolean buscarNombre(String nombre){

        for(int i = 0; i < cont; i++){

            if(nombres[i].equals(nombre)){
                return true;
            }
        }
        return false;

    }

}

