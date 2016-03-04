package com.java.main.process;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.univocity.parsers.common.processor.ColumnProcessor;
import com.univocity.parsers.common.processor.RowListProcessor;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;

public class ReadCSV {
	public static LinkedHashMap<String, List<String>> main(String path) {

		CsvParserSettings parserSettings = new CsvParserSettings();

		parserSettings.setLineSeparatorDetectionEnabled(true);

		RowListProcessor rowProcessor = new RowListProcessor();

		parserSettings.setRowProcessor(rowProcessor);

		parserSettings.setHeaderExtractionEnabled(true);

		CsvParser parser = new CsvParser(parserSettings);
		//"C:\\MyData\\SSLC_Data_For_Analysis\\wmdata.csv"
		File file = new File(path);
		parser.parse(file);

		String[] c = rowProcessor.getHeaders();
		List<String[]> rows = rowProcessor.getRows();

		ColumnProcessor colProcessor = new ColumnProcessor();
		parserSettings.setRowProcessor(colProcessor);

		CsvParser parse = new CsvParser(parserSettings);

		parse.parse(file);

		LinkedHashMap<String, List<String>> columnValues = (LinkedHashMap<String, List<String>>) colProcessor
				.getColumnValuesAsMapOfNames();

		return columnValues;

		// Iterator<Map.Entry<String, List<String>>> entries =
		// columnValues.entrySet().iterator();
		//
		// LinkedHashMap<String, Data> dat = new LinkedHashMap<String, Data>();
		//
		// while (entries.hasNext()) {
		// Map.Entry<String, List<String>> entry = entries.next();
		//
		// Object o = interpret(entry.getValue().get(8)) ;
		// System.out.println(o.getClass().getSimpleName());
		//
		// //Need to update data type of class Data
		// Data data1 = new Data<String>();
		// data1.setValue(new ArrayList(entry.getValue()));
		// dat.put(entry.getKey(), data1);
		// }
		// }
		// public static Object interpret(String s) {
		// Scanner sc = new Scanner(s);
		// return
		// sc.hasNextInt() ? sc.nextInt() :
		// sc.hasNextLong() ? sc.nextLong() :
		// sc.hasNextFloat() ? sc.nextFloat() :
		// sc.hasNextDouble() ? sc.nextDouble() :
		// sc.hasNextBoolean() ? sc.nextBoolean() :
		// sc.hasNext() ? sc.next() :
		// s;
	}

}
