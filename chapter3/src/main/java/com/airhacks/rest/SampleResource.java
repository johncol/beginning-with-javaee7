package com.airhacks.rest;

import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneOffset;

import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import com.airhacks.domain.Customer;

@Path("sample")
public class SampleResource {
    
    @Inject
    private ValidatorFactory validatorFactory; 

    @GET
    public String sample(@QueryParam(value = "name") String name, @QueryParam(value = "email") String email) {
	Locale.setDefault(new Locale("es"));
	Validator validator = validatorFactory.getValidator();
	Date birthDate = Date.from(LocalDate.of(1989, Month.JUNE, 24).atStartOfDay().toInstant(ZoneOffset.UTC));
	Customer customer = new Customer(name, "cely", email, "3057724370", birthDate, null);
	Set<ConstraintViolation<Customer>> violations = validator.validate(customer);
	return violations.toString();
    }

}
