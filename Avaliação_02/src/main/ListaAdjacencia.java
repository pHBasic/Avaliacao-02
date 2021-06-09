package main;
import java.util.*;
public class ListaAdjacencia {
	class Edge{
		int destination;
		public Edge(int destination){
			this.destination = destination;
		}
		@Override
		public String toString(){
			return "("+ destination + ")";
		}
	}
	List<Edge> G[];
	public ListaAdjacencia(int vertices){
		G = new LinkedList[vertices];
		for(int i = 0; i < G.length; i++)
			G[i] = new LinkedList<Edge>();
	}
	void addEdge(int source, int destination){
		G[source].add(0, new Edge(destination));
	}
	@Override
	public String toString(){
		String result = "";
		for(int i = 0; i < G.length; i++)
			result+= i + " => " + G[i] + "\n";
		return result;
	}

	public static void main(String[] args) {
		ListaAdjacencia l = new ListaAdjacencia(6);
		l.addEdge(0, 1);
		l.addEdge(0, 2);
		l.addEdge(0, 4);
		l.addEdge(1, 0);
		l.addEdge(2, 3);
		l.addEdge(3, 0);
		l.addEdge(4, 5);
		l.addEdge(5, 0);
		
		System.out.println(l);
	}
}
	
	

