package inJava.chapter1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Q7 {
	public void rotateMatrix(int[][] image) {
		if (image == null)
			return;
		int N = image.length;
		for (int i = 0; i < N / 2; i++) {// This handles empty case
			for (int j = i; j < N - i - 1; j++) {
				rotate(image, i, j);
			}
		}
		return;
	}

	private void rotate(int[][] image, int i, int j) {
		int len = image.length, buf = image[i][j];
		image[i][j] = image[len - 1 - j][i];
		image[len - 1 - j][i] = image[len - 1 - i][len - 1 - j];
		image[len - 1 - i][len - 1 - j] = image[j][len - 1 - i];
		image[j][len - 1 - i] = buf;
		return;
	}
	
	@Test public void test1(){
		int[][] matrix = new int[0][0];
		int[][] matrixans = new int[0][0];
		rotateMatrix(matrix);
		assertTrue(isEqual(matrix, matrixans));
	}
	@Test public void test2(){
		int[][] matrix = {{1}};
		int[][] matrixans = {{1}};
		rotateMatrix(matrix);
		assertTrue(isEqual(matrix, matrixans));
	}
	@Test public void test3(){
		int[][] matrix = {{1,2},{3,4}};
		int[][] matrixans = {{3,1},{4,2}};
		rotateMatrix(matrix);
		assertTrue(isEqual(matrix, matrixans));
	}
	@Test public void test4(){
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] matrixans = {{7,4,1},{8,5,2},{9,6,3}};
		rotateMatrix(matrix);
		assertTrue(isEqual(matrix, matrixans));
	}
	@Test public void test5(){
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] matrixans = {{13,9,5,1},{14,10,6,2},{15,11,7,3},{16,12,8,4}};
		rotateMatrix(matrix);
		assertTrue(isEqual(matrix, matrixans));
	}

	private boolean isEqual(int[][] m1, int[][] m2) {
		if(m1.length != m2.length) return false;
		int len = m1.length;
		if(len == 0) return true;
		for(int i = 0; i < len; i++){
			for(int j = 0; j < len; j++){
				if(m1[i][j] != m2[i][j]) return false;
			}
		}
		return true;
	}
}
