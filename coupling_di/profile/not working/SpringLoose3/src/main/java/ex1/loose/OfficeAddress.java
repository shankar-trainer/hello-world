package ex1.loose;

import lombok.Data;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Data
@Service
public class OfficeAddress  implements  Address{
    
    private int addrId;
    private String addrCity;
    private int addrPin;
        
    @Override
    public void addressDetail() {
        System.out.println("\nOffice Address");
    }
    
    @PostConstruct
    public void init(){
        this.addrId=55555;
        this.addrCity="gurgaon";
        this.addrPin=11111;
    }
}