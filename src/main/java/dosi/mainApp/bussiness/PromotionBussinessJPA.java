package dosi.mainApp.bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dosi.mainApp.bean.Promotion;
import dosi.mainApp.bean.PromotionPK;
import dosi.mainApp.repositories.PromotionRepository;

@Component
public class PromotionBussinessJPA   implements  PromotionBussiness{
	
	private PromotionRepository repos ;
	

	@Autowired 
	public PromotionBussinessJPA(PromotionRepository repos) {
		
		this.repos = repos;
	}

	@Override
	public Promotion CreatePromotion(Promotion promotiont) {
		// TODO Auto-generated method stub
		
		return repos.save(promotiont);
	}



	
	
	
	@Override
	public void deletePromotionByID(PromotionPK promotionASuppPK) {
		//Promotion p = repos.findOne(promotionASuppPK)		;
		repos.deleteById(promotionASuppPK);
	}
	@Override
	public List<Promotion> GetAllPromotions() {
		// TODO Auto-generated method stub
		return (List<Promotion>) repos.findAll();
	}

	@Override
	public List<Promotion> FindSiglePromotion(String SiglePromotion) {
		// TODO Auto-generated method stub
		List<Promotion> promotion = repos.findBySiglePromotion(SiglePromotion);
		return promotion;
	}

	@Override
	public Promotion FindPromotionById(PromotionPK PK) {
		// TODO Auto-generated method stub
		return repos.findById(PK).orElse(null);
	}



	

	

}
