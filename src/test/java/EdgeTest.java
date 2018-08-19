import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeTest {

	private Edge edge;
	@Before
	public void init() {
		edge = new Edge(1, 2);
	}
	
	@Test
	public void edgeContainNodes() {
		assertTrue(edge.isContain(1, 2));
		assertTrue(edge.isContain(2, 1));
	}
	
	@Test
	public void edgeNotContainNodes() {
		assertFalse(edge.isContain(3, 1));
		assertFalse(edge.isContain(1, 3));
		assertFalse(edge.isContain(3, 4));
	}	
}
