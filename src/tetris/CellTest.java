package tetris;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CellTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMoveDown() {
		Cell c1=new Cell(3,4,Tetris.I);
		c1.moveDown();
		assertEquals(4,c1.getRow());
		assertEquals(4,c1.getCol());
	}

	@Test
	public void testMoveLeft() {
		Cell c1=new Cell(3,4,Tetris.I);
		c1.moveLeft();
		assertEquals(3,c1.getRow());
		assertEquals(3,c1.getCol());
	}

	@Test
	public void testMoveRight() {
		Cell c1=new Cell(3,4,Tetris.I);
		c1.moveRight();
		assertEquals(3,c1.getRow());
		assertEquals(5,c1.getCol());
		
	}

}
