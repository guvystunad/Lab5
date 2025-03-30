package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv12 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1839, 1839, 10);
	    String string0 = nextDate0.run(10, 10, 1839);
	    assertEquals("10/11/1839", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(9, 9, 11);
	    String string0 = nextDate0.run(9, 9, 1801);
	    assertEquals("9/10/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 2021);
	    assertEquals("1/2/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(3, 3, 3);
	    String string0 = nextDate0.run(3, 3, 2021);
	    assertEquals("3/4/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 11);
	    String string0 = nextDate0.run(2, 28, 1829);
	    assertEquals("3/1/1829", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1810, 1810, 2);
	    String string0 = nextDate0.run(2, 30, 1810);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1432, 1801);
	    String string0 = nextDate0.run(8, 31, 1810);
	    assertEquals("9/1/1810", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(2, 29, 2021);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 11);
	    String string0 = nextDate0.run(8, 475, 1801);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 11);
	    String string0 = nextDate0.run(5, 6, 2021);
	    assertEquals("5/7/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate18() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 11, 11);
	    String string0 = nextDate0.run(31, 1206, 11);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate(1, 1, 1);
	    String string0 = nextDate0.run(1, 1, 2049);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate19() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 11);
	    String string0 = nextDate0.run(11, 11, 1801);
	    assertEquals("11/12/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(1996, 1996, 35);
	    String string0 = nextDate0.run(7, 31, 1996);
	    assertEquals("7/31/1996", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, (-45));
	    String string0 = nextDate0.run(2, 2, 1801);
	    assertEquals("2/3/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(904, 904, 904);
	    String string0 = nextDate0.run(12, 31, 2010);
	    assertEquals("1/1/2011", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(904, 904, 904);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(11, 11, 11);
	    String string0 = nextDate0.run(12, 11, 1801);
	    assertEquals("12/12/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(1810, 1810, 4);
	    String string0 = nextDate0.run(4, 30, 1810);
	    assertEquals("5/1/1810", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 1801, 1801);
	    String string0 = nextDate0.run(6, 31, 1801);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 11);
	    String string0 = nextDate0.run(4, 10, 1801);
	    assertEquals("4/11/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate(2, 2, 11);
	    String string0 = nextDate0.run(4, 10, 1801);
	    assertEquals("4/11/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndRunWithPositiveAndRunWithPositive2() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 11, 11);
	    String string0 = nextDate0.run(2, (-679), 328);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndRunWithPositiveAndRunWithPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 11, 11);
	    String string0 = nextDate0.run(11, 1801, (-679));
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndRunWithPositiveAndRunWithPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(31, 11, 11);
	    String string0 = nextDate0.run((-1072), 1801, 11);
	    assertEquals("invalid Input Date", string0);
	}

}