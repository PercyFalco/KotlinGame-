import javax.print.attribute.IntegerSyntax

fun main() {

    val redTron = Enemy("Red Tron", 15, 9)
    //println(redTron)

    //redTron.takeDamage(5)
    //println(redTron)

    val yellowTron = Enemy("Yellow Tron", 30, 1)
   // println(yellowTron)

    //yellowTron.takeDamage(30)
    //println(yellowTron)



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
    }
        println("Vul Hier de eerste paragraaf in die ik via discord heb gestuurd.")
        line = readLine()!!.toLowerCase()



}
