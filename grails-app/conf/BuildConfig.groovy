grails.project.work.dir = 'target'

grails.project.dependency.resolution = {

    inherits 'global'
    log 'warn'

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }

    plugins {
        build ':release:3.0.1', ':rest-client-builder:1.0.3', {
            export = false
        }
        //runtime ":twitter-bootstrap:3.2.0.2" // gives problems with <g:paginate>
        runtime ":jquery-ui:1.10.4"
        //compile ":font-awesome-resources:4.1.0.2" // gives error Error creating bean with name 'FontAwesomePluginResourceMapperInstance'
        compile ":platform-core:1.0.0"
        runtime ":hibernate:3.6.10.9", { // https://github.com/grails-plugins/grails-platform-core/issues/14
            export = false
        }
    }
}
