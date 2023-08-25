package oops;


		// TODO Auto-generated method stub
		class Shape {
		    void draw() {
		        System.out.println("Drawing a shape");
		    }
		}

		class Circle extends Shape {
		    @Override
		    void draw() {
		        System.out.println("Drawing a hgdgcircle");
		    }
		}

		class Square extends Shape {
		    @Override
		    void draw() {
		        System.out.println("Drawing a square");
		    }
		}

		public class Polymorphism {

			public static void main(String[] args) {
		        Shape shape1 = new Circle();
		        shape1.draw();
		        

		        Shape shape2 = new Square();
		        shape2.draw();
		    }
		
	}


