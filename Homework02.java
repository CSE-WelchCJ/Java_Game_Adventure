// Chris Welch, CSCE 145-004
import java.util.Scanner;
public class Homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		System.out.println("An Outdoor Adventure\n");
		System.out.println("This is a relaxed choose your own adventure style game.  At points, you will be prompted to make a decision based on the given options.");
		System.out.println("When prompted for input, you'll be given options in single quotes.  Respond with only the text within the single quotes, including spaces if applicable");
		System.out.println("If your decision is not understood then the game will end.  Enjoy this walk through nature.\n");
		System.out.println("You are at the edge of a field and forest and wish to explore. On the ground, you notice a strong looking stick, a rounded but flat stone,");
		System.out.println("some string, and a rolled up pup tent.\n");
		// The following variables will be used to track certain decisions that will impact later game play
		int weight = 0;  // Character weight affects river crossing
		boolean stick = false; // Is the item in possession? initial is false
		boolean stone = false; // Is the item in possession? initial is false
		boolean string = false; // Is the item in possession? initial is false
		boolean canMakeFishRod = false; // Will be used near end to determine if stick and string are in possession
		boolean canMakeSling = false; // Will be used near end to determine if string and stone are in possession
		boolean fishRod = false; // Will track at end if a fish rod is in possession
		boolean sling = false; // Will track at end if a sling shot is in possession
		System.out.println("Do you pick up the stick? \nEnter 'yes' or 'no':");
		String response = key.next();
		// The next process is repeated for each item.  This is decisions 1-4, choosing to pick up items or not.
		if (response.equalsIgnoreCase("yes")) {
			System.out.println("You pick up the stick.  You feel a little bit heavier.\n");
			// Note weight will be a factor later when crossing the river
			weight = weight + 1;
			// Boolean variables will track whether an item is currently in possession or not
			stick = true;
			} else if (response.equalsIgnoreCase("no")) {
			System.out.println("You leave the stick where it lies.\n");
			} else {
			System.out.println("Your response was invalid.  A butterfly must be distracting you.  Come back later when you feel like playing.");
			System.exit(0);
			}
		System.out.println("Do you pick up the stone? \nEnter 'yes' or 'no':");
		response = key.next();
		if (response.equalsIgnoreCase("yes")) {
			System.out.println("You pick up the stone.  You feel a little bit heavier.\n");
			weight = weight + 1;
			stone = true;
			} else if (response.equalsIgnoreCase("no")) {
			System.out.println("You leave the stone where it lies.\n");
			} else {
			System.out.println("Your response was invalid.  A butterfly must be distracting you.  Come back later when you feel like playing.");
			System.exit(0);
			}
		System.out.println("Do you pick up the string? \nEnter 'yes' or 'no':");
		response = key.next();
		if (response.equalsIgnoreCase("yes")) {
			System.out.println("You pick up the string.  You feel a little bit heavier.\n");
			weight = weight + 1;
			string = true;
			} else if (response.equalsIgnoreCase("no")) {
			System.out.println("You leave the string where it lies.\n");
			} else {
			System.out.println("Your response was invalid.  A butterfly must be distracting you.  Come back later when you feel like playing.");
			System.exit(0);
			}
		System.out.println("Do you pick up the tent? \nEnter 'yes' or 'no':");
		response = key.next();
		if (response.equalsIgnoreCase("yes")) {
			System.out.println("You pick up the tent.  You feel a little bit heavier.\n");
			// The tent affects weight but has no boolean because it serves no other purpose than affecting the river crossing outcome
			weight = weight + 1;
			} else if (response.equalsIgnoreCase("no")) {
			System.out.println("You leave the tent where it lies.\n");
			} else {
			System.out.println("Your response was invalid.  A butterfly must be distracting you.  Come back later when you feel like playing.");
			System.exit(0);
			}
		// 1 of 7 decision areas.  No will continue the game, yes gives ending 1
		System.out.println("You begin walking into the woods and soon come across an old gnarled tree.  Its roots look very inviting and comfortable, but part");
		System.out.println("of you feels like if you stop you may not get back up.  Do you sit under the tree? \nEnter 'yes' or 'no':");
		response = key.next();
		// Used a complex boolean to check user input either yes or no
		if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
			System.out.println("Your response was invalid.  A butterfly must be distracting you.  Come back later when you feel like playing.");
			System.exit(0);
			} else if (response.equalsIgnoreCase("yes")) {
			System.out.println("You get comfortable with your back against the tree and nestled between the roots.  Between the shade, the breeze, and rustle of");
			System.out.println("leaves you quickly feel so relaxed that sleep comes easily.  You sleep deeply and your dreams span a lifetime.  You slowly awake and");
			System.out.println("are startled to realize the roots of the tree have encased you.  You must have slept for years!  You don't panic though, for you've");
			System.out.println("lived lifetimes in your dreams.  You close your eyes one last time and know lasting peace. Game over."); // Ending 1
			System.exit(0);
			} else {
			System.out.println("As inviting as the tree is, you decide you'd rather keep walking for now.  You head down the path.\n");
			}
		// Decision area 2
		System.out.println("You come across a small pond whose surface is as calm as can be.  You instantly think of the small stone.");
		System.out.println("It may be the most perfect skipping stone ever.");
		System.out.println("Do you stop and skip the stone? \nEnter 'yes' or 'no':");
		response = key.next();
		if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
			System.out.println("Your response was invalid.  A butterfly must be distracting you.  Come back later when you feel like playing.");
			System.exit(0);
			// User must have chosen to pick up stone.  If not picked up, changes outcome
			} else if (response.equalsIgnoreCase("yes") && stone == true) {
			System.out.println("Will you throw the stone with a lot of oomph or a little? \nEnter 'little' or 'lot':");
			response = key.next();
			if (!response.equalsIgnoreCase("lot") && !response.equalsIgnoreCase("little")) {
				System.out.println("Your response was invalid.  A butterfly must be distracting you.  Come back later when you feel like playing.");
				System.exit(0);
				} else if (response.equalsIgnoreCase("lot")) {
				System.out.println("You throw the stone with all your might and smile as it easily skips all the way across the pond.  That is until you realize");
				System.out.println("it hit a now very angry bear.  As you run for your life, you reflect on your short adventure.  Game over."); // Ending 2
				System.exit(0);
				} else {
				System.out.println("You throw the stone gently at the pond and watch it skip four times before sinking into the water.  Satisifed, you move on.\n");
				weight = weight -1;
				stone = false;
				}
			} else if (response.equalsIgnoreCase("yes") && stone == false) {
			System.out.println("Sadly, you realize you didn't pick up the stone.  The pond shall remain unskipped.\n");
			} else if (response.equalsIgnoreCase("no") && stone == false) {
			System.out.println("You decide to hold onto the stone but then realize you never picked it up, so its a moot point.\n");
			} else {
			System.out.println("You finger the stone in your pocket but decide to leave it there.\n");
			}
		// Decision area 3
		System.out.println("A little further down you find a small waterfall in the stream feeding the pond.  This would be an excellent place to sit and spend the rest");
		System.out.println("of the afternoon if you wanted.  Will you sit and rest here? \nEnter 'yes' or 'no':");
		response = key.next();
		if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
			System.out.println("Your response was invalid.  A butterfly must be distracting you.  Come back later when you feel like playing.");
			System.exit(0);
			} else if (response.equalsIgnoreCase("yes")) {
			System.out.println("You settle down next to the water fall on a rock and lay back.  The sound of the running water is very soothing.  You may not");
			System.out.println("make any more progress today, but its well worth the refreshing rest.  After several hours, you head home, revitalized.  Game over."); // Ending 3
			System.exit(0);
			} else {
			System.out.println("While the waterfall would be an excellent way to spend the day, you want to see what's ahead.\n");
			}
		// Decision area 4
		System.out.println("Leaving the waterfall behind, you come across a field with long grasses waving gently in the breeze.");
		System.out.println("Butterflies, a long time passion of yours, fill the area.  Do you wish to stop and count the butterflies? \nEnter 'yes' or 'no':");
		response = key.next();
		if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
			System.out.println("Your response was invalid.  A butterfly must be distracting you.  Come back later when you feel like playing.");
			System.exit(0);
			} else if (response.equalsIgnoreCase("yes")) {
			System.out.println("You cant't help yourself and you begin chasing down the butterflies.  Minutes and hours fly by without notice because you");
			System.out.println("are having too much fun.  Unfortunately, you soon realize its dark and getting cold but you have no idea where you are.");
			System.out.println("You spend a long cold night outside being very uncomfortable.  At first light, you head home with the sniffles.  Game over"); // Ending 4
			System.exit(0);
			} else {
			System.out.println("The butterflies will have to wait.  Your desire to see the end of the path is too great.\n");
			}
		// Decision area 5
		System.out.println("You come upon a river about 15 feet across.  Its deep enough that you would have to swim across if you can't find a bridge.");
		System.out.println("Lucky for you, a tree fell not too long ago and forms a natural bridge.  While not too wide, you should be able to cross.");
		System.out.println("Do you attempt to cross the river? \nEnter 'yes' or 'no':");
		response = key.next();
		if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
			System.out.println("Your response was invalid.  A butterfly must be distracting you.  Come back later when you feel like playing.");
			System.exit(0);
			} else if (response.equalsIgnoreCase("no")) {
			System.out.println("You have already traveled far and this spot along the river seems pleasant enough.  You build a small shelter and a fire.");
			System.out.println("A bear wanders close, gives you a sniff, then walks into the river and begins catching salmon. You watch the bear and learn");
			System.out.println("its ways.  The bear and you become life long friends hanging out at the river and enjoying your fish diet.  Game over."); //Ending 5
			System.exit(0);
			} else {
			System.out.println("You decide to cross on the log.  Softly, you step up onto the fallen tree staring at the running water below.\n");
			}
		// Weight of user will affect outcome. if all items picked up, player will either end game or have to sacrifice the stick to pass. Numeric comparison.
		if (weight == 4) {
			System.out.println("As you reach the midpoint, you realize that the stick, stone, string, and tent are affecting your balance and you will surely fall");
			System.out.println("if you do not do something! Jam the stick into the river bend to regain your balance? \nEnter 'yes' or 'no':");
			response = key.next();
			if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
				System.out.println("Your response was invalid.  A butterfly must be distracting you.  Come back later when you feel like playing.");
				System.exit(0);
				} else if (response.equalsIgnoreCase("no")) {
				System.out.println("You decide to try and regain your balance without using the stick.  For one moment you think you've succeeded and then splash,");
				System.out.println("in you go.  You easily make it back to the side you started on though you are soaked.  Since its getting dark, you decide to head");
				System.out.println("home and get some dry clothes.  Despite the fall, this was a good adventure.  Game over."); // Ending 6
				System.exit(0);
				} else {
				System.out.println("You quickly jam the stick into the river bottom and use it to right yourself.  The stick becomes lodged into the muddy bottom");
				System.out.println("so you release it and hurry along.\n");
				// Losing the stick here will impact later possible outcomes
				weight = weight - 1;
				stick = false;
				}
			} else {
			System.out.println("You manage to cross the river on the log without incident.\n");
			}
		// Decision area 6
		System.out.println("Just beyond the river is a small clearing.  You notice a bird feeder on the ground below a tree branch at the edge of the clearing.");
		System.out.println("You also hear a low buzzing sound but can't quite place where it is coming from.");
		// Variations depend on whether string is in the inventory.  If yes, set 1.  If not, set 2
		if (string == true) {
			System.out.println("You recall the string you picked up at the trail head.  You could use it to re-hang the bird feeder.  Do you re-hang the feeder? \nEnter 'yes' or 'no':");
			response = key.next();
			if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
				System.out.println("Your response was invalid.  A butterfly must be distracting you.  Come back later when you feel like playing.");
				System.exit(0);
				} else if (response.equalsIgnoreCase("yes")) {
				System.out.println("You decide to use the string to re-hang the feeder.  When you pick up the feeder you realize what the buzzing noise is: bees!");
				System.out.println("The bees don't take kindly to you disturbing their home and begin to swarm around you.  Remembering the river, you make a mad dash");
				System.out.println("and jump into the water.  The bees go away, but now you are soaked and decide to head home for a change of clothes.  What an exciting");
				System.out.println("adventure.  Game over."); // Ending 7
				System.exit(0);
				} else {
				System.out.println("You decide to keep the string and leave the scene undisturbed.  Despite the fallen feeder, the clearing has certain wholesome feeling.\n");
				}
			}
		if (string == false) {
			System.out.println("The buzzing noise rouses your curiosity.  Shall you investigate? \nEnter 'yes' or 'no':");
			response = key.next();
			if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
				System.out.println("Your response was invalid.  A butterfly must be distracting you.  Come back later when you feel like playing.");
				System.exit(0);
				} else if (response.equalsIgnoreCase("yes")) {
				System.out.println("You start poking around the feeder.  When you pick up the feeder you realize what the buzzing noise is: bees!");
				System.out.println("The bees don't take kindly to you disturbing their home and begin to swarm around you.  Remembering the river, you make a mad dash");
				System.out.println("and jump into the water.  The bees go away, but now you are soaked and decide to head home for a change of clothes.  What an exciting");
				System.out.println("adventure.  Game over."); // Ending 8
				System.exit(0);
				} else {
				System.out.println("You remember what curiosity did to the cat and decide better safe than sorry.  You move on.\n");
				}
			}
		// Decision area 7
		System.out.println("The path becomes steep and you walk uphill for several hours before reaching the mountain top.  The view is spectacular and you can easily");
		System.out.println("imagine living here for the rest of your life.  Do you wish to stay here forever? \nEnter 'yes' or 'no':");
		response = key.next();
		if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
				System.out.println("Your response was invalid.  A butterfly must be distracting you.  Come back later when you feel like playing.");
				System.exit(0);
			} else if (response.equalsIgnoreCase("no")) {
				System.out.println("You know deep down that your home is in the city and you would miss the daily bustle.  You decide the day was well spent but its");
				System.out.println("time to head home.  The memories will last a life time.  Game Over."); // Ending 9
				System.exit(0);
			} else {
				System.out.println("You decide this mountaintop would be an excellent home and start making preparations to build.\n");
			}
		System.out.println("The structure of the home is now complete and you realize that if you are to stay you'll need a way to gather food.\n");
		// Whether or not the player can stay depends on ability to make a tool.  Next IF ELSE determines what tools can be made and gives player the choice if >1
		if (stick == true && string == true) {
			System.out.println("You realize you have a stick and string which can be made into a fishing rod.\n");
			canMakeFishRod = true;
			}
		if (string == true && stone == true) {
			System.out.println("You realize you have a string and stone which can used as a slingshot.\n");
			canMakeSling = true;
			}
		// If the player cannot make a tool, the game ends
		if (canMakeFishRod == false && canMakeSling == false) {
			System.out.println("Sadly, you do not have the materials needed to make a fishing rod or a sling.  Without these, you will soon run out of food.");
			System.out.println("You decide to head back home.  You can return tomorrow with the necessary supplies and begin your new life then.  Game over."); // Ending 10
			System.exit(0);
			} 
		key.nextLine();
		// Player chooses between fishing rod or sling shot if the right items are in inventory.  if only one tool possible, makes the only tool possible
		if (canMakeFishRod == true && canMakeSling == true) {
				System.out.println("You have the materials needed to either make a fishing rod or sling.  Which will you make? \nEnter 'fishing rod' or 'sling':");
				response = key.nextLine();
				if (!response.equalsIgnoreCase("fishing rod") && !response.equalsIgnoreCase("sling")) {
					System.out.println("Your response was invalid.  A butterfly must be distracting you.  Come back later when you feel like playing.");
					System.exit(0);
					} else if(response.equalsIgnoreCase("fishing rod")) {
					System.out.println("You have made a fishing rod using the stick and string.\n");
					stick = false;
					string = false;
					fishRod = true;
					} else {
					System.out.println("You have made a sling shot out of the string and stone.\n");
					string = false;
					stone = false;
					sling = true;
					}	
			} else if (canMakeFishRod == true) {
			System.out.println("You have the materails to make a fishing rod so you do.  This will be helpful for gathering food.\n");
			fishRod = true;
			} else if (canMakeSling == true) {
			System.out.println("You have the materials to make a sling shot so you do.  This will be helpful for gathering food.\n");
			sling =  true;
			} else {
			// This is a fail safe and should not occur based on previous logic
			System.out.println("You do not have a means to gather food and you must go home.  It was still a good day.  Game over.");
			System.exit(0);
			}
		// Game outcomes are modified based on which tool player has at the end
		if (fishRod == true) {
			System.out.println("You settle into your idyllic mountain top home with ease.  Your handy fishing rod provides more than enough fish for you");
			System.out.println("and your new bear friend.  What started out as day long adventure has turned into a lifetime of great memories.  Game over."); // Ending 11
			System.exit(0);
			} else if (sling == true) {
			System.out.println("You settle into your beautiful mountain top home with ease.  Your handy sling provides more than enough game for you.");
			System.out.println("What started out as day long adventure has turned into a lifetime of great memories.  Game over."); // Ending 12
			System.exit(0);
			} else {
			// Another fail safe, should not occur
			System.out.println("You do not have a means to gather food and you must go home.  It was still a good day.  Game over."); 
			System.exit(0);
			}
		}
	}
