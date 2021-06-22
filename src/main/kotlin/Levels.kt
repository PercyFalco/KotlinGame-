class Levels(){
    fun main() {





        //Enemy's
        val bandit = Enemy("Bandit", 1, 1, 7)
        val wolf = Enemy("Wolf", 1, 1, 7)
        val darkmatter = Enemy("DarkMatter", 1, 1, 7)
        val villagers = Enemy("Villagers", 1,1,7)
        val darian = Enemy("Darian", 1,1,10)
        val mason = Enemy("Mason", 1,1,10)






        //weapons
        val sword1 = Weapon("sword", 1)
        val shield1 = Weapon("shield", 1)
        val bow1 = Weapon("bow", 1)
        val teeth = Weapon("Wolf Teeth", 1)
        val mind = Weapon("Mind", 1)
        val chair = Weapon("Spikey Chair", 1)
        val pitchfork = Weapon("Pitchfork", 1)
        val Scream = Weapon("Scream", 1)
        val knife = Weapon("Knife",1)
        val fist = Weapon("Fist", 1)
        val axe1 = Weapon("Axe",1)
        val chain1 = Weapon("Electrocuted chain", 1)



        //player
        println("Enter your character name")
        var username = readLine()

        while (username!!.isBlank()) {
            println("Please enter a valid character name")
            username = readLine()
        }
        val player = Player("$username", 3, 3, 9)





        //inventory
        val sword = Loot("Sword", LootType.WEAPON, 100)
        val necklace = Loot("necklace", LootType.NECKLACE, 1000)
        val shield = Loot("Shield", LootType.WEAPON, 50)
        val bow = Loot("Shield", LootType.WEAPON, 50)
        val axe = Loot("Axe", LootType.WEAPON,70)
        val chain = Loot("Electrocuted chain", LootType.WEAPON, 2349)







        //Intro Part 1
        println("You wake up on a sunny morning and decide to go to the arcade.\n" +
                "You grab your bike and cycle to your friends to see if they are awake yet.\n" +
                "You are standing at the door of your best friend(Darian).\n" +
                "You knock and hear someone coming down the stairs after a few seconds the door was opened.\n" +
                "It was Darian. you decided together to pick up 1 more friend and the three of you to spend your pocket money on old dusty arcade machines.\n" +
                "You cycle together to the last friend (Mason).\n" +
                "You ring the bell and hear a rumble coming from the kitchen. \"I'm coming\" you hear Mason yell.\n" +
                "After a few seconds the door is opened. \"I'll grab my money and then I'll be there 2 minutes\".\n" +
                "4 minutes later Mason walks out with a bag of change.\n" +
                "You get on your bike and cycle to the arcade as fast as possible so that you are the first to play on the new arcade machine.\n" +
                "Type next to continue."

        )
        var line : String?
        line = readLine()!!.toLowerCase()




        //intro part 2
        while (line != "next"){
            println("Wrong input please try again.")
            line = readLine()!!.toLowerCase()
        }
        println("Once arrived at the arcade.\n" +
                "You exchange your pocket money into arcade tokens.\n" +
                "You walk searching for the location of the new arcade machine.\n" +
                "As you walk in the right direction you come across several other games like Pacman, Donkey Kong etc.\n" +
                "In the end of the aisle there were lights aimed at a machine.\n" +
                "it was the new arcade machine Tron.\n" +
                "Type next to continue")
        line = readLine()!!.toLowerCase()




        //intro part 3
        while (line != "next"){
            println("Wrong input please try again.")
            line = readLine()!!.toLowerCase()
        }
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







        //intro part 4
        while (line != "next"){
            println("Wrong input please try again.")
            line = readLine()!!.toLowerCase()
        }
        println("You slowly wake up with a pain in your chest.\n " +
                "As soon as you open your eyes you will notice that you are no longer in the arcade.\n" +
                "\"Mason! Darian!\" you scream.\n" +
                "Soon you realized that you have arrived in an unknown place where there are high mountains and beautiful blue sky with a cloud here and there.\n" +
                "You try to get up slowly.\n" +
                "With all the strength you still have you rise but not without difficulties.\n" +
                "The pain in your chest only got worse the more you exerted yourself.\n" +
                "Once on your feet you look around and to your great surprise you are in the middle of a forest surrounded by mountains.\n" +
                "You decide to walk north towards the valley where there may be a village. \n" +
                "You walked downhill to the valley.\n" +
                "After one hour walk you were so exhausted that you just had to rest on a tree trunk that stood beside the path.\n" +
                "You said to yourself \"it's just a dream\". \n" +
                "After 10 minutes of rest you decide to continue.\n" +
                "Type next to continue\n")
        line = readLine()!!.toLowerCase()







        //intro part 5
        while (line != "next"){
            println("Wrong input please try again.")
            line = readLine()!!.toLowerCase()
        }
        println("After walking 2 km you hear running water.\n " +
                "You walk after the noise in the hope of being able to drink again.\n" +
                "Once arrived at the water you see that it is a river with people standing by.\n" +
                "\"Hello\" you call.\n" +
                "To your surprise, the people came running towards you with swords and shields.\n" +
                "You had a sword thrown at you.\n" +
                "\"Fight to the death\" was called to you by the strange people. \n" +
                "Type fight to continue\n")
        player.inventory.add(sword)
        player.showInventory()
        line = readLine()!!.toLowerCase()




        //Level 1 (BANDIT FIGHT)
        while (line != "fight"){
            println("Wrong input please try again.")
            line = readLine()!!.toLowerCase()
        }

        println("A bandit runs towards you he has his sword high and tries to make a move.\n " +
                "What do you do dodge, slash, block.\n" +
                "Type your choice.\n")
        line = readLine()!!.toLowerCase()

        if (line == "dodge") {
            println("You're avoiding the attack.\n" +
                    "The bandit's sword is stuck in the ground.\n" +
                    "what are you going to do overhead slash or a side slash.\n"+
                    "Type your choice.\n")
                    line = readLine()

                if(line == "overhead slash") {
                println("You raise your sword and wave it down.\n" +
                        "You cut the bandit head in half with your sword.\n" +
                        "The rest of the bandits look at you in shock as blood drops slide off your head.\n" +
                        "All the other bandits run away in terror.\n" +
                        "The bandit you killed dropped something.\n" +
                        "It was a beautiful necklace.\n" +
                        "You decide to pick it up and put in your pocket.\n" +
                        "Type walk to continue")
                        bandit.takeDamage(sword1)
                        player.inventory.add(necklace)
                        player.showInventory()}


                else if(line == "side slash") {
                println("You put your sword back and swing your sword at the bandit's head with all your force.\n" +
                        "You decapitate the bandit.\n" +
                        "The rest of the bandits look at you in shock as blood drops slide off your head.\n" +
                        "All the other bandits run away in terror.\n" +
                        "The bandit you killed dropped something.\n" +
                        "It was a beautiful necklace.\n" +
                        "You decide to pick it up and put in your pocket.\n" +
                        "Type walk to continue")
                        bandit.takeDamage(sword1)
                        player.inventory.add(necklace)
                        player.showInventory()
                        line = readLine() }
        }

        else if(line == "slash") {
            println("You run towards the bandit with the sword in your hand.\n" +
                    "With a quick slash aimed at his belly in mind.\n" +
                    "Slashh! you cut open the belly of the bandit all the guts came spilling out." +
                    "The rest of the bandits look at you in shock as blood drops slide off your head.\n" +
                    "All the other bandits run away in terror.\n" +
                    "The bandit you killed dropped something.\n" +
                    "It was a beautiful necklace.\n" +
                    "You decide to pick it up and put in your pocket.\n" +
                    "Type walk to continue")
                    bandit.takeDamage(sword1)
                    player.inventory.add(necklace)
                    player.showInventory()}



        else if(line == "block") {
            println("You see the bandit's sword in the sky.\n" +
                    "You raise your sword in an attempt to block the attack.\n" +
                    "You manage to block the attack but because there was so much power in the attack you fall over with your sword out of reach.\n" +
                    "With no way to defend your self.\n" +
                    "You decide to crawl to your sword.\n" +
                    "On your way towards the sword you hear the bandit coming towards you." +
                    "You feel a tremendous amount of force on your left arm.\n" +
                    "It was the bandit standing on your arm.\n" +
                    "The bandit swings his sword in the air in cut arm of." +
                    "He then moves over to the other arm and cuts that one of.\n" +
                    "The bandit moves you to the campfire where a burning sword was.\n" +
                    "He then burns the wound so it stops bleeding.\n" +
                    "With your wound scourged you were helpless.\n" +
                    "You were being carried to a table and stripped naked.\n" +
                    "With no way to see whats happening behind you.\n" +
                    "You feel a sharp thing moving between your legs and gently going up.\n" +
                    "it was a sword that you felt.\n" +
                    "The sword was put to your ass and pushed in with a lot of force.\n" +
                    "The pushing stopped when the point of the sword came out of your mouth." +
                    "You have lost a live\n" +
                    "Type walk to continue")
                    player.takeDamage(sword1)
                    }



        //Level 2
        line = readLine()
        while (line != "walk"){
            println("Wrong input please try again.")
            line = readLine()!!.toLowerCase()}

            println("You are tired of the fight.\n " +
                    "It was a tough event but you got out of it.\n" +
                    "You walk to the river to drink some water to quench your thirst.\n" +
                    "After resting for a while you decide to follow the river in the hope that you will arrive at a village.\n" +
                    "You keep following the river for about 3 km.\n" +
                    "But then you see that the water falls down.\n" +
                    "It's a waterfall.\n" +
                    "You walk up to the edge to see how high it is.\n" +
                    "The height was about 20 meters.\n" +
                    "Next to the waterfall you spot some protruding stones that you can climb down.\n" +
                    "But you can also jump down as the water looked quite deep.\n" +
                    "What will you do?\n" +
                    "Jump or Climb\n")
                    line = readLine()!!.toLowerCase()

                            if (line == "jump") {
                                println("You stand at the edge and still thinking about that time at the arcade.\n" +
                                        "\"I wish I hadn't touched that cable.\"\n" +
                                        "You look down and take a deep breath.\n"+
                                        "You quietly walk backwards until you decide to jump down.\n" +
                                        "This was the moment.\n" +
                                        "You run to the edge and jump.\n" +
                                        "\"ahahhahhhhhh\" you scream as you fall.\n" +
                                        "Splash! You end up in the water and swim to the shore as quickly as possible.\n" +
                                        "Type walk to continue") }

                            else if(line == "climb") {
                                println("You are at the edge and start to descend to the first stone.\n" +
                                        "Once you have a good grip on the stone, you keep slowly lowering yourself.\n" +
                                        "Until a stone is loose.\n" +
                                        "The stone wobbles and you slowly lose your balance.\n" +
                                        "The stone let go.\n" +
                                        "You are now falling with your back down in the water.\n" +
                                        "\"ahahhahhhhhh\" you scream as you fall.\n" +
                                        "splash! you end up in the water and swim to the shore as quickly as possible.\n" +
                                        "Type walk to continue") }

        //level 3
        line = readLine()
        while (line != "walk"){
            println("Wrong input please try again.")
            line = readLine()!!.toLowerCase()}

            println("You continue to the valley with your clothes completely wet from the fall.\n " +
                    "To have run after several minutes you see a sign standing in the distance.\n" +
                    "You decide to inspect the sign\n" +
                    "The sign had an arrow pointing left surmounted called Riverwood.\n" +
                    "The arrow pointed to a dirt path that went down.\n" +
                    "Hoping to find a village you keep following the path.\n" +
                    "\n" +
                    "45 minutes later.\n" +
                    "\n" +
                    "In the distance you see a gate that is open.\n" +
                    "It was a village smoke was coming from it.\n" +
                    "\"there are people\" You said to yourself.\n" +
                    "You run to the gate and soon hear howling and screaming. \n" +
                    "The village was attacked by wolves.\n" +
                    "At the entrance of the gate light a shield and an bow with arrows.\n" +
                    "You decide to help the village.\n" +
                    "Which weapon do you choose? \n" +
                    "Shield or a Bow\n" +
                    "Type your choice\n")
                     line = readLine()!!.toLowerCase()

                        if (line == "shield") {
                            player.inventory.add(shield)
                            player.showInventory()
                            println("You pick up the shield and hold it in front of you.\n" +
                                    "The wolf is running towards you at high speed.\n" +
                                    "Not knowing what to do keep your shield but for you as protection.\n"+
                                    "Before you knew it the wolf jumped on you.\n" +
                                    "You hold the shield in front of your face.\n" +
                                    "But you couldn't stand this any longer.\n" +
                                    "In one swift movement the wolf bites you on the neck.\n" +
                                    "You push the wolf away from you with all your strength.\n" +
                                    "The wolf is now on the ground and you are now on top.\n" +
                                    "You smash his skull open with your shield.\n" +
                                    "You are completely covered in blood and you panic because you can't see anything anymore.\n" +
                                    "You wipe the blood off your face.\n" +
                                    "You open your eyes and can hardly believe it.\n" +
                                    "There are people.\n" +
                                    "Type walk to continue")
                                    player.takeDamage(teeth)}


                        else if(line == "bow") {
                            player.inventory.add(bow)
                            player.showInventory()
                            println("You pick up the bow and put the quiver on your back.\n" +
                                    "You grab an arrow and cock it.\n" +
                                    "Completely stunned how you can take a bow in one go, you shoot the first arrow.\n" +
                                    "\"Bullseye\" The arrow ended up right between the wolf's eyes but it wasn't done yet.\n" +
                                    "In the distance 2 wolves came running towards you, you tightened your bow again and hit 1 between the eyes.\n" +
                                    "\"Klats\" The wolf jumps on you. You put the bow between the wolf's mouth to stop him.\n" +
                                    "You reach for the last arrow in your quiver.\n" +
                                    "\"Sleish\" You push the arrow right into the wolf's brain.\n" +
                                    "You are completely covered in blood and you panic because you can't see anything anymore.\n" +
                                    "You wipe the blood off your face.\n" +
                                    "You open your eyes and can hardly believe it." +
                                    "There are people.\n" +
                                    "Type walk to continue")
                                    wolf.takeDamage(bow1)}


        //level 4
        line = readLine()
        while (line != "walk"){
            println("Wrong input please try again.")
            line = readLine()!!.toLowerCase()

        }
        println("The people look at you with a strange look.\n " +
                "A man walks towards you with handcuffs in his hand\n" +
                "You look surprised\n" +
                "You try to talk but you are still in shock from the fight.\n" +
                "The stranger will cuff you and take you to a house\n" +
                "Once entered the house\n" +
                "The strange man says \"down the stairs\"\n" +
                "You do what he says\n" +
                "Once you go down the stairs you have to be on your knees you do what he says.\n" +
                "The man walks back upstairs and closes the door behind him.\n" +
                "Completely dark you are on your knees in a cold dark room.\n" +
                "\"all hope is lost\" You say to yourself but nothing could be further from the truth.\n" +
                "Suddenly you hear a voice in the distance.\n" +
                "\"You touched the cable or not\" says the voice.\n" +
                "\"listen to me what's about to happen is unexplainable. You're about to start a fight with your worst fear. Whatever you do don't let it touch you.\"\n" +
                "Suddenly you see a man walking from a dark corner.\n" +
                "By now your eyes were well accustomed to the dark.\n" +
                "The man walked out of the corner with a flashlight?\n" +
                "It was your father.\n" +
                "\"Father is that you?\"\n" +
                "\"Yes son i missed you.\"\n" +
                "\"It's not your father don't let him touch you\" says the voice in the distance.\n" +
                "\"No this is not possible you are dead.\"\n" +
                "\"I'll help you get out of here\" says your father.\n" +
                "\"Don't listen to him.\"\n" +
                "The only way to beat him is to accept that he's gone!\" says the voice.\n" +
                "Who do you trust the voice or father.\n" +
                "Type your choice")
                line = readLine()!!.toLowerCase()

                    if (line == "voice") {
                        println("You sit on the floor and close your eyes.\n" +
                                "Thinking of the last moments with your father.\n" +
                                "Last time baseball, football you loved your dad more than most.\n"+
                                "But now it's time to accept that he's dead. \n" +
                                "That damn drunk man\" you say to yourself.\n" +
                                "You hear your father coming close.\n" +
                                "Now is the time.\n" +
                                "You are gone\" you say calmly to your father. \n" +
                                "Your father broke off slowly?\n" +
                                "As if it were made of sand.\n" +
                                "\"I'm sorry about everything son, I love you\" your father says.\n" +
                                "You begin to doubt whether you have made the right choice.\n" +
                                "Out of anger you cry out your pain.\n" +
                                "\"ahhhhhhhhhhhhhhhh!\" the scream was so loud that the building was slowly breaking down as well.\n" +
                                "\"Continue\" says the voice." +
                                "The walls came down, the roof collapsed, and the door was blown out.\n" +
                                "It took you a while to get used to the bright sunlight again.\n" +
                                "You decide to go outside via the stairs.\n" +
                                "\"Free me\" says the voice where you come closer with every step\n" +
                                "Type up to go up the stairs")
                                darkmatter.takeDamage(mind)}

                    else if(line == "father") {
                        println("Your father extends his hand.\n" +
                                "\"Connect with me son,he says.\"\n" +
                                "\"Don't listen to him\" says the voice in the distance.\n" +
                                "You think back to your childhood to how always played games with your father.\n" +
                                "Hoping to get this joy back you walk up to your father and shake his hand.\n" +
                                "You hug him and cry.\n" +
                                "I'm sorry I failed you my son\" hear your voice in the distance say calmly.\n" +
                                "Suddenly you feel a rough skin on your father you step back and to your shock it was no longer your father.\n" +
                                "It was a dark matter that formed in an object.\n" +
                                "It slowly formed into a chair with pointed objects.\n" +
                                "The was held in the air by an unknown force and pushed you into the seat.\n" +
                                "Our body pierced by pointy objects you still think of your father and you say \"See you soon\"\n" +
                                "Type up to go further")
                                player.takeDamage(chair)}

        //level 5
        line = readLine()
        while (line != "up"){
            println("Wrong input please try again.")
            line = readLine()!!.toLowerCase()

        }
        println("You walk up the stairs.\n " +
                "Once at the top you look to the right and to your surprise you see your father sitting in a cell. \n" +
                "Father!\" You say. \"Yes son it is me.\"\n" +
                "Your father says to you as he smiles you open his cell with your scream.\n" +
                "The whole simulation breaks down we have to get out of here\" your father yells.\n" +
                "You run outside and everything is gone the houses the mountains.\n" +
                "Everything flickered as if one second it was there and the next it wasn't.\n" +
                "Once outside village residents come running at you with pitchforks \n" +
                "What are you going to do fight or run with your father\n" +
                "Type your choice")
                line = readLine()!!.toLowerCase()

                    if (line == "fight") {
                        println("You take a deep breath and prepare your scream.\n" +
                                "After taking a deep breath, you look at your father.\n"+
                                "\"Do it,\" he says.\n" +
                                "You scream your lungs out and everything in front of you disappeared all that was left was a silence you weren't used to.\n" +
                                "Everything in front of you was gone except the flickering of the view but this time it wasn't a pretty village flickering anymore.\n" +
                                "No it was a destroyed village with dead people everywhere and massive amount of blood everywhere. \n" +
                                "Type run to continue")
                                villagers.takeDamage(Scream)}

                    else if(line == "run") {
                        println("You look at your father and say \"we have to run\".\n" +
                                "Your father agreed and quickly ran out of the village but without difficulty.\n" +
                                "The villagers threw all the weapons they had in their arsenal.\n" +
                                "You keep running no matter what.\n" +
                                "Until you get a pitchfork through your chest.\n" +
                                "Your father picks you up and runs away with you on his neck.\n" +
                                "Type run to continue\n")
                                player.takeDamage(pitchfork)}

        //level 6
        line = readLine()
        while (line != "run"){
            println("Wrong input please try again.")
            line = readLine()!!.toLowerCase()

        }
        println("You keep running with your father for another 10 minutes until your father takes something out of his pocket, it was a glowing chip.\n " +
                "\"I'm going to save your life with this chip, unfortunately I can't go with you to do this\" says your father.\n" +
                "\"I'm going to open a portal for you to walk into.\"\n" +
                "\"This portal will take you back to the arcade\" he says.\n" +
                "You don't want to believe you're going to lose your father again.\n" +
                "Your father takes the chip well and says some strange words and makes a circular movement with his arms.\n" +
                "A portal appears. \"Go fast I won't last long\" your father yells.\n" +
                "I'm not going to lose another father\" you say.\n" +
                "\"I've never been gone, I've always been there and always will be go now!\" your father says with a tear in his eye.\n" +
                "You run through the portal.\n" +
                "Bright lights dazzle you until suddenly you hear beeps and footsteps.\n" +
                "You wake up and lie on the floor.\n" +
                "You were back in the arcade and your friends were there all along.\n" +
                "Type wake to progress further")
                line = readLine()

        //level 7
        while (line != "wake"){
            println("Wrong input please try again.")
            line = readLine()!!.toLowerCase()

        }
        println("\"Why $username?\" do your friends say.\n " +
                "\"What do you mean?\"\n" +
                "\"YOU KILLED EVERYONE!!!\" your friends scream.\n" +
                "Your friends starts flickering just like in the simulation.\n" +
                "I AM GOING TO KILL YOU!!\n" +
                "They all say at the same time if there where being mind controlled.\n" +
                "What are you going to do RUN outside or FIGHT\n" +
                "Type your choice\n")
                line = readLine()!!.toLowerCase()

                    if (line == "run") {
                        println("You run towards the door.\n" +
                                "On your way to the door you see multiple arcade machines acting strange.\n"+
                                "\"YOU CANT STOP IT $username\" shout your friends \n" +
                                "You smash the door open and you were being blinded by the sunlight.\n" +
                                "IT WAS ALREADY BEEN DONE!\n" +
                                "You hear behind you.\n" +
                                "The real world is also flickering now." +
                                "\"What is happening\" you say to yourself. +" +
                                "Type next to continue")}


                    else if(line == "fight") {
                        println("You ready your fist.\n" +
                                "with a quick motion you hit Darian right in the face.\n" +
                                "He drops to the ground.\n" +
                                "Now you also hit Mason in the face.\n" +
                                "They were not dodging or even try to attack me \n" +
                                "Now you make you way to the door\n" +
                                "On your way to the door you see multiple arcade machines acting strange.\n" +
                                "You look behind you and see Darian and Mason stand with no scratch on there face they were just looking at you." +
                                "You smash the door open and you were being blinded by the sunlight.\n" +
                                "\"IT WAS ALREADY BEEN DONE!\"\n" +
                                "You hear behind you.\n" +
                                "The real world is also flickering now." +
                                "\"What is happening\" you say to yourself. +" +
                                "Type next to continue")
                                darian.takeDamage(fist)
                                mason.takeDamage(fist)}
                                line = readLine()


        //level 8
        while (line != "wake"){
            println("Wrong input please try again.")
            line = readLine()!!.toLowerCase()

        }
        println("You just stand there looking not knowing what to do.\n " +
                "And then you remember that your father had a chip to make a portal.\n" +
                "\"Maybe he gave it to me\" you think.\n" +
                "You are searching you pocket and find the chip.\n" +
                "you look up and see your friends standing there again.\n" +
                "But know it was different. they had a fighters look on their face\n" +
                "\"Maybe the chip can help\" you think \n" +
                "\"What did my father do?\" you say to yourself.\n +" +
                "you make a few movements with you arms and to your surprise a screen came in front of view but it was transparent.\n" +
                "it asked for a choice.\n" +
                "Do you want a axe or a electrocuted chain.\n" +
                "AXE OR CHAIN?")
                line = readLine()!!.toLowerCase()

                        if (line == "axe"){
                        player.inventory.add(axe)
                        player.showInventory()
                            println("A axe spawned in your hand.\n" +
                                    "You run towards your friends in order to kill them.\n"+
                                    "In one smooth motion you cut both of their heads off.\n" +
                                    "With there heads on the ground you turn around.\n" +
                                    "\"Sorry $username\" your friends are in front of you.\n" +
                                    "Mason stabs a knife in your chest.\n" +
                                    "Darian stabs a knife in your leg." +
                                    "They keep stabbing you till you cant breath anymore. +" +
                                    "Type next to continue")
                                    player.takeDamage(knife)}



                        else if(line == "chain") {
                            player.inventory.add(chain)
                            player.showInventory()
                            println("A electrocuted chain was suddenly in your hand.\n" +
                                    "You prepare yourself to hit the chain.\n" +
                                    "You make the chain spin to create momentum.\n" +
                                    "\"Weep!\" You hit Darian with the chain.\n" +
                                    "The chain is now stuck around him.\n" +
                                    "You pull the chain and see Darian dissolve.\n" +
                                    "you're next target Mason\n" +
                                    "\"This isn't real $username. this is all in your head\"  " +
                                    "You slash him in half with your chain.\n" +
                                    "All of a sudden you are blinded by a bright light\n" +
                                    "Type see to continue")
                                    darian.takeDamage(chain1)
                                    mason.takeDamage(chain1)}
                                    line = readLine()

        //ENDING
        while (line != "see"){
            println("Wrong input please try again.")
            line = readLine()!!.toLowerCase()

        }
        println("\"How is the patient doing doctor?\" You hear a man say.\n " +
                "You open your eyes carefully.\n" +
                "\"A white Wall, A white ceiling, A white floor where am i?\"\n" +
                "\"Hello $username, You are back. says the strange man who was standing next to a white door.\"\n" +
                "\"Back from what?\" You reply.\n" +
                "\"Back from you made up reality\" Says the man.\n" +
                "\"Made up reality?\" \n" +
                "\"Aw yes your made up reality in that unique head of yours.\"\n +" +
                "\"You do realise you are in this Psychiatric hospital for brutally killing your family?\"\n" +
                "\"No! NO ! No!?! this cant be.\" You scream\n" +
                "Your name also isn't $username. this is a made up name by yourself to process your loss.\n" +
                "\"Your real Name is Alex\" You killed your wife and your 3 childeren: Darian, Mason, Voice" +
                "\"We are here to help you\" Says the doctor" +
                "THE END")


    }














}