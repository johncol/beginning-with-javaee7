package com.airhacks.validation.validators;

import java.util.regex.Pattern;

import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.airhacks.qualifiers.USA;
import com.airhacks.services.ZipCodeChecker;
import com.airhacks.validation.ZipCode;

public class ZipCodeValidator implements ConstraintValidator<ZipCode, String> {
    
    @Inject @USA
    private ZipCodeChecker zipCodeChecker;
    
    private Pattern zipPattern = Pattern.compile("\\d{5}(-\\d{5})?");

    @Override
    public void initialize(ZipCode constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
	if (value == null || value.equals("")) {
	    return true;
	}
	if (!zipPattern.matcher(value).matches()) {
	    return false;
	}
	return zipCodeChecker.check(value);
    }

}
