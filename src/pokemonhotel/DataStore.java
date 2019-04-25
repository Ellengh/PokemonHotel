/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonhotel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stephen
 */
public class DataStore
{
    private final ArrayList<String> pokemonNames;
    private final ArrayList<String> pokemonTypes;
    
    public DataStore()
    {
        this.pokemonNames = fillPokemonNames();
        this.pokemonTypes = fillPokemonTypes();
    }
    
    private ArrayList<String> fillPokemonNames()
    {
        ArrayList<String> filledPokemonNames = new ArrayList<>();
        File file = new File("pokemon.txt");
        
        try (Scanner scan = new Scanner(file)) 
        {
            while(scan.hasNextLine())
            {
                filledPokemonNames.add(scan.nextLine());
            }
        }catch (FileNotFoundException e)
        {
            System.out.println("No such File: " + e);
        }
        return filledPokemonNames;
    }
    
    private ArrayList<String> fillPokemonTypes()
    {
        ArrayList<String> filledPokemonTypes = new ArrayList<>();
        File file = new File("poke_types.txt");
        
        try (Scanner scan = new Scanner(file)) 
        {
            while(scan.hasNextLine())
            {
                filledPokemonTypes.add(scan.nextLine());
            }
        }catch (FileNotFoundException e)
        {
            System.out.println("No such File: " + e);
        }
        return filledPokemonTypes;
    }
    
    public ArrayList<String> getPokemonNames()
    {
        return pokemonNames;
    }
    
    public ArrayList<String> getPokemonTypes()
    {
        return pokemonTypes;
    }
    
}
