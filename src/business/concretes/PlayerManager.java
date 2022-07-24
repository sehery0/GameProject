package business.concretes;

import java.util.List;

import business.abstracts.PlayerService;
import core.utilities.MernisServiceAdapter;
import core.utilities.PersonCheckService;
import dataAccess.abstracts.BaseRepository;
import entities.Player;

public class PlayerManager implements PlayerService{
	private BaseRepository baseRepository;
	private MernisServiceAdapter mernisServiceAdapter;
	
	
	public PlayerManager(BaseRepository baseRepository, MernisServiceAdapter mernisServiceAdapter) {
		super();
		this.baseRepository = baseRepository;
		this.mernisServiceAdapter = mernisServiceAdapter;
	}


	@Override
	public void add(Player player) {
		 
	}


	@Override
	public void update(Player player) {
		baseRepository.update(player);
	}


	@Override
	public void delete(Player player) {
		baseRepository.delete(player);
		
	}


	@Override
	public List<Player> getAll() {
		return baseRepository.getAll();
	}
	
	
}
