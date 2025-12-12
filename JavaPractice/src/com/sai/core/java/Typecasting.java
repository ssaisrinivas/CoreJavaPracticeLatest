package com.sai.core.java;

public class Typecasting {

	public static void main(String[] args) {

		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f= 10.10f;
		double d= 100.789;

		// lower to higher

		short p = b;
		int x1 = b;
		int x2 = s;

		long l1 = b;
		long l2 = s;
		long l3 = i;
		
		float f1 = b;
		float f2 = s;
		float f3 = i;
		
		double d1 = b;
		double d2 = s;
		double d3 = i;
		double d4 = f;
		
		System.out.println(p  +" "+ x1  +" "+ x2  +" "+ l1  +" "+l2 +" "+ l3  +" "+ f1  +" "+ f2  +" "+f3 +" "+d1 +" "+ d2  +" "+ d3  +" "+ d4);
		
		//higher to lower
		
		byte b1=(byte)s;
		byte b2=(byte)i;
		byte b3=(byte)l;
		byte b4=(byte)f;
		byte b5=(byte)d;
		
		
		short s2=(short)i;
		short s3=(short)l;
		short s4=(short)f;
		short s5=(short)d;
		
	
		int i3=(int)l;
		int i4=(int)f;
		int i5=(int)d;
		

		long l4=(long)f;
		long l5=(long)d;
		
		
		float f5=(float)d;
		
		System.out.println(b1  +" "+ b2  +" "+ b3  +" "+ b4  +" "+b5);
		System.out.println( s2  +" "+ s3  +" "+ s4  +" "+s5);
		System.out.println( i3  +" "+ i4  +" "+i5);
		System.out.println( f5);
		
		
		int v1 = b+b;
		int v2 = b+s;
		int v3 = s+s;
		int v4 = s+i;
		int v5 = i+i;
		long v6 = i+l;
		float v7 = i+f;
		float v8 = l+f;
		float v9 = s+f;
		float v10 = b+f;
		double v11 = i+d;
		double v12 = l+d;
		double v13 = s+d;
		double v14 = b+d;
		double v15 = f+d;

	}

}
