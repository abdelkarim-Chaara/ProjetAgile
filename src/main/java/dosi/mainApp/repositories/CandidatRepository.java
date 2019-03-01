package dosi.mainApp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import dosi.mainApp.bean.Candidat;

public interface CandidatRepository extends CrudRepository<Candidat, String> {
	
	List<Candidat> findByNom(String nom);
	
	List<Candidat> findByUniversiteOrigine(String universiteOrigine);
	
	Candidat findByNoCandidat(String NoCandidat);

}
