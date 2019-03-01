package dosi.mainApp.bussiness;

import java.util.List;

import dosi.mainApp.bean.Promotion;
import dosi.mainApp.bean.PromotionPK;

public interface PromotionBussiness {

	Promotion CreatePromotion(Promotion promotion);
	List<Promotion> GetAllPromotions();
	List<Promotion> FindSiglePromotion(String SiglePromotion);
	Promotion FindPromotionById(PromotionPK PK );
	void deletePromotionByID(PromotionPK promotion);

}
