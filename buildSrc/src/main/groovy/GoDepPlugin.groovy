import org.gradle.api.Plugin
import org.gradle.api.Project

class GoDepPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.task('goBuild') {
            doLast {
                println 'Hello from GoDepPlugin'
            }
        }
    }
}
