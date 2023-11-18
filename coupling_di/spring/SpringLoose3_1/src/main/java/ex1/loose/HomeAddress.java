package ex1.loose;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import lombok.Data;

import javax.annotation.PostConstruct;

//@Component
@Data
@Service
public class HomeAddress  implements  Address{
    
    private int addrId;
    private String addrCity;
    private int addrPin;
    
    @PostConstruct
    public void init(){
        this.addrId=78787;
        this.addrCity="noida";
        this.addrPin=7667767;
    }
    
    @Override
    public void addressDetail() {
        System.out.println("\nHome Address");
        
    }
}