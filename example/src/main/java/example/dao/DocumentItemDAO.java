package example.dao;

import org.springframework.data.repository.CrudRepository;

import example.model.DocumentItem;

public interface DocumentItemDAO extends CrudRepository<DocumentItem, Integer>{

	public DocumentItem save(DocumentItem documentItem);
	public void delete(int id);
	//update
}
