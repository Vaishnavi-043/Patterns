class  Patterns1
{
	public static void main(String[] args) 
	{
		
		for (int i=1 ;i<=5 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		System.out.println();
		//odd number 
		int a=1;
		for (int i=1 ;i<=5 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(a+" ");
				a+=2;
			}
			System.out.println();
		}
		System.out.println();
		
		// even number
		
		int b=2;
		for (int i=1 ;i<=5 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(b+" ");
				b+=2;
			}
			System.out.println();
		}
		
		// a a a a b b b c c d .....
		
		for (int i=1 ;i<=5;i++ )
		{
			char ch ='a';
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(ch++ +" ");
				
			}
			System.out.println();
		}
		
		System.out.println();
		
		// a b d e f g h e....
		
		char ch ='a';
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				System.out.print(ch++ + " ");
			}
			System.out.println();
			
		}
		
		System.out.println();
		
		// 1 0 1 0 1 0 1 (1 at even place )
		
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				if ((i+j)%2==0)
				System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 1 0 1 0 1 0 1 0 1 (0 at even place )
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
				if((i+j)%2!=0)  
				  System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// a b c d e f  g h i 
		char ch1='a';
		int	num=1;
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=i ;j++ )
			{
			
				if(i%2!=0)
				   System.out.print(ch1++ +" ");
				else
					System.out.print(num++ + " ");
			}
			System.out.println();
		}
		
		
		
	}
}
 m   6