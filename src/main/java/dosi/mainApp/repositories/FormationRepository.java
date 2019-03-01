package dosi.mainApp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import dosi.mainApp.bean.Formation;

public interface FormationRepository extends CrudRepository<Formation, String> {

	List<Formation> findByNomFormation(String nomFormation);
	Formation findByCodeFormation(String codeFormation);
	
	
}
