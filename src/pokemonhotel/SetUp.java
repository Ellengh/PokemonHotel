/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonhotel;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Stephen
 */
public class SetUp
{

    Random rGen = new Random();

    ArrayList<Pokemon> filledPokemon = new ArrayList<>();

    DataStore dataStore = new DataStore();

    public ArrayList<Pokemon> returnedPokemon(ArrayList<Pokemon> pokemon, int amount)
    {
        for (int i = 0; i < amount; i++)
        {
            int choice = rGen.nextInt(5);
            switch (choice)
            {
                case 0:
                    LandPokemon landPokemon = new LandPokemon();
                    landPokemon.setName(dataStore.getPokemonNames().get(rGen.nextInt(dataStore.getPokemonNames().size())));
                    landPokemon.setExpertLevel(choice);
                    landPokemon.setGenericStamp(choice);
                    landPokemon.setResistanceRating(choice);
                    landPokemon.setRoomNumber(choice);
                    landPokemon.setSpecialAttackRating(choice);
                    landPokemon.setSpeedRating(choice);
                    landPokemon.setType(landPokemon);
                    System.out.println("Random pokemon: " + landPokemon.getName());
                    pokemon.add(landPokemon);
                    break;
                case 1:
                    AirPokemon airPokemon = new AirPokemon();
                    airPokemon.setName(dataStore.getPokemonNames().get(rGen.nextInt(dataStore.getPokemonNames().size())));
                    airPokemon.setExpertLevel(choice);
                    airPokemon.setGenericStamp(choice);
                    airPokemon.setResistanceRating(choice);
                    airPokemon.setRoomNumber(choice);
                    airPokemon.setSpecialAttackRating(choice);
                    airPokemon.setSpeedRating(choice);
                    airPokemon.setType(airPokemon);
                    System.out.println("Random pokemon: " + airPokemon.getName());
                    pokemon.add(airPokemon);
                    break;
                case 2:
                    WaterPokemon waterPokemon = new WaterPokemon();
                    waterPokemon.setName(dataStore.getPokemonNames().get(rGen.nextInt(dataStore.getPokemonNames().size())));
                    waterPokemon.setExpertLevel(choice);
                    waterPokemon.setGenericStamp(choice);
                    waterPokemon.setResistanceRating(choice);
                    waterPokemon.setRoomNumber(choice);
                    waterPokemon.setSpecialAttackRating(choice);
                    waterPokemon.setSpeedRating(choice);
                    waterPokemon.setType(waterPokemon);
                    System.out.println("Random pokemon: " + waterPokemon.getName());
                    pokemon.add(waterPokemon);
                    break;
                default:
                    System.out.println("Something went wrong!!!");
            }
        }
        return pokemon;
    }
}
