package br.com.api.sum;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.Random;

import org.junit.Test;

import br.com.api.sum.model.sum;

public class SumTest {


	@Test
	public void TestSum() {
	  Random randomic = new Random();
	  sum sumOp = new sum(randomic.nextInt(),randomic.nextInt());	  
	  System.out.println("This test method should be run");
	  assertEquals(sumOp.getValue1()+sumOp.getValue2(), sumOp.Total());
	}
	
}
