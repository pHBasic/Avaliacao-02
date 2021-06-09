package main;

import java.util.Scanner;
import java.math.*;

public class CalcularComplexidadeMatriz {
	int vertices;
	int matrix[][];
	int complexity;
	//Vértices Marcio = 0, Nanda = 1, Clara = 2, Gael = 3, Nilda = 4, Theo = 5
	
	CalcularComplexidadeMatriz(int vertices){
		this.vertices = vertices;
		matrix = new int[vertices][vertices];
	}

	void addEdge(int source, int destination){
		matrix[source][destination] = 1;
	}

	/*void printGraph(){
		for(int i = 0; i < vertices; i++){
			for(int j = 0; j < vertices; j++){
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}*/
	
	void calculateComplexity(){
		complexity = (int) Math.pow(vertices, 2);
		System.out.println("A comlexidade é" + complexity );
		
	}

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.println("Insira o número de vertices.");
		int V = s.nextInt();
		CalcularComplexidadeMatriz amg = new CalcularComplexidadeMatriz(V);
		System.out.println("Insira o número de arestas.");
		int E = s.nextInt();

		for(int i = 0; i < E; i++){
			System.out.println("Insira o vertice de saída.");
			int a = s.nextInt();
			System.out.println("Insira o vértice de entrada.");
			int b = s.nextInt();

			amg.addEdge(a, b);
		}

		amg.calculateComplexity();
		
	}
}
