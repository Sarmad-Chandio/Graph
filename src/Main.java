
public class Main {
    public static void main(String[] args) {

        Graph myGraph = new Graph(); //No Args constructor will be called  , empty hashset will be there o/p --> {}
        myGraph.addVertex("A");//setting up A =[] into above empy hashSet -->{A=[]}
        myGraph.addVertex("B");

        myGraph.addEdge("A","B");
        myGraph.printGraph();
        myGraph.removeEdge("A","B");
        myGraph.printGraph();

        myGraph.addVertex("A");
        myGraph.addVertex("B");
        myGraph.addVertex("C");
        myGraph.addVertex("D");

        myGraph.addEdge("A","B");
        myGraph.addEdge("A","C");
        myGraph.addEdge("A","D");
        myGraph.addEdge("B","D");
        myGraph.addEdge("C","D");

        myGraph.printGraph();

        myGraph.removeVertex("D");
        myGraph.printGraph();

        /* OUTPUT:
        {A=[B], B=[A]}
        {A=[], B=[]}
        {A=[B, C, D], B=[A, D], C=[A, D], D=[A, B, C]}
        {A=[B, C], B=[A], C=[A]}

         */



    }
}