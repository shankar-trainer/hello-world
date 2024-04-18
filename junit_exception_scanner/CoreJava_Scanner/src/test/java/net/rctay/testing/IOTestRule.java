package net.rctay.testing;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.rules.MethodRule;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

public class IOTestRule implements MethodRule {

	private ByteArrayOutputStream out = new ByteArrayOutputStream();
	private PrintStream oldOut = System.out;

	public String getLastLine() {
		Scanner sc = new Scanner(out.toString());
		String ret = null;
		while (sc.hasNextLine())
			ret = sc.nextLine();
		return ret;
	}

	protected void beginPipe(String data) {
		System.setOut(new PrintStream(out));
		System.setIn(new ByteArrayInputStream(("1\n\n" + data).getBytes()));
	}

	protected void endPipe() {
		System.setOut(oldOut);
		oldOut.print(out.toString());
	}

	protected void invokeMain(Class<?> klass) throws Throwable {
		// fake String[] args
		Class<?> paramTypes[] = new Class[1];
		paramTypes[0] = String[].class;

		// if not for this, we'll need to call invoke with ((Object) null,
		// (Object) null) - what??
		Object nullObj = null;

		// klass.main(null)
		klass.getMethod("main", paramTypes)
			.invoke(nullObj, nullObj);
	}

	@Override
	public Statement apply(final Statement stmt, final FrameworkMethod meth, Object o) {
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				IOTest ann = meth.getAnnotation(IOTest.class);
				if (ann == null)
					stmt.evaluate();
				else {
					beginPipe(ann.input());
					try {
						invokeMain(ann.main());
						stmt.evaluate();
					} finally {
						endPipe();
					}
				}
			}
		};
	}

}
