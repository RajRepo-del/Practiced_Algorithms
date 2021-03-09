package algo;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Graph {
 //class for represting an edge of a graph
 public static class Edge implements Comparable < Edge > {
  int source,
  destination,
  weight;
  //sorting edges on weight
  public int compareTo(Edge
   var) {
   return this.weight -
    var.weight;
  }
 };

 //class for Disjoint sets
 public static class DisjointSets {
  int p, r;
 }

 public int Vertex, Edges;
 public Edge edge[];


 @SuppressWarnings("unchecked")

 public Graph(int v, int e) {
  Vertex = v;
  Edges = e;
  edge = new Edge[Edges];
  for (int i = 0; i < e; ++i)
   edge[i] = new Edge();
 }

 //function for finding set of a given element 
 int find(DisjointSets mySet[], int v) {
  // find root and make root as parent of i 
  if (mySet[v].p != v)
   mySet[v].p = find(mySet, mySet[v].p);

  return mySet[v].p;
 }

 //function for taking union of two sets
 void merge(DisjointSets mySet[], int i, int j) {
  int set_i = find(mySet, i);
  int set_j = find(mySet, j);

  if (mySet[set_i].r < mySet[set_j].r)
   mySet[set_i].p = set_j;
  else if (mySet[set_i].r > mySet[set_j].r)
   mySet[set_j].p = set_i;

  else {
   mySet[set_j].p = set_i;
   mySet[set_i].r++;
  }
 }
}
