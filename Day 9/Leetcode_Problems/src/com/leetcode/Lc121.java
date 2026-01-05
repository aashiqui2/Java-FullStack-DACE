package com.leetcode;

public class Lc121 {

	public static void main(String[] args) {
		int prices[]= {7,1,5,3,6,4};
		Lc121 l=new Lc121();
		int maxProfit=l.bestTimeSellStock(prices);
		System.out.println(maxProfit);
	}
	
	public int bestTimeSellStock(int[] price)
	{
		int min=Integer.MAX_VALUE;
		int maxpro=0;
		for(int i=0;i<price.length;i++)
		{
			min=Math.min(min, price[i]);
			maxpro=Math.max(maxpro, price[i]-min);	
		}
		return maxpro;		 
	}

}
