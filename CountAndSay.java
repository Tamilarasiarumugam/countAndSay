package assignments;

public class CountAndSay {
	
	public static String countNSay(int n)
	{
		if (n == 1) 
			return "1";
	    if (n == 2)   
	    	return "11";
	 
	    
	    String str = "11"; 
	    for (int i = 3; i <= n; i++)
	    {
	        
	        str += '0';
	        int len = str.length();
	 
	        int cnt = 1; 
	        String tmp = ""; 
	        char []arr = str.toCharArray();
	         
	       
	        for (int j = 1; j < len; j++)
	        {
	            
	            if (arr[j] != arr[j - 1])
	            {
	                
	                tmp += cnt ;
	 
	               
	                tmp += arr[j - 1];
	 
	                
	                cnt = 1;
	            }
	 
	           
	            else cnt++;
	        }
	 
	        
	        str = tmp;
	    }
	 
	    return str;
	    }
	
	public static void main(String[] args)
	{
		int n=3;
		System.out.println(countNSay(n));
	}

}

