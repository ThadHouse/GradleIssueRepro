import groovy.transform.Canonical
import groovy.transform.CompileStatic


@CompileStatic
class Main {
  @CompileStatic
  @Canonical
  private static class Storage {
    String x;
    int y;
  }

  public static int sumbitStorage(String x, int y) {
    def s = new Storage(x, y)
    // This .hashCode() should not throw a GroovyCastException
    return s.hashCode()
  }
}
