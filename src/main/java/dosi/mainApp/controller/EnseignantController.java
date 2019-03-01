package dosi.mainApp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dosi.mainApp.bean.Enseignant;
import dosi.mainApp.bussiness.EnseignantBusiness;

@RestController 
@RequestMapping("/Enseignant")
public class EnseignantController {

	
private EnseignantBusiness bussiness ;
	
	@Autowired
	public EnseignantController(EnseignantBusiness bussiness) {
		this.bussiness = bussiness;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Enseignant CreateEnseignant(@RequestBody Enseignant enseignant) {
		return bussiness.CreateEnseignant(enseignant);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/Delete/{id}")
	public String DeleteEnseignant(@PathVariable long id) {
	    bussiness.DeleteEnseignantByID(id);
		return "Enseignant is deleted !!";
	}
	@RequestMapping(method = RequestMethod.GET)
	public List<Enseignant> GetAllEnseignants() {
		return bussiness.GetAllEnseignants();
	}
	@RequestMapping(method = RequestMethod.GET, value="/nom/{nom}")
	public List<Enseignant> FindEnseignantByNom(@PathVariable String nom) {
		return bussiness.FindEnseignantByNom(nom);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/id/{noEnseignant}")
	public Enseignant FindEnseignantById(@PathVariable long noEnseignant) {
		return bussiness.FindEnseignantById(noEnseignant);
	}
	@RequestMapping(method = RequestMethod.GET, value="/email/{email}")
	public List<Enseignant> FindEnseignantByEmail(@PathVariable String email) {
		return bussiness.FindEnseignantByEmail(email);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/Adresse/{adresse}")
	public List<Enseignant> FindEnseignantByAdresse(@PathVariable String adresse) {
		return bussiness.FindEnseignantByAdresse(adresse);
	}
}
