package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj ="Bugün hava güneşli";
		System.out.println(mesaj);
		String yeniMesaj = sehirVer();
		System.out.println("Benim Memleketim " + yeniMesaj);
		int sayi = topla(5,7);
		System.out.println("Sayıların Toplamı = " + sayi);
		int toplam = topla2(2,1,7,9,8);
		System.out.println(toplam);
		

	}
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	public static String sehirVer() {
		return "Giresun";
	}
	public static int topla(int sayi1,int sayi2) {
		return sayi1 + sayi2;
	}
	
	//Variable Arguments
	
	public static int topla2(int... sayilar) {
		int toplam=0;
		for (int sayi : sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	
	
	
	

}
