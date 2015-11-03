package basic

/**
  * This creates a singleton object. It declares a class HelloWorldObject and an instance
  * of that class. The instance is created the first time it is used.
  */
object HelloWorldObject {
  def main(args: Array[String]) {
    println("Hello Scala object");
  }
}
