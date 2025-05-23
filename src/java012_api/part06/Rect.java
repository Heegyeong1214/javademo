package java012_api.part06;

public class Rect implements Cloneable{
	int width;
	int height;
	
	public Rect() {
		
	}
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int getArea() {
		return width * height;
	}
	
	
    public Rect clone() {
    	Rect obj =null;    	
    	try {
			obj = (Rect)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}    	
    	return obj;
    }
}






