package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.ArrayRhymersFactory;
import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.ListRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;
import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

	// TODO redundant tests for Rhymers, can be automated

	@Test
	public void testCountIn() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheck() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertTrue(result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertFalse(result);
	}

	@Test
	public void testIsFull() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertFalse(result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertTrue(result);
	}

	@Test
	public void testPeekaboo() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOut() {
		DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testCountInFIFO() {
		DefaultCountingOutRhymer rhymer = new FIFORhymer();
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheckFIFO() {
		DefaultCountingOutRhymer rhymer = new FIFORhymer();
		boolean result = rhymer.callCheck();
		Assert.assertTrue(result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertFalse(result);
	}

	@Test
	public void testIsFullFIFO() {
		DefaultCountingOutRhymer rhymer = new FIFORhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertFalse(result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertTrue(result);
	}

	@Test
	public void testPeekabooFIFO() {
		DefaultCountingOutRhymer rhymer = new FIFORhymer();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOutFIFO() {
		DefaultCountingOutRhymer rhymer = new FIFORhymer();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testCountInHanoi() {
		DefaultCountingOutRhymer rhymer = new HanoiRhymer();
		int testValue = 4;
		rhymer.countIn(testValue);

		int result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCallCheckHanoi() {
		DefaultCountingOutRhymer rhymer = new HanoiRhymer();
		boolean result = rhymer.callCheck();
		Assert.assertTrue(result);

		rhymer.countIn(888);

		result = rhymer.callCheck();
		Assert.assertFalse(result);
	}

	@Test
	public void testIsFullHanoi() {
		DefaultCountingOutRhymer rhymer = new HanoiRhymer();
		final int STACK_CAPACITY = 12;
		for (int i = 0; i < STACK_CAPACITY; i++) {
			boolean result = rhymer.isFull();
			Assert.assertFalse(result);
			rhymer.countIn(888);
		}

		boolean result = rhymer.isFull();
		Assert.assertTrue(result);
	}

	@Test
	public void testPeekabooHanoi() {
		DefaultCountingOutRhymer rhymer = new HanoiRhymer();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.peekaboo();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
		result = rhymer.peekaboo();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testCountOutHanoi() {
		DefaultCountingOutRhymer rhymer = new HanoiRhymer();
		final int EMPTY_STACK_VALUE = 0;

		int result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);

		int testValue = 4;
		rhymer.countIn(testValue);

		result = rhymer.countOut();
		Assert.assertEquals(testValue, result);
		result = rhymer.countOut();
		Assert.assertEquals(EMPTY_STACK_VALUE, result);
	}

	@Test
	public void testDefaultFactoryCountIn() {
		Rhymersfactory factory = new DefaultRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			int testValue = 4;
			rhymer.countIn(testValue);
			int result = rhymer.peekaboo();
			Assert.assertEquals(testValue, result);
		}
	}

	@Test
	public void testDefaultFactoryCallCheck() {
		Rhymersfactory factory = new DefaultRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			boolean result = rhymer.callCheck();
			Assert.assertTrue(result);
			rhymer.countIn(888);
			result = rhymer.callCheck();
			Assert.assertFalse(result);
		}
	}

	@Test
	public void testDefaultFactoryIsFull() {
		Rhymersfactory factory = new DefaultRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			final int STACK_CAPACITY = 12;
			for (int i = 0; i < STACK_CAPACITY; i++) {
				boolean result = rhymer.isFull();
				Assert.assertFalse(result);
				rhymer.countIn(888);
			}
			boolean result = rhymer.isFull();
			Assert.assertTrue(result);
		}
	}

	@Test
	public void testDefaultFactoryPeekaboo() {
		Rhymersfactory factory = new DefaultRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			final int EMPTY_STACK_VALUE = 0;
			int result = rhymer.peekaboo();
			Assert.assertEquals(EMPTY_STACK_VALUE, result);
			int testValue = 4;
			rhymer.countIn(testValue);
			result = rhymer.peekaboo();
			Assert.assertEquals(testValue, result);
			result = rhymer.peekaboo();
			Assert.assertEquals(testValue, result);
		}
	}

	@Test
	public void testDefaultFactoryCountOut() {
		Rhymersfactory factory = new DefaultRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			final int EMPTY_STACK_VALUE = 0;
			int result = rhymer.countOut();
			Assert.assertEquals(EMPTY_STACK_VALUE, result);
			int testValue = 4;
			rhymer.countIn(testValue);
			result = rhymer.countOut();
			Assert.assertEquals(testValue, result);
			result = rhymer.countOut();
			Assert.assertEquals(EMPTY_STACK_VALUE, result);
		}
	}
	
	@Test
	public void testsListFactoryCountIn() {
		Rhymersfactory factory = new ListRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			int testValue = 4;
			rhymer.countIn(testValue);
			int result = rhymer.peekaboo();
			Assert.assertEquals(testValue, result);
		}
	}

	@Test
	public void testsListFactoryCallCheck() {
		Rhymersfactory factory = new ListRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			boolean result = rhymer.callCheck();
			Assert.assertTrue(result);
			rhymer.countIn(888);
			result = rhymer.callCheck();
			Assert.assertFalse(result);
		}
	}

	@Test
	public void testsListFactoryIsFull() {
		Rhymersfactory factory = new ListRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		int id = 0;
		for (DefaultCountingOutRhymer rhymer : rhymers) {
			final int STACK_CAPACITY = 12;
			for (int i = 0; i < STACK_CAPACITY; i++) {
				boolean result = rhymer.isFull();
				Assert.assertFalse(result);
				rhymer.countIn(888);
			}
			boolean result = rhymer.isFull();
			if (id++ != 1)
				Assert.assertFalse(result);
			else
				Assert.assertTrue(result); // falseRhymer is an array that can be full
		}
	}

	@Test
	public void testsListFactoryPeekaboo() {
		Rhymersfactory factory = new ListRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			final int EMPTY_STACK_VALUE = 0;
			int result = rhymer.peekaboo();
			Assert.assertEquals(EMPTY_STACK_VALUE, result);
			int testValue = 4;
			rhymer.countIn(testValue);
			result = rhymer.peekaboo();
			Assert.assertEquals(testValue, result);
			result = rhymer.peekaboo();
			Assert.assertEquals(testValue, result);
		}
	}

	@Test
	public void testsListFactoryCountOut() {
		Rhymersfactory factory = new ListRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			final int EMPTY_STACK_VALUE = 0;
			int result = rhymer.countOut();
			Assert.assertEquals(EMPTY_STACK_VALUE, result);
			int testValue = 4;
			rhymer.countIn(testValue);
			result = rhymer.countOut();
			Assert.assertEquals(testValue, result);
			result = rhymer.countOut();
			Assert.assertEquals(EMPTY_STACK_VALUE, result);
		}
	}
	
	@Test
	public void testArrayFactoryCountIn() {
		Rhymersfactory factory = new ArrayRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			int testValue = 4;
			rhymer.countIn(testValue);
			int result = rhymer.peekaboo();
			Assert.assertEquals(testValue, result);
		}
	}

	@Test
	public void testArrayFactoryCallCheck() {
		Rhymersfactory factory = new ArrayRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			boolean result = rhymer.callCheck();
			Assert.assertTrue(result);
			rhymer.countIn(888);
			result = rhymer.callCheck();
			Assert.assertFalse(result);
		}
	}

	@Test
	public void testArrayFactoryIsFull() {
		Rhymersfactory factory = new ArrayRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		int id = 0;
		for (DefaultCountingOutRhymer rhymer : rhymers) {
			final int STACK_CAPACITY = 12;
			for (int i = 0; i < STACK_CAPACITY; i++) {
				boolean result = rhymer.isFull();
				Assert.assertFalse(result);
				rhymer.countIn(888);
			}
			boolean result = rhymer.isFull();
			if (id++ != 1)
				Assert.assertTrue(result); // falseRhymer is a list that's never full
			else
				Assert.assertFalse(result);
		}
	}

	@Test
	public void testArrayFactoryPeekaboo() {
		Rhymersfactory factory = new ArrayRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			final int EMPTY_STACK_VALUE = 0;
			int result = rhymer.peekaboo();
			Assert.assertEquals(EMPTY_STACK_VALUE, result);
			int testValue = 4;
			rhymer.countIn(testValue);
			result = rhymer.peekaboo();
			Assert.assertEquals(testValue, result);
			result = rhymer.peekaboo();
			Assert.assertEquals(testValue, result);
		}
	}

	@Test
	public void testArrayFactoryCountOut() {
		Rhymersfactory factory = new ArrayRhymersFactory();
		DefaultCountingOutRhymer[] rhymers = { factory.getStandardRhymer(), factory.getFalseRhymer(),
				factory.getFIFORhymer(), factory.getHanoiRhymer()};

		for (DefaultCountingOutRhymer rhymer : rhymers) {
			final int EMPTY_STACK_VALUE = 0;
			int result = rhymer.countOut();
			Assert.assertEquals(EMPTY_STACK_VALUE, result);
			int testValue = 4;
			rhymer.countIn(testValue);
			result = rhymer.countOut();
			Assert.assertEquals(testValue, result);
			result = rhymer.countOut();
			Assert.assertEquals(EMPTY_STACK_VALUE, result);
		}
	}
	
}
