/* package examen.proyecto.conceptosavanzados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProgramaPrincipal {

    private static final Logger logger = LoggerFactory.getLogger(CursoImpl.class);

    public static void main(String[] args) {
        ProgramaPrincipal pruebaMain = new ProgramaPrincipal();
        List<Master> listadoMaster = pruebaMain.crearMaster(false);
        pruebaMain.ejecutar(listadoMaster);
    }

    // Métodos
    // Método que ejecuta todos los métodos
    private void ejecutar(List<Master> listadoMasters) {
        boolean oficial = pideDatoBooleano("\nEl máster es oficial: ");
        crearMaster(oficial);
        eliminarMaster(listadoMasters);
    }

    // Método que crea los objetos Master y los guarda en una lista
    public List<Master> crearMaster(boolean oficial) {
        List<Master> listadoMaster = new ArrayList<>();
        Master m1 = new Master(oficial);
        Master m2 = new Master(oficial);
        Master m3 = new Master(oficial);
        listadoMaster.addAll(Arrays.asList(m1, m2, m3));
        return listadoMaster;
    }

    public void alumnosSuspensos(List<Master> listadoMaster) {
        String codigoCurso = pideDatoCadena("\n¿Qué máster quieres borrar? Elige un código: ");
        System.out.println("\n*** Eliminar master ***");
        for (int i = 0; i < listadoMaster.size(); i++) {
            if (listadoMaster.get(i).equals()) {
                listadoMaster.remove(i--);
            }
        }
        
    }
    
    //Método para eliminar un de ellos por su código
    public void eliminarMaster(List<Master> listadoMaster) {
        String codigoCurso = pideDatoCadena("\n¿Qué máster quieres borrar? Elige un código: ");
        if (listadoMaster.contains(codigoCurso))
        for (Master master : listadoMaster) {
            if (master.equals(codigoCurso))
                listadoMaster.remove(codigoCurso);
        }
    }

    // Método Scanner
    public boolean pideDatoBooleano(String texto) {
        logger.info(texto);
        Scanner scan = new Scanner(System.in);
        boolean dato = Boolean.parseBoolean(scan.nextLine());
        return dato;
    }

    public String pideDatoCadena(String texto) {
        logger.info(texto);
        Scanner scan = new Scanner(System.in);
        String dato = scan.nextLine();
        return dato;
    }

}
 */