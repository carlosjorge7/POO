package agenda;

import agenda.Contacto;

public class Agenda{

    private Contacto[] contactos;
    private int cont = 0;
    
    public Agenda(int tamano){
        contactos = new Contacto[tamano];
    }

    public boolean anadirContacto(Contacto contacto){

        if(cont == contactos.length){
            return false;
        }
        for(int i = 0; i < cont; i++){
            if(contacto.getNombre().equalsIgnoreCase(contactos[i].getNombre())){
                //esta repetido
                return false;
            }
        }
        contactos[cont] = contacto;
        cont++;
        return true; 
    }

    public boolean existeContacto(Contacto contacto){

        //Existe contacto cuando el nombre esta repetido, indica si el pasado existe o no
        for(int i = 0; i < cont; i++){

            if(contacto.getNombre().equalsIgnoreCase(contactos[i].getNombre())){
                return true;
            }
        }
        return false;
    }

    public Contacto[] listarContactos(){

        Contacto[] con = new Contacto[cont];
        for(int i = 0; i < con.length; i++){
            con[i] = contactos[i];
        }
        return con;
    }

    public String buscarContacto(String nombre){

        String tel = "";
        for(int i = 0; i < cont; i++){

            if(nombre.equalsIgnoreCase(contactos[i].getNombre())){
                tel = contactos[i].getTelefono();
            }
        }
        return tel;
    }

    public boolean eliminarContacto(Contacto contacto){

        if(posContacto(contacto) == -1){
            return false;
        }
        else{

            for(int i = posContacto(contacto); i  < cont -1; i++){
                contactos[i] = contactos[i+1];
            }
            cont--;
            return true;
        }
    }

    public int posContacto(Contacto contacto){

        for(int i = 0; i < cont; i++){

            if(contacto.getNombre().equalsIgnoreCase(contactos[i].getNombre())){
                return i;
            }
        }
        return -1;
    }

    public boolean agendaLlena(){
        if(cont == contactos.length){
            return true;
        }
        return false;
    }
    
    public int huecosLibres(){

        return contactos.length - cont;
    }

}