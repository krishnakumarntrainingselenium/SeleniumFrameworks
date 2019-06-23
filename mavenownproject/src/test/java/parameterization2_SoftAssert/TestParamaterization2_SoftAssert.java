package parameterization2_SoftAssert;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class TestParamaterization2_SoftAssert {
	
		// TESTCase 1
		@Test(dataProvider = "providedata1")
		public void Login1(String Username, String Password1, String Password2) {
			System.out.println(Username + " and " + Password1 + " and " + Password2);
			SoftAssert Sassert1=new SoftAssert();
			Sassert1.assertEquals(Password1, Password2,"Values are not matching");
			//Sassert1.assertAll();
		}
		
		// TESTCase 2
			@Test(dataProvider = "providedata2")
			public void Login2(String Username, String Password) {
				System.out.println(Username + " and " + Password);
			}

		// Method to pass test data to the testCase
		@DataProvider
		public Object[][] providedata1() {
			Object[][] data = new Object[3][3];
			//Note 1: [3][3]  --Row, column
			//Note 2:Column number should match with the "TestCase" method parameter

			data[0][0] = "Kumar00";
			data[0][1] = "Kumar01";
			data[0][2] = "Kumar01";

			data[1][0] = "Kumar10";
			data[1][1] = "Kumar11";
			data[1][2] = "Kumar12";

			data[2][0] = "Kumar20";
			data[2][1] = "Kumar21";
		    data[2][2] = "Kumar22";

			return data;
		}

		// Method to pass test data to the testCase
			@DataProvider
			public Object[][] providedata2() {
				Object[][] data = new Object[3][2];
				//Note 1: [3][3]  --Row, column
				//Note 2:Column number should match with the "TestCase" method parameter

				data[0][0] = "Kumar00";
				data[0][1] = "Kumar01";
			

				data[1][0] = "Kumar10";
				data[1][1] = "Kumar11";
				

				data[2][0] = "Kumar20";
				data[2][1] = "Kumar21";
			

				return data;
			}
	}


