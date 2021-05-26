package com.example.filter.aspect;

import java.util.Arrays;

import javax.persistence.EntityManager;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.hibernate.Session;
import org.hibernate.Filter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.example.filter.Constants;

@Aspect
@Configuration
public class SubTenantFilter {

	@Autowired
	private EntityManager entityManager;
	
	
	@Before("execution(* *(..))" +
	"&& (@annotation(org.springframework.web.bind.annotation.RequestMapping) || " +
			" @annotation(org.springframework.web.bind.annotation.GetMapping) || " +
			" @annotation(org.springframework.web.bind.annotation.RestController))"
	)
	public void addFilter() {
		Session session = (Session) entityManager.getDelegate();
		Filter filter = session.enableFilter(Constants.SUB_TENANT_FILTER);
		filter.setParameterList("subTenants", Arrays.asList(1l, 2l));
	}
	
	
	@After("execution(* *(..))" +
			"&& (@annotation(org.springframework.web.bind.annotation.RequestMapping) || " +
					" @annotation(org.springframework.web.bind.annotation.GetMapping) || " +
					" @annotation(org.springframework.web.bind.annotation.RestController))"
			)
			public void removeFilter() {
				Session session = (Session) entityManager.getDelegate();
				session.disableFilter(Constants.SUB_TENANT_FILTER);
			}
}
