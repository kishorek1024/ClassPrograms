package packone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel_Con {

	public static void main(String[] args) throws Exception{
		
		FileWriter fw=new FileWriter("C:\\Users\\DELL\\Desktop\\WD8PM\\1010op.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hi This is Kishore Kumar");
		
		bw.close();
		
		/*FileReader f=new FileReader("C:\\Users\\DELL\\Desktop\\WD8PM\\1234.txt");
		BufferedReader b=new BufferedReader(f);
		
		String s;
		
		while((s=b.readLine())!=null){
			System.out.println(s);
		}
		*/
		
		
		
		
		
		/*int a=50;
		int b=60;
		int c=a*b; int d=b-a;
		
		FileOutputStream fo=new FileOutputStream("C:\\Users\\DELL\\Desktop\\WD8PM\\1010.xls");
		WritableWorkbook wwb=Workbook.createWorkbook(fo);
		WritableSheet ws=wwb.createSheet("Result", 1);
		WritableSheet ws1=wwb.createSheet("Result1", 0);
		
		Label l=new Label(0, 0, "C Value is " + c);		
		ws.addCell(l);
		Label l1=new Label(0, 0, "D Value is " + d);
		ws1.addCell(l1);
		
		wwb.write();wwb.close();
*/		
		/*// Identifying the location of excel
		FileInputStream f=new FileInputStream("C:\\Users\\DELL\\Desktop\\WD8PM\\1009.xls");
		
		// Opening Identified excel
		Workbook wb=Workbook.getWorkbook(f);
		
		// Open sheet in opened excel
		Sheet s=wb.getSheet("Sheet1");
		
		int r=s.getRows();
		int i;
		
		int c=s.getColumns();
		int j;
		
		for(j=0; j<c; j++){
			for(i=0; i<r; i++){
				System.out.println(s.getCell(j, i).getContents());
			}
		}*/
		
		/*WebDriver driver=new FirefoxDriver();
		driver.get(s.getCell(0, 0).getContents());
		driver.manage().window().maximize();
		
		driver.findElement(By.id(s.getCell("A2").getContents())).sendKeys(s.getCell(0, 2).getContents());
		driver.findElement(By.id(s.getCell(0, 3).getContents())).sendKeys(s.getCell(0, 4).getContents());*/
		
		
		/*// Identifying cell and read data from cell
		System.out.println(s.getCell(0, 0).getContents());
		System.out.println(s.getCell(1, 0).getContents());*/

	}

}
