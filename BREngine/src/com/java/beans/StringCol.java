package com.java.beans;

import java.util.ArrayList;
import java.util.List;

import com.java.main.interfaces.IColumn;

public class StringCol implements IColumn {

	private List<String> strValues;
	private ColSummary summary;
	private String type;

	public StringCol(List<String> strValues) {
		this.setStrValues(strValues);
	}

	@Override
	public ColSummary getSummary() {
		return summary;
	}

	public void setStrValues(ArrayList<String> strValues) {
		this.strValues = strValues;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSummary(ColSummary summary) {
		this.summary = summary;
	}

	public List<String> getStrValues() {
		return strValues;
	}

	public void setStrValues(List<String> strValues) {
		this.strValues = strValues;
	}

}
