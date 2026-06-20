# Roulette

## About this Repo
This Repo is a refactor of [Roulette](https://github.com/hewner/csse375/tree/master/Code/Roulette/Roulette_BadEdition). This refactor is done in Java, and is done for the Code Reengineering course. There are 6 smells that we identified in the original codebase, which are Primitive Obsession, Switch Statements, Large Class, Dead Code, Comments, and Shotgun Surgery.

## Directories of Interest
- `./old/src/raw` Contains the old version of the code. This is the raw, unmodified version of the code.
- `./old/src/test` Contains a modified version of the code used for testing alongside the input file for the test.
- `./new/src` Contains the new version of the code. This is the completed, refactored version of the code.

## Running this Repo
This project requires
- [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

If you are on NixOS and use flakes, the simplest way to run is to run `nix develop` and then run the `./run.sh` script. This will automatically generate 2 text files and diff them with the expected result.

Otherwise, simply run the project as you would a standard java project. An example input file is provided in `./old/src/test/in.txt`.

## Changes Made before Refactoring
Since the project is inherently random, a seed was added to allow for deterministic results when testing. This can be found in the `wheel.java` file in the test version and the new version of the code. Due to a minor bug, the matchesBet method was also modified to allow for red and black bets to be parsed properly and used in testing.
