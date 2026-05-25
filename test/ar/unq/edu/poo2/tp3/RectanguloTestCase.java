package ar.unq.edu.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTestCase {

	@Test
	void testRectanguloGetters() {
		Rectangulo r1 = new Rectangulo(0, 0, 3, 2); // rectangulo 3 x 2
		assertEquals(3, r1.getA());
		assertEquals(2, r1.getB());
	}

    @Test
    void testCuadrado() {
    	Point p1 = new Point();      // (0,0)
        
    	assertEquals(0, p1.getX());
        assertEquals(0, p1.getY());
    }

    @Test 
    void testSetters() { 
    	Point p1 = new Point();      // (0,0)
    	p1.setX(10); 
    	p1.setY(20);
    	assertEquals(10, p1.getX());
    	assertEquals(20, p1.getY()); 
    }
}
