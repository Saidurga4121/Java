package javaPrograms;

public class AccessSpecifiers1 {
    //Global Variables
        public static  int a=10;
        protected String Name="Naresh";
        private static double b=12.75;
        static boolean results=true;
       
        public static void main(String[] args)
        {
        			AccessSpecifiers1.acs1m1();
        			AccessSpecifiers1.acs1m2();
        			AccessSpecifiers1.acs1m3();
        }
        public static void acs1m1()
        {
        	// AccessSpecifiers1 rv1= new AccessSpecifiers1();
            System.out.println(a);
            // System.out.println(Name); // Non-static objects can't access in a static methods
            System.out.println(b);
            System.out.println(results);
            System.out.println("*******************************");
        }
       
        private static void acs1m2()
        {
        	
            System.out.println(a);
            // System.out.println(Name); // Non-static objects can't access in a static methods
            System.out.println(b);
            System.out.println(results);        
            System.out.println("*******************************");
        }
       
        static void acs1m3()
        {
            System.out.println(a);
            //System.out.println(Name); // Non-static objects can't access in a static methods
            System.out.println(b);
            System.out.println(results);           
        }

}