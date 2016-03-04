package com.java.main.profiling;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.java.beans.IntegerCol;
import com.java.beans.MainData;
import com.java.beans.StringCol;
import com.java.main.interfaces.IColumn;

/**
 * Abstract Class which is responsible for profiling data. As of now supporing Null and Special Characters IProfiling
 * Thi class implements interface profiling which overrides method clean()
 * @see NullProfiling which profiles Null data
 * @see SpecialCharactersProfiling which profiles special characters 
 * @author Karthik
 *
 */
public class Profiling{
	
	/**
	 * 
	 * @param str
	 * @return true if numeric else false
	 */
	public static boolean isNumeric(String str)
	{
	  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
	
	/**
	 * Cleans the StringCol type column and assign the column correct data type.
	 * @param col
	 * @return void
	 * @throws
	 * 
	 */
	public IColumn cleanProfile(List<String> col){
		NullProfiling nullProfiling = new NullProfiling();
		SpecialCharactersProfiling specialCharactersProfiling = new SpecialCharactersProfiling();
		boolean isInt = true;
		//List<Double> numValues = new ArrayList<Double>();
		List<Integer> numValues = new ArrayList<Integer>();
		for (int i = 0; i < col.size(); i++) {
			if(isInt && isNumeric(col.get(i))){
				col.set(i, specialCharactersProfiling.clean(col.get(i)));
				numValues.set(i, Integer.parseInt(nullProfiling.clean(col.get(i))));
				col.set(i, "0");
			}else{
				isInt = false;
				col.set(i, nullProfiling.clean(col.get(i)));
				numValues.set(i, 0);
			}
		}
		if(isInt){
			return new IntegerCol(numValues);
		}else{
			return new StringCol(col);
			
		}
		
	}
	/**
	 * 
	 * @param LinedHashmap data
	 * @return cleaned data with proper form and datatypes.
	 */
	public MainData cleanProfile(LinkedHashMap<String, List<String>> data){
		MainData mainData = new MainData();
		for(String col: data.keySet()){
			IColumn colValues = cleanProfile(data.get(col));
			mainData.add(col, colValues);
		}
		return mainData;
	}

}
