package co.assessment.question3;
class UserMainCode
{
 	static boolean checkTripplets(int[] a)
 	{
 	
 	int i=0;
       int len =a.length;
       for(i=0;i<len;++i)
       {
       	if(i==(len-2))
       	break;
       	if((a[i]==a[i+1])&&(a[i]==a[i+2]))
       	return true;
       	
       }
 	return false;
 	}
}
