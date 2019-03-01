package  dosi.mainApp.bussiness;

import java.util.List;

import dosi.mainApp.bean.*;
public interface EnseignantBusiness {

	Enseignant CreateEnseignant(Enseignant enseignant);

	List<Enseignant> FindEnseignantByNom(String nom);

	List<Enseignant> GetAllEnseignants();

	Enseignant FindEnseignantById(long id);

	void DeleteEnseignantByID(long id);

	List<Enseignant> FindEnseignantByEmail(String email);

	List<Enseignant> FindEnseignantByAdresse(String adresse);
}
