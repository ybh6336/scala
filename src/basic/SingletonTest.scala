package basic

object SingletonTest {
  def main(args: Array[String]) {
    val counter = SingletonObject.getCounter();
    // this (prepending s) is called String Interpolation
    println(s"counter = $counter");
    SingletonObject.incrementCounter();
    val incrementedCounter = SingletonObject.getCounter();
    println(s"after incrementing, counter = $incrementedCounter");
  }
}
