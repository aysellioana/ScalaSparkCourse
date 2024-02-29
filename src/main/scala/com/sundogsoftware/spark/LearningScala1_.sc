// VALUES are immutable constants.
val hello: String = "Hola!"

//VARIABLRD are mutable
var helloThere: String = hello
helloThere = hello + " There!"
println(helloThere)

val immutableHelloThere = hello + " There!"
println(immutableHelloThere)

//Data types
val numberOne: Int = 1
val truth: Boolean = true
val letterA: Char = 'a'
val pi: Double = 3.141592
val piSinglePrecision: Float = 3.1415932f
val bigNumber: Long = 123456789
val smallNumber: Byte =127

println("Here is a mess: " + numberOne +  truth + letterA + pi + bigNumber)

println(f"Pi is about $piSinglePrecision%.3f")
println(f"Zero padding on the left: $numberOne%05d")

println(s"I can use the s prefix to use variables like $numberOne $truth $letterA")

println(s"The s prefix isn t limited to variables; I cand include  any expression. Like ${1+2}")

val theUltimateAnswer: String = "To life, the universe, and everything is 42 ."
val pattern = """.* ([\d]+).*""".r
val pattern(answerString) = theUltimateAnswer
val answer = answerString.toInt
println(answer)

//Booleans
val isGreter = 1 > 2
val isLEsser = 1 < 2
val impossible = isGreter & isLEsser
val anotherWay = isGreter || isLEsser

val picard: String = "Picard"
val bestCaptain: String = "Picard"
val isBest: Boolean = picard == bestCaptain


