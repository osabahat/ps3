package ps3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AccountTest {

	Account c;

	@Before
	public void setUp() throws Exception {
		c = new Account();
		
	}

	@After
	public void tearDown() throws Exception {
		c = null;
	}

	@Test
	public void test() throws InsufficientFundsException {
		c.setId(1122);
		c.setBalance(20000);
		c.setAnnualInterestRate(0.045);
		c.withdraw(2500);
		c.deposit(3000);
		
		System.out.println("balance: " + c.getBalance() + " monthly interest: " + c.getMonthlyInterestRate());
		System.out.println("date created: " + c.getDateCreated());
	}

	@Test
	public void testgetBalance() {
		c.setBalance(5000);
		assertTrue(c.getBalance()==5000);
		}
	@Test
	public void testgetId() {
		c.setId(123);
		assertTrue(c.getId()==123);
	}
	@Test
	public void testgetAnnualInterestRate() {
		c.setAnnualInterestRate(0.10);
		assertTrue(c.getAnnualInterestRate()==0.10);
	}
	@Test
	public void testgetMonthlyInterestRate() {
		c.setAnnualInterestRate(0.12);
		assertTrue(c.getMonthlyInterestRate()==0.01);
	}
	@Test
	public void testdeposit() {
		c.setBalance(500);
		c.deposit(250);
		assertTrue(c.getBalance()==750);
	}
	@Test
	public void testwithdraw() throws InsufficientFundsException {
		c.setBalance(500);
		c.withdraw(400);
		assertTrue(c.getBalance()==100);
	}
	@Test(expected=InsufficientFundsException.class)
	public final void testwithdrawexception() throws InsufficientFundsException {
		
		c.deposit(500);
		c.withdraw(900);
		assertEquals("$400 Expected, actual is $500",(long)c.getBalance(),(long)500);
        
	}	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

}
