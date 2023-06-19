fun main() {
    val calculator = Calculator()

    while (true) {
        print("\nType the operation (+, -, *, /) or '0' to exit: ")
        val input = readlnOrNull()

        if (input.equals("0"))
            break

        print("Type the first number: ")
        val numA = readlnOrNull()?.toInt()

        print("Type the second number: ")
        val numB = readlnOrNull()?.toInt()

        val result = when (input) {
            "+" -> calculator.plus(numA!!, numB!!)
            "-" -> calculator.minus(numA!!, numB!!)
            "*" -> calculator.times(numA!!, numB!!)
            "/" -> calculator.div(numA!!, numB!!)
            else -> null
        }

        if (result != null) print("The result is $result") else print("Invalid operation")
    }
}
