/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemonhotel;

/**
 *
 * @author Stephen
 */
public class Pokemon
{
    private String                  name;
    private int             genericStamp;
    private Pokemon                 type;
    private int      specialAttackRating;
    private int              speedRating;
    private int              expertLevel;
    private int               roomNumber;
    private int         resistanceRating;
    
    public Pokemon(){}
    
    public Pokemon(String name, int genericStamp, Pokemon type, int specialAttackRating, 
            int speedRating, int expertLevel, int roomNumber, int resistanceRating)
    {
        this.name                = name;
        this.genericStamp        = genericStamp;
        this.type                = type;
        this.specialAttackRating = specialAttackRating;
        this.speedRating         = speedRating;
        this.expertLevel         = expertLevel;
        this.roomNumber          = roomNumber;
        this.resistanceRating    = resistanceRating;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getGenericStamp()
    {
        return genericStamp;
    }

    public void setGenericStamp(int genericStamp)
    {
        this.genericStamp = genericStamp;
    }

    public Pokemon getType()
    {
        return type;
    }

    public void setType(Pokemon type)
    {
        this.type = type;
    }
    
    public int getSpecialAttackRating()
    {
        return specialAttackRating;
    }

    public void setSpecialAttackRating(int specialAttackRating)
    {
        this.specialAttackRating = specialAttackRating;
    }

    public int getSpeedRating()
    {
        return speedRating;
    }

    public void setSpeedRating(int speedRating)
    {
        this.speedRating = speedRating;
    }

    public int getExpertLevel()
    {
        return expertLevel;
    }

    public void setExpertLevel(int expertLevel)
    {
        this.expertLevel = expertLevel;
    }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public int getResistanceRating()
    {
        return resistanceRating;
    }

    public void setResistanceRating(int resistanceRating)
    {
        this.resistanceRating = resistanceRating;
    }

    @Override
    public String toString()
    {
        return "Pokemon{" + "name=" + name + ", genericStamp=" + genericStamp + ", type=" + type + ", specialAttackRating=" + specialAttackRating + ", speedRating=" + speedRating + ", expertLevel=" + expertLevel + ", roomNumber=" + roomNumber + ", resistanceRating=" + resistanceRating + '}';
    }   
}
