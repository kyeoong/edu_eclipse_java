package och08_ex01;

public class ShapeEx {
	
	static void action(Shape shape) {
		shape.print();
		shape.draw();
//		if(shape instanceof Triangle) {
////			Triangle tri  = (Triangle) shape;
////			tri.print();
////			tri.draw();
//		}
		if(shape instanceof Rectangle ) {
			Rectangle rec = (Rectangle) shape;
//			rec.print();
//			rec.draw();
			rec.display();
		}
//		if(shape instanceof Circle) {
//			Circle cir = (Circle) shape;
////			cir.print();
////			cir.draw();
//		}
			
	}

	public static void main(String[] args) {
		// HW  -> Robot 공부
		// 결과 화면
//		------선과 점으로 구성됐다.-------
//		삼..각형을 그린다
//		------선과 점으로 구성됐다.-------
//		사각형을 그린다
//		Rectangle 사각형 Display을 그린다
//		------선과 점으로 구성됐다.-------
//		원...을 그린다
		
		Shape[] shape = new Shape[3];
		shape[0] = new Triangle();
		shape[1] = new Rectangle();
		shape[2] = new Circle();
		
		for (Shape kk : shape) {
			action(kk);
		}
		
		for( Shape s : shape) {
			s.print();
			s.draw();
			if (s instanceof Rectangle) {
				((Rectangle)s).display();
			}
		}

	}

}
