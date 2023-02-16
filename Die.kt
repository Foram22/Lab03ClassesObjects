import kotlin.random.Random

class Die (var type: String = "d6", var sides: Int = 6, var currentSide: Int = 3){

    init() {
        roll()
    }

    fun roll() {
        currentSide = Random.nextInt(1, sides + 1)
    }
}
