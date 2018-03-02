package com.mavendemo.mavendemo;

import org.junit.Test;

/**
 * Hello world!
 *
 */
public class App 
{
   @Test
   public void createTest()
   {
	   String browser=System.getProperty("browser");
	   System.out.println(browser);
   }
}
