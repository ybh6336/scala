package basic

/**
  * Refer to the following threads
  *
  * https://stackoverflow.com/questions/25468047/how-to-turn-off-scala-auto-completion-of-function-with-unit-return-type-in-intel
  * https://stackoverflow.com/questions/9461880/should-i-use-unit-or-leave-out-the-return-type-for-my-scala-method
  *
  * for a discussion about method definition (: Unit / Int = vs = vs no =).
  * Bottomline is that ': Unit / Int =' might be the only acceptable syntax eventually.
  *
  * A Google search of 'scala what is unit' unveils this:
  *   Unit is a subtype of scala.AnyVal. There is only one value of type Unit, (), and it is not represented by any
  *   object in the underlying runtime system. A method with return type Unit is analogous to a Java method which is
  *   declared void.
  */
object SingletonObject {
  private var counter: Int = 0

//  def getCounter(): Int = {
//    counter;
//  }

  /**
    * a parameterless method can be written without parenthesis
    * @return
    */
  def getCounter: Int = {
    counter
  }


  def incrementCounter(): Unit = {
    counter += 1
  }
}
