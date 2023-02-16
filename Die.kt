import kotlin.random.Random

class Die {

    var type: String = "d6"
    var sides: Int = 6
    var currentSide: Int = roll()

    // 0 argument constructor
    constructor() {
        this.type = "d6"
        this.sides = 6
        this.currentSide = roll()
    }

    // 1 argument constructor
    constructor(sides: Int) {
        this.type = "d$sides"
        this.sides = sides
        this.currentSide = roll()
    }

    // 2 argument constructor
    constructor(sides: Int, type: String) {
        this.type = type
        this.sides = sides
        this.currentSide = roll()
    }

    // Function to get Random integer and set it to currentSide.
    fun roll() {
        currentSide = Random.nextInt(1, sides + 1)
    }
}
