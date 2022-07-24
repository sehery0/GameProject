package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.BaseRepository;
import entities.Campaign;

public class CampaignRepository implements BaseRepository<Campaign> {
	List<Campaign> campaigns = new ArrayList<Campaign>();
	
	@Override
	public void add(Campaign entity) {
		campaigns.add(entity);
		System.out.println("Campaigns added");
		
	}

	@Override
	public void update(Campaign entity) {
		System.out.println("Campaign updated");
		
	}

	@Override
	public void delete(Campaign entity) {
		campaigns.remove(entity);
		System.out.println("Campaign deleted");
		
	}

	@Override
	public List<Campaign> getAll() {
		return campaigns;
	}

}
