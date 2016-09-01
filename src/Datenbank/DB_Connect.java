package Datenbank;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.integrator.spi.Integrator;
import org.hibernate.query.Query;
import org.hibernate.boot.registry.StandardServiceRegistry;
import java.util.*;


//import entity.Kund;
import entity.Arti;

public class DB_Connect {
    
        public DB_Connect()
        {
            
        }

	public List Connect(String statement){
		
		StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("Datenbank/hibernate.cfg.xml").build();	
		Metadata metadata = new MetadataSources(standardRegistry).buildMetadata();		
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();		
		Session session = sf.openSession();		
		Transaction tx = session.beginTransaction();
		

                List result = session.createQuery(statement).list();
                                               
		
		//for ( Iterator iterator = kunden.iterator(); iterator.hasNext();){
		//Kund kunde = (Kund) iterator.next();
		//System.out.println(kunde.getVorname() + " " + kunde.getNachname() );
		tx.commit();         		
		session.close();
		sf.close();
                return result;
	}
        
   
        public int UpdateArtikel(String statement, int amount, int nummer){
            StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("Datenbank/hibernate.cfg.xml").build();
            Metadata metadata = new MetadataSources(standardRegistry).buildMetadata();		
            SessionFactory sf = metadata.getSessionFactoryBuilder().build();
            Session session = sf.openSession();		
            Transaction tx = session.beginTransaction();      
            
            Query updateQuery = session.createQuery(statement);
            //con.UpdateArtikel("UPDATE Arti set BESTANDSMENGE = :bestand "+ "WHERE ANR = :artikel");
            Arti artikel = new entity.Arti();
            int i = Integer.parseInt(artikel.getBESTANDSMENGE() + amount);
            //Lagerverwaltung.EinlagernGUI.getjTextField1().setText(String.valueOf(i));
            updateQuery.setParameter("bestand", 5 );
            updateQuery.setParameter("artikel", 5);
                                          
            
            int result = updateQuery.executeUpdate();
            
            tx.commit();
            session.close();
            sf.close();
            return result;
        }
        	
	
}
