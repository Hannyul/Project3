/*
 Group Members:
 Algorithms and Data Structures
 Section CH 
 Project 3 - Dijkstra's Algorithm 
 */
package dijkstra;

public class Dijkstra {

    public static void main(String[] args) {

        // Infinity variable equals 10000.
        final int INF = 10000;
        // declare and initialize matrix
        int Matrix[][] = {
            
            {INF, 4, 3, INF, INF, INF},
            {4, INF, 2, 13, 10, INF},
            {3, 2, INF, 12, INF, INF},
            {INF, 13, 12, INF, 5, 1},
            {INF, 10, INF, 5, INF, 3},
            {INF, INF, INF, 1, 3, INF}
        
        };

        // the row of matrix
        int[] distance = new int[6];
        int[] visited = new int[6];
        int[] preD = new int[6];
        int min = 0;
        int nextnode = 0;
        char[] nodes = {'a', 'b', 'c', 'd', 'e', 'f'};
        LinkedList[] Paths= new LinkedList[6];
        


        // A
        distance = Matrix[0];
        // becuase the A[0,0] = 0 for itself 
        distance[0] = 0;
        // make it visited & other indices will be zeros 
        visited[0] = 1;

        
        
        
        // Call the Dijkstra method,
       Dijkstra(Matrix, min, INF,nodes, distance, visited, nextnode, preD,Paths);

        
//        for (int i = 0; i < visited.length; i++) {
//            System.out.println(visited[i]);
//        }
        
        // Matrix after running Dijkstra algorithm:
      //  print(Matrix, preD, nodes, distance, Paths);

    }

    public static void Dijkstra(int[][] Matrix, int min, int INF, char[] nodes, int[] distance, int[] visited, int nextnode, int[] preD, LinkedList[] Paths) {

        /*
         Dijkstra’s Algorithm
        
        
         - Description:
        
        
         - Parameters:
        
        
        
         - Output:
        
        
         */



        for (int i = 0; i < Matrix.length; i++) {
            min = INF;
              Paths[i]=new LinkedList();
            // only determine which next nodes 
            for (int j = 0; j < Matrix[i].length; j++) {
                
                // test if node is not visited 
                if (visited[j] != 1 ) {
                    //3 
                  if (min > distance[j]) {
                      // min = 4 // min = 3
                    min = distance[j];
        
                    nextnode = j;
                }  
                }
                

            }
            
            visited[nextnode] = 1;

            for (int k = 0; k < Matrix.length; k++) {
                
                if (visited[k] != 1) { 
                    if (min + Matrix[nextnode][k] < distance[k]) {
                        // 
                        distance[k] = min + Matrix[nextnode][k];
                        preD[k] = nextnode;
                      
                        for (int j = 0; j < preD.length; j++) {
                            System.out.println("------------------------");
                            System.out.print(preD[j]);
                            Paths[].insert(nodes[j]);
                        }
  
                   
                    }
                } // for visi
                
            }
            System.out.println("now at Dijkstra's method for node "+nodes[i]+": ");
            Paths[i].PrintPath();
            System.out.println("enddddddddd");
        } // big for 
    } /// *****888

    public static void print(int Matrix[][], int[] preD, char[] nodes, int[] distance, LinkedList[] Paths) {
        
        reverse(preD);
            
        for (int i = 0; i < Matrix.length; i++) {
            int j;
             Paths[i].PrintPath();
            System.out.print("The shortest path from a to " + nodes[i] + ":   ");

            
            j = i;


//
//            do {
//
//                if (distance[i] == 0) {
//                    System.out.print("NULL");
//                } else {
//                    
//                   
//                    
//
//
////                    do {
////                        j = preD[j];
////                        System.out.print(nodes[j] + " -> ");
////                    } while (j != 0);
//
//                    System.out.printf(nodes[i] + "\nwith the cost of " + distance[i] + "\n");
//
//                }
//
//            } while (j != 0);

            System.out.println();
        }
    }

    public static void reverse(int[] preD) {
        //method 1:
//    for (int left = 0, right = preD.length - 1; left < right; left++, right--) {
//        // swap the values at the left and right indices
//        int temp = preD[left];
//        preD[left]  = preD[right];
//        preD[right] = temp;
//    }

        
        
       
//        
//        System.out.println("BEFORE");
//        for (int i = 0; i < preD.length; i++) {
//            System.out.print(preD[i]);
//            
//        }
//        
//        method 2: 
//        for (int i = 0; i < preD.length/2; i++) {
//            {
//                int temp = preD[i];
//                preD[i] = preD[preD.length - i - 1];
//                preD[preD.length - i - 1] = temp;
//            }
//        }
//        System.out.println("AFTER:");
//
//for (int i = 0; i < preD.length; i++) {
//            System.out.print(preD[i]);
//            
//        }
//    }
    }
}
