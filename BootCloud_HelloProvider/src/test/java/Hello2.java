class Hello2 extends  Hello {
   public Hello2(){
       System.out.println("b");
   }
   {
       System.out.println("b.x");
   }
   static {
       System.out.println("static b");
   }
public static void main(String [] args){
       new Hello2();
}

}
