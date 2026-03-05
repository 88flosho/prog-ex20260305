public class CentroFp {

    private Alumno[] alumnos;
    private int MAX_ALUMNOS;

    public CentroFp(int cantidad_maxima_alumnos) {
       MAX_ALUMNOS = cantidad_maxima_alumnos;
       alumnos = new Alumno[MAX_ALUMNOS];
    }

    public Alumno buscarAlumno(int idAlumno){
    boolean seguirBuscando = false;
    Alumno alumnoEncontrado = null;
        for (int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++) {
            if( alumnos[i] != null && alumnos[i].getId() == idAlumno ){
                seguirBuscando = false;
                alumnoEncontrado = alumnos[i];
            }
        }

        return alumnoEncontrado;
    }


    private int buscarPrimerHuecoLibre(){

    }



    public boolean registrarAlumno(Alumno alumno){
        boolean anadidoAlumno = false;
        for (int i = 0; i < MAX_ALUMNOS && anadidoAlumno; i++) {
            if( alumnos[i] == null){
                anadidoAlumno = true;
            }
        }
    }



    public String mostrarAlumnos(){
    }



    public int contarAlumnos(){}
}

}



