

class sum {

	
	static int sumDigits(int no)
	{
		if(no == 0){
		return 0 ;
		}

		return (no % 10) + sumDigits(no / 10) ;
	}

	
	public static void main(String[] args)
	{
		System.out.println(sumDigits(687));
	}
}


