package core.java.demo;

public class MaxNumberMatrix {
	
	public void calculations() {
		int ab[][]= {{2,3,4},{7,8,5},{1,0,9}};
		int max= ab[0][0];
		
		for(int i=0;i<ab.length;i++)
		{
			for (int j=0;j<ab.length;j++)
			{
				if(ab[i][j]>max)
				{
					max=ab[i][j];
				}

			}
		}
		System.out.print("Max number: "+max);
	}

	public static void main(String[] args) {
		MaxNumberMatrix mx =new MaxNumberMatrix();
        mx.calculations();  
	}

}
