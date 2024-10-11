# CRUD API

The REST API performs CRUD operations on Animal objects as described below.

## Installation
- Get the project
    - clone
  
        `git clone https://github.com/TSS71998/CSC340-Assignment4.git`
    - download zip.
- Open the project in IntelliJ.
- [`/src/main/resources/application.properties`](https://github.com/TSS71998/CSC340-Assignment4/blob/master/Assignment4/src/main/resources/application.properties) file  is the configuration for the MySQL database on your localhost.
  - the database name is on the `datasource.url` property between the last `/` and the `?`. In this case the database name is `assignemnt4`.
  - You MUST have the database up and running before running the project! 
    - Open your XAMPP Control Panel.
    - Start the Apache server.
    - Start MySQL.
    - Click on MySQL "Admin" to open up the DBMS.
    - Ensure the database that you need is available.
- Build and run the main class. You should see 2 new tables created in the aforementioned database.

## API Endpoints
Use POSTMAN to try the following endpoints:

## Get list of Animals

### Request

    `GET /animals/all`

    `http://localhost:8080/animals/all`

   
### Response

     [
   
     {"animalId": 1, "name": "sample1", "scientificName": "name1", "species": "species1", "habitat": "habitat1", "description": "desc1"}, 
   
     {"animalId": 2, "name": "sample2", "scientificName": "name2", "species": "species2", "habitat": "habitat2", "description": "desc2"}, 
   
     {"animalId": 3, "name": "sample3", "scientificName": "name3", "species": "species3", "habitat": "habitat3", "description": "desc3"}, 
   
     ]

## Get a specific Animal

### Request

`GET /animals/{animalId}`

`http://localhost:8080/animals/1`

### Response

    {
     {"animalId": 1, "name": "sample1", "scientificName": "name1", "species": "species1", "habitat": "habitat1", "description": "desc1"}, 
    }

     
## Create a new Animal

### Request

    `POST /animals/new`
    
    `http://localhost:8080/animals/new` --data '{  "name": "sample4", "scientificName": "name4", "species": "species4", "habitat": "habitat4", "description": "desc4"}'

   ### Response

   [
   
  
     {"animalId": 1, "name": "sample1", "scientificName": "name1", "species": "species1", "habitat": "habitat1", "description": "desc1"}, 
   
     {"animalId": 2, "name": "sample2", "scientificName": "name2", "species": "species2", "habitat": "habitat2", "description": "desc2"}, 
   
     {"animalId": 3, "name": "sample3", "scientificName": "name3", "species": "species3", "habitat": "habitat3", "description": "desc3"}, 
   
     {"animalId": 4, "name": "sample4", "scientificName": "name4", "species": "species4", "habitat": "habitat4", "description": "desc4"}, 
   
  ]


## Update an existing Animal

### Request

    `PUT /animals/update/{animalsId}`
    
    `http://localhost:8080/animals/update/1` --data '{ "name": "sample Updated", "scientificName": "name1", "species": "species1", "habitat": "habitat1", "description": "desc1"}'

   ### Response
   
    {
       {"animalId": 1, "name": "sample Updated", "scientificName": "name1", "species": "species1", "habitat": "habitat1", "description": "desc1"}, 
    }

## Delete an existing Animal

### Request

    `DELETE /animals/delete/{animalId}`
    
    `http://localhost:8080/animals/delete/1`

   ### Response
   
   [
   
     {"animalId": 2, "name": "sample2", "scientificName": "name2", "species": "species2", "habitat": "habitat2", "description": "desc2"}, 
   
     {"animalId": 3, "name": "sample3", "scientificName": "name3", "species": "species3", "habitat": "habitat3", "description": "desc3"}, 
   
     {"animalId": 4, "name": "sample4", "scientificName": "name4", "species": "species4", "habitat": "habitat4", "description": "desc4"}, 
   
   
  ]


## Get Animals by species

### Request

    `GET /animals?species=none`

    `http://localhost:8080/animals?species=species2`

   
### Response

     [
   
           {"animalId": 2, "name": "sample2", "scientificName": "name2", "species": "species2", "habitat": "habitat2", "description": "desc2"}, 

     ]

## Get Animals by string in name

### Request

    `GET /animals/name=`

    `http://localhost:8080/animals/name=updated`

   
### Response

   [
   
            {"animalId": 1, "name": "sample Updated", "scientificName": "name1", "species": "species1", "habitat": "habitat1", "description": "desc1"}, 
     
   ]



