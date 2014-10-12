object prod {
  
   
 
  
 
  
  def mapReduce(f: Int => Int)(a: Int, b: Int)(neutral: Int)(operator: (Int, Int) => Int): Int =
    if(a > b) neutral
    else operator(f(a), mapReduce(f)(a +  1, b)(neutral)(operator))
                                                  //> mapReduce: (f: Int => Int)(a: Int, b: Int)(neutral: Int)(operator: (Int, Int
                                                  //| ) => Int)Int
    mapReduce(x => x)(1, 4)(1)((x, y) => x * y)   //> res0: Int = 24
    
  def product(f: Int => Int)(a: Int, b: Int): Int =
    mapReduce(f)(a,b)(1)((x,y) => x *y)           //> product: (f: Int => Int)(a: Int, b: Int)Int
    
  product(x =>  x)(1, 3)                          //> res1: Int = 6
  
  def factorial(n: Int): Int =
    product(x => x)(1, n)                         //> factorial: (n: Int)Int
  
  factorial(4)                                    //> res2: Int = 24
}