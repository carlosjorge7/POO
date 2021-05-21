package persona;

public class Main{

    public static void main(String[] args){

      Persona persona1 = new Persona("Carlos", 22, 'H', 63, 1.73);
      Persona persona2 = new Persona("MJ", 55, 'E', 50, 1.55);
      Persona persona3 = new Persona("Pepe", 16, 'H', 130, 1.78);

      persona1.setEdad(23);
      persona2.setNombre("Maria Jose");
      persona1.setPeso(65);
      System.out.println(persona1.calcularIMC());
      System.out.println(persona2.calcularIMC());
      System.out.println(persona3.calcularIMC());

      MostrarMensajePeso(persona1);
      MostrarMensajePeso(persona2);
      MostrarMensajePeso(persona3);

      if(MayorEdad(persona1)){
        System.out.println(persona1.getNombre() + " es mayor de edad");
      }
      else{
        System.out.println(persona1.getNombre() + "no es mayor de edad");
      }

      if(MayorEdad(persona2)){
        System.out.println(persona2.getNombre() + " es mayor de edad");
      }
      else{
        System.out.println(persona2.getNombre() + "no es mayor de edad");
      }

      if(MayorEdad(persona3)){
        System.out.println(persona3.getNombre() + " es mayor de edad");
      }
      else{
        System.out.println(persona3.getNombre() + "no es mayor de edad");
      }

      System.out.println(persona1.toString());
      System.out.println(persona2.toString());
      System.out.println(persona3.toString());
      
    }

    public static void MostrarMensajePeso(Persona persona){

      if(persona.calcularIMC() < 20){
        System.out.println(persona.getNombre() + "tiene un peso ideal" );
      }

      else if(persona.calcularIMC() >= 20 && persona.calcularIMC() <= 25){
        System.out.println(persona.getNombre() + "tiene infrapeso");
      }

      else if(persona.calcularIMC() > 25){
        System.out.println(persona.getNombre() + "tiene sobrepeso");
      }

    }

    public static boolean MayorEdad(Persona persona){

      if(persona.getEdad() >= 18 ){
        return true;
      }
      return false;

    }

   
}