package inJava.chapter1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Chapter1Test {
	Q5 q5 = new Q5();
	
	@Test public void test501() {assertEquals(true, q5.oneAway("a", ""));	}
	@Test public void test502() {assertEquals(true, q5.oneAway("a", "b"));	}
	@Test public void test503() {assertEquals(true, q5.oneAway("", "a"));	}
	@Test public void test504() {assertEquals(true, q5.oneAway("aaa", "aaa"));	}
	@Test public void test505() {assertEquals(true, q5.oneAway("aa", "ba"));	}
	@Test public void test506() {assertEquals(true, q5.oneAway("aa", "a"));	}
	@Test public void test507() {assertEquals(true, q5.oneAway("a", "ba"));	}
}
