object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(40); 
	def test_func(a: Int) = a;System.out.println("""test_func: (a: Int)Int""");$skip(14); val res$0 = 
	test_func(1);System.out.println("""res0: Int = """ + $show(res$0));$skip(30); 
	
  val test_test(b: Int) = b;System.out.println("""b  : Int = """ + $show(b ))}
}
