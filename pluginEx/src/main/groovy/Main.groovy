import groovy.transform.CompileStatic
import org.gradle.api.Project
import org.gradle.api.Plugin

@CompileStatic
class Main implements Plugin<Project> {
  void function(Project project) {
    // This should compile successfully
    Main m = project.plugins.getPlugin(Main)
  }

  @Override
  void apply(Project project) {

  }
}
