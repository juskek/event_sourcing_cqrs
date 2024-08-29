package mygrailsapp

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class SpeakerSpec extends Specification implements DomainUnitTest<Speaker> {

     void "test domain constraints"() {
        when:
        Speaker domain = new Speaker()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
