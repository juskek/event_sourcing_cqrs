package mygrailsapp

// Example domain class
class Speaker {
    String firstName
    String lastName
    String name
    String email
    String bio

    // constraints defines rules and restrictions for the properties of the domain class
    static constraints = {
        email nullable: true, email: true // email is nullable and if not null, must be a valid email
    }
    
    // mapping defines the mapping of the domain class to the database
    static mapping = {
        bio type: 'text'
        name formula: 'concat(FIRST_NAME,\' \',LAST_NAME)'
    }
}