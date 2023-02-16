// Foramben Jayeshkumar Patel
// Student ID:-  A00272251
/*  Program Description: This is small kotlin command line program based on classes and objects. In this program, I am going to create 
                         dice using contructor of Die class and display results. */

class DiceGame {

    fun run() {
        // Create Dice
        println("Creating a default d6...")
        val d6 = Die()

        println("Creating a d20...")
        val d22 = Die(22)

        println("Creating Tetrahedron die (a special d4)...")
        val d10 = Die(10, "Tetrahedron")

        // Printing the cureent side up for all newly created dice before rolling.
        println("The current side up for ${d6.type} is ${d6.currentSide}")
        println("The current side up for ${d20.type} is ${d20.currentSide}")
        println("The current side up for ${d10.type} is ${d10.currentSide}")

        println("Testing the roll method")

        // Roll Dice
        println("Rolling the ${d6.type}...")
        d6.roll()

        println("Rolling the ${d20.type}...")
        d20.roll()

        println("Rolling the ${d10.type}...")
        d10.roll()

        // Printing the cureent side up for all newly created dice after rolling.
        println("New current side up for ${d6.type} is ${d6.currentSide}")
        println("New current side up for ${d20.type} is ${d20.currentSide}")
        println("New current side up for ${d10.type} is ${d10.currentSide}")

    }
}