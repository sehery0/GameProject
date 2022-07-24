
import java.time.LocalDate;

import org.apache.axis.components.image.MerlinIO;

import business.abstracts.GameService;
import business.concretes.CampaignManager;
import business.concretes.GameManager;
import business.concretes.PlayerManager;
import business.concretes.SalesManager;
import core.utilities.MernisServiceAdapter;
import core.utilities.PersonCheckService;
import dataAccess.concretes.CampaignRepository;
import dataAccess.concretes.GameRepository;
import dataAccess.concretes.PlayerRepository;
import entities.Campaign;
import entities.Game;
import entities.Player;

public class Main {

	public static void main(String[] args) {
		PlayerManager playerManager = new PlayerManager(new PlayerRepository(), new MernisServiceAdapter());
		PersonCheckService personCheckService = new MernisServiceAdapter();
		Player player = new Player(1, "Seher", "Yalçın", "1999", "11111111111");
		playerManager.add(player);
		playerManager.update(player);
		playerManager.delete(player);
		
		GameManager gameManager = new GameManager(new GameRepository());
		Game game = new Game(2, "sims 3", 100);
		gameManager.add(game);
		
		CampaignManager campaignManager = new CampaignManager(new CampaignRepository());
		Campaign campaign = new Campaign(3, "Sezon indirimi", 0.30);
		campaignManager.add(campaign);
		
		SalesManager salesManager=new SalesManager();
        salesManager.sale(game,campaign,player);
		
	} 
		
		

}
