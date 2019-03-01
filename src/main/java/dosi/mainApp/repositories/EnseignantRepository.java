package dosi.mainApp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import dosi.mainApp.bean.Enseignant;

public interface EnseignantRepository extends CrudRepository<Enseignant, String> {

	List<Enseignant> findByNom(String nom);
	Enseignant findByNoEnseignant(long id);
	List<Enseignant> findByEmailUbo(String emailUbo);
	List<Enseignant> findByAdresse (String adresse);

}
