//n Fakultet med while - løkke
public class fakultet{
	public static void main(String[] args) {
		int n = 4; //Heltall
		int b = 1;
		while(n>1) {
			b *=n;
			n--;
		}
		System.out.println(b);
	}
}