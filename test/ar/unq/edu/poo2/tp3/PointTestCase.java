package ar.unq.edu.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTestCase {


	@Test 
	void testConstructorConParametros() { 
		 Point p = new Point(3, 4); // (3,4) 
		 assertEquals(3, p.getX()); 
		 assertEquals(4, p.getY()); 
	}
    @Test
    void testConstructorPorDefecto() {
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
    @Test
    void testSumaPoint() { 
    	Point p1 = new Point(); // (0,0) 
    	Point p2 = new Point(3, 4); // (3,4) 
    	p1.setX(1); 
    	p1.setY(2);
	    p1.sumaPoint(p2); // p1 = (1+3, 2+4) = (4,6)
	    assertEquals(4, p1.getX());
	    assertEquals(6, p1.getY()); 
    }
}
