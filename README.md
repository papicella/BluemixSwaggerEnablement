<h1> Spring Boot / Swagger Demo </h1>

The following demo is a Spring Boot application using Swagger and API Managment to expose RESTful services to 
your private Bluemix Catalog to be consumed by applications
 
This demo is an example of a Micro Service

<h3> Deploy to Bluemix </h3>

- Clone project as follows

```
git clone https://github.com/papicella/BluemixSwaggerEnablement.git
```

- Package as follows [This may take a while if downloaded maven repos is required]

```
$ cd BluemixSwaggerEnablement
$ mvn package
```

- Deploy as follows

```
$ cf push -f manifest.yml
```

<h3> Access Swagger UI </h3>

```
http://apples-{identifier}.mybluemix.net/swagger-ui.html
```

Eg:

![alt tag](https://dl.dropboxusercontent.com/u/15829935/bluemix-docs/images/springboot-swagger.png)

Pas Apicella [pasapi at au1.ibm.com] is a Bluemix Technical Specialist at IBM Australia