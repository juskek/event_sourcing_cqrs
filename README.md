## Example App with Event Sourcing + CQRS using Groovy on Grails, GraphQL, GORM & Axon

### Setting up your own example app

Using the following [guide](https://docs.grails.org/6.2.0/guide/single.html#creatingAnApplication), 
1. Install JDK
2. Install Grails
3. grails create-app mygrailsapp 

### Running the app

1. `cd mygrailsapp`
2. `./gradlew bootRun`
3. Go to `http://localhost:8080/`

### Creating a controller 

1. `cd mygrailsapp`
2. `grails`
3. `grails> create-controller greeting`

### Creating a domain class and using GORM

1. `cd mygrailsapp`
2. `grails`
3. `grails> create-domain-class Speaker`

See `grails-app/domain/mygrailsapp/Speaker.groovy` for added properties of the domain class, constraints, and mappings to the DB.

Domain classes in Grails are GORM entities, which provide an ORM interface to the database. 

E.g., for a `Book` domain class, 

```groovy
// Create a new book and save it to the DB
def book = new Book(title: 'The Great Gatsby', author: 'F. Scott Fitzgerald', publishedDate: new Date())
book.save()

// Get a book from the DB
def book = Book.get(1)



```

#### A note on in-memory DB for this example app


In a default Grails application, data is saved in an embedded H2 database, which is stored in the filesystem.

```yaml
dataSource:
  url: jdbc:h2:mem:devDb;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE
  driverClassName: org.h2.Driver
```