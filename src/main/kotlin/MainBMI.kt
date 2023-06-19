fun main() {
    val bmi = BMI()

    while (true) {
        print("\nType the weight: ")
        val weight = readlnOrNull()?.toDouble()

        print("Type the height: ")
        val height = readlnOrNull()?.toDouble()

        when (bmi.calculate(weight!!, height!!)) {
            in Double.MIN_VALUE.rangeTo(18.5) -> print("Very underweight")
            in 18.6.rangeTo(24.9) -> print("Ideal weight")
            in 25.0.rangeTo(29.9) -> print("Slightly overweight")
            in 30.0.rangeTo(34.9) -> print("Grade 1 obesity")
            in 35.0.rangeTo(39.9) -> print("Grade 2 obesity")
            in 40.0.rangeTo(Double.MAX_VALUE) -> print("Grade 3 obesity")
        }
    }
}
