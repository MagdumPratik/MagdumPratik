package Arrays;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrangDescending();
	}
	public static void arrangDescending()
	{
		int[]x= {4,1,2,89,97,3};
		for(int i=0;i<x.length;i++)
		{
			for(int j=i+1;j<x.length;j++)
			{
				if(x[i]<x[j])
				{
					int y=x[i];
					x[i]=x[j];
					x[j]=y;
				}
			}
		}
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]+" ");
		}
	}


	}
