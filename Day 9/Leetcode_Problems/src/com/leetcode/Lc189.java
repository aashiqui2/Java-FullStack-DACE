package com.leetcode;

import java.util.Arrays;

public class Lc189 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;
		// [5,6,7,1,2,3,4]
		Lc189 l = new Lc189();
		int res[] = l.rotate(a, k);
		System.out.println(Arrays.toString(res));
	}

	public int[] rotate(int[] a, int k) {
		if (k % a.length != 0) {
			int n = a.length;
			reverse(a, 0, n - 1);
			reverse(a, 0, k - 1);
			reverse(a, k, n - 1);
		}
		return a;
	}

	public void reverse(int[] a, int st, int end) {
		while (st < end) {
			int temp = a[st];
			a[st] = a[end];
			a[end] = temp;
			st++;
			end--;
		}
	}

}
