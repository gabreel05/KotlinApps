import kotlin.math.pow

class BMI {
    fun calculate(weight: Double, height: Double): Double {
        return weight / height.pow(2)
    }
}
