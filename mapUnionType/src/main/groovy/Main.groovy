import groovy.transform.CompileStatic
import org.gradle.api.Task
import org.gradle.api.DefaultTask

@CompileStatic
class Main extends DefaultTask {
  void function() {
    // This one actually broke in 4.10...
    Map<String, Task> map = [:]
    Task a = this;
    Task b;
    [a, b].each { Task t ->
      if (t instanceof Main) {
        // This should know that t is a Task
        map.put('hello', t)
      }
    }
  }
}
