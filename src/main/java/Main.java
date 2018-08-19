import java.util.HashSet;
import java.util.Set;

/*
Задача 118:  Сумма на дереве
Задача: дано дерево состоящее из N вершин, каждая вершина имеет значение value. 
Необходимо определить такое множество вершин дерева, в котором никакие две вершины не имеет общего ребра, и сумма значений в этих вершинах максимальная. 
Выведите максимально возможную сумму значений в таком множестве вершин.
Входные данные: edges - список ребер, которым задано дерево; каждое ребро определятся двумя вершинами: (i, j). 
value - упорядоченный массив значений в вершинах, где value(i) - значение вершины i (i от 1 до N; 1 <= N <= 10^4). 
Вывод: максимальную сумму значений вершин в подмножестве.
Пример:
Edges = [ (1, 2), (1, 3), (2, 4) ]
Value = [ 1, 1, 0, 1] (Пояснение: 1я вершина - значение 1; 2я вершина - 1; 3я вершина - 0; 4я вершина - 1)
Answer = 2
*/

/* 
 * Задача решена 2-мя способами
 * 1. Простой перебор всех возможных сумм (TreeSum) 
 * 2. Перебор только вершин с максимальными значениями (TreeSumQuick)
 */

public class Main {
	
	public static void main( String[] args ) {
    	Edge e1 = new Edge(1, 2);
    	Edge e2 = new Edge(1, 3);
    	Edge e3 = new Edge(2, 4);
    	Set<Edge> edges = new HashSet<>();
    	edges.add(e1);
    	edges.add(e2);
    	edges.add(e3);
    	
    	int[] values = new int[] {1, 1, 0, 1}; 
    	TreeSum treeSum = new TreeSum(edges, values);
    	System.out.println("Max sum: " + treeSum.getMaxSum());
    	
    	TreeSumQuick treeSumQuick = new TreeSumQuick(edges, values);
    	System.out.println("Max sum: " + treeSumQuick.getMaxSum());
    }
}