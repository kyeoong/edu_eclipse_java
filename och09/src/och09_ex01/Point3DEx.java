package och09_ex01;

class Point3D {
	int x,y,z;
	
	public Point3D(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public boolean equals(Point3D p3d) {
		// TODO Auto-generated method stub
		// return super.equals(obj);
		boolean result = false;
		if( x == p3d.x && y == p3d.y ) result = true;
		
		return result;
	}
	
	@Override
	public String toString() {  // 객체의 값을 볼 수 있다
		// TODO Auto-generated method stub
		// return super.toString();
		String showStr = "[x = " + x + ", y = " + y + ", z = " + z + "]";
		return showStr;
	}
	
}





public class Point3DEx {

	public static void main(String[] args) {
		Point3D pd1 = new Point3D(1, 2, 3);
		Point3D pd2 = new Point3D(1, 2, 4);
		Point3D pd3 = new Point3D(1, 2, 5);
		
		if(pd1.equals(pd2)) System.out.println("pd1.equals(pd2) 같다");
		else 				System.out.println("pd1.equals(pd2) 다르다");
		
		if(pd1 == pd2)		System.out.println("pd1 == pd2 같다");
		else				System.out.println("pd1 == pd2 다르다");
		
		System.out.println(pd1);  // 해시코드가 나온다
		System.out.println(pd2);
		System.out.println(pd3);
	}

}
