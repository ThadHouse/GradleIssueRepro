import groovy.transform.CompileStatic
import org.gradle.api.*
import org.gradle.api.tasks.TaskContainer

@CompileStatic
class Main implements Plugin<Project> {
  @Override
  void apply(Project project) {
    TaskContainer tasks = project.tasks;
    tasks.each { Task t->

    }
  }
}
