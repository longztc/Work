class People (
  val id: String,
  val name: String
)

class Order (
  val owner: People,
  val amount: Int
)

object MyOrder {
  def main(args: Array[String]): Unit = {
    
    object p1 extends People("1", "Tiancong")

    object o1 extends Order(p1, 2)

    println(o1.owner.name)
  }
}