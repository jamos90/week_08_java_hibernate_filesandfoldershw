package db;

import models.Folder;
import models.Owner;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBOwner {

    private static Transaction transaction;
    private static Session session;


    public static List<Folder> findAllFolders(Owner owner){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Folder> folders = null;
        try{
            Criteria cr = session.createCriteria(Folder.class);
            cr.add(Restrictions.eq("owner", owner));
            folders = cr.list();
        } catch(HibernateException e){
            e.printStackTrace();
        } finally {
            session.close();
        }
        return  folders;
    }
}




