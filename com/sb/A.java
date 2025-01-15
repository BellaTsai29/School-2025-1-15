package com.sb;

import com.sa.Student;
import com.sa.Student2;

class A extends Student implements Student2
{
	private int chi;

	A(String name,int chi)
	{
		super(name);
		this.chi=chi;
	}
	
	public void skill()
	{
		System.out.println("A skill");
	}
}