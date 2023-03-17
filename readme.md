# Overview
This project is a Java implementation of the classic game of Rock-Paper-Scissors, with two players using different strategies. The goal of the game is to win more rounds than the other player by making strategic choices of rock, paper, or scissors. The game consists of 100 rounds, with Player A always choosing paper and Player B choosing a random strategy.

The project is designed to showcase the use of object-oriented programming concepts in Java, including classes, interfaces, and inheritance. The main entities in the project include the Game, Player, and Round classes, which are used to manage the overall game and track the progress of each round. The Choice enum is used to represent the possible choices of rock, paper, or scissors, while the RPSGame class provides the main logic for playing the game.

The project includes several key entities, including Game, Player, Round, and Choice. The Game entity is used to represent the overall game, including the two players involved, the total number of rounds, and the results of each round. The Player entity is used to represent a single player in the game, including their name and a unique ID. The Round entity is used to represent a single round in the game, including the choices made by each player and the winner of the round. The Choice entity is used to represent the possible choices of rock, paper, or scissors.

The relationships between these entities are important because they help to establish the structure and behavior of the overall game. For example, the one-to-many relationship between the Game entity and the Round entity allows us to track the progress of the game and determine the winner based on the results of each round. The many-to-many relationship between the Round entity and the Choice entity allows us to determine the winner of each round based on the choices made by each player.

# Project Structure
The project is organized into several packages, each containing classes related to a specific aspect of the project:

### model
Contains the Game, Player, Round, and Choice classes, which define the data models used by the game.

### service
Contains the RPSGameService interface, which defines the contract for the game service, as well as the RPSGame class, which provides the implementation of the game service.

### util
Contains the RandomChoiceGeneratorImpl class to decouple the choice generation logic from the game logic.
using an interface allows us to mock the RandomChoiceGenerator in unit tests, which makes it easier to test the RPSGame class in isolation from the actual generation of random choices.
