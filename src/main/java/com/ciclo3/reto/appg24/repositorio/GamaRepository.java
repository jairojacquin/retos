package com.ciclo3.reto.appg24.repositorio;
import com.ciclo3.reto.appg24.entidad.Gama;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GamaRepository extends JpaRepository<Gama,Integer >{
}
/**
@Repository

public class GamaRepository {
    @Autowired
    private GamaCrudRepository gamaCrudRepository;

    public List<Gama> getAll(){
        return (List<Gama>) gamaCrudRepository.findAll();
    }
    public Optional<Gama> getGama(int idGama){

        return gamaCrudRepository.findById(idGama);
    }
    public Gama save(Gama c){
        return gamaCrudRepository.save(c);
    }
    public void delete(Gama c){
        gamaCrudRepository.delete(c);
    }
}
*/