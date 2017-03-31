package basic

object TupleFlatMapTest {
  def main(args: Array[String]): Unit = {
    val links = List(
      ("MapR", (List("Baidu", "Blogger"), 1)),
      ("Baidu", (List("MapR"), 2)),
      ("Blogger", (List("Google", "Baidu"), 3)));

    val flattened = links.flatMap { case (url, (links, rank)) => links };

    println(flattened);
  }
}
