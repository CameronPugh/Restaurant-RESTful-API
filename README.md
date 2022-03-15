# RESTful API - Restaurants

A RESTful API made via Spring to access a H2 database using Spring Data JPA for a Restaurant database

## Installation
Requries Gradle 7.4.1
```bash
git clone https://github.com/CameronPugh/Restaurant-RESTful-API.git
```
## Usage
Run Main Application\
Starts Web Server on port :8080\
Can you all CRUD operations, example:

```bash
% curl localhost:8080/api/restaurants       
{
  "_embedded" : {
    "restaurants" : [ {
      "name" : "Fancy Food",
      "location" : "Paris",
      "max_capacity" : 20,
      "_links" : {
        "self" : {
          "href" : "http://localhost:8080/api/restaurants/6"
        },
        "restaurant" : {
          "href" : "http://localhost:8080/api/restaurants/6"
        },
        "menu" : {
          "href" : "http://localhost:8080/api/restaurants/6/menu"
        },
        "staff" : {
          "href" : "http://localhost:8080/api/restaurants/6/staff"
        }
      }
    } ]
  }
```

## Frameworks used
- Spring Data JPA
- Spring Boot H2 Database
- Spring Data REST
- Spring HATEOAS

## License
[MIT](https://choosealicense.com/licenses/mit/)
