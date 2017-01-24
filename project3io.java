class project3io{
	public static void main( String [] inputs ){
		boolean foundUSTP = false;

		for( String i : inputs ){
			System.out.println(i);

			/*if(i.equals("USTP")){
				foundUSTP = true;
			}
		}

		if(foundUSTP){
			System.out.println( "Alma mater found!" );
		} 
		else{
			System.out.println( "Alma mater not found!" ); */
		}
		if(inputs.length == 1){
		System.out.print("\nNaay " +inputs.length);
		System.out.println(" kabuok argument."); //char grammar nazi
		}
		else{
		System.out.print("\nNaay " +inputs.length);
		System.out.println(" kabuok arguments.");
		}
	}
}