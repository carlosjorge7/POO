package persona;

public class Persona{

    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(){}

    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        generarDni();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }

    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    public char getSexo(){
        return sexo;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

    public double getPeso(){
        return peso;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }


    public double calcularIMC(){

        return this.peso / (this.altura * this.altura);
    }

    public boolean mayorEdad(){

        if(this.edad >= 18){
            return true;
        }
        return false;
    }

    private void comprobarSexo(){

        if(this.sexo != 'H' && this.sexo != 'M'){
            this.sexo = 'H';
        }
    }

    private void generarDni() {

        final int divisor = 23;
 
        //Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);
 
        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);
 
        //Pasamos el DNI a String
        dni = Integer.toString(numDNI) + letraDNI;
    }
 
    private char generaLetraDNI(int res) {

        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        return letras[res];
    }

    public String toString(){
        
        return "Informacion de la persona: \n"
                + "Nombre : " + nombre + "\n"
                + "Edad : " + edad + "\n"
                + "Dni : " + dni + "\n"
                + "Sexo : " + sexo + "\n"
                + "Peso : " + peso + "\n"
                + "Altura : " + altura + "\n";
    }

 }