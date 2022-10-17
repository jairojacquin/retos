package com.ciclo3.reto.appg24.servicio;

import com.ciclo3.reto.appg24.entidad.Client;
import com.ciclo3.reto.appg24.repositorio.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;
    public List<Client> getClients(){
        return repository.findAll();
    }
    public Client saveClient(Client client){
        return repository.save(client);
    }
    public Client getClient(int id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteClient(int id){
        repository.deleteById(id);
    }

    public Client updateClient(Client clientUpd){
        Client clientOld = getClient(clientUpd.getIdClient());
        clientOld.setName(clientUpd.getName());
        clientOld.setEmail(clientUpd.getEmail());
        clientOld.setPassword(clientUpd.getPassword());
        // clientOld.setAge(clientUpd.getAge());
        return repository.save(clientOld);

    }

}
/**
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.getAll();
    }
    public Optional<Client> getProduct(int idClient){
        return clientRepository.getClient(idClient);
    }
    public Client save(Client p){
        if(p.getIdClient()==null){
            return clientRepository.save(p);
        }else{
            Optional<Client> e = clientRepository.getClient(p.getIdClient());
            if(e.isPresent()){

                return p;
            }else{
                return clientRepository.save(p);
            }
        }
    }
    public Client update(Client p){
        if(p.getIdClient()!=null){
            Optional<Client> q = clientRepository.getClient(p.getIdClient());
            if(q.isPresent()){
                if(p.getName()!=null){
                    q.get().setName(p.getName());
                }
                clientRepository.save(q.get());
                return q.get();
            }else{
                return p;
            }
        }else{
            return p;
        }
    }
    public boolean delete(Integer idClient){
        boolean flag=false;
        Optional<Client>p= clientRepository.getClient(idClient);
        if(p.isPresent()){
            clientRepository.delete(p.get());
            flag=true;
        }
        return flag;

    }


}*/
