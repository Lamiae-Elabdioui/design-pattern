import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StrategyTest {

	@Test
	void testStrategyAddition() {
		Context c= new Context();
		Strategy additionStrategy = new ConcreteStrategyAddition();
		c.setStrategy(additionStrategy);
        assertEquals(8, c.executeStrategy(5,3));
	}
	@Test
	void testStrategyMultiplication() {
		Context c= new Context();
		Strategy MultiplicationStrategy = new ConcreteStrategyMultiplication();
		c.setStrategy(MultiplicationStrategy);
        assertEquals(15, c.executeStrategy(5,3));
	}
    @Test
	public void testContextChangeStrategy() {
        Context context = new Context();
        Strategy additionStrategy = new ConcreteStrategyAddition();
        Strategy MultiplicationStrategy = new ConcreteStrategyMultiplication();

        context.setStrategy(additionStrategy);
        assertEquals(5, context.executeStrategy(3,2));

        context.setStrategy(MultiplicationStrategy);
        assertEquals(6, context.executeStrategy(3,2));
    }

}
