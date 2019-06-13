package tetris;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TetrominoTest {

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
		
		Tetromino t1=new Z();
		t1.moveDown();
		assertEquals(2,t1.cells[3].getRow());
		
		
	}

	@Test
	public void testMoveLeft() {
		
		Tetromino t2=new D();
		t2.moveLeft();
		assertEquals(4,t2.cells[0].getCol());
		
	}

	@Test
	public void testMoveRight() {
		
		Tetromino t3=new J();
		t3.moveRight();
		assertEquals(6,t3.cells[0].getCol());
		
	}

	@Test
	public void testSpin() {
		
		Cell[] cells = new Cell[4];
		Tetromino t4 = new L();
		cells=t4.spin();
		assertEquals(3,cells[0].getRow());
		assertEquals(5,cells[0].getCol());
		
	}

}
