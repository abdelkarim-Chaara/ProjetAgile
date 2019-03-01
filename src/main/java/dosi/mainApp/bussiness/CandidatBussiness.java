package  dosi.mainApp.bussiness;

import java.util.List;

import dosi.mainApp.bean.Candidat;



public interface CandidatBussiness {
	Candidat CreateCandidat(Candidat candidatACreer);
	List<Candidat> GetAllCandidats();
	void DeleteCandidat(Candidat candidat);
	//void supprimerCandidat(String Id);
	List<Candidat> FindCandidatByNom(String nom);
	List<Candidat> FindCandidatByUniversiteOrigine(String UnivOrigine);
	Candidat FindCandidatById(String NoCandidat);
	//Candidat supprimerCandidat(Candidat candidatASupprimer) ;
}
