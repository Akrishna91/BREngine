package com.java.beans;
import java.util.ArrayList;

public class ColSummary {

	 private int min, max;
	 private ArrayList<String> levels;
	 private int cardinality;
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public ArrayList<String> getLevels() {
		return levels;
	}
	public void setLevels(ArrayList<String> levels) {
		this.levels = levels;
	}
	public int getCardinality() {
		return cardinality;
	}
	public void setCardinality(int cardinality) {
		this.cardinality = cardinality;
	}
}
