package example.services;

import java.util.List;

import example.model.Document;

public interface DocumentService {

	public List<Document> findDocuments();
	public Document findDocument(int id);
}
