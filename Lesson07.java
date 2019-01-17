import java.util.ArrayList;
import java.util.Random;

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
			public int ListNumber;
		
			public Mynumber (int  numbers) 
			
			{
				this.ListNumber = numbers;
			}
			
			public void  GetMinNumber() 
			{
				ArrayList<Integer> ArrayList = new ArrayList<Integer>();
				
				for (int i = 0; i < numbers; i++);
				{
					ListNumber = Math.min(max, min);
					
					ArrayList.add(ListNumber);
					
				}
			
			}
			
			public void GetMaxNumber() 
			{
				ArrayList<Integer> ArrayList = new ArrayList<Integer>();
				for (int i = 0; i < numbers; i++);
				{
					ListNumber = Math.max(max, min);
					
					ArrayList.add(ListNumber);
					
				}
			}
		}
}
	

