package br.com.sigen.fabrica;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ConnectionFactory {

    public Session getSession() {
        AnnotationConfiguration configuration = new AnnotationConfiguration();
        configuration.configure();

        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        return session;
    }
}
