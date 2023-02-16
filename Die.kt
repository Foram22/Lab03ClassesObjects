import kotlin.random.Random

class Die (var type: String = "d6", var sides: Int = 6, var currentSide: Int = 1){

    // 0 argument constructor
    init() {
        roll()
    }

    // 1 argument constructor
    constructor(sides: Int) : this("d$sides", sides)

    // 2 argument constructor
    constructor(sides: Int, type: String) : this(sides, type, 1)

    // Function to get Random integer and set it to currentSide.
    fun roll() {
        currentSide = Random.nextInt(1, sides + 1)
    }
}
