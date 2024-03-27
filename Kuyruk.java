package queue;

public class Kuyruk {
	int[] dizi;
	int front = 0;
	int rear = -1;
	int boyut;
	int adim;
	public Kuyruk(int x) {
		this.boyut = x;
		adim = -1;
		dizi = new int[boyut];
		front = dizi[0];
	}
	void ekle(int a) {
		if (adim == boyut) {
			System.out.println("Dizi Dolu!");
		}
		else {
			adim++;
			rear++;
			dizi [adim] = a;
			System.out.println("Eleman Eklendi!");
			
		}
	}
	void yazdir() {
		int a = -1;
		while (a<adim) {
			a++;
			System.out.println("------------->" + dizi[a]);
		}
	}
	void cikar() {
		int b = 0;
		while (b<adim)
			b++;
			dizi[b-1] = dizi[b];
			adim--;
			System.out.println("Eleman Çıkarıldı!");


		}
	void fullKontrol() {
		if (adim == boyut) {
			System.out.println("Kuyruk Dolu!");
		}
		else {
			System.out.println("Kuyrukta boşluk var");
		}

	}
	void bosKontrol() {
		if (rear == 0) {
			System.out.println("Kuyruğun Boş!");
		}
		else {
			System.out.println("Kuyruğunda eleman var!");
		}
	}

}
