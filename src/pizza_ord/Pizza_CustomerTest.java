package pizza_ord;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Pizza_CustomerTest {
	
	Pizza p1,p2;
	Pizza_Customer c1;

	@Before
	public void setUp() throws Exception {
		
		p1 = new Pizza ("Pepper Cheese","Veg",210,1);
		p2 = new Pizza ("Babycorn with capsicum","Non Veg",150,2);
		c1 = new Pizza_Customer("johann");
		c1.addPizza(new Pclass(p1));
		c1.addPizza(new Pclass(p2));
		System.out.println(c1.bill());
	}

	@Test
	public void test() {
		//fail("Not yet implemented");
	}

}
