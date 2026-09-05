package com.meeran.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SameMatrix {
	static public int count_different_matrices(int[][] matrices) {
		int row = matrices.length;
		int count = 1;
		int[][] refMatrix = new int[2][2];
		int[][] matToCompute = new int[2][2];
		List<Integer> MatchedRows = new ArrayList<Integer>();
		for(int k = 0; k < row; k++) {
			boolean isSame = true;

			if(!MatchedRows.contains(k)) {
				refMatrix[0][0] = matrices[k][0];
				refMatrix[0][1] = matrices[k][1];
				refMatrix[1][0] = matrices[k][2];
				refMatrix[1][1] = matrices[k][3];
				for(int i = k; i < row; i++) {
					if(i != k) {
						matToCompute[0][0] = matrices[i][0];
						matToCompute[0][1] = matrices[i][1];
						matToCompute[1][0] = matrices[i][2];
						matToCompute[1][1] = matrices[i][3];
						if(!findRotation(matToCompute, refMatrix)) {
							isSame = false;
						} else {
							isSame = true;
							MatchedRows.add(i);
						}
					}
				}
			}

			if(!isSame) count += 1;
		}
		return count;
	}

	public static void print2D(int mat[][]) {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
	}

	public static boolean findRotation(int[][] mat, int[][] target) {
		int ml = mat.length;
		int mw = mat[0].length;
		int[][] roted = new int[ml][mw];
		if(Arrays.deepToString(mat).equals(Arrays.deepToString(target))) return true;
		for(int i = 0; i < 3; i++) {
			roted = rotateCW(mat);
			mat = roted;
			if(Arrays.deepToString(roted).equals(Arrays.deepToString(target))) return true;
		}
		return false;
	}

	static int[][] rotateCW(int[][] mat) {
		final int matRow = mat.length;
		final int matCol = mat[0].length;
		int[][] roted = new int[matCol][matRow];
		for (int row = 0; row < matRow; row++) {
			for (int col = 0; col < matCol; col++) {
				roted[col][matRow-1-row] = mat[row][col];
			}
		}
		return roted;
	}
}
