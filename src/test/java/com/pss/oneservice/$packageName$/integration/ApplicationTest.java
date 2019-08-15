package com.pss.oneservice.$packageName$.integration;

import static org.junit.Assert.assertNotNull;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.pss.oneservice.$packageName$.integration.Application;

/**
 * Test case for Application.java
 * 
 * <!-- This Class DOES NOT require any modification.-->
 * 
 * @author KARUNAR
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ApplicationTest {

	// Success scenarios
	/*@Test
	public void testApplicationFilter() {
		Application application = new Application();
		FilterRegistrationBean filterRegistrationBean = application.filter();
		assertNotNull(filterRegistrationBean);
	}

	// Exception scenarios
	@Test(expected = IllegalArgumentException.class)
	public void testApplication() {
		Application.main(new String[] {});
	}*/
}
