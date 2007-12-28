package pelore.dao;

import java.util.List;

public interface GenericDAO<T, PK> {

	public void create(T t);
	
	public boolean delete(PK key);
	
	public void update(PK key, T t);
	
	public List<T> list();
	
	public T retrieve(PK key);
	
}
