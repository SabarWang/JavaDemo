package com.zhao;

public class Test {
	public static void main(String args[])
    {
       int a=0;
       outer:  for(int i=0;i<2;i++)
                {
                  for(int j=0;j<2;j++)
                    {
                     if(j>i)
                       {
                         continue outer;
                        }
                        a++;
                     }
                 }
       System.out.println(a);
     }


}
