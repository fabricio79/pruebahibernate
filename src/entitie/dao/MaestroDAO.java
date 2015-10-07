package entitie.dao;

import entitie.Maestro;
import java.util.List;

/**
 *
 * @author willy
 */
public interface MaestroDAO {

    List<Maestro> getMaestro();
    Maestro getMaestro(int leNumero);
    
}
