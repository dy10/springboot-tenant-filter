package com.example.filter.rest;

import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Filter;
import org.hibernate.annotations.FilterDef;
import org.hibernate.annotations.FilterDefs;
import org.hibernate.annotations.Filters;
import org.hibernate.annotations.ParamDef;

import com.example.filter.Constants;

@FilterDefs({
	@FilterDef(name = Constants.SUB_TENANT_FILTER, parameters = {@ParamDef(name="subTenants", type = "long")})
})

@Filters({
	@Filter(name =  Constants.SUB_TENANT_FILTER, condition = "sub_tenant in (:subTenants)")
	})

@MappedSuperclass
public class MyBase {

}
