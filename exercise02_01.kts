data class Person(val name: String, val age: Int, val mother: Person?)
val name = "Jonas"
val age = 24
val person = Person(name, age, Person("mum", 50, null))

println(person)


