package jUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	StringHelper helper = new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions2_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_WhenTheresNoA() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinLastTwoPositions() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicUnusualScenario() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicUnusualNegativeScenario() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
	}
	
	
	
}
