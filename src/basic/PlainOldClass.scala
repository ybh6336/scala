package basic

class PlainOldClass(stringField: String, intField: Int) {
  def getStringField = stringField

  def getIntField = intField

  def powerOfIntField(power: Int): Int = {
    Math.pow(intField, power).toInt
  }
}
