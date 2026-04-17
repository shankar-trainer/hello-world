import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import ejb30.Sless;
import ejb30.SlessRemote;

public class Client1 {
	public static void main(String args[]) {

		try {
			Properties props = new Properties();
			props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.enterprise.naming.impl.SerialInitContextFactory");
			props.put(Context.STATE_FACTORIES, "com.sun.corba.ee.impl.presentation.rmi.JNDIStateFactoryImpl");
			props.put("org.omg.CORBA.ORBInitialHost", "localhost");
			props.put("org.omg.CORBA.ORBInitialPort", "3700"); // Default GlassFish IIOP port
//			InitialContext ctx = new InitialContext(props);
//			InitialContext ctx = new InitialContext(props);
			InitialContext ic = new InitialContext(props);
//			InitialContext ic = new InitialContext();
//			SlessRemote sless = (SlessRemote) ic.lookup("hello123");
			SlessRemote sless = (SlessRemote) ic.lookup("java:global/ejb1/Sless,");
			// SlessRemote sless = (SlessRemote) ic.lookup("	hello123#ejb30.SlessRemote");
			System.out.println("Sless bean says : " + sless.hello());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
