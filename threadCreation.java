class mythread1 extends Thread
{
   public void run()
      {
        //for(int i=0;i<5;i++)
        System.out.println("Hello word 2");
        mythread t2=new mythread();
        t2.start();
      }
}
class mythread extends Thread
{
   public void run()
      {
       // for(int i=0;i<10;i++)
        System.out.println("Hello word 1");
      }
}
public class threadCreation
{
   public static void main(String[] atgs)
     {
  // object for the thread class 
         mythread t1=new mythread();
         t1.start();
         mythread1 t2=new mythread1();
         t2.start();

         // the way to get the name of thread
         System.out.println(t1.getName());
          // The way of set the name
         t1.setName("neeraj-thread");
         System.out.println(t1.getName());
    } 
}
