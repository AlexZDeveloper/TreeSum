import java.util.Arrays;
import java.util.Set;


public class TreeSum {
	
	private Set<Edge> edges;
	private int[] values;
	private int nodesCount;
	
	public TreeSum(Set<Edge> edges, int[] values) {
		this.edges = edges;
		this.values = values;
		this.nodesCount = values.length;
	}
	
	public int getMaxSum() {		
		if (this.nodesCount <= 1) {
			return 0;
		}
		
		int sum = Arrays.stream(values).min().getAsInt();
		
		for (int i = 0; i < nodesCount; i++) {
			for (int j = i + 1; j < nodesCount; j++) {
				if (!isLinked(i + 1, j + 1)) {
					if (sum < values[i] + values[j]) {
						sum = values[i] + values[j];
					}
				}
			}	
		}
		return sum;
	}	
	
	private boolean isLinked(int node1, int node2) {
		for (Edge edge: edges) {
			if (edge.isContain(node1, node2)) {
				return true;
			}
		}
		return false;
	}	
}
