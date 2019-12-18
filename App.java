package com.test.maven.quickstart;

/**
 * Hello world!
 *
 */
public class App 
{
	public int fact(int n) {
		int p=1;
		for (int i=1; i<=n;i++) {
			p=p*i;
		}
		return p;
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}