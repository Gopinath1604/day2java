class Star
{
	public static void patter(int n)
	{
		for(int i=1;i<n;i++)
	 	{ 
	 		for(int j=0;j<i;j++)
	 		{
	 		 System.out.print("*");
	 		}
	 		System.out.println();
	 	}
	}

	public static void main(String[] args) {
		patter(6);


	}		


}