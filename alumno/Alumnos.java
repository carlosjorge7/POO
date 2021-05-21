package alumno;

import alumno.Alumno;

public class Alumnos{

    private Alumno[] alumnos;
    private int cont = 0;
    
    public Alumnos(int tamano){
        alumnos = new Alumno[tamano];
    }

    public boolean anadirAlumno(Alumno alumno){

        if(cont == alumnos.length){
            return false;
        }
        for(int i = 0; i < cont; i++){

            if(alumno.getNombre().equalsIgnoreCase(alumnos[i].getNombre())){
                return false;
            }
        }
        alumnos[cont] = alumno;
        cont++;
        return true;
    }

    public boolean eliminarAlumnoA(Alumno alumno){

        if(posicionAlumno(alumno) == -1){
            return false;
        }
        else{

            for(int i = posicionAlumno(alumno); i < cont -1; i++){
                alumnos[i] = alumnos[i+1];
            }
            cont--;
            return true;
        }
    }

    public boolean existeAlumno(Alumno alumno){

        if(posicionAlumno(alumno) == -1){
            return false;
        }
        return true;
    }

    public boolean ponerNotaA(Alumno alumno, int evaluacion, double nota){

        if(posicionAlumno(alumno) == -1){
            return false;
        }
        if(!alumno.validarEvaluacion(evaluacion) || !alumno.validarNota(nota)){
            return false;
        }
        alumnos[posicionAlumno(alumno)].ponerNota(evaluacion, nota);
        return true;
    }

    public boolean borrarNotaA(Alumno alumno, int evaluacion){

        if(posicionAlumno(alumno) == -1){
            return false;
        }
        if(!alumno.validarEvaluacion(evaluacion)){
            return false;
        }
        alumnos[posicionAlumno(alumno)].borrarNota(evaluacion);
        return true;
    }

    public Alumno[] getAlumnos(){

        Alumno[] alumnosAux = new Alumno[cont];
        for(int i = 0; i < alumnosAux.length; i++){
            alumnosAux[i] = alumnos[i];
        }
        return alumnosAux;
    }

    public boolean estaLleno(){

        if(cont == alumnos.length){
            return true;
        }
        return false;
    }

    private int posicionAlumno(Alumno alumno){

        for(int i = 0; i < cont; i++){

            if(alumno.getNombre().equalsIgnoreCase(alumnos[i].getNombre())){
                return i;
            }
        }
        return -1;
    }
}