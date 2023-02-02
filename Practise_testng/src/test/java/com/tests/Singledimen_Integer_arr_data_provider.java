package com.tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Singledimen_Integer_arr_data_provider {
	@Test(dataProvider="h")
	public void test(Integer a) {
		System.out.println(a);
	}
	@DataProvider(name="h")
	public Integer[] dataP() {
		Integer[] data=new Integer[] {1,2,3,4};
		return data;
	}

}
