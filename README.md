# monopoly-board-game


# Rules of the game

1. The number of players must be between 2 and 4.

2. There is bank that maintains cash and tickets of the sites.

3. The available cash denominations are: INR 100, INR 500, INR 1000, and INR 5000.

4. At the beginning of the game, each player will start with INR 15000 (calculated as 100*10 + 500*10 + 1000*4 + 5000*1). The bank has an infinite amount of money and will never run out.. 5. You have to develop the business game application following this image.

a. The application should include all the locations such as cities, services (like water works), jail, club, etc.

b. Additionally, you need to incorporate the rules of 'Chance' and 'Community Chest' as mentioned in the image into your application.

6. The game will feature two 6-sided dice numbered from 1 to 6, which will always provide a random number when rolled. Players will move the combined value of the dice roll.

7. Players will take turns rolling the dice one by one until someone scores a double-digit number (10, 11, or 12). The player who scores a double-digit number will start moving, while the others will remain at the starting point (referred to as "Start" in the image).

8. Every time a player lands on or passes the 'Start' location, they will receive INR 1500 (calculated as 100*10 + 500*1) from the bank.

9. In the game, if a player arrives in a city (eg Mumbai) but chooses not to purchase it or is unable to do so, they must pay a fine of 1000 INR to the bank. The property will remain unsold.

10. If a player lands in a property owned by another player, they are required to pay rent to the owner. The rent amount is calculated as 10% of the property's purchase price, rounded down to the nearest multiple of 100 INR. For example, if the price of Ahmedabad is 4000 INR, the rent would be 0.10 * 4000 = 400 INR. If the price is 1500 INR, the rent would be floor(0.1 * 1500) = floor(150) = 100 INR.

11. When a player lands in jail, they have to pay a bail amount of 1500 INR to the bank and lose their next turn.

12. If a player wants to sell their property due to lack of funds or personal choice, they can sell it back to the bank for 50% of the original cost of the property, rounded down to the nearest multiple of 100 INR.

13. If a player lands on Income tax, they are required to pay 10% of the rent they have earned in the game to the bank.

14. If a player lands on wealth tax, they must pay INR 200 to the bank.

15. If a player lands in Club, they to pay INR 200 to bank.

16. Rules for Constructing House in Cities:

a. A player becomes eligible to construct houses in cities after passing the 'Start' position twice.

b. Once the above condition is met, if a player lands on a property they already own, they can build a house on it by paying INR 500 to the bank.

c. Once a house is constructed, other players visiting the city will have to pay rent equal to 20% of the original price of the city to the player who owns that property. 17. Rules pertaining to 'Chance' and 'Community Chest' are present in this image

18. If any player goes bankrupt, the player with the highest net worth will be declared the winner. In the event of a tie, the player with the highest number of title cards will be declared the winner.






# Running the Code

1. As mentioned above, the first line should take the number of players p (0<p<=4).

2. Next p lines should take the names of the players

3. Now you need to print the initial status of the game which includes names of the players and the amount of cash they have. If you are also maintaining the denominations held by players, then print that too. All this should be printed in readable format

4. Now you should start the game.

5. Ask to press enter with the name of the player mentioned. Eg: Player 1's turn, press enter to throw the dice or if the player has any property, then ask if the player wants to sell/mortage any his/her site.

6. Print the total of the number appearing on dice with values of individual die.

7. Calculate where the player will move on the basis of dice roll. If player can’t move then print that.

8. Also print the amount of cash paid/received by the player. Also print the total cash the player has

9. Repeat step 5,6 and 7 for all the players.

10. Once all the players complete their turn. Give 2 options

a. Enter “Show” to print the status of the gave

b. Continue the game

11. If the option “a” from step 10 is selected, then you need to print the following for each player

a. Amount of cash

b. Denominations (If u are handling denominations part)

c. How many times the player has crossed start position

d. The sites possessed by player

e. The cities which the player has house in

f. Current site of the player (if the player is at Mumbai, then you need to print Mumbai)

g. Amount of cash the player has earned from rent so far

h. Amount of money the player has paid to bank so far

i. Amount of money the bank has paid to the player so far

12. If in the step 5, the player selects for mortgage, then:

a. Give list of the properties owned by player and ask him/her to select a site to sell

b. Take input from the player for the site he/she wants to sell

c. Print the cash the player has received

d. Print the sites left with the player

13. If a player lands on a property owned by other player, then print the player’s name who has that property. Also, print the amount received by the owner. Finally, print the cash with players (with denominations if u r handling that)

14. If player lands on a property owned by him, give him/her an option to construct a house if he/she is eligible. If not, print that

15. In cash of jail, chance, and community chest, print what happens on landing on those sites.

Note: Basically you need to print in such a way that we understand the progress of the game after every turn. Also you need to print what happened in every turn.
