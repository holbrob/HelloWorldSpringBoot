package com.illinus.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CovidService {
	
	public List<String> getStates() {
		List<String> stateArray = new ArrayList<String>();
		
		stateArray.add("AL");		
		stateArray.add("AK");
		stateArray.add("AZ");
		stateArray.add("AR");
		stateArray.add("CA");
		stateArray.add("CO");
		stateArray.add("CT");
		stateArray.add("DE");
		stateArray.add("FL");
		stateArray.add("GA");
		stateArray.add("HI");		
		stateArray.add("ID");
		stateArray.add("IL");
		stateArray.add("IN");
		stateArray.add("IA");
		stateArray.add("KS");
		stateArray.add("KY");
		stateArray.add("LA");
		stateArray.add("ME");
		stateArray.add("MD");
		stateArray.add("MA");		
		stateArray.add("MI");
		stateArray.add("MN");
		stateArray.add("MS");
		stateArray.add("MO");
		stateArray.add("MT");
		stateArray.add("NE");
		stateArray.add("NV");
		stateArray.add("NH");
		stateArray.add("NJ");
		stateArray.add("NM");		
		stateArray.add("NY");
		stateArray.add("NC");
		stateArray.add("ND");
		stateArray.add("OH");
		stateArray.add("OK");
		stateArray.add("OR");
		stateArray.add("PA");
		stateArray.add("RI");
		stateArray.add("SC");
		stateArray.add("SD");		
		stateArray.add("TN");
		stateArray.add("TX");
		stateArray.add("UT");
		stateArray.add("VT");
		stateArray.add("VA");
		stateArray.add("WA");
		stateArray.add("WV");
		stateArray.add("WI");
		stateArray.add("WY");
		
		return stateArray;
		
	}

}
