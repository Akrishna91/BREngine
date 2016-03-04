package com.java.main.beans;

import com.java.main.interfaces.IColumn;
import com.java.main.interfaces.Iterator;


public class MainDataIterator implements Iterator {
	
	public MainData mainData;
	public int index = 0;
	
	public  MainDataIterator(MainData mainData) {
		this.mainData = mainData;
	}

	/**
	 * 
	 * @return boolean if the next value is present in the iterator
	 */
	@Override
	public boolean hasNext(){
		return (this.index <= mainData.getCol_values().size());
	}
	
	/**
	 * 
	 * @return next column in the data
	 */
	@Override
	public IColumn next(){
		if(this.hasNext()){
			return mainData.getCol_values().get(this.index++);
		}else{
			return null;
		}
	}

}
