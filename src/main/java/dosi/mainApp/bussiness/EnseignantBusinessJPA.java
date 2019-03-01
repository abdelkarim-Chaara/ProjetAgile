package dosi.mainApp.bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dosi.mainApp.bean.Enseignant;
import dosi.mainApp.repositories.EnseignantRepository;



@Component
public class EnseignantBusinessJPA implements EnseignantBusiness{

	private EnseignantRepository repos ;

	@Autowired 
	
	public EnseignantBusinessJPA(EnseignantRepository repos) {
		
		this.repos = repos;
	}

	@Override
	public Enseignant CreateEnseignant(Enseignant enseignant) {
		// TODO Auto-generated method stub
		return repos.save(enseignant);
	}

	public void DeleteEnseignant(Enseignant enseignant) {
		// TODO Auto-generated method stub
		repos.delete(enseignant);
	}
	

	@Override
	public List<Enseignant> FindEnseignantByNom(String nom) {
		// TODO Auto-generated method stub
		List<Enseignant> enseignantRecherche = repos.findByNom(nom);
		return enseignantRecherche;
	}
	
	@Override
	public List<Enseignant> GetAllEnseignants() {
		return (List<Enseignant>) repos.findAll();
	}
	@Override
	public Enseignant FindEnseignantById(long id) {
		return repos.findByNoEnseignant(id);
	}

	@Override
	public List<Enseignant> FindEnseignantByEmail(String emailUbo)
	{
		return repos.findByEmailUbo(emailUbo);
	}
	
	@Override
	public List<Enseignant> FindEnseignantByAdresse(String adresse)
	{
		return (List<Enseignant>) repos.findByAdresse(adresse);
	}

	@Override
	public void DeleteEnseignantByID(long id) {
		// TODO Auto-generated method stub
		Enseignant e = repos.findByNoEnseignant(id);
		repos.delete(e);
	}


	
	
}
