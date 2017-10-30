# crud-rest-example

Running project: mvn spring-boot:run  (App will run on localhost:8080, Database: localhost:8080/h2)

(suggestion: use Postman for sending requests)

End-points:

========= Document Object:

*** First create Document object using POST:

POST - /documents 

	Request Body Example: 
	
	{
	"code": "AA03",
	"date": "10/24/2017",
	"name": "document1"
	}
	
note: id is autogenareted
	
*** Read Document object:

GET - /documents/{documentId}

*** Update Document object:
	
UPDATE /documents/{documentId}

	Request Body Example:
	
	{
	"code": "AA03",
	"date": "10/29/2017",
	"name": "document1"
	} 
	
*** Delete Document object:

DELETE - /documents/{documentId}


========= Document Item Object:

*** First create Document Item object using POST:

POST - /documents/{documentId}/items

	Request Body Example:
	
	{
	"name":"documentItem12",
	"price":"12.20"
	}
	
note: id is autogenareted

*** Read Document Item object(s):
	
GET - /documents/{documentId}/items

*** Update Document Item object:

UPDATE - /{documentId}/items/{itemId}

	Request Body Example:
	
	{
	"name":"documentItem12",
	"price":"144.20"
	}
	
*** Delete Document Item object:	

DELETE - /{documentId}/items/{itemId}

note: After creating a document item, if you try reading a document you can see that document item
is in the list of documents items included in document object.