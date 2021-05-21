package rectangulo;

public class Main{

    public static void main(String[] args) {

        Rectangulo rec = new Rectangulo();
        rec.agranda();
        System.out.println(rec.getArea());

        rec.agranda(10);
        System.out.println(rec.getPerimetro());

        
        
    }
}