fun main() {
    val calculator = Calculator()

    print("Type the first number: ")
    val numA = readlnOrNull()?.toInt()

    print("Type the second number: ")
    val numB = readlnOrNull()?.toInt()

    val result = calculator.plus(numA!!, numB!!)

    print("The result is $result")
}
