# Project created

First of all you need to download this project in your machine and import this local project with the Spring Tool Suite. (File > Import > browser)
So, you will change your pom.xm file if necessary with more dependences.
And check the file application.properties with your conection information.

Important: It's necessary have a mongodb installed in your machine, i used docker to do this. And i used the MongoDB Compass to access the database local. 

After that, you will need to start your application with the Spring Tool Suite in BootDashboard. Click with the left botton and click restart. 

You can see the log application on console.

Second you need to open your Postman and send a POST request to URL: http://localhost:8080/api/messages mapped in the application. 
and click in Body and select "raw" and send a JSON format message. 
Like this: 

{
  "content": "Hello",
  "message": "World"
}

And click on "Send"

Now open your MongoDB Compass refresh and see a new database created. 

{
  "_id": {
    "$oid": "6461222ebb33e77c9675f1e7"
  },
  "content": "{\r\n  \"content\": \"Hello\",\r\n  \"message\": \"World\"\r\n}",
  "_class": "com.diego.demo.entities.Message"
}

and you can see this same message in your browser accessing the URL: http://localhost:8080/api/messages

Done.
