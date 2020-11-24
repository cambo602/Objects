package objectClass;


public class Rect {

	int length;
	int width;
	char colour;
	
	public Rect(int l, int w, char c) {
		this.length = l;
		this.width = w;
		this.colour = c;
	}

	public void drawRect() {
		
		int l = this.length;
		int w = this.width;
		char c  = this.colour;
		
		for (int i = 0; i < w; i++) {
			System.out.print("@ ");
		}
		
		for (int i = 0; i < l-2; i++) {
			System.out.print("\n@ ");
			
			for (int j = 0; j < w-2; j++) {
				System.out.print(c + " ");
			}
			
			System.out.print("@");
		}
		
		System.out.print("\n");
		
		for (int i = 0; i < w; i++) {
			System.out.print("@ ");
		}
		
	}
}
