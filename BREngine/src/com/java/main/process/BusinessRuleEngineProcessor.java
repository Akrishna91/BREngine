package com.java.main.process;

import java.util.LinkedHashMap;
import java.util.List;

import com.java.main.beans.MainData;
import com.java.main.profiling.Profiling;

/**
 * Class which collects the data from UI and transform to Model and Controller.
 * This acts as an intermediate between UI <==> Model, Controller
 * @author Karthik
 *
 */
public class BusinessRuleEngineProcessor {

	public static void main(String[] args) {
		LinkedHashMap<String, List<String>> tempData =  ReadCSV.main(args[0]);
		Profiling profiling = new Profiling();
		MainData mainData = profiling.cleanProfile(tempData);
		System.out.println(mainData);
	}

}
