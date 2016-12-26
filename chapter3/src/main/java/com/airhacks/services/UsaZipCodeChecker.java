package com.airhacks.services;

import com.airhacks.qualifiers.USA;

@USA
public class UsaZipCodeChecker implements ZipCodeChecker {

    @Override
    public boolean check(String zipCode) {
	return true;
    }

}
