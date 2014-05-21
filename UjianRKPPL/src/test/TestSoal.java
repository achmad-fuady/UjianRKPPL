package test;

import static org.junit.Assert.*;

import org.junit.Test;

import soal.Soal;

public class TestSoal {

	@Test
	public void testPerkalian() {
		Soal soal = new Soal();
		assertEquals(6, soal.perkalian(2, 3));
		assertEquals(6, soal.pangkat(3, 2));
	}
	
	@Test
	public void testPangkat(){
		Soal soal = new Soal();
		assertEquals(8,soal.pangkat(2, 3));
		assertEquals(9, soal.pangkat(3, 2));
	}
	
	@Test
	public void testFaktorial(){
		Soal soal = new Soal();
		assertEquals(4,soal.faktorial(2));
		assertNull(soal.faktorial(-1));
	}

}
