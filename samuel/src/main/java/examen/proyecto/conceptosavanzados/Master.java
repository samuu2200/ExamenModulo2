package examen.proyecto.conceptosavanzados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Master extends CursoImpl {
    private boolean oficial;

    // Constructor
    public Master(boolean oficial) {
        this.nombreCurso();
        this.codigoCurso();
        this.cupoCurso();
        this.oficial = oficial;
    }

    // Getters & Setters
    public boolean getOficial() {
        return oficial;
    }

    public void setOficial(boolean oficial) {
        this.oficial = oficial;
    }



}
