package ee.ut.cs.swt.nextdate;

import org.junit.Test;
import static org.junit.Assert.*;

public class GTv2 {

	@Test(timeout = 4000)
	public void testCreatesNextDate1() throws Throwable {
	    NextDate nextDate0 = new NextDate((-4537), 0, 0);
	    String string0 = nextDate0.run(5, 11, 1801);
	    assertEquals("5/12/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(10, 10, 1801);
	    assertEquals("10/11/1801", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate3() throws Throwable {
	    NextDate nextDate0 = new NextDate(1804, 1804, 1804);
	    String string0 = nextDate0.run(1, 1, 1804);
	    assertEquals("1/2/1804", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate2() throws Throwable {
	    NextDate nextDate0 = new NextDate(1807, (-4032), (-4032));
	    String string0 = nextDate0.run(3, 28, 1807);
	    assertEquals("3/29/1807", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate5() throws Throwable {
	    NextDate nextDate0 = new NextDate(1804, 1804, 1804);
	    String string0 = nextDate0.run(2, 31, 1804);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate4() throws Throwable {
	    NextDate nextDate0 = new NextDate(1804, 1804, 1804);
	    String string0 = nextDate0.run(2, 29, 1804);
	    assertEquals("3/1/1804", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive1() throws Throwable {
	    NextDate nextDate0 = new NextDate(1804, (-4024), (-4024));
	    String string0 = nextDate0.run(29, (-1857), 28);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithNegativeAndPositive0() throws Throwable {
	    NextDate nextDate0 = new NextDate(1807, 1807, 1807);
	    String string0 = nextDate0.run((-2913), 2, 29);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate14() throws Throwable {
	    NextDate nextDate0 = new NextDate(1801, 1801, 1801);
	    String string0 = nextDate0.run(11, 11, 1801);
	    assertEquals("11/12/1801", string0);
	}

	@Test(timeout = 4000)
	public void testRunWithPositive() throws Throwable {
	    NextDate nextDate0 = new NextDate(322, (-1), 322);
	    String string0 = nextDate0.run(9, 6, 2021);
	    assertEquals("9/7/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate13() throws Throwable {
	    NextDate nextDate0 = new NextDate(1835, (-333), 1812);
	    String string0 = nextDate0.run(6, 30, 1835);
	    assertEquals("7/1/1835", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate16() throws Throwable {
	    NextDate nextDate0 = new NextDate(1835, 1835, 1835);
	    String string0 = nextDate0.run(8, 31, 1835);
	    assertEquals("9/1/1835", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate15() throws Throwable {
	    NextDate nextDate0 = new NextDate(1830, 1830, 1830);
	    String string0 = nextDate0.run(8, 8, 1830);
	    assertEquals("8/9/1830", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate18() throws Throwable {
	    NextDate nextDate0 = new NextDate(6, 6, 2118);
	    String string0 = nextDate0.run(6, 2118, 2118);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate17() throws Throwable {
	    NextDate nextDate0 = new NextDate((-4537), 0, 0);
	    String string0 = nextDate0.run(1, 1915, 1801);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate19() throws Throwable {
	    NextDate nextDate0 = new NextDate(322, (-1), 322);
	    String string0 = nextDate0.run(6, 747, 11);
	    assertEquals("invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate7() throws Throwable {
	    NextDate nextDate0 = new NextDate(1804, (-4024), (-4024));
	    String string0 = nextDate0.run(2, 28, 1804);
	    assertEquals("2/29/1804", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate6() throws Throwable {
	    NextDate nextDate0 = new NextDate(1807, (-4024), (-4024));
	    String string0 = nextDate0.run(2, 28, 1807);
	    assertEquals("3/1/1807", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate9() throws Throwable {
	    NextDate nextDate0 = new NextDate(1870, 1870, 1870);
	    String string0 = nextDate0.run(7, 7, 1870);
	    assertEquals("7/7/1870", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate8() throws Throwable {
	    NextDate nextDate0 = new NextDate(0, (-1), (-4537));
	    String string0 = nextDate0.run(2, 19, 2021);
	    assertEquals("2/20/2021", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate10() throws Throwable {
	    NextDate nextDate0 = new NextDate(1852, 1852, 1852);
	    String string0 = nextDate0.run(12, 31, 2021);
	    assertEquals("Invalid Next Year", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate12() throws Throwable {
	    NextDate nextDate0 = new NextDate(1804, 1, 1804);
	    String string0 = nextDate0.run(4, 31, 1804);
	    assertEquals("Invalid Input Date", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate11() throws Throwable {
	    NextDate nextDate0 = new NextDate(1852, 1852, 1852);
	    String string0 = nextDate0.run(12, 31, 1852);
	    assertEquals("1/1/1853", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDateAndCallsRun() throws Throwable {
	    NextDate nextDate0 = new NextDate((-343), (-1), (-343));
	    String string0 = nextDate0.run(12, 19, 2011);
	    assertEquals("12/20/2011", string0);
	}

	@Test(timeout = 4000)
	public void testRunReturningNonEmptyString() throws Throwable {
	    NextDate nextDate0 = new NextDate((-343), (-1), (-343));
	    String string0 = nextDate0.run(12, 19, 2011);
	    assertEquals("12/20/2011", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate21() throws Throwable {
	    NextDate nextDate0 = new NextDate(1815, 1815, 1815);
	    String string0 = nextDate0.run(2, 29, 1815);
	    assertEquals("2/29/1815", string0);
	}

	@Test(timeout = 4000)
	public void testCreatesNextDate20() throws Throwable {
	    NextDate nextDate0 = new NextDate(1804, (-4024), (-4024));
	    String string0 = nextDate0.run(1794, 2, 28);
	    assertEquals("invalid Input Date", string0);
	}

}