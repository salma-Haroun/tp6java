package cigma.pfe.repositories;
import cigma.pfe.models.Client;
public class ClientRepositoryImpl implements ClientRepository {
    @Override
    public Client save(Client C){
        System.out.println("DAO Layer: ClientRepositoryImpl" );
        return null;
    }
    public ClientRepositoryImpl() {
        System.out.println("Call ClientRepositoryImpl ....");
    }
}
