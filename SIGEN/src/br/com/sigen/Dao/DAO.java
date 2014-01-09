/*package br.com.sigen.dao;


import br.com.sigen.fabrica.ConnectionFactory;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

@SuppressWarnings("uncheked")
public class DAO<T> {
    
    
    private final Class<T> classe;
    private Session session;

    public DAO(Class<T> class1) {
        classe = class1;
        session = new ConnectionFactory().getSessionFactory().openSession();
    }
    
    public void adicionar(T t) {

        Transaction tx = session.beginTransaction();
        session.save(t);
        tx.commit();
    }

    public T adicionaRetorno(T t) {

        Transaction tx = session.beginTransaction();
        session.save(t);
        tx.commit();
        return t;
    }

    public void atualiza(T t) {
        Transaction tx = session.beginTransaction();
        session.update(t);
        tx.commit();
    }

    public void remover(T t) {

        Transaction tx = session.beginTransaction();
        session.delete(t);
        tx.commit();
    }

    public List<T> listaTodos() {
        return this.session.createCriteria(classe).list();
    }

    public T busca(Long id) {
        return (T) session.load(classe, id);
    }

    public List<T> buscaPorNome(String nome) {
        return session.createCriteria(classe).add(Restrictions.ilike("nome", "%" + nome + "%")).list();
    }

    public List<T> buscaPorCPF(String cpf) {
        return session.createCriteria(classe).add(Restrictions.ilike("cpf", "%" + cpf + "%")).list();
    }

    public T testeBusca(String cpf) {
        return (T) session.load(classe, cpf);
    }

    public List<Object[]> buscaAvançada(String consulta) {
        return (List<Object[]>) session.createQuery(consulta).list();
    }

    public void close(){
        session.close();  
    }
}*/
package br.com.sigen.dao;


import br.com.sigen.Fabrica.ConnectionFactoryPersistence;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@SuppressWarnings("uncheked")
public class DAO<T> {
    
    private final Class<T> classe;
    EntityManager entityManager;
    
    public DAO(Class<T> classe){
        entityManager = new ConnectionFactoryPersistence().getEntityManager()
                .createEntityManager();
        this.classe = classe;
    }
    
    public void adicionar(T t){
       // EntityManager entityManager = factory.createEntityManager().;
        entityManager.getTransaction().begin();
        entityManager.persist(t);
        entityManager.getTransaction().commit();   
        entityManager.close();
        //factory.close();
    }
    
    public T adicionaRetorno(T t) {
        //EntityManagerFactory factory = Persistence.createEntityManagerFactory("SigenPU");
        //EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(t);
        entityManager.getTransaction().commit(); 
        //entityManager.close();
        //factory.close();
        return t;
    }
    
    public void atualiza(T t) {
        //EntityManagerFactory factory = Persistence.createEntityManagerFactory("SigenPU");
        //EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.merge(t);
        entityManager.getTransaction().commit();
        //entityManager.close();
        //factory.close();
    }
    
    public void remover(T t){
        //EntityManagerFactory factory = Persistence.createEntityManagerFactory("SigenPU");
        //EntityManager entityManager = factory.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(t);
        entityManager.getTransaction().commit();
        //entityManager.close();
        //factory.close();
    }
    
    public List<T> listaTodos(){
        //EntityManagerFactory factory = Persistence
          //      .createEntityManagerFactory("SigenPU");
        //EntityManager entityManager = factory.createEntityManager();
        CriteriaQuery<T> query = entityManager.getCriteriaBuilder().
                createQuery(classe);
        query.select(query.from(classe));
        List<T> lista = entityManager.createQuery(query).getResultList();
        //entityManager.close();
        //factory.close();
        
        return lista;
    }
    
    public T busca(Long id){
        //EntityManagerFactory factory = Persistence
          //      .createEntityManagerFactory("SigenPU");
        //EntityManager entityManager = factory.createEntityManager();
        T t = (T) entityManager.find(classe, id);
        entityManager.close();
        //factory.close();
        return t;
    }
    
    public List<T> buscaPorCPF(String cpf) {
        //EntityManagerFactory factory = Persistence
          //      .createEntityManagerFactory("SigenPU");
        //EntityManager entityManager = factory.createEntityManager();
        
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = cb.createQuery(classe);
        Root<T> a = query.from(classe);
        query.select(a);
        // cb igual á raiz.cpf = cpf
        Predicate predicate = cb.equal(a.get("cpf"), cpf);
        // ASSOCIANDO O PREDICATE A CONSULTA
        query.where(predicate);
        
        List<T> list = entityManager.createQuery(query).getResultList();
        //entityManager.close();
        //factory.close();
        
        return list;
        
    }
    
    public List<T> buscaPorNome(String nome) {
        //EntityManagerFactory factory = Persistence
          //      .createEntityManagerFactory("SigenPU");
        //EntityManager entityManager = factory.createEntityManager();
        
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> query = cb.createQuery(classe);
        Root<T> a = query.from(classe);
        query.select(a);
        // cb igual á raiz.nome like %nome%
        Predicate predicate = cb.like(a.<String>get("nome"), "%"+nome+"%");
        query.where(predicate);
        List<T> list = entityManager.createQuery(query).getResultList();
        //entityManager.close();
        //factory.close();
        
        return list;
    }
    
    public List<Object[]> buscaAvançada(String consulta) {
        //EntityManagerFactory factory = Persistence
          //      .createEntityManagerFactory("SigenPU");
        //EntityManager entityManager = factory.createEntityManager();
        List<Object[]> lista = (List<Object[]>) entityManager.createQuery(consulta).getResultList();
        //entityManager.close();
        //factory.close();
        return lista;
    }
    
}