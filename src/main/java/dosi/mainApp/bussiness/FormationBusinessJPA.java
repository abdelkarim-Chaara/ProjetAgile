package dosi.mainApp.bussiness;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dosi.mainApp.bean.Enseignant;
import dosi.mainApp.bean.Formation;
import dosi.mainApp.repositories.FormationRepository;

@Component
public class FormationBusinessJPA  implements FormationBussiness {

	private FormationRepository repos ;
	
	@Autowired
	public FormationBusinessJPA(FormationRepository repos) {

		this.repos = repos;
	}

	@Override
	public Formation CreateFormation(Formation formation) {
		// TODO Auto-generated method stub
		formation.setDebutAccreditation(new Date());
		return repos.save(formation);
		
	}
	@Override
	public Formation UpdateFormation(Formation formation) {
		// TODO Auto-generated method stub
		
		return repos.save(formation);	
		}

	@Override
	public List<Formation> FindFormationByNom(String nom) {
		return repos.findByNomFormation(nom);
	}

	@Override
	public List<Formation> GetAllFormations() {
		return (List<Formation>) repos.findAll();
	}

	@Override
	public Formation findFormationById(String id) {
		return repos.findByCodeFormation(id);
	}
	
	
	
	@Override
	public void DeleteFormationByID(String codeFormation) {
		// TODO Auto-generated method stub
		Formation f = repos.findByCodeFormation(codeFormation);
		repos.delete(f);
	}



}