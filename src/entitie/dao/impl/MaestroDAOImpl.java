
package entitie.dao.impl;

import entitie.Maestro;
import entitie.dao.MaestroDAO;
import hibernate.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;

import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author willy
 */
public class MaestroDAOImpl implements MaestroDAO {
    private Object hibernateUtil;
    @Override
  public List<Maestro> getMaestro(){
      List<Maestro> list = new ArrayList<>();
      Session session = NewHibernateUtil.getSessionFactory().openSession();
      try{
          session.beginTransaction();
            Criteria criteria = session.createCriteria(Maestro.class);
            list = (List<Maestro>) criteria.list();
      }catch (Exception e){
           session.beginTransaction().rollback();          
      } finally {
          session.close();
            return list;
      }          
  }
    @Override
    public Maestro getMaestro(int leNumero){
    Maestro maestro = new Maestro();
    Session session = NewHibernateUtil.getSessionFactory().openSession();
    try {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Maestro.class);
        criteria.add(Restrictions.eq("leNumero", leNumero));
        maestro = (Maestro) criteria.uniqueResult();
    } catch (Exception e) {
        session.beginTransaction().rollback();        
    } finally {
        session.close();
        return maestro;
    }
    
}
}