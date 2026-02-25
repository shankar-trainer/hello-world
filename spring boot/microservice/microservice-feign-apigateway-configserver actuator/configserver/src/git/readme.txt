in this case application.properties works below not

IN PRODUCT client add below dependency
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-config</artifactId>
        </dependency>

===============
give the git file name same as application name

The Configuration Repository (Git)
First, create a Git repository (local or remote) to store your application's configuration files.
These files are named using the pattern {application-name}-{profile}.properties (or .yml).
Example: For an application named config-client with a default profile,
create a file named config-client.properties in your Git repository.

add in git repo
https://github.com/shankar-trainer/myproject1

then run configserver application

http://localhost:6060/configserver/default



