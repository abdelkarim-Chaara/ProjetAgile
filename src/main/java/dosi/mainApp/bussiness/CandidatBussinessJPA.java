package  dosi.mainApp.bussiness;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dosi.mainApp.bean.Candidat;
import dosi.mainApp.repositories.CandidatRepository;

@Component
public class CandidatBussinessJPA implements CandidatBussiness {
	
	private CandidatRepository repos ;

	@Autowired 
	
	public CandidatBussinessJPA(CandidatRepository repos) {
		
		this.repos = repos;
	}

	@Override
	public Candidat CreateCandidat(Candidat candidat) {
		// TODO Auto-generated method stub
		//candidatACreer.setDateNaissance(new Date());
		return repos.save(candidat);
	}

	@Override
	public void DeleteCandidat(Candidat candidat) {
		// TODO Auto-generated method stub
		 repos.delete(candidat);
	}

	@Override
	public List<Candidat> FindCandidatByNom(String nom) {
		// TODO Auto-generated method stub
		List<Candidat> candidatfound = repos.findByNom(nom);
		return candidatfound;
		
	}

	@Override
	public List<Candidat> FindCandidatByUniversiteOrigine(String UnivOrigine) {
		// TODO Auto-generated method stub
		List<Candidat> candidatfound = repos.findByUniversiteOrigine(UnivOrigine);
		return candidatfound;
	}
	
	@Override
	public List<Candidat> GetAllCandidats() {
		return (List<Candidat>) repos.findAll();
	}
	@Override
	public Candidat FindCandidatById(String NoCandidat) {
		return repos.findByNoCandidat(NoCandidat);
	}

}
