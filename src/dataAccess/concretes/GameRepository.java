package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.BaseRepository;
import entities.Game;

public class GameRepository implements BaseRepository<Game>{
	List<Game> games = new ArrayList<>();

	@Override
	public void add(Game entity) {
		games.add(entity);
		System.out.println("Game added");
	}

	@Override
	public void update(Game entity) {
		System.out.println("Game updated");
	}

	@Override
	public void delete(Game entity) {
		games.remove(entity);
		System.out.println("Game deleted");
		
	}

	@Override
	public List<Game> getAll() {
		return games;
	}

}
