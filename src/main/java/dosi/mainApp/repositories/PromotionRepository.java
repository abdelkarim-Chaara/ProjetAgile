package dosi.mainApp.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import dosi.mainApp.bean.Promotion;
import dosi.mainApp.bean.PromotionPK;



public interface PromotionRepository extends CrudRepository<Promotion, PromotionPK>  {
	List<Promotion> findBySiglePromotion(String siglePromotion);
	Promotion  findByProcessusStage(String processusStage);
	Optional<Promotion> findById(PromotionPK p);
	void deleteById(int Id);
}
