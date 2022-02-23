
package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Q4LifeCycleHookTest {
	Q4LifeCycleHook hooks;

@BeforeAll
 static void BefAll()
{
	System.out.println("Operation started");
}
@AfterAll
static void AfteAll()
{
	System.out.println("Operation ended");
}

@BeforeEach
void init()
{hooks=new LifecycleHooks();
	
}
@AfterEach
void after()
{
	System.out.println("operation completed");
}
	@Test
	void sum() {
		int expected=2;
		assertEquals(expected,hooks.add(1, 1) );
	}
	@Test
	void sub() {
		int expected=2;
		assertEquals(expected,hooks.sub(3, 1) );
	}
	@Test
	void mul() {
		int expected=4;
		assertEquals(expected,hooks.mul(2, 2) );
	}
	@Test
	void div() {
		int expected=3;
		assertEquals(expected,hooks.div(6, 2));
	}

}