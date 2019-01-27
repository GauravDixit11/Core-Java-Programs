package core.java.demo;

public class MaxNumberColumn {
	public void calculations() {
		int ab[][]= {{2,3,4},{7,8,5},{1,0,9}};
		int min= ab[0][0];
		int mincol=0;
		
		for(int i=0;i<ab.length;i++)
		{
			for (int j=0;j<ab.length;j++)
			{
				if(ab[i][j]<min)
				{
					min=ab[i][j];
					mincol=j;
				}
			}
		}
		//System.out.println(min);
      //  System.out.println(mincol);
        
        int k=0;
        int max=ab[k][mincol];
        while(k<ab.length) {
        	
        	if(max<ab[k][mincol]) {
        	  max=ab[k][mincol];	
        	}
        	k++;
        }
      System.out.println(max);  
	}
	public static void main(String[] args) {
		MaxNumberColumn mnx= new MaxNumberColumn();
		mnx.calculations();
	}

}
