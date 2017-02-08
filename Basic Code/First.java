class Test{

	//Basic data types are the same as in C
	int x;
	float y;
	double z;
	char id;

	//Arrays are declared similar to C, but differ slightly
	char name[100];


	//New Data Type
	String s="Hello World";

	//Single line comments
	/*

	Multi-line comments

	*/

	//Writing functions is similar to C
	int doSomething(int x,float y){


		//If-else is the same as in C
		if(x==0){

		}else{

		}

		//Switch case is same as in C
		switch(x){
			case 1:
			case 2:
			default:
		}

		//For, while and do while loops are same as in C
		for(int i=0;i<x;i++){

		}
		while(x!=0){

		}
		do{

		}while(x!=0);


		return 0;
	}

	//Functions can also have an access specifier attached to them
	// public,private,protected
	public void doNothing(){
		
	}
}