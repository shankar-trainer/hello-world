package org.com;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;


@Stateless
@LocalBean
public class Test1 {
    public String disp(String s){
    	return "welcome "+s;
    }
}
