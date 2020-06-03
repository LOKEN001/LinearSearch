
public class LinearSearch {

	public static void main(String[] args) {
		int arr []= {10,20,30,40,50,60};
		int search_ele = 60;
		boolean flag = false;
		for(int i = 0 ; i<arr.length; i++) {
			if(search_ele == arr[i]) {
				System.out.println("Element found at: "+(i+1));
				flag = true;
				break;
			}
		}
		if(flag == false) {
			System.out.println("Element not found");
		}

	}

}
