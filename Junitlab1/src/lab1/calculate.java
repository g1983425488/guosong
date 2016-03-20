package lab1;

public class calculate {
	private static int result = 0;
	public void triangle(int a,int b,int c)
	{
		if(a<=0 || b<=0 || c<=0)
		{
			result = 0;//边长必须大于0
		}
		else
		{
			if(((a+b)>c) && ((a+c)>b && (b+c)>a))
			{
				if((a == b) &&(a == c))
			    {
				  result = 3;//等边
			    }
				if((a==b && a!=c)||(a==c && a!=b)||(b==c && a!=b))
				{
					result = 2;//等腰
					
				}
				if(a!=b && a!=c && b!=c)
				{
					result = 1;//普通
				}
			}
			
			else
			{
				result = 0;//不满足两边之和大于第三边的不是三角形
			}
		}
		
	}
	
	
	public int getReuslt(){
		return result;
	}
	
		public void clear(){
		result = 0;
	}

}
