package Activity2;

public class Activity02 {
	public static void main (String[] args) {
		Activity02 actObj=new Activity02();
		
	
	int[] nums={10,77,10,54,-11,10};
	int searchNum=10;
	int fixedSum=30;
	
	System.out.println("Result:" +actObj.result(nums,searchNum,fixedSum));
	}
	public boolean result(int[] nums,int searchNum,int fixedSum) {
		int tempSum=0;
		for(int number :nums) {
			if(number == searchNum);{
			tempSum += searchNum;
		}
		
		if(tempSum>fixedSum) {
			break;
		}
	}	
		
		return fixedSum==tempSum;
		
	}

}
