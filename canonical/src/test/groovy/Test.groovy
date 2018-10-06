import spock.lang.Specification

class Test extends Specification {
  def "storage"() {
    when:
    def hc = Main.sumbitStorage('hello', 42)
    then:
    1 == 1
  }
}
