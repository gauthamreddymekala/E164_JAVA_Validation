package com.convert.phoneNumber;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.PhoneNumberUtil.PhoneNumberFormat;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

/**
 * Hello world!
 *
 */
public class App 
{
	private String ConvertPhoneNumberToE164(String phoneNumber){
		
				//get PhoneNumberUtil instance
				PhoneNumberUtil phoneUtil = PhoneNumberUtil.getInstance();
				
				PhoneNumber parse = null;
				try {
					//Parse string input phone number with country code 1(US region)
					parse = phoneUtil.parse(phoneNumber, "US");
					//Convert PhoneNumber to E.164 format
					String formattedNumber = phoneUtil.format(parse, PhoneNumberFormat.E164);
					return formattedNumber;

				} catch (NumberParseException e) {
					// TODO Auto-generated catch block
					return null;
				}
								
	}
    public static void main( String[] args )
    {
    	
        App app = new App();
        
		String validPhoneNumber = app.ConvertPhoneNumberToE164("555555555555555500");
		
		System.out.println("String Phone Number to E.164 Format >>> " + validPhoneNumber);

		String invalidPhoneNumber = app.ConvertPhoneNumberToE164("sadfasdfsd");
		
		System.out.println("String Phone Number to E.164 Format >>> " + invalidPhoneNumber);

	
    }
}