package och08_ex01;

public abstract class Shape {
	int a = 3;
	abstract void draw();
	void print() {
		System.out.println("-------------선과 점으로 구성됐다--------------");
	}
}

class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("사각형을 그린다");
		
	}
	
	void display() {
		System.out.println("Rectangle 사각형 Display를 그린다");
	}
}

class Triangle extends Shape {

	@Override
	void draw() {
		System.out.println("삼각형을 그린다");
		
	}
	
}

class Circle extends Shape {

	@Override
	void draw() {
		System.out.println("원을 그린다");
		
	}
	
}