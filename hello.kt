/* 
    The first hello world app for kotlin tutorials
*/

fun main(args:Array<String>) {
// Enter user name
    print("Enter name: ")
    var name = readLine()
// Enter user age
    print("Enter age: ")
    var age:Int = readLine()!!.toInt()
// Enter user department
    print("Enter department: ")
    var dep:String?
    dep = readLine()
// Enter number of pi
    print("Enter pi: ")
    var pi:Double = readLine()!!.toDouble()

    println("\n*******output*******\n")
    println("name: " + name)
    println("age: " + age)
    println("department: " + dep)
    println("pi: " + pi)

}
