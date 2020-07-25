package com.epam.Patterns_task;

public class File1 extends Template{
	@Override
	public void read() {
		System.out.println("This File is readable");
	}

	@Override
	public void write() {
		System.out.println("This File can be edited");
	}

	@Override
	public void both() {
		System.out.println("This file has both read and write acsess");
		System.out.println();
		
	}

}