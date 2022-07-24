package business.concretes;

import java.util.List;

import business.abstracts.CampaignService;
import dataAccess.abstracts.BaseRepository;
import entities.Campaign;

public class CampaignManager implements CampaignService {
	private BaseRepository baseRepository;

	
	public CampaignManager(BaseRepository baseRepository) {
		this.baseRepository = baseRepository;
	}

	@Override
	public void add(Campaign campaign) {
		baseRepository.add(campaign);
		
	}

	@Override
	public void updated(Campaign campaign) {
		baseRepository.update(campaign);
		
	}

	@Override
	public void deleted(Campaign campaign) {
		baseRepository.delete(campaign);
	}

	@Override
	public List<Campaign> getAll() {
		return baseRepository.getAll();
	}

}
