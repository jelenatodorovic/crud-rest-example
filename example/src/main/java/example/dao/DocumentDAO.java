package example.dao;

import org.springframework.data.repository.CrudRepository;

import example.model.Document;

public interface DocumentDAO extends CrudRepository<Document, Integer>{
	public Iterable<Document> findAll();
	public Document findById(int id);
	public void delete(Document d);
	public Document save(Document d);
}
