package com.java.main.profiling;

import com.java.main.interfaces.IProfiling;

/**
 * Class which is responsible for profiling null data.
 * Thi class implements interface profiling which overrides method clean()
 * @author Karthik
 *
 */
public class SpecialCharactersProfiling implements IProfiling {

	@Override
	public String clean(String col) {
		
		return col.replaceAll("[*&%#^:,]", "");
	}
	

}
