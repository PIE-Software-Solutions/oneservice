package com.kj.oneservice.$packageName$.integration.controller;

import static com.kj.oneservice.common.integration.util.CommonConstants.ONESERVICE_JDBC_TEMPLATE;
import static org.mockito.Mockito.mock;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.kj.oneservice.$packageName$.integration.controller.$serviceNamecc$Controller;
import com.kj.oneservice.$packageName$.integration.dao.$serviceNamecc$DAO;
import com.kj.oneservice.$packageName$.integration.service.$serviceNamecc$Service;

/**
 * JUnit Test class for $serviceNamecc$ service
 * 
 * @author $author$
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class $serviceNamecc$ControllerTest {

	@TestConfiguration
	static class TestContextConfiguration {

		static JdbcTemplate oneServiceJdbcTemplate = mock(JdbcTemplate.class);

		@Bean
		public $serviceNamecc$Controller $serviceName$Controller() {
			return new $serviceNamecc$Controller();
		}

		@Bean
		public $serviceNamecc$Service $serviceName$Service() {
			return new $serviceNamecc$Service();
		}

		@Bean
		public $serviceNamecc$DAO $serviceName$DAO() {
			return new $serviceNamecc$DAO();
		}

		@Bean
		@Qualifier(ONESERVICE_JDBC_TEMPLATE)
		public JdbcTemplate oneServiceJdbcTemplate() {
			return oneServiceJdbcTemplate;
		}
	}

	@Autowired
	private $serviceNamecc$Controller $serviceName$Controller;

	// Success scenarios
	@Test
	public void testSuccessScenario() {
		// TODO Success test cases
	}

	// Error scenarios
	@Test
	public void testErrorScenario() {
		// TODO Error test cases
	}
}
