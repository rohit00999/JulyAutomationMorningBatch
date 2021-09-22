package com.sgtest.Log4jDemo;

import org.apache.log4j.Logger;

public class Example1 {
	public static Logger l = Logger.getLogger("Loop Output");
	public static void main(String[] args) {
		l.info("The Loop Starts Here -------------------");
		for(int i=20; i<=40; i++)
		{
			if(i%2==0)
			{
				l.info("The Even Numbers Are : " + i);
			}
		}
		l.info("The Loop Ends Here ----------------------");
	}
}
