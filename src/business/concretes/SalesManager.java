package business.concretes;

import entities.Campaign;
import entities.Game;
import entities.Player;

public class SalesManager {
	public void sale(Game game, Campaign campaign, Player player) {
		System.out.println(campaign.getName() + " " + player.getFirstName() + " " + saleCampaign(campaign, game) + " tutarında indirim uygulandı");	}
	
	public double saleCampaign(Campaign campaign, Game game) {
		return campaign.getDiscountRate() * game.getPrice();
	}

}
