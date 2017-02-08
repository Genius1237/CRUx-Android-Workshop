struct One{
	int x;
	float y;
	char name[100];
	char id[10];
};

//C-style structs cannot have functions inside them 

int main(){
	struct One a;
	a.x=5;
	a.y=3.14;
}