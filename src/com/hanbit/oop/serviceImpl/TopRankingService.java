package com.hanbit.oop.serviceImpl;

public class TopRankingService {
	public int[] execute(int[] arr, int[] avgs){
		for(int i=0;i<avgs.length;i++){
			arr[1] += avgs[i];
		}
		arr[2]=arr[1]/arr[0];
		
		for(int i=0;i<avgs.length;i++){
			if(avgs[i]>arr[3]){
				arr[3]=avgs[i];
			}
			if(avgs[i]<arr[4]){
				arr[4]=avgs[i];
			}			
		}
		return arr;
	}
}
