import kotlin.random.Random

class Die (var type: String = "d6", var sides: Int = 6, var currentSide: Int = 3){

    init() {
        roll()
    }

    contructor(sides: Int) : this("d$sides", sides)

    construcor(sides: Int, type: String) : this(type, sides, 1)

    fun roll() {
        currentSide = Random.nextInt(1, sides + 1)
    }
}
