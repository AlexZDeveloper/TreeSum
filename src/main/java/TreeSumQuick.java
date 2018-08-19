import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;


/*
 * Описание алгоритма
 * Сначала отсортируем все вершины в порядке убывания значений в вершинах
 * Будем искать комбинации с максимальной суммой начиная с вершин с максимальными значениями.
 * Таким образом при нахождении суммы 2-х вершин i и j (i>j, value[i]>=value[j]) 
 * Дальше мы перебираем пары вершин  k, m (k > m) до тех пор, пока k > j. 
 * Оставшиеся вершины дадут меньшую сумму, чем первоначальная.    
 * */
public class TreeSumQuick {
	private Set<Edge> edges;
	private int[] values;
	private int nodesCount;
	
	private List<Node> nodes = new ArrayList<>(); 
	
	class Node {
		int number;
		int val;
		private Node(int number, int val) {
			this.number = number;
			this.val = val;
		}
	}
	
	public TreeSumQuick(Set<Edge> edges, int[] values) {
		this.edges = edges;
		this.values = values;
		this.nodesCount = values.length;
		
		this.buildNodes();
	}
	
	private void buildNodes() {		
		for (int i = 0; i < nodesCount; i++) {
			this.nodes.add(new Node(i + 1, values[i]));	
		}
		
		this.nodes.sort(new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {				
				return o2.val - o1.val;
			}			
		});
	}
	
	public int getMaxSum() {
		if (this.nodesCount <= 1) {
			return 0;
		}
		
		int sum = nodes.get(nodesCount - 1).val; // min value of all nodes
		int lowNodeNumber = nodesCount;		
		
		for (Node node: nodes) {
			if (lowNodeNumber <= node.number) {
				break;
			}
			
			Node secondNode = getNextNotLinkedNode(node);
			if (secondNode == null) {
				break;
			}
			if (sum < node.val + secondNode.val) {
				sum = node.val + secondNode.val;
				lowNodeNumber = secondNode.number;
			}
		}
		return sum;
	}
	
	private Node getNextNotLinkedNode(Node node) {
		int nodeNumber = node.number;
		while (nodeNumber < nodesCount) {
			Node nextNode = nodes.get(nodeNumber);
			nodeNumber++;
			if (!isLinked(node, nextNode)) {
				return nextNode;
			}
		}
		return null;
	}
	
	private boolean isLinked(Node node1, Node node2) {
		for (Edge edge: edges) {
			if (edge.isContain(node1.number, node2.number)) {
				return true;
			}
		}
		return false;
	}
}
