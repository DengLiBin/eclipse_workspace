package myuse.test;

import org.junit.Test;

import junit.framework.Assert;
import myuse.domain.Person;

public class TestPerson {
	@Test
	public void testGetAge(){
		Person person = new Person(12,"����");
		//����
		Assert.assertEquals(12, person.getAge());
		
		Assert.assertTrue(true);
	}
}
