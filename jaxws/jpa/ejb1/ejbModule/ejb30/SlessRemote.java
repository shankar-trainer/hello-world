package ejb30;

import jakarta.ejb.Remote;

@Remote
public interface SlessRemote {
    public String hello();

}
