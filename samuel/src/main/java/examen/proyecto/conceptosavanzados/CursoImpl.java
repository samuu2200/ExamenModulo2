package examen.proyecto.conceptosavanzados;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CursoImpl implements Curso {
    private static final Logger logger = LoggerFactory.getLogger(Curso.class);


    @Override
    public void codigoCurso() {
        logger.info("*** Código del curso ***");
        
    }

    @Override
    public void cupoCurso() {
        logger.info("*** Cupón del curso ***");
        
    }

    @Override
    public void nombreCurso() {
        logger.info("*** Nombre del curso ***");
        
    }

    

}
