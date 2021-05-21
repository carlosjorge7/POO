package conductor;

public class Main {

    public static void main(String[] args) {
        
        Conductor c = new Conductor("Carlos", "123");

        c.pasaPorCiudad("Madrid");
        c.pasaPorCiudad("Alicante");
        c.pasaPorCiudad("Malaga");

        c.sumarKilometros(120);
        c.sumarKilometros(200);

        System.out.println("TOTAL KM : " + c.getTotalKilometros());
        
        System.out.println("CIUDADES RECORRIDAS : ");
        for(String ciu : c.getCiudadesRecorridas()){
            System.out.print(ciu + ",");
        }
    }
}