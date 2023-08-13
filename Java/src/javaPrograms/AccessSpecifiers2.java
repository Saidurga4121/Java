package javaPrograms;

public class AccessSpecifiers2 {

	public static void main(String[] args)
    {
    			AccessSpecifiers2.acs2m1();
    			AccessSpecifiers2.acs2m2();
    			AccessSpecifiers2.acs2m3();
    }
    static AccessSpecifiers1 rv1=new AccessSpecifiers1();
	
    public static void acs2m1()
    {
		 // even if it is a static variable,it should be accessed through class reference
         System.out.println(AccessSpecifiers1.a); 
         System.out.println(rv1.Name); // Non-static objects can't access in a static methods
         //System.out.println(b); // private variable can be accessed only in the specific class
         System.out.println(AccessSpecifiers1.results);
    }
   
    private static void acs2m2()
    {
        System.out.println(AccessSpecifiers1.a);
        System.out.println(rv1.Name); // Non-static objects can't access in a static methods
        // System.out.println(b); // private variable can be accessed only in the specific class
        System.out.println(AccessSpecifiers1.results);           
    }
   
    static void acs2m3()
    {
        System.out.println(AccessSpecifiers1.a);
        System.out.println(rv1.Name); // Non-static objects can't access in a static methods
        // System.out.println(b); // private variable can be accessed only in the specific class
        System.out.println(AccessSpecifiers1.results);           
    }
}
