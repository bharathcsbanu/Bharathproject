package com.E_commerce.generic.fileutility;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_Utility {
	public String getdataFromjsonFile(String key) throws IOException, ParseException {
		FileReader read = new FileReader("./configAppdata/commondata.json");
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(read);
		JSONObject map = (JSONObject) obj;
		System.out.println(map.get("url"));
		String data=(String) map.get(key);
		return data;
	}
}
