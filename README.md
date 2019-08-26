# kotlin-agent-api
Kotlin project

http://localhost:8080/search

# Testing 
* The request is a post request. 
* In postman, add the json request in the body. 
* Click Send. If you have your database set up correctly, you should see one result.
* You can add more search parameters as need to refine the search

### Request 
```json
{
	"state":"mo",
	"brand":"united",
	"msaRegion": "St. Louis",
	"postalCode":"63122"
}
```

##### Additional Params
```java 
     name
     phone 
     address1 
     address2 
     city
     state
     brand
     postalCode
     commonOwner
     url
     msaRegion
     country
```
    