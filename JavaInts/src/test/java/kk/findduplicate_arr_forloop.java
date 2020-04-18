package kk;

public class findduplicate_arr_forloop {
	public static void main(String[] args) {
		int[] ar = {10,6,8,100,65,10,8,100};
		
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					System.out.println("Duplicate element found "+ar[i]);
				}
			}
		}
	}
}

//space complexity of array is o(n)
//space complexity for outer for loop is o(n) and the space complexity of inner for loop is o(n)
//.so total time complexity is o(n2)