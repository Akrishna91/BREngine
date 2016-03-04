package com.java.beans;

import java.util.HashMap;
import java.util.LinkedHashMap;

import com.java.main.interfaces.IColumn;

public class MainData {

	private LinkedHashMap<String, IColumn> col_values;
	private int ind = 0;

	public void setCol_values(LinkedHashMap<String, IColumn> col_values) {
		this.col_values = col_values;
	}

	public HashMap<String, IColumn> getCol_values() {
		return col_values;
	}
	/**
	 * 
	 * @param  String coulmn namecol
	 * @param Column Values of IColumn type
	 */
	public void add(String col, IColumn values) {
		this.col_values.put(col, values);
	}

	/**
	 * 
	 * @param Column name String col
	 */
	public void remove(String col) {
		this.col_values.remove(col);
	}
	
	
	

}
