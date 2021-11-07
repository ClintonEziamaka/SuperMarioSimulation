# SuperMarioSimulation
In this new platform game Super Mario Bros UW, Mario and Luigi are off to save Princess Peach once again from the evil king koopa Bowser; but they will encounter enemies on the way. Using Abstract Factory Pattern and Factory Method Pattern we create the different enemies, worlds and levels.

## RUN AbstractEnemyFactorDriver
Uses Abstarct Factory Method Pattern to create different enemies Mario will face throughout the UW universe. In the different worlds Duckworth Centre, Centennial Hall, and Lockhart Hall, the player will encounter several enemies from each of the species Piranha Plant, Koopa Troopa, and Goomba. 

## RUN SuperMarioUWDriver
Uses Factory Method Pattern to test different levels in the worlds.
Req:- levels use enemies from the Abstract Enemy Factories.
    - enemies spawned in each level (in order):   L1: 7 piranha plants, 7 koopa troopas, 7 goombas
                                                  L2: 7 goombas, 8 piranha plants, 15 koopa troopas
                                                  L3: 12 of each species, randomly spawned
    - environments are strings set when the levels are created.
    - other methods for simulation in the game level class simply display strings.
