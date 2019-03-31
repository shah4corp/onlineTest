package TestPractice;

public class Array {
public static void main(String[] args) {
	Object a[] = new Object[20];
	a[0]=1;
	a[14]="a";
	a[6]=15;
	a[18]=13;
	int b[] = new int[4];
	b[3]=33;
	for(int j=0; j<a.length;j++)
	{
		System.out.println(a[j]);
	}
	
}
}
