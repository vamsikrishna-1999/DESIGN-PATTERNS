package com.epam.Patterns_task;
public abstract class Template {
	public abstract void read();
	public abstract void write();
	public abstract void both();
	
	public void files() {
		read();
		write();
		both();
	}

}