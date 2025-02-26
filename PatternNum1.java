class PatternNum1 
{
	public static void main(String[] args) 
	{
		int n=4, evendiff=7,odddiff= -2;
		
		for (int i=1;i<=n ;i++ )
		{
			System.out.print(i+" ");
			int temp=i;
			for (int j=1;j<=i ;j++ )
			{
				if (j%2==0)
				{
					temp+=evendiff;
					System.out.print(temp+" ");
				}
				else{
					temp+=odddiff;
					System.out.print(temp+" ");
				}
			}
			System.out.println();
			evendiff-=2;
			odddiff+=2;
		}
	}
}
