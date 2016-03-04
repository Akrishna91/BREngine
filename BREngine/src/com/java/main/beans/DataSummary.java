package com.java.main.beans;

import java.util.HashMap;

public class DataSummary {
	
	private HashMap<String, ColSummary> col_summary;

	public HashMap<String, ColSummary> getCol_summary() {
		return col_summary;
	}

	public void setCol_summary(HashMap<String, ColSummary> col_summary) {
		this.col_summary = col_summary;
	}

}
