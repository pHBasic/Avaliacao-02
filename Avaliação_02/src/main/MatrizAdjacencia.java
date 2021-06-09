package main;

import java.util.Scanner;

public class MatrizAdjacencia{
	int vertices;
	int matrix[][];
	//Vértices Marcio = 0, Nanda = 1, Clara = 2, Gael = 3, Nilda = 4, Theo = 5
	
	MatrizAdjacencia(int vertices){
		this.vertices = vertices;
		matrix = new int[vertices][vertices];
	}

	void addEdge(int source, int destination){
		matrix[source][destination] = 1;
	}

	void printGraph(){
		for(int i = 0; i < vertices; i++){
			for(int j = 0; j < vertices; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Insira o número de vertices.");
		int V = s.nextInt();
		MatrizAdjacencia amg = new MatrizAdjacencia(V);
		System.out.println("Insira o número de arestas.");
		int E = s.nextInt();

		for(int i = 0; i < E; i++){
			System.out.println("Insira o vertice de saída.");
			int a = s.nextInt();
			System.out.println("Insira o vértice de entrada.");
			int b = s.nextInt();

			amg.addEdge(a, b);
		}

		amg.printGraph();
	}
}
