package string;

public class Main{

    public static void main(String[] args){

        MiString mstr = new MiString();
        System.out.println(mstr.alReves("hola"));
        System.out.println(mstr.limpiaCaracteres("hola", "ha"));
        System.out.println(mstr.sustituye("cadena", 'e', 'i'));
        System.out.println(mstr.todosIguales("aaaaaaa"));
        System.out.println(mstr.quitaEspacios("Hola que tal"));
        System.out.println(mstr.esNumeroEntero("012345f"));


    }
}