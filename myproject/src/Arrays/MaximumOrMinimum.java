package Arrays;

public class MaximumOrMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]x= {4,3,12,8,96,197,80,62};
		int n=x.length;
		FindMaxMinValue(x,n);
	}
	public static void FindMaxMinValue(int[]x,int n)
	{
		int max=Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0;i<x.length;i++)
		{
			
				if(max<x[i])
				{
					max=x[i];
					x[i]=max;
				}
				if(min>x[i])
				{
					min=x[i];
					x[i]=min;
				}
			
		}
		System.out.println(max);
		System.out.println(min);
	}
	}
