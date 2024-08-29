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