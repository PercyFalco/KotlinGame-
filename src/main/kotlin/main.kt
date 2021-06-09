import javax.print.attribute.IntegerSyntax

fun main() {
    //Enemy's
    val redTron = Enemy("Red Tron", 15, 9)
    //println(redTron)

    //redTron.takeDamage(5)
    //println(redTron)

    val yellowTron = Enemy("Yellow Tron", 30, 1)
   // println(yellowTron)

    //yellowTron.takeDamage(30)
    //println(yellowTron)


    //First Part of the story (Part 1)
    println("You wake up on a sunny morning and decide to go to the arcade.\n" +
            "You grab your bike and cycle to your friends to see if they are awake yet.\n" +
            "You are standing at the door of your best friend(Darian).\n" +
            "You knock and hear someone coming down the stairs after a few seconds the door was opened.\n" +
            "It was Darian. you decided together to pick up 1 more friend and the three of you to spend your pocket money on old dusty arcade machines.\n" +
            "You cycle together to the last friend (Mason).\n" +
            "You ring the bell and hear a rumble coming from the kitchen. \"I'm coming\" you hear Mason yell. \n" +
            "After a few seconds the door is opened. \"I'll grab my money and then I'll be there 2 minutes\".\n" +
            "4 minutes later Mason walks out with a bag of change.\n" +
            "You get on your bike and cycle to the arcade as fast as possible so that you are the first to play on the new arcade machine.\n" +
            "Type next to continue."
    )
    var line : String?
    line = readLine()!!.toLowerCase()

    while (line != "next"){
        println("Wrong input please try again.")
        line = readLine()!!.toLowerCase()
    }    ////Second Part of the story (Part 2)
        println("Once arrived at the arcade.\n" +
                "You exchange your pocket money into arcade tokens.\n" +
                "You walk searching for the location of the new arcade machine.\n" +
                "As you walk in the right direction you come across several other games like Pacman, Donkey Kong etc.\n" +
                "In the end of the aisle there were lights aimed at a machine.\n" +
                "it was the new arcade machine Tron.\n" +
                "Type next to continue")
        line = readLine()!!.toLowerCase()

    while (line != "next"){
        println("Wrong input please try again.")
        line = readLine()!!.toLowerCase()
    }   //Third Part of the story (Part 3)
        println("You longingly walk to the machine with your friends.\n " +
                "\"It's heavenly\" you hear Mason shout.\n" +
                "You look at the screen and see that it asks for 1 token.\n" +
                "You put in a token and start playing.\n" +
                "The aim of the game is to hit the other player with your lightcycle.\n" +
                "By means of a beam of light that is behind the light cycle.\n" +
                "The time flew.\n" +
                "You just kept pushing tokens into it.\n" +
                "Until Mason looked behind the machine and realized the power cord wasn't in\n" +
                "This was strange because the machine was on and it worked.\n" +
                "You then decide in consultation with your friends to plug in the plug to see if anything would change.\n" +
                "You walk calmly to the cable and squat.\n" +
                "You pick up the cable and plug it into the power socket.\n" +
                "ShSHHeSSSNII!?!?!\n" +
                "TyPe NeXt To CoNtInUe!?!?!?!?!\n")
        line = readLine()!!.toLowerCase()
}


