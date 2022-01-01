package dec29;

public class dec29 {
	//reverse number __________[1st problem]______________________________________________***
	
	public static void reverse(int num) {
		if(num==0) {
			System.out.println();
		}else {
			System.out.print(num%10);
			reverse(num/10);
			
		}
	}
	
//recursive binary search___________[2nd problrm]_________________________________________***
	
	public static void search(int[] arr2,int start,int end ,int t) {
		
		if(start<=end) {
			int mid=start+(end-start)/2;
			
			if(t==arr2[mid]) {
				System.out.println("number is : "+mid);
			}else if(t>arr2[mid]) {
				start=mid+1;
				search(arr2, start, end, t);
			}else {
				end=mid-1;
				search(arr2, start , end, t);
			}
				
		}
		
	}
	
	
	

	public static void main(String[] args) {
		
		reverse(1234);
//_______________________________________________________________________________________***
		
		int[] arr2= {1,3,21,4,65,34,83,87};
		int start=0;
		int end=arr2.length;
		int t=87;
		
		
		
		search(arr2, start, end, t);


    

   
	}
}
