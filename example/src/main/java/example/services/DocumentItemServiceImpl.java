package example.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.dao.DocumentItemDAO;
import example.exceptions.DocumentItemNotFoundException;
import example.model.DocumentItem;

@Service
public class DocumentItemServiceImpl implements DocumentItemService{

	private static final Logger LOGGER = LoggerFactory.getLogger(DocumentItemServiceImpl.class);
	
	@Autowired
	DocumentItemDAO documentItemDAO;
	
	@Override
	public DocumentItem save(DocumentItem documentItem) {
		// TODO Auto-generated method stub
		DocumentItem item = documentItemDAO.save(documentItem);
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		documentItemDAO.delete(id);
	}

	@Override
	public DocumentItem findById(int id) {
		// TODO Auto-generated method stub
		DocumentItem item = documentItemDAO.findById(id);
		if(item == null) {
			LOGGER.info("Document item does not exist.");
			throw new DocumentItemNotFoundException();
		}
		return item;
	}

}
