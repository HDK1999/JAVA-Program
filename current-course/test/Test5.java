import java.util.*;
import java.io.*;

class AA implements Serializable{}

class BB extends AA{}

class CC extends AA{}

public class Test5{
	public static void main(String[] args){
		int i=2;
		float f=2.0f;
		double d=4.0;
		
		//����float*intת��Ϊfloat*float��Ȼ��float==doubleת��Ϊdouble==double
		System.out.println(0.0==0.0);
		
		byte b=0x1f;
		char c='G';
		//byte&charת��Ϊint&int
		System.out.println(Integer.toHexString(b&c));
		
		f = (b==0) ? i : 6.0f; //int:floatת��Ϊfloat:float
		System.out.println(f/2.0); //float/doubleת��Ϊdouble/double		
	}
}