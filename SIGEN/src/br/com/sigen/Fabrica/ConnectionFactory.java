package br.com.sigen.fabrica;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ConnectionFactory {

    public static final SessionFactory session = buildSession();

    private static SessionFactory buildSession() {
        AnnotationConfiguration configuration = new AnnotationConfiguration();
        configuration.configure();
        return configuration.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return session;
    }
}
