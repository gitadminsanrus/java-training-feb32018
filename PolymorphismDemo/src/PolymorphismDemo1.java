
public class PolymorphismDemo1 {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		C c = new C();
		
		A r;
		
		a.callMe();
		b.callMe();
		c.callMe();
		
		r = a;
		r.callMe();
		
		r = b;
		r.callMe();
		
		r = c;
		r.callMe();
	}

}
