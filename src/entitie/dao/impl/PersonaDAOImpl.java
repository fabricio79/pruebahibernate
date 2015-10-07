package entitie.dao.impl;

import entitie.Persona;
import entitie.dao.PersonaDAO;
import hibernate.NewHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author willy
 */
public class PersonaDAOImpl implements PersonaDAO {

    @Override
    public void guardarPersona(Persona persona) {

        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx=session.beginTransaction();
            session.save(persona);
            session.flush();
            tx.commit();
        } catch (Exception e) {
            if (tx!=null){                
            session.beginTransaction().rollback();
            }
            System.out.println(e.getLocalizedMessage());
        } finally {
            session.close();
        }

    }

}
