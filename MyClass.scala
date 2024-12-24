```scala
class MyClass(val x: Int) {
  def this() = this(0) // This is perfectly valid
}

val myObj = new MyClass()
println(myObj.x) // Output: 0

//Let's modify it slightly:
class MyClass2(val x: Int, val y:Int = 1){
  def this(x: Int) = this(x,2)
}

val myObj2 = new MyClass2(5)
println(myObj2.x) //Output: 5
println(myObj2.y) //Output: 2

// This is still fine. But if we change it a little bit more:
class MyClass3(val x: Int, val y:Int = x){
  def this(x: Int) = this(x, x + 1)
}

val myObj3 = new MyClass3(5)
println(myObj3.x) // Output: 5
println(myObj3.y) // Output: 6
```