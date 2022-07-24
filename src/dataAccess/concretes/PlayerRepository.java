package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.BaseRepository;
import entities.Player;

public class PlayerRepository implements BaseRepository<Player>{
	List<Player> players = new ArrayList<Player>();

	@Override
	public void add(Player entity) {
		players.add(entity);
		System.out.println("Player added");
		
	}

	@Override
	public void update(Player entity) {
		System.out.println("Player updated");
		
	}

	@Override
	public void delete(Player entity) {
		players.remove(entity);
		System.out.println("Player deleted");
		
	}

	@Override
	public List<Player> getAll() {
		return players;
	}

}
