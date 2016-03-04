package com.java.main.beans;

import java.util.ArrayList;
import java.util.List;

import com.java.main.interfaces.IColumn;

public class IntegerCol implements IColumn {
	
	private List<Integer> values;
	private ColSummary summary;
	
	public IntegerCol(List<Integer> values) {
		this.setValues(values);
	}

	public void setValues(ArrayList<Integer> values) {
		this.values = values;
	}

	@Override
	public ColSummary getSummary() {
		return summary;
	}

	public void setSummary(ColSummary summary) {
		this.summary = summary;
	}


	public List<Integer> getValues() {
		return values;
	}


	public void setValues(List<Integer> values) {
		this.values = values;
	}

}
