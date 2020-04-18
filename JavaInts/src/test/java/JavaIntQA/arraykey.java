package JavaIntQA;

import java.util.Arrays;

public class arraykey {
	static int j = 0;
	public static void main(String[] args) {
		int keyindex = 0;
		
		int k = 0;
		int[] ar = { 10, 50, 3, 7, 80, 8, 3 };
		int[] ar1 = new int[ar.length];
		int[] ar2 = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 10) {
				keyindex = i;
			}
			if (ar[i] < 10) {
				ar1[j] = ar[i];
				j++;

			}
			if (ar[i] > 10) {
				ar2[k] = ar[i];
				k++;

			}
		}
		ar1[j]=10;
		int l=++j;
	for(k=0;l<ar1.length;k++) {
		
		ar1[l]=ar2[k];
		l++;
	}	
		System.out.println(Arrays.toString(ar1));
		
	}

}
