package javaPrograms;

public class Local_Global {
	  static int a;  // need not to initialize global variables
	  int b=30;
	  public static void main(String[] args)
	  {
		  int b=20;    // local variables should be initialized
		  System.out.println(b);  // prints value as 20
		  System.out.println("################");
		  Local_Global rv1= new Local_Global();
		  System.out.println(rv1.b);   // since it is a non static variable create a instance of it
		  System.out.println(Local_Global.a);  // since it is a static variable we have to class using class name
		  System.out.println("################");
		  rv1.move();
	  }
	  public void move()
	  {
		  int c=30;
		  System.out.println(c);  // prints value as 30
		  Local_Global rv2= new Local_Global();
		  System.out.println(rv2.b);
		  System.out.println(this.b); // this represents current obj in execution
		  // this represents non static variable.
		  
	  }

	}

