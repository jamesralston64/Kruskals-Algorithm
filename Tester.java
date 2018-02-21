/*
 * James Ralston
 * CSCD 320 HW6
 * In this program i implemented the Kruskals algorithm to output the minimum spanning
 * tree
 */


public class Tester {
    public static void main (String[] args)
    {
        WeightedGraph MST = new WeightedGraph(8, 14);
 
        //add all of the vertices and their edges to the to the edges list
        //contained inside of the weighted graph.        
        
        MST.edgesList[0].v1 = 0;
        MST.edgesList[0].v2 = 1;
        MST.edgesList[0].weight = 4;
 
        MST.edgesList[1].v1 = 0;
        MST.edgesList[1].v2 = 2;
        MST.edgesList[1].weight = 6;
 
        MST.edgesList[2].v1 = 0;
        MST.edgesList[2].v2 = 3;
        MST.edgesList[2].weight = 16;
 
        MST.edgesList[3].v1 = 1;
        MST.edgesList[3].v2 = 7;
        MST.edgesList[3].weight = 24;
 
        MST.edgesList[4].v1 = 2;
        MST.edgesList[4].v2 = 3;
        MST.edgesList[4].weight = 8;
        
        MST.edgesList[5].v1 = 2;
        MST.edgesList[5].v2 = 5;
        MST.edgesList[5].weight = 5;
        
        MST.edgesList[6].v1 = 2;
        MST.edgesList[6].v2 = 7;
        MST.edgesList[6].weight = 23;
        
        MST.edgesList[7].v1 = 3;
        MST.edgesList[7].v2 = 5;
        MST.edgesList[7].weight = 10;
        
        MST.edgesList[8].v1 = 3;
        MST.edgesList[8].v2 = 4;
        MST.edgesList[8].weight = 21;
        
        MST.edgesList[9].v1 = 4;
        MST.edgesList[9].v2 = 5;
        MST.edgesList[9].weight = 14;
        
        MST.edgesList[10].v1 = 4;
        MST.edgesList[10].v2 = 6;
        MST.edgesList[10].weight = 7;
        
        MST.edgesList[11].v1 = 5;
        MST.edgesList[11].v2 = 6;
        MST.edgesList[11].weight = 11;
        
        MST.edgesList[12].v1 = 5;
        MST.edgesList[12].v2 = 7;
        MST.edgesList[12].weight = 18;
        
        MST.edgesList[13].v1 = 6;
        MST.edgesList[13].v2 = 7;
        MST.edgesList[13].weight = 9;
        
        System.out.println("The MST contains the following edges: \n");
        MST.KruskalAlgorithm();
    }
}
