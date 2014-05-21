package test;

import static org.junit.Assert.*;

import org.junit.Test;

import soal.Soal;

public class TestSoal {

	@Test
	public void test() {
		Soal soal = new Soal();
		assertEquals(6, soal.perkalian(2, 3));
	}

}
