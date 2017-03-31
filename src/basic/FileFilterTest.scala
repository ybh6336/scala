package basic

import java.io.{FileFilter, File}

object FileFilterTest {
  def main(args: Array[String]) : Unit = {
    val file = new File("/Users/yogeshbhardwaj/workspace/get-shipperconnect/rtt/rtt_src/rtt/webapp/target/web/rjs/build/scripts")
    //file.listFiles().foreach(f => println(f.getName()))
    //val filtered = file.listFiles().filter(f => !f.getName().equals("app.js"))
    val filtered = file.listFiles(new FileFilter {
      def accept(file: File) = !file.getName.equals("app.js")
    })
    filtered.foreach(f => println(f.getName()))
  }
}
