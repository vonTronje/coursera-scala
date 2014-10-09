package greeter

object hello_worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 
  println("Welcome to the Scala worksheet");$skip(11); 
	val x = 1;System.out.println("""x  : Int = """ + $show(x ))}
}
