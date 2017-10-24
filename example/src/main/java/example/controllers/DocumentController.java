package example.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import example.model.Document;
import example.services.DocumentServiceImpl;

@Controller
public class DocumentController {

	@Autowired
	DocumentServiceImpl documentService;
	
	@RequestMapping(value = "/findAllDocuments", method = RequestMethod.GET)
	public @ResponseBody List<Document> findAllDocuments() {
		return documentService.findDocuments();
	}
	
	@RequestMapping(value = "/find/{documentId}", method = RequestMethod.GET)
	public @ResponseBody Document findDoc(@PathVariable("documentId") int id) {
		return documentService.findDocument(id);
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public @ResponseBody Document createDocument(
												@RequestParam(value = "", required = false) String code,
												@RequestParam(value = "", required = false) String name,
												@RequestParam(value = "", required = false) Date date) {
		return null;
	}
}
