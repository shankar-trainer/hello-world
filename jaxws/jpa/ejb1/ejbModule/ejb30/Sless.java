package ejb30;

import jakarta.ejb.Stateless;

@Stateless//(mappedName = "hello123")
public class Sless implements SlessRemote {
	public String hello() {
		return "hello, world!\n";
	}
}
