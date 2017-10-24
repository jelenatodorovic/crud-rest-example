package example.services;

import java.util.List;




import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.dao.DocumentDAO;
import example.exceptions.DocumentNotFoundException;
import example.model.Document;

@Service
public class DocumentServiceImpl implements DocumentService{

	private static final Logger LOGGER = LoggerFactory.getLogger(DocumentServiceImpl.class);
	@Autowired
	DocumentDAO documentDAO;
	
	
	@Override
	public List<Document> findDocuments() {
		// TODO Auto-generated method stub
		List<Document> documents = (List<Document>) documentDAO.findAll();
		if(documents.isEmpty()) {
			LOGGER.info("List of Documents is empty!");
		}
		return documents;
	}


	@Override
	public Document findDocument(int id) {
		// TODO Auto-generated method stub
		Document document = documentDAO.findById(id);
		if(document == null) {
			LOGGER.info("Document does not exist.");
			throw new DocumentNotFoundException();
		}
		return document;
	}
	
	

}
