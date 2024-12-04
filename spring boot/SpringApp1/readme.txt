Spring container creates object using

@Bean
   -- method level

@Component
@Service
@Repository
@Controller
@RestController
      -- Class level

 @SpringBootApplication=
              @SpringBootConfiguration,
               @EnableAutoConfiguration
               and @ComponentScan

└───com
    └───example
        └───model-- Employee
        SpringApp1Application

        com.example.model.Employee
        com.example.SpringApp1Application
        com.example.main.SpringApp1Application





dao---   repository
    -- used by client main method


layered architecture

  dao  ----    model/doamin
   |           /
  service     /
   \
   client\view


    service  will get data from dao layer  and handle the exception


