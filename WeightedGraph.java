/*
James Ralston
CSCD 320 HW6

in this program i implemented the Kruskal algorithm to output the minimum spanning 
tree
*/

import java.util.*;
 
class WeightedGraph
{

    private int v;
    private int e;
    Edge edgesList[];
	
    WeightedGraph(int numVertices, int numEdges)
    {
        v = numVertices;
        e = numEdges;
        edgesList = new Edge[e];
        
        for (int i = 0; i < numEdges; ++i)
        {
            edgesList[i] = new Edge();
        }//end for
        
    }//end WeightedGraph
 
    int find(UnionFind vertices[], int value)
    {
        if (vertices[value].parent != value)
        {
            vertices[value].parent = find(vertices, vertices[value].parent);
        }//end if
        
        return vertices[value].parent;
        
    }//end find
 

    void UnionFind(UnionFind vertices[], int vertice1, int vertice2)
    {
        int v1 = find(vertices, vertice1);
        int v2 = find(vertices, vertice2);
 
        if (vertices[v2].rank > vertices[v1].rank)
        {       	
            vertices[v1].parent = v2;    
        }//end if
        
            vertices[v2].parent = v1;
        
    }//end unionfind
 
    void KruskalAlgorithm()
    {
        Edge myTree[] = new Edge[v];
        int edges = 0;
        int i = 0; 
        
        for (i = 0; i < v; ++i)
        {
            myTree[i] = new Edge();
        }//end for

        Arrays.sort(edgesList);//sort the edges by their weight
        UnionFind vertices[] = new UnionFind[v];
        
        for(i = 0; i < v; ++i)
        {
            vertices[i] = new UnionFind();
        }//end for
 
        for (i = 0; i < v; ++i)
        {
            vertices[i].parent = i;
            vertices[i].rank = 0;
        }//end for
 
        int n = 0;

        while (edges < v - 1)
        {

            Edge next = new Edge();
            next = edgesList[n++];
 
            int x = find(vertices, next.v1);
            int y = find(vertices, next.v2);
 
            if (x != y)
            {
                myTree[edges++] = next;
                UnionFind(vertices, x, y);
            }//end if
        }//end while
 
        for (n = 0; n < edges; n++)
        {
            System.out.println(myTree[n].v1 +" ---> "+myTree[n].v2);
        }//end for
    }//end KruskalMST
    
	
    class Edge implements Comparable<Edge>
    {
        int v1;
        int v2; 
        int weight;

        public int compareTo(Edge e)
        {
            int result;
            result = this.weight - e.weight;
            return result;
        }
    };//end nested Edge class
    
    class UnionFind
    {
        int parent; 
        int rank;
    };//end nestedUnion
 
}
