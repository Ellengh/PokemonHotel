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

    public ArrayList<Pokemon> returnedPokemon(ArrayList<Pokemon> inmates, int amount)
    {
        for (int i = 0; i < amount; i++)
        {
            int choice = rGen.nextInt(5);
            switch (choice)
            {
                case 0:
                    LandPokemon landPokemon = new LandPokemon();
                    landPokemon.setName(dataStore.getPokemonNames().get(rGen.nextInt(dataStore.getPokemonNames().size())));
                    System.out.println("Random pokemon: " + landPokemon.getName());
                    inmates.add(landPokemon);
                    break;
                case 1:
                    AirPokemon airPokemon = new AirPokemon();
                    airPokemon.setName(dataStore.getPokemonNames().get(rGen.nextInt(dataStore.getPokemonNames().size())));
                    System.out.println("Random pokemon: " + airPokemon.getName());
                    inmates.add(airPokemon);
                    break;
                case 2:
                    WaterPokemon waterPokemon = new WaterPokemon();
                    waterPokemon.setName(dataStore.getPokemonNames().get(rGen.nextInt(dataStore.getPokemonNames().size())));
                    System.out.println("Random pokemon: " + waterPokemon.getName());
                    inmates.add(waterPokemon);
                    break;
                default:
                    System.out.println("Something went wrong!!!");
            }
        }
        return inmates;
    }
}
