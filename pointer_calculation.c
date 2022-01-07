
void calculation(int a,int b,int *c, int *d, int *e, int *f)
{
*c=a+b;	
*d=a-b;
*e=a*b;
*f=a/b;
}
void main()
{ 
int x=5,y=2,k=0,l=0,m=0,n=0;

calculation(x,y,&k,&l,&m,&n);
printf("\naddition is %d  ",k);
printf("\nsubtraction is %d  ",l);
printf("\nmultiplication is %d  ",m);
printf("\ndivision is %d  ",n);

}
