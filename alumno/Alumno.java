package alumno;

public class Alumno{

    private String nombre;
    private double[] notas;

    private static int SIN_NOTA = -1;

    public Alumno(String nombre){
        this.nombre = nombre;
        notas = new double[3];
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public boolean ponerNota(int evaluacion, double nota){

        if(validarEvaluacion(evaluacion) && validarNota(nota)){
            notas[evaluacion-1] = nota;
            return true;
        }
        return false;
    }

    public boolean borrarNota(int evaluacion){

        if(validarEvaluacion(evaluacion)){
            notas[evaluacion-1] = SIN_NOTA;
            return true;
        }
        return false;
    }

    public int numeroNotas(){

        int contNotas = 0;

        for(int i = 0; i < notas.length; i++){
            if(notas[i] != SIN_NOTA){
                //Sin nota
                contNotas++;
            }
        }
        return contNotas;
    }

    public double notaMaxima(){

        double max = Double.MIN_VALUE;
        for(int i = 0; i < notas.length; i++){
            if(notas[i] > max){
                max = notas[i];
            }
        }
        return max;
    }

    public boolean tieneNota(int evaluacion){

        if(validarEvaluacion(evaluacion)){

            if(notas[evaluacion-1] != SIN_NOTA){
                return true;
            }
        }
        return false;
    }

    public double getNota(int evaluacion){

        if(!validarEvaluacion(evaluacion) || notas[evaluacion-1] == SIN_NOTA){
            return -1;
        }
        return notas[evaluacion-1];
    }

    public boolean validarEvaluacion(int evaluacion){

        if(evaluacion >= 1 && evaluacion <= 3){
            return true;
        }
        return false;
    }

    public boolean validarNota(double nota){

        if(nota >= 0 && nota <= 10){
            return true;
        }
        return false;
    }

}

