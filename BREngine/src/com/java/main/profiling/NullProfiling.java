package com.java.main.profiling;

import java.util.ArrayList;

import com.java.beans.IntegerCol;
import com.java.beans.StringCol;
import com.java.main.interfaces.IProfiling;

/**
 * Class which is responsible for profiling null data. Thi class implements
 * interface profiling which overrides method clean()
 * 
 * @author Karthik
 *
 */
public class NullProfiling implements IProfiling {

	/**
	 * @param String
	 *            value
	 * @return Boolean
	 * @throws
	 */
	public boolean isNull(String val) {
		return (val == null);
	}

	/**
	 * @param StringCol
	 * @return
	 * @throws
	 */
	/*public void clean(StringCol col) {
		ArrayList<String> colValues = col.getValues();
		for (int i = 0; i < colValues.size(); i++) {
			if (isNull(colValues.get(i))) {
				colValues.set(i, "0");
			}
		}
		col.setValues(colValues);
	}
*/

	public String clean(String val) {
		if (isNull(val)){
			return "0";
		}else{
			return val;
		}

	}

}
