object HelloWorld {
	def main(args: Array[String]): Unit = {
		println("Hello World")
	}
}

object MyMath extends App {
	def myProduct(num1: Int, num2: Int): Int = {
		return num1 * num2
	}

	def myProduct2(nums: Array[Int]): Int = {
		var res = 1

		nums.foreach(res *= _)

		return res
	}

	println(myProduct(10, 20))
}

object Main {

	import MyMath._

	def main(args: Array[String]) {
		var nums = Array(1, 2, 3, 4)

		println(myProduct2(nums))

		for(num <- nums) {
			println(num)
		}
	}
}