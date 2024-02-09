import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonTest {

	 @Test
	    public void testGetInstance() {
	        
	        Singleton instance1 = Singleton.getInstance();
	        Singleton instance2 = Singleton.getInstance();

	        assertSame(instance1, instance2);
	    }
}
