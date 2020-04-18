
public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		int[] a = { 20, 50, 60, 20, 30, 50,100,70 };
		int[] t = new int[a.length];
		boolean flag=false;
		int c=0;
		//int j = 0;
		//t[0]=a[0];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]==t[j]) {
					flag=false;
					break;
				}
				else
					flag=true;
			}
			if(flag == true) {
				t[c++]=a[i];
				//c++;
			}
		}
		
		for(int i=0;i<c;i++) {
			System.out.println(t[i]);
		}
		
	}

}
