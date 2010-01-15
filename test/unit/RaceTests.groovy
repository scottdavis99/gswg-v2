import grails.test.*

class RaceTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testInMiles() {
      def race = new Race(distance:5.0)
      assertEquals 3.107, race.inMiles()
    }
}
