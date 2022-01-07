package cigma.pfe;
import cigma.pfe.models.Client;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
public class CLIENTDAOIMPL  implements IClientDao {
    EntityManagerFactory emf=
            Persistence.createEntityManagerFactory("unit_clients");
    EntityManager em=emf.createEntityManager();
    public ClientDaoImpl() {
    }
    @Override
    public boolean save(Client c) {
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        return true;
    }

}
