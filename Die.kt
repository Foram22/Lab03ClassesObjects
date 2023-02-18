import kotlin.random.Random

class Die {

    var type: String = "d6"
    var sides: Int = 6
    var currentSide = 1
    // var currentSide = roll()

    // 0 argument constructor
    constructor() {
        this.type = "d6"
        this.sides = 6
        roll()
    }

    // 1 argument constructor
    constructor(sides: Int) {
        this.type = "d$sides"
        this.sides = sides
        roll()
    }

    // 2 argument constructor
    constructor(sides: Int, type: String) {
        this.type = type
        this.sides = sides
        roll()
    }

    // Function to get Random integer and set it to currentSide.
    fun roll() {
        currentSide = Random.nextInt(1, this.sides + 1)
    }
}
