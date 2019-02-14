
	
	package com.gforms.qa.pages;

	import java.io.IOException;

	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import com.gforms.qa.base.TestBase;

	import net.bytebuddy.jar.asm.commons.FieldRemapper;

	public class FormPageTest2 extends TestBase{
		
		public static int count=1;
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
		
		@Test(priority=1,dataProvider="dataprovider1")
		public void fillformTest(String ... args) throws InterruptedException {
			
			//formpage.fillformdata(q,o1,o2,o3);
			System.out.println("print length of array"+args.length);
			
			if(count==1) {
				formpage.fillQuestion(args[0]);
				System.out.println("filled first question value");
				
			}
			else {
				formpage.fillQuestion2(args[0]);
				System.out.println("filled question other than question1");
				
			}
			//formpage.fillQuestion(args[0]);
			
			for (int i=1;i<args.length;i++) {
				
				formpage.fillOption(args[i]);
				System.out.println("filled option value");
				if(i!=args.length-1) {
				System.out.println("value of i is: "+i);
				
					formpage.addOption();
					System.out.println("clciked on add option");
					
				}
				
				
				
			}
			formpage.clickOnAddQuestion();
			System.out.println("clicked on question");
			count++;
			Thread.sleep(3000);
			//formpage.fillformdata(q, o1, o2, o3);
			
		}
		
		@Test(priority=2)
		public void deleteQuestion() throws InterruptedException {
			
			formpage.clickOnDeleteQuestion();
		}
		
		@Test(priority=3)
		public void saveFormData() throws InterruptedException {
			formpage.saveQuiz();
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



