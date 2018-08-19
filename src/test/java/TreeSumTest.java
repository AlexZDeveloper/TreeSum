import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class TreeSumTest {
    @Test
    public void TreeSum() {
    	Edge e1 = new Edge(1, 2);
    	Edge e2 = new Edge(1, 3);
    	Edge e3 = new Edge(2, 4);
    	Set<Edge> edges = new HashSet<>();
    	edges.add(e1);
    	edges.add(e2);
    	edges.add(e3);
    	
    	int[] values = new int[] {1, 1, 0, 1}; 
    	TreeSum treeSum = new TreeSum(edges, values);
        assertEquals(2, treeSum.getMaxSum());
        
        TreeSumQuick treeSum2 = new TreeSumQuick(edges, values);
        assertEquals(2, treeSum2.getMaxSum());
    }
    
    
    @Test
    public void TreeSum2() {
    	Edge e1 = new Edge(1, 2);
    	Edge e2 = new Edge(1, 3);
    	Edge e3 = new Edge(2, 4);
    	Set<Edge> edges = new HashSet<>();
    	edges.add(e1);
    	edges.add(e2);
    	edges.add(e3);
    	
    	int[] values = new int[] {-1, -2, -3, -7}; 
    	TreeSum treeSum = new TreeSum(edges, values);
        assertEquals(-5, treeSum.getMaxSum());
        
        TreeSumQuick treeSum2 = new TreeSumQuick(edges, values);
        assertEquals(-5, treeSum2.getMaxSum());        
    }
    
    
    @Test
    public void TreeSum3() {
    	Edge e1 = new Edge(1, 4);
    	Edge e2 = new Edge(2, 3);
    	Edge e3 = new Edge(3, 4);
    	Set<Edge> edges = new HashSet<>();
    	edges.add(e1);
    	edges.add(e2);
    	edges.add(e3);
    	
    	int[] values = new int[] {1, 1, 0, 1}; 
    	TreeSum treeSum = new TreeSum(edges, values);
        assertEquals(2, treeSum.getMaxSum());
        
        TreeSumQuick treeSum2 = new TreeSumQuick(edges, values);
        assertEquals(2, treeSum2.getMaxSum());        
    }
    
    @Test
    public void TreeSum4() {
    	Edge e1 = new Edge(1, 2);
    	Edge e2 = new Edge(1, 3);
    	Edge e3 = new Edge(3, 4);
    	Set<Edge> edges = new HashSet<>();
    	edges.add(e1);
    	edges.add(e2);
    	edges.add(e3);
    	
    	int[] values = new int[] {10, 9, 6, 1}; 
    	TreeSum treeSum = new TreeSum(edges, values);
        assertEquals(15, treeSum.getMaxSum());
        
        TreeSumQuick treeSum2 = new TreeSumQuick(edges, values);
        assertEquals(15, treeSum2.getMaxSum());        
    }
}