package example.services;

import example.model.DocumentItem;

public interface DocumentItemService {

	public DocumentItem save(DocumentItem documentItem);
	public void delete(int id);
}
