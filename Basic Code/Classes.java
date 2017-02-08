class One{
	int x;
	float y;
	char name[100];
	char id[10];

	
	//Classes can have functions inside them
	int doSomething(){

	}
	public void doNothing(){

	}

	//Constructor
	One(){

	}

	//Constructor with arguments
	One(int x,float y){

	}

	public static void main(String args[]){

		//Object Creation
		int x=5;
		One y=new One();

		//Each time an object is created, memory must be alotted using new operator

		One z;
		//No object is created here. z points to null

	}

}