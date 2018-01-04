package test.java;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.Test;

import br.com.api.sum.model.sum;



public class SumTest {


	@Test
	public void TestSum() {
	  Random randomic = new Random();
	  sum sumOp = new sum(randomic.nextInt(99),randomic.nextInt(99));  
	  System.out.println("running a sum operation of " + sumOp.getValue1() + " + " + sumOp.getValue2() + " = " + sumOp.Total() );
	  assertEquals(sumOp.getValue1()+sumOp.getValue2(), sumOp.Total());
	}
	
}
