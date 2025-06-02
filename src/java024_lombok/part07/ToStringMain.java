package java024_lombok.part07;

import java024_lombok.part07.item1.ToStringExample;
import java024_lombok.part07.item2.ToStringExample2;

public class ToStringMain {

	public static void main(String[] args) {
		ToStringExample te = new ToStringExample();
		System.out.println(te.toString());
		
		ToStringExample.Square tSquare = new ToStringExample.Square(20, 40);
		System.out.println(tSquare);
		
		System.out.println("===ToStringExample2=================");
		ToStringExample2 te2= new ToStringExample2();
		System.out.println(te2.toString());
		
		ToStringExample2.Square2 tSquare2 = new ToStringExample2.Square2(20, 40);
		System.out.println(tSquare2);
	}

}
