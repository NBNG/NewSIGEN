package br.com.sigen.Fabrica;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactoryPersistence {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("SigenPU");

    public EntityManagerFactory getEntityManager() {
        return emf;
    }

}
