package dosi.mainApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dosi.mainApp.bean.Promotion;
import dosi.mainApp.bean.PromotionPK;
import dosi.mainApp.bussiness.PromotionBussiness;

@RestController 
@RequestMapping("/Promotion")
public class PromotionController {

	private PromotionBussiness business;

	@Autowired
	public PromotionController(PromotionBussiness business) {
		
		this.business = business;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Promotion CreatePromotion(@RequestBody Promotion promotion) {
		return business.CreatePromotion(promotion); 
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Promotion> GetAllPromotions() {
		return business.GetAllPromotions();
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value="/SiglePromotion/{SiglePromotion}")
	public List<Promotion> FindSiglePromotion(@PathVariable String SiglePromotion) {
		return business.FindSiglePromotion(SiglePromotion);
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/id/{codeFormation}/{anneUniv}")
	public Promotion FindPromotionById(@PathVariable String anneUniv , @PathVariable String codeFormation) {
		return business.FindPromotionById(new PromotionPK(anneUniv,codeFormation));
	}

	@RequestMapping(method = RequestMethod.DELETE, value="/id/{codeFormation}/{anneUniv}")
	public String suppCandidat(@PathVariable String codeFormation , @PathVariable String anneUniv) {
		 business.deletePromotionByID(new PromotionPK(anneUniv,codeFormation));
		return "Promotion is deleted !!";
	}

}
