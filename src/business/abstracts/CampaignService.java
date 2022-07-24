package business.abstracts;

import java.util.List;

import entities.Campaign;

public interface CampaignService {
	void add(Campaign campaign);
	void updated(Campaign campaign);
	void deleted(Campaign campaign);
	List<Campaign> getAll();

}
