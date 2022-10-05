package classes;

public class Main {

	public static void main(String[] args) {
		
		//Reference Type
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		//Value Type
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		//Reference Type
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2=sayilar1;
		sayilar1[0]=30;
		System.out.println(sayilar2[0]);

	}

}
