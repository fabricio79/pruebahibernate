package services;

import entitie.Maestro;
import entitie.Persona;
import java.util.List;

/**
 *
 * @author willy
 */
public interface service {

    void guardarPersona(Persona persona);

    List<Maestro> listarMaestro();
    Maestro getMaestro(int leNumero);
}
