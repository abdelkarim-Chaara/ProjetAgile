package dosi.mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dosi.mainApp.bean.Candidat;
import dosi.mainApp.bussiness.CandidatBussiness;


@RestController 
@RequestMapping("/candidat")
public class CandidatController {

	private CandidatBussiness bussiness ;
	
	@Autowired
	public CandidatController(CandidatBussiness bussiness) {
		this.bussiness = bussiness;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Candidat CreateCandidat(@RequestBody Candidat candidat) {
		return bussiness.CreateCandidat(candidat);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/Delete/{id}")
	public String suppCandidat(@PathVariable String id) {
		Candidat candidat = FindCandidatById (id);
		 bussiness.DeleteCandidat(candidat);;
		return "Candidat is deleted !!";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Candidat> GetAllCandidats() {
		return bussiness.GetAllCandidats();  
	}
	@RequestMapping(method = RequestMethod.GET, value="/nom/{nom}")
	public List<Candidat> FindCandidatByNom(@PathVariable String nom) {
		return bussiness.FindCandidatByNom(nom);
	}
	@RequestMapping(method = RequestMethod.GET, value="/Univ/{UnivOrigine}")
	public List<Candidat> FindCandidatByUniversiteOrigine(@PathVariable String UnivOrigine) {
		return bussiness.FindCandidatByUniversiteOrigine(UnivOrigine);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
	public Candidat FindCandidatById(@PathVariable String id) {
		return bussiness.FindCandidatById(id);
	}

}
