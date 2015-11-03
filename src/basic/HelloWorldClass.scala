package basic

/**
  * This code cannot directly be executed (there will not be an option to run) if
  * HelloWorldClass is not accompanied with a companion object and the method
  * main is included directly inside the class.
  *
  * Note that, unlike in Java, main is not declared as static. Scala does not have
  * static members. The object HelloWorldClass, which is singleton, is used to
  * declare such members.
  */
class HelloWorldClass {

}

object HelloWorldClass {
  def main(args: Array[String]) {
    println("Hello Scala class...er object");
  }

  // the following syntax (with an = for method definition) also works
  /*def main(args: Array[String]) = {
    println("Hello Scala class...er object");
  }*/
}
