package inJava.chapter1;

public class Q8 {
	public void zeroMatrix(int[][] MN){
		  if(MN == null || MN.length == 0 || MN[0].length == 0){
		    return;
		  }
		  int m = MN.length, n = MN[0].length;
		  boolean[] row = new boolean[m], col = new boolean[n];
		  /*mark the row and col*/
		  for(int i = 0; i < m; i++){
		    for(int j = 0; j < n; j++){
		      if(MN[i][j] == 0){
		        row[i] = true;
		        col[j] = true;
		      }
		    }
		  }
		  /*set the col and row*/
		  
		  for(int i = 0; i < m; i++){
		    for(int j = 0; j < n; j++){
		      if(row[i] || col[j]){
		        MN[i][j] = 0;
		      }
		    }
		  }
		}
}
