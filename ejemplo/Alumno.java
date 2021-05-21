package ejemplo;

public class Alumno{

    private String nombre;
    private int edad;
    private int curso;
    private float[] notas;
    private int cont = 0; //Atributo de clase;

    public Alumno(String nombre, int edad, int curso){

        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        notas = new float[5];
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getCurso(){
        return curso;
    }

    public void setCurso(int curso){
        this.curso = curso;
    }

    public int capacidadNotas(){

        return notas.length;
    }

    public boolean introducirNota(float nota){

        if(notas.length == cont || (nota < 0 || nota > 10)){
            return false;
        }
        else{
            notas[cont] = nota;
            cont++;
            return true;
        }
    
    }

    public float[] mostrarNotas(){

        float[] auxNotas = new float[cont];
        for(int i = 0; i < cont; i++){

            auxNotas[i] = notas[i];
        }
        return auxNotas;
    }

    public float mediaNotas(float[] auxNotas){

        float sum = 0;
        for(int i = 0; i < cont; i++){

            sum += auxNotas[i];
        }
        return sum / cont;  
    }

    public float notaMayor(float[] auxNotas){

        float mayor = Float.MIN_VALUE;
        for(int i = 0; i < cont; i++){

            if(auxNotas[i] > mayor){
                mayor = auxNotas[i];
            }
        }
        return mayor;
    }

    public float notaMenor(float[] auxNotas){

        float menor = Float.MAX_VALUE;
        for(int i = 0; i < cont; i++){

            if(auxNotas[i] < menor){
                menor = auxNotas[i];
            }
        }
        return menor;
    }

   
 
}