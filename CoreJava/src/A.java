
public class A {
	int a = 1;

	class B {
		int b = 10;

		class C {
			int c = 20;

			class D {
				int d = 30;
			}
		}
	}

	void disp() {
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		A.B.C.D d = c.new D();

		System.out.println(a.a);
		System.out.println(b.b);
		System.out.println(c.c);
		System.out.println(d.d);
	}

	public static void main(String[] args) {
		new A().disp();
	}
}
