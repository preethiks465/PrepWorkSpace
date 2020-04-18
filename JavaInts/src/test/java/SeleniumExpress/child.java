package SeleniumExpress;

public class child extends abs {
	int p, k;

	public child(int i,int j,int p, int k) {
		super(i,j);
		this.p=p;
		this.k=k;
	}
	public static void main(String[]args) {
		child c= new child(5,10,6,8);
	}
}
