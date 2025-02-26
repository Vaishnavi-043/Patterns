class TrianglePattern 
{
	public static void main(String[] args) 
	{
		int n=5;
		
		for (int i=0;i<=n ;i++ )
		{
			 // 1 triangle 
			for (int j=0;j<n-i ;j++ )
			{
				System.out.print(" "+" ");
			}
			for (int j=0;j<=i ;j++ )
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			
		}
		System.out.println();
		
		
		//2 triangle
		
		for (int i=n;i>=0 ;i--)
		{
			
			for (int j=0;j<n-i ;j++ )
			{
				System.out.print(" "+" ");
			}
			for (int j=0;j<=i ;j++ )
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		
		
		}
		
		System.out.println();
		//3 triangle
		
		for (int i=n;i>=0 ;i--)
		{
			 // 1 triangle 
			//for (int j=0;j<n-i ;j++ )
			//{
			//	System.out.print(" "+" ");
			//}
			for (int j=i;j>=0 ;j--)
			{
				System.out.print("*"+" ");
			}
			
			System.out.println();
	    } 
		
		System.out.println();
		
		
		//4 triangle
		
		for (int i=0;i<=n ;i++)
		{
			
			//for (int j=0;j<n-i ;j++ )
			//{
			//	System.out.print(" "+" ");
			//}
			for (int j=0;j<=i ;j++ )
			{
				System.out.print("*"+" ");
			}
			
			System.out.println();
			
	    }
		System.out.println();
		
		// 5 triangle
		
		for (int i=0;i<=n ;i++)
		{
			
			for (int j=0;j<n-i ;j++ )
			{
				System.out.print(" ");
			}
			for (int j=0;j<=i ;j++ )
			{
				System.out.print("* ");
			}
			
			System.out.println();
			
	    }
		System.out.println();
		
	}
}
