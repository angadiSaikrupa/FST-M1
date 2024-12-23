package Activity2;

abstract class Book{
	String title;
	public abstract void setTitle(String title);
	public String grtTitle() {
		return this.title;
		
	}
}
class MyBook extends Book {
	public void setTitle(String title) {
		this.title =title;
		
		
		
	}
}
class MyBook2 extends Book {
	public void setTitle(String title) {
		if(title.length()<3) {
			System.out.println("Title is too small");
		}else {
			this.title=title;
			
			
		}
	}
	
}
public class Activity5 {
	public static void main(String[] args) {
		MyBook bookObj=new MyBook();
		bookObj.setTitle("percy Jackson and the lighting Thief");
	
	}

}
