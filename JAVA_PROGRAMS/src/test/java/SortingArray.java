
public class SortingArray {

	public static void main(String[] args) {
		int[] a = {12,90,47,89,44,119};
		int t=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		}
		
		System.out.println(a[a.length-3]);

	}

}
