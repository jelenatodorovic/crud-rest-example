package example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.dao.DocumentItemDAO;
import example.model.DocumentItem;

@Service
public class DocumentItemServiceImpl implements DocumentItemService{

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

}
