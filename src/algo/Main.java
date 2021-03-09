package algo;

import java.util.Arrays;

class Kruskal {
	 public static void KruskalMST(Graph g) {

	  Graph.Edge answer[] = new Graph.Edge[g.Vertex];
	  int j = 0; //index for keeping track of asnwer[]
	  int i = 0; //index for keeping track of sorted edges 
	  for (i = 0; i < g.Vertex; ++i) {
	   answer[i] = new Graph.Edge();
	  }
	  //sort all edges
	  Arrays.sort(g.edge);
	  //allocating memory to create subsets
	  Graph.DisjointSets mySet[] = new Graph.DisjointSets[g.Vertex];
	  for (i = 0; i < g.Vertex; ++i)
	   mySet[i] = new Graph.DisjointSets();
	  //creating subsets 
	  for (int x = 0; x < g.Vertex; ++x) {
	   
	   mySet[x].p = x;
	   mySet[x].r = 0;
	  }
	  i = 0;

	  while (j < g.Vertex - 1) {
	   
	   //picking the smallest edge
	   Graph.Edge nextEdge = new Graph.Edge();

	   //incrementing the index for next iteration
	   nextEdge = g.edge[i++];

	   int temp1 = g.find(mySet, nextEdge.source);
	   int temp2 = g.find(mySet, nextEdge.destination);

	   //if cycle not formed, include edge in answer[]
	   if (temp1 != temp2) {
	    
	    //incrementing the index for answer[] for next edge
	    answer[j++] = nextEdge;
	    g.merge(mySet, temp1, temp2);
	   }
	  }
	  //printing contents of answer[] to display the MST
	  for (i = 0; i < j; ++i)
	   System.out.println(answer[i].source + " , " + answer[i].destination);

	 }
	}

	class Main {
	 public static void main(String[] args) {

	  int V = 4, E = 5;
	  Graph graph = new Graph(V, E);

	  // add edge 0-1 
	  graph.edge[0].source = 0;
	  graph.edge[0].destination = 1;
	  graph.edge[0].weight = 10;

	  // add edge 0-2 
	  graph.edge[1].source = 0;
	  graph.edge[1].destination = 2;
	  graph.edge[1].weight = 6;

	  // add edge 0-3 
	  graph.edge[2].source = 0;
	  graph.edge[2].destination = 3;
	  graph.edge[2].weight = 5;

	  // add edge 1-3 
	  graph.edge[3].source = 1;
	  graph.edge[3].destination = 3;
	  graph.edge[3].weight = 15;

	  // add edge 2-3 
	  graph.edge[4].source = 2;
	  graph.edge[4].destination = 3;
	  graph.edge[4].weight = 4;

	  System.out.println("Minimum Spanning Tree of Graph 1");
	  Kruskal.KruskalMST(graph);
	  System.out.println();


	  V = 6;
	  E = 15;
	  Graph graph1 = new Graph(V, E);


	  graph1.edge[0].source = 0;
	  graph1.edge[0].destination = 1;
	  graph1.edge[0].weight = 4;

	  graph1.edge[1].source = 0;
	  graph1.edge[1].destination = 2;
	  graph1.edge[1].weight = 3;

	  graph1.edge[2].source = 1;
	  graph1.edge[2].destination = 2;
	  graph1.edge[2].weight = 1;


	  graph1.edge[3].source = 1;
	  graph1.edge[3].destination = 3;
	  graph1.edge[3].weight = 2;

	  graph1.edge[4].source = 2;
	  graph1.edge[4].destination = 3;
	  graph1.edge[4].weight = 4;

	  graph1.edge[5].source = 3;
	  graph1.edge[5].destination = 4;
	  graph1.edge[5].weight = 2;

	  graph1.edge[6].source = 4;
	  graph1.edge[6].destination = 5;
	  graph1.edge[6].weight = 6;

	  System.out.println("Minimum Spanning Tree of Graph 2");
	  Kruskal.KruskalMST(graph1);
	 }
	}
