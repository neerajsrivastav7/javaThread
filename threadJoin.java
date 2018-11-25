/*
   join methode wiil be used if you want to put the calling methode in waitting state 
   let there are two thread t1 and t2 and t1 is running . if you want to stop the thread t1 and execute t2 then you can write t2.join() in such case t2 thread will call and it will exe
*/
class mythread extends Thread
{
    public void run()
     {
        for(int i=0;i<10;i++)
          {
             System.out.println("Hello Thread1");
             try
                {
                   Thread.sleep(2000);// The thread will sleep for 2000 milisecond
                }
              catch(Exception e)
               {
                  System.out.println(e.toString());
               }
          }
     }
}
public class threadJoin
{
   public static void main(String[] args) throws InterruptedException// This is the checked exception for join methode 
      {
          mythread t=new mythread();
          t.start();
           /*
               This is the calling thrad so this thread will wait until the t thread wiil dead
           */
          t.join();
          for(int i=0;i<5;i++)
            {
               System.out.println("Hello thread2");
            }
      }
}
