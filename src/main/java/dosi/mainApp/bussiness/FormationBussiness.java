package dosi.mainApp.bussiness;

import java.util.List;

import dosi.mainApp.bean.Formation;

public interface FormationBussiness {
	Formation CreateFormation(Formation formation);

	 List<Formation> GetAllFormations();
	 List<Formation> FindFormationByNom(String nom);
	 Formation findFormationById(String id);

	void DeleteFormationByID(String codeFormation);

	Formation UpdateFormation(Formation formation);

}
