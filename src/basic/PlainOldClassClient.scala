package basic

object PlainOldClassClient {
  def main(args: Array[String]): Unit = {
    val plainOldClass = new PlainOldClass("string", 10)
    println("stringField = " + plainOldClass.getStringField)
    println("intField" + plainOldClass.getIntField)
    println("intField ^ 2 = " + plainOldClass.powerOfIntField(2))
  }
}
