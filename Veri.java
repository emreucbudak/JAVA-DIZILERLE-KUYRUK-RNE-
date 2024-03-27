package queue;

public class Veri {

	public static void main(String[] args) {
		Kuyruk dizim = new Kuyruk(6);
		dizim.ekle(45);
		dizim.ekle(36);
		dizim.yazdir();
		dizim.cikar();
		dizim.yazdir();
		dizim.ekle(89);
		dizim.cikar();
		dizim.yazdir();
		dizim.bosKontrol();
		dizim.fullKontrol();

	}

}
