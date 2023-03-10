// Foramben Jayeshkumar Patel
// Student ID:-  A00272251
/*  Program Description: This is small kotlin command line program based on classes and objects. In this program, I am going to create 
                         dice using contructor of Die class and display results. */
import Die
import kotlin.random.Random
class DiceGame {

    fun run() {
        // Create Dice
        println("Creating a default d6...")
        val d6 = Die()
        // Printing the cureent side up for newly created dice d6 before rolling.
        println("The current side up for ${d6.type} is ${d6.currentSide}")

        // Create Dice
        println("Creating a d22...")
        val d22 = Die(22)
        // Printing the cureent side up for newly created dice d22 before rolling.
        println("The current side up for ${d22.type} is ${d22.currentSide}")

        // Create Dice
        println("Creating Tetrahedron die (a special d4)...")
        val d10 = Die(10, "Tetrahedron")
        // Printing the cureent side up for newly created dice Tetrahedron before rolling.
        println("The current side up for ${d10.type} is ${d10.currentSide}")

        println("\nTesting the roll method...")

        // Roll Dice
        println("\nRolling the ${d6.type}...")
        d6.roll()
        // Printing the cureent side up for dice d6 after rolling.
        println("New current side up for ${d6.type} is ${d6.currentSide}")

        println("Rolling the ${d22.type}...")
        d22.roll()
        // Printing the cureent side up for dice d22 after rolling.
        println("New current side up for ${d22.type} is ${d22.currentSide}")

        println("Rolling the ${d10.type}...")
        d10.roll()
        // Printing the cureent side up for dice Tetrahedron after rolling.
        println("New current side up for ${d10.type} is ${d10.currentSide}")

        // Set the cureent side of dice d20 to 20
        println("\nSetting the ${d22.type} to show 22...")
        d22.currentSide = 22
        println("The side up is now ${d22.currentSide}.")

        println("\nCreating five d6...")
        var count = 0
        var matched = false
        while(!matched){
            count++
            val dice = Array(5) { (1..6).random() }
            matched = dice.all { it == dice[0] }
        }
        println("It took $count rolls.")
    }
}

fun main() {
    val diceGame = DiceGame()
    diceGame.run()
}