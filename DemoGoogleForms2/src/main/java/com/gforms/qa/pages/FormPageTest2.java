
	
	package com.gforms.qa.pages;

	import java.io.IOException;

	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import com.gforms.qa.base.TestBase;

	import net.bytebuddy.jar.asm.commons.FieldRemapper;

	public class FormPageTest2 extends TestBase{
		
		
		public static UserNamePage2 usernamepage;
		public static LoginPage2 loginpage;
		public static HomePage2 homepage;
		public static FormPage2 formpage;
		//public static UserNamePage usernamepage;
		
		
		public FormPageTest2() throws IOException {
			
			super();
		}
		
		@BeforeClass
		public void setup() throws IOException, InterruptedException {
			initialization();
			usernamepage = new UserNamePage2();
			usernamepage.provideUserName();
			loginpage = usernamepage.cliconNext();
			loginpage.enterpassword();
			Thread.sleep(2000);
			homepage = loginpage.clickonnext();
			Thread.sleep(15000);
			formpage = homepage.navigatetoNewForm();
			Thread.sleep(5000);
	//return formpage;
			
		}
		
		@Test(dataProvider="dataprovider1")
		public void fillformTest(String ... args) throws InterruptedException {
			
			//formpage.fillformdata(q,o1,o2,o3);
			System.out.println("print length of array"+args.length);
			
			formpage.fillQuestion(args[0]);
			
			for (int i=1;i<args.length;i++) {
				formpage.fillOption(args[i]);
			}
			//formpage.fillformdata(q, o1, o2, o3);
			
		}
		
		
		@DataProvider(name="dataprovider1")
		public static Object[][] getData(){

			Object[][] data= new Object[3][4];
			data[0][0]="Q1";
			data[0][1]="q1o1";
			data[0][2]="q1o2";
			data[0][3]="q1o3";
			data[1][0]="Q2";
			data[1][1]="q2o1";
			data[1][2]="q2o2";
			data[1][3]="q2o3";

			data[2][0]="Q3";
			data[2][1]="q3o1";
			data[2][2]="q3o2";
			data[2][3]="q3o3";


			return data;
		}

	}



