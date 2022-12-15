
public class alternate {

	public static void main(String[] args) {
		int[] arr1= {10,20,30,40,50,60,70,80,90,100};
		int[] arr2=new int[5];
		int index=0;
		int sum = 0;
		for(int i =0; i<arr1.length;i=i+2) {
			arr2[index++]=arr1[i];
			}
		for(int i = 0; i<arr2.length;i++) {
			sum+=arr2[i];
			}
		System.out.print(sum);
		
	}

}
