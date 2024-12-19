package org.example;

import org.example.entity.Doctor;
import org.example.entity.Patient;
import org.example.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class DoctorMain // implements CommandLineRunner
{

    public static void main(String[] args) {
        SpringApplication.run(DoctorMain.class,args);
    }

//
//    @Autowired
//    DoctorService doctorService;
//
//    @Override
//    public void run(String... args) throws Exception {
//
//        Patient patient[]=new Patient[]{
//                Patient.builder().age(24).name("amit kumar").location("delhi").build(),
//                Patient.builder().age(34).name("sumit kumar").location("noida").build(),
//                Patient.builder().age(41).name("parveen kumar").location("mathura").build(),
//                Patient.builder().age(51).name("akash kumar").location("gurgaon").build(),
//        };
//        Set<Patient> collect = Stream.of(patient).collect(Collectors.toSet());
//
//        Doctor doctor= Doctor.builder().age(34).name("dr.shyam kumar").patientSet(collect).build();
//        doctorService.addDoctor(doctor);
//
//        doctorService.getDoctorAll().forEach(System.out::println);
//    }
}

//http://localhost:8080/swagger-ui/index.html
/*
post 
http://localhost:8080/doctor
{
    	"name":"ram kumar",
        "age":20,
      	 "patientSet":[

            {"name":"patient",
            "age":22,
            "location":"patna"
            },
            {"name":"patient",
            "age":22,
            "location":"patna"
            }
          ]
}
*/
