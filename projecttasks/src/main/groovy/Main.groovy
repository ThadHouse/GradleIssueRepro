import groovy.transform.CompileStatic
import org.gradle.api.*

@CompileStatic
class Main implements Plugin<Project> {
  @Override
  void apply(Project project) {
    project.tasks.each { Task t ->

    }
  }
}
