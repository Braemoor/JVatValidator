/*******************************************************************************
 * Copyright 2015 Eugen Covaci
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.vat.validator.impl;


/**
 * Luxembourg VAT number validator.
 * 
 * @author eugen covaci
 * 
 */
public class LU extends AbstractVatFormalValidator  {

	@Override
	public boolean validateDigits(String vatNumber) {
		
		// Checks the check digits of a Luxembourg VAT number.

		return Integer.parseInt(vatNumber.substring(0, 6)) % 89 == Integer.parseInt(vatNumber.substring(6, 8));
	}

	@Override
	public String[] getRegexArray() {
		return  new String[]{"^(\\d{8})$"};
	}

}
