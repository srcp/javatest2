package com.mycompany.app;
import junit.framework.TestCase;


public class UtilTest extends TestCase {
	public void testUtilistErstesHalbjahr(){
		final int e = 3;
		final int n = 8;
		assertTrue((Util.istErstesHalbjahr(e) && !Util.istErstesHalbjahr(n)));
	}
	
}
