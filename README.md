# crud-rest-example

Running project: mvn spring-boot:run

End-points:

Document Object:

*** First create Document object using POST

POST - /documents 

	Request Body Example: 
	
	{
	"code": "AA03",
	"date": "10/24/2017",
	"name": "document1"
	}
	
*** Read Document object

GET - /documents/{documentId}

*** Update Document object
	
UPDATE /documents/{documentId}

	Request Body Example:
	
	{
	"code": "AA03",
	"date": "10/29/2017",
	"name": "document1"
	} 
	
*** Delete Document object

DELETE - /documents/{documentId}


Document Item Object:

*** First create Document Item object using POST

POST - /documents/{documentId}/items

	Request Body Example:
	
	{
	"name":"documentItem12",
	"price":"12.20"
	}

*** Read Document Item object(s)
	
GET - /documents/{documentId}/items

GET - /documents/{documentId}/items/{itemId}


UPDATE
DELETE
