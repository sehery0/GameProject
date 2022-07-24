package dataAccess.abstracts;

import java.util.List;

public interface BaseRepository<T> {
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	List<T> getAll();
	

}
