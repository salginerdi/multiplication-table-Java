
public class WorkSpace {

	public static void main(String[] args) {
		// Çarpım tablosu yapımı
		// İç içe for döngüsü kullanacağız

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
			System.out.println("------------------------------------------------");
		}
	}

}
