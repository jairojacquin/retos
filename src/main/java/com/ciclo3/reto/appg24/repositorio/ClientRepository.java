package com.ciclo3.reto.appg24.repositorio;

import com.ciclo3.reto.appg24.entidad.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
/**
@Repository

public class ClientRepository {
    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAll(){
        return (List<Client>) clientCrudRepository.findAll();
    }
    public Optional<Client> getClient(Integer idClient){
        return clientCrudRepository.findById(idClient);
    }
    public Client save(Client c){
        return clientCrudRepository.save(c);
    }
    public void delete(Client c){
        clientCrudRepository.delete(c);
    }
}
*/