import java.util.*;
public class Graphs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read=new Scanner(System.in);
		
		System.out.println("Enter the number of nodes:");
		int n=read.nextInt();
		System.out.println("Enter the number of edges:");
		int m=read.nextInt();
		
		System.out.println("Enter the edges in u v order where u and v are the endpoints:");
		int[][] adjMatrix=new int[n][n];
		for(int i=0;i<m;i++) {
			int u=read.nextInt();
			int v=read.nextInt();
			adjMatrix[u][v]=1;
			adjMatrix[v][u]=1;
		}
		read.close();
		System.out.println("\nAdjacency matrix for the undorected graph:");
		for (int i = 0; i < adjMatrix.length; i++) { 
	         for (int j = 0; j < adjMatrix[i].length; j++) { 
	            System.out.print(adjMatrix[i][j] + " ");
	         }
	         System.out.println(); 
	      }
		
		Queue q=new Queue(m);
		boolean[] visited=new boolean[m];
		Arrays.fill(visited, false);
		
		int vis;
		
		while(!q.isEmpty()) {
			vis=q.dequeue();
			
			System.out.print(vis+" ");
			
			for(int i=0;i<n;i++) {
				if(adjMatrix[vis][i]==1&&(!visited[i])) {
					q.enqueue(i);
					visited[i]=true;
				}
			}
		}
		
	}

}
