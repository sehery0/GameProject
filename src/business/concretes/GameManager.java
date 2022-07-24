package business.concretes;

import java.util.List;

import business.abstracts.GameService;
import dataAccess.abstracts.BaseRepository;
import entities.Game;

public class GameManager implements GameService{
	private BaseRepository baseRepository;

	
	public GameManager(BaseRepository baseRepository) {
		this.baseRepository = baseRepository;
	}

	@Override
	public void add(Game game) {
		baseRepository.add(game);
	}

	@Override
	public void updated(Game game) {
		baseRepository.update(game);
		
	}

	@Override
	public void deleted(Game game) {
		baseRepository.delete(game);
		
	}

	@Override
	public List<Game> getAll() {
		return baseRepository.getAll();
	}
	

}
