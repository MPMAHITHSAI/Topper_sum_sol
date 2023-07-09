package Topperprob;
import java.util.*;
public class Topperprobss 
{
	
	public static void main(String[] args) 
	
	{
		Scanner sc = new Scanner(System.in);
		int tn=sc.nextInt();
		sc.close();
		int var=tn;
		int c=0;
		int e=0;
		int o=0;
		while(var>0) {
			c=var%10;
			if(c%2==0) {
				e+=c;
			}
			else
				o+=c;
			var/=10;
		}
		if(e==o)
			System.out.println("true");
		else {
			System.out.println("false");
		}
		
	}
	}