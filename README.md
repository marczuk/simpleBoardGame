## Introduction - the project's aim
Simple board game prototype

board
- 5 x 5

piece
 - move N / E / S / W
 - start position left down corner
 - start facing N
 - move action (M)
      - no effect if crossing border of board
      - no validation at this point
 - turn action (L, R)
      - left or right by 90 degrees
      - only change of direction
 - one input - set of commands/actions eg : RMLLMM...
 - output - always current location and current direction of piece (eg X Y D)
 - unit tests
 

 ## Technologies
 
 Java / Maven / jUnit / jacoco
 
 
 ## Launch
 download sources
 
 execute: mvn test
 