import java.util.concurrent.{LinkedBlockingQueue, ThreadPoolExecutor, TimeUnit}

import akka.actor.Actor

object MessagePassingOverThreads {

  val message1 = "HeLLo WORld"

  val message2 = "hEllo worlD"

  class Test(obj: String) extends Thread {
    override def run(): Unit = {
      Thread.sleep(1000)
      println(s"${Thread.currentThread().getName} ${obj.toLowerCase}")
    }
  }

  def threadInvocations(): Unit = {
    val t1 = new Test(message1)
    val t2 = new Test(message2)
    t1.start()
    t2.start()
  }

  def threadPolling(): Unit = {
    val tp = new ThreadPoolExecutor(1,5,500, TimeUnit.MILLISECONDS, new LinkedBlockingQueue[Runnable]())
    tp.submit(new Runnable {
      override def run(): Unit = {
        Thread.sleep(1000)
        println(s"${Thread.currentThread().getName} ${message1.toLowerCase}")
      }
    })
    println(s"${Thread.currentThread().getName} Sent message to ThreadPool")
    tp.submit(new Runnable {
      override def run(): Unit = {
        Thread.sleep(1000)
        println(s"${Thread.currentThread().getName} ${message2.toLowerCase}")
      }
    })
  }

  class Test2 extends Actor {
    
  }

  def main(args: Array[String]): Unit = {
    //threadInvocations()
    threadPolling()
  }
}