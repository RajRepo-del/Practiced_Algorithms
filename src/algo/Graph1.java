package algo;

import java.io.*;
import java.util.*;

class Graph1 {
 private int vertices; //number of vertices 
 private LinkedList < Integer > adjacencyList[]; //Adjacency Lists 
 @SuppressWarnings("unchecked")
 // Constructor 
 Graph1(int vert) {
  this.vertices = vert;
  this.adjacencyList = new LinkedList[vertices];
  for (int i = 0; i < this.vertices; ++i)
   this.adjacencyList[i] = new LinkedList();
 }

 // Function to add an edge into the graph 
 void addEdge(int source, int destination) {
  this.adjacencyList[source].add(destination);
 }

 public int getVertices() {
  return this.vertices;
 }

 public LinkedList < Integer > [] getAdj() {
  return this.adjacencyList;
 }
 public static void main(String args[]){
	 Graph1 g = new Graph1(7);
	  g.addEdge(1, 2);
	  g.addEdge(2, 3);
	  g.addEdge(3, 4);
	  g.addEdge(4, 5);
	  g.addEdge(5, 6);
	  g.addEdge(6, 1);
	  
 }
}

