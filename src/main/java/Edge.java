public class Edge {

	private int parentNode;
	private int childNode;
	
	public Edge(int parentNode, int childNode) {
		this.parentNode = parentNode;
		this.childNode = childNode;
	}	
	
	public boolean isContain(int node1, int node2) {
		if ((parentNode == node1) && (childNode == node2)) {
			return true;
		}
		if ((parentNode == node2) && (childNode == node1)) {
			return true;
		}
		return false;
	}
}
