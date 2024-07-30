import spock.lang.Specification

class TestCaseOne extends Specification {

    def "should be a simple assertion"() {
        expect:
        1 == 1
    }

    def "two plus two should equal four"() {
        given:
        int left = 2
        int right = 24

        when:
        int result = left + right

        then:
        result == 4

    }

}
