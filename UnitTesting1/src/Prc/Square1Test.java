package Prc;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Square1Test {

	@Test
	void test() {
     UnitTest obj=new UnitTest();
     
     int ans=obj.square(4);
     assertEquals(16, ans);
	}

}
