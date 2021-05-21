package rectangulo;

public class Rectangulo{

    private float base;
    private float altura;
    private float x;
    private float y;

    //Contructores de sobrecarga
    public Rectangulo(float base, float altura, float x, float y){
        this.base = base;
        this.altura = altura;
        this.x = x;
        this.y = y;
    }

    public Rectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
        x = 0;
        y = 0;
    }

    public Rectangulo(float base){
        this.base = base;
        altura = 1;
        x = 0;
        y = 0;
    }

    public  Rectangulo(){
        base = 1;
        altura = 1;
        x = 0;
        y = 0;  
    }

    public void setBase(float base){
        this.base = base;
    }

    public float getBase(){
        return base;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    public float getAltura(){
        return altura;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getX(){
        return x;
    }

    public void setY(float y){
        this.y = y;
    }

    public float getY(){
        return y;
    }

    public float getArea(){
        return base * altura;
    }

    public float getPerimetro(){
        return 2*base + 2*altura;
    }

    //Metodos de sobrecarga
    public void agranda(float aumentoBase, float aumentoAltura){
        base += aumentoBase;
        altura += aumentoAltura;
    }

    public void agranda(float valor){
        base += valor;
        altura += valor;
    }

    public void agranda(){
        base++;
        altura++;
    }
}