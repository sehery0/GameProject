package business.abstracts;

import java.util.List;

import entities.Player;

public interface PlayerService {
	void add(Player player);
	void update(Player player);
	void delete(Player player);
	List<Player> getAll();

}
