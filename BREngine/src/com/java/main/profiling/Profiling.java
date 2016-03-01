package com.java.main.profiling;

import com.java.main.interfaces.IProfiling;

/**
 * Abstract Class which is responsible for profiling data. As of now supporing Null and Special Characters IProfiling
 * Thi class implements interface profiling which overrides method clean()
 * @see NullProfiling which profiles Null data
 * @see SpecialCharactersProfiling which profiles special characters 
 * @author Karthik
 *
 */
public abstract class Profiling implements IProfiling{
	
	@Override
	public void clean(){
		
	}

}
