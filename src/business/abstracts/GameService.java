package business.abstracts;

import java.util.List;

import entities.Game;

public interface GameService {
	void add(Game game);
	void updated(Game game);
	void deleted(Game game);
	List<Game> getAll();

}
