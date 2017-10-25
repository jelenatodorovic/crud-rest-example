package example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import example.model.Document;
import example.services.DocumentServiceImpl;

@Controller
@RequestMapping(value = "/documents")
public class DocumentController {

	@Autowired
	DocumentServiceImpl documentService;
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public @ResponseBody List<Document> findAllDocuments() {
		return documentService.findDocuments();
	}
	
	@RequestMapping(value = "/{documentId}", method = RequestMethod.GET)
	public @ResponseBody Document findDoc(@PathVariable("documentId") int id) {
		return documentService.findDocument(id);
	}
	
	@PostMapping(headers = {"content-type=application/json" }, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Document> createDocument(@RequestBody Document document) {
		Document documentnew = documentService.create(document);
		return new ResponseEntity<Document>(documentnew, HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/{documentId}")
	public ResponseEntity<String> deleteDocument(@PathVariable("documentId") int id) {
		documentService.delete(id);
		return new ResponseEntity<String>(HttpStatus.OK);
	}
	
}
