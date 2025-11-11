using @profile 
in config\DatabaseConfig.java  add DataSource for all three
no need to add these values now in yml or properties file 
comment it or delete it.
now in application.yml add the spring.profile.active 


 
@Configuration
public class DatabaseConfig {

    @Profile("dev")
    @Bean
    public DataSource devDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:testdb");
        dataSource.setUsername("sa");
        dataSource.setPassword("");
        return dataSource;
    }


