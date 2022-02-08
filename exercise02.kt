import java.io.File

data class Person(val name: String, val age: Int, var mother: Person?)

fun main(args: Array<String>) {


  var peopleMap =
    mapOf<String, Person>("God" to Person("God", Int.MAX_VALUE, null))
  var people = File("./genealogy.txt")
    .readLines()
    .map({
      val row = it.split("\t")
      val p = Person(row[0], row[1].toInt(), null)
      peopleMap += p.name to p
      val m = peopleMap[row[2]]
      if (m != null) {
        p.mother = m
      }
      p
    })
  println(people)
}
