<h1> Spring Boot / Swagger Demo </h1>

The following demo is a Spring Boot application using Swagger and API Managment to expose RESTful services to 
your private Bluemix Catalog to be consumed by applications
 
This demo is an example of a Micro Service

<h3> Deploy to Bluemix <h3>

- Clone project as follows

```
git clone 
```

- Package as follows [This may tabke a while if downloaded maven repos is required]

```
$ mvn package
```

- Deploy as follows

```
$ cf push -f manifest.yml
```

Pas Apicella [pasapi at au1.ibm.com] is a Bluemix Technical Specialist at IBM Australia