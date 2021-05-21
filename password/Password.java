package password;

public class Password{

    private int longitud;
    private String pass;

    public Password(){

    }

    public Password(int longitud){
        this.longitud = 8;
    }

    public Password(int longitud, String pass){
        this.longitud = longitud;
        this.pass = pass;
    }

    

}