import java.util.ArrayList;
import java.util.Random;

/*
 * Viết class MyNumber với các thuộc tính
 

import java.util.ArrayList;
import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

/*
 * Viết class MyNumber với các thuộc tính
 * int[] ListNumber - Lưu trữ một danh sách các số được khởi tạo qua constructor
 * Methods:
 * - MyNumber(int[] number) - Khởi tạo giá trị cho thuộc tính ListNumber
 * - GetMinNumber() - Trả ra giá trị nhỏ nhất trong ListNumber
 * - GetMaxNumber() - Trả ra giá trị lớn nhất trong ListNumber
 * - GetDistanceMinMax() - Đưa ra các số nằm giữa Min và Max
 * Viết test cho 3 methods GetMinNumber, GetMaxNumber, GetDistanceMinMax
 */
public class Lesson07 {
	
		class Mynumber
		{
			int min;
			int max;
			int numbers;
			public int[] ListNumber;
		
			public Mynumber (int[]  numbers) 
			
			{
				this.ListNumber = numbers;
			}
			
			public int  GetMinNumber() 
			{
				int min = ListNumber[0];
				int j;
				for ( j = 1; j < ListNumber.length; j++)
				{
					if (ListNumber[j]< min) {
						min = ListNumber[j];
					}
						
					
				}
				return min;
			
			}
			
			public int GetMaxNumber() 
			{
				int max = ListNumber[0];
				int j;
				for ( j = 1; j < ListNumber.length; j++)
				{
					if (ListNumber[j]> max) {
						max = ListNumber[j];
					}
				}
				return max;
			}
			
			public ArrayList GetDistanceMinMax() 
			{
				ArrayList Mynumber = new ArrayList();
				int min;
				int max;
				
				min = GetMinNumber();
				max = GetMaxNumber();
				
				for (int i = 1 ; i < ListNumber.length; i++) {
					
					if (ListNumber[i] > min && ListNumber[i]<max) {
						Mynumber.add(ListNumber[i]);
					 
					}
				}
				
				
				return Mynumber;
				
			}
			
		}
		@Test
		public void Check_GetMinNumber ()
		{
			// Arrange
			
			int [] numbers = {1,3,5,8,9,4};
			Mynumber mynum = new Mynumber(numbers);
			 //Action 
			
			int min = mynum.GetMinNumber();
			
			Assert.assertEquals(1, min);
			
		}
		@Test
		public void Check_GetMaxNumber()
		{
			int [] numbers = {1,3,5,8,9,4};
			Mynumber mynum = new Mynumber(numbers);
			 //Action 
			
			int max = mynum.GetMaxNumber();
			
			Assert.assertEquals(9, max);
		}
		@Test
		public void Check_GetDistanceMinMax() 
		{
					
			//Arrange
			int [] numbers = {1,3,5,8,9,4};
			 
			Mynumber mynum = new Mynumber(numbers);
			//Action
			
			ArrayList MyArr = new ArrayList();
			MyArr = mynum.GetDistanceMinMax();
			
			//Assertion
			
			Assert.assertEquals(4,MyArr.size());
			
			
		}
}
