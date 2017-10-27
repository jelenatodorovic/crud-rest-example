# crud-rest-example

Running project: mvn spring-boot:run

End-points:

Document:

GET - /documents/{documentId}
POST - /documents
	Request Body Example:
	{
	"code": "AA03",
	"date": "10/24/2017",
	"name": "document1"
	}
UPDATE 
DELETE - /documents/{documentId}

Document Item:

GET - /documents/{documentId}/items
GET - /documents/{documentId}/items/{itemId}
POST - /documents/{documentId}/items
	Request Body Example:
	{
	"name":"documentItem12",
	"price":"12.20"
	}
UPDATE
DELETE
