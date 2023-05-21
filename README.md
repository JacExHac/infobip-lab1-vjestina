# infobip-lab1-vjestina
Labosi na vještini za Infobip

#LABOS 2 
Dockerfile and docker-compose file added so that the application can be run in 1 container, while the database is running in a seperate container (but the same network)

 
To test if it is working in the home directory of the project run:
1. mvn install
2. docker-compose up --build
3. Open postman
4. POST request on http://localhost:8080/workers to put a worker into the database using some JSON data (f.e. 
{
  "age": 53,
  "toolOfChoice": "screwdriver"
} )
5. GET request on http://localhost:8080/workers to list all workers in the database
6. GET request on http://localhost:8080/workers/1 to list the worker with id 1 in the database
