package dosi.mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dosi.mainApp.bean.Enseignant;
import dosi.mainApp.bean.Formation;
import dosi.mainApp.bussiness.FormationBussiness;

@RestController 
@RequestMapping("/formations")

public class FormationController {

	
	private FormationBussiness business;

	@Autowired
	public FormationController(FormationBussiness business) {
		this.business = business;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Formation CreateFormation(@RequestBody Formation formation) {
		return business.CreateFormation(formation);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Formation UpdateFormation(@RequestBody Formation formation) {
		return business.UpdateFormation(formation);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Formation> GetAllFormations() {
		return business.GetAllFormations();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/nom/{nom}")
	public List<Formation> FindFormationByNom(@PathVariable String nom) {
		return business.FindFormationByNom(nom);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
	public Formation FindFormationById(@PathVariable String id) {
		return business.findFormationById(id);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/Delete/{id}")
	public void DeleteFormationByID(@PathVariable String id) {
		business.DeleteFormationByID(id);;
	}
	
}
