
import java.util.*;
import java.lang.*;
import java.io.*;

class Test
{
	public static void main (String[] args) throws java.lang.Exception
  {
		Scanner sc=new Scanner(System.in);
		String s= sc.next();
		HashSet set =new HashSet();
		for(int i=0;i<s.length();i++){
			set.add(s.charAt(i));
		}
		int k=set.size();
		set.clear();
		while(k>0){
			for(int i=0;i<s.length()-k+1;i++){
				for(int j=i;j<i+k;j++){
					set.add(s.charAt(j));
				}
				if(set.size()==k){
					System.out.println(k);
					return;
				}
				set.clear();
			}
			k--;
		}
	}
}
