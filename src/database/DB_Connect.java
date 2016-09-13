package database;

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
        
        static Session session;
        static Transaction tx;
        static SessionFactory sf;

        
        public static void ConnectOpen(){
            
            StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure("database/hibernate.cfg.xml").build();	
            Metadata metadata = new MetadataSources(standardRegistry).buildMetadata();		
            sf = metadata.getSessionFactoryBuilder().build();		
            		
            
            
        }
        
        public static void ConnectClose(){         		
		
		sf.close();
    }       
        
	public List Connect(String statement){
		
		session = sf.openSession();
                tx = session.beginTransaction();
                List result = session.createQuery(statement).list();
                tx.commit();
		session.close();
		
                return result;
	}
        
        
        
        	public int simpleConnect(String statement){
		session = sf.openSession();
                 tx = session.beginTransaction();
               // Query updateQuery = session.createQuery(statement);
               Query updateQuery = session.createNativeQuery(statement);
                int result = updateQuery.executeUpdate();
		tx.commit();
		session.close();
		
                return result;
	}
   

        	
	
}
