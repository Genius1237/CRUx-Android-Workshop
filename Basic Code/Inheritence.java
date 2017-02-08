class One{
	int x;
	float y;

	One(){

	}

	void doSomething(){

	}
	int doNothing(){

	}
}

class Two extends One{
	
	//x and y are accessible here
	//One is super class. Two is sub class. All variables(members) and functions(methods) of superclass are available in the sub class

	Two(){

	}
}