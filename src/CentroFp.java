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
        int posicionLibre = -1;
        boolean seguirBuscando = true;

        for (int i = 0; i < MAX_ALUMNOS && seguirBuscando; i++) {
            if( alumnos[i] == null ){
                posicionLibre = i;
                seguirBuscando = false;
            }
        }
    }



    public boolean registrarAlumno(Alumno alumno){
        boolean alumnoAnadido = false;
        int posicion;
        if( registrarAlumno(alumno.getId()) == null ) {
            posicion = buscarPrimerHuecoLibre();
            if(posicion >= 0) {
                alumnos[posicion] = alumno;
                alumnoAnadido = true;
            }
        }
    }



    public String mostrarAlumnos(){
        String alumnos = "";
        for (int i = 0; i < MAX_ALUMNOS; i++) {

        }
    }



    public int contarAlumnos(){}
}

}



