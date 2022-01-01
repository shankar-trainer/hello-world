int main()
{
	char c;
	printf("\nstate capital program\n");
	
	printf("\na. Bihar");
	printf("\nb. Uttar Pardesh");
	printf("\nc. West Bengal");
	printf("\nd. Madhya ParDesh");
	printf("\ne. Rajsthan");
	printf("\nenter a b c d e  to get capital name\n");
	
	scanf("%c",&c);
	switch(c)
	{
	case 'a':
	 printf("\nCapital of Bihar is Patna ");
	 break;
	case 'b':
	 printf("\nCapital of Uttar Pardesh is Lucknow ");
	break;
	case 'c':
	printf("\nCapital of West Bengal is Kolkotta ");
	break;
	case 'e':
	printf("\nCapital of Rajsthan is Jaipur ");
	break;
	case 'd':
	printf("\nCapital of Madhya pardesh is bhopal ");
	break;
	default:
	printf("\n wrong choice");  
	}
 }

