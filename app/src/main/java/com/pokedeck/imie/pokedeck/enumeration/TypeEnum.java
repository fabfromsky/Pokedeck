package com.pokedeck.imie.pokedeck.enumeration;

public enum TypeEnum {
    NORMAL,
    GRASS,
    ELECTRIC,
    WATER,
    FIRE,
    BUG,
    GHOST,
    PSYCHIC,
    STEEL,
    DARK,
    FLYING,
    ICE,
    POISON,
    GROUND,
    ROCK,
    DRAGON,
    FIGHTING,
    FAIRY,
    NONE;

    public TypeEnum[] weak, strong, noEffect;

    static {
        //Normal
        NORMAL.weak = new TypeEnum[]{FIGHTING};
        NORMAL.strong = new TypeEnum[]{};
        NORMAL.noEffect = new TypeEnum[]{GHOST};
        //Grass
        GRASS.weak = new TypeEnum[]{FLYING, POISON, BUG, FIRE, ICE};
        GRASS.strong = new TypeEnum[]{GROUND, WATER, GRASS, ELECTRIC};
        GRASS.noEffect = new TypeEnum[]{};
        //Electric
        ELECTRIC.weak = new TypeEnum[]{GROUND};
        ELECTRIC.strong = new TypeEnum[]{FLYING, STEEL, ELECTRIC};
        ELECTRIC.noEffect = new TypeEnum[]{};
        //Water
        WATER.weak = new TypeEnum[]{GRASS, ELECTRIC};
        WATER.strong = new TypeEnum[]{STEEL, FIRE, WATER, ICE};
        WATER.noEffect = new TypeEnum[]{};
        //Fire
        FIRE.weak = new TypeEnum[]{GROUND, ROCK, WATER};
        FIRE.strong = new TypeEnum[]{BUG, STEEL, FIRE, GRASS, ICE, FAIRY};
        FIRE.noEffect = new TypeEnum[]{};
        //Bug
        BUG.weak = new TypeEnum[]{FLYING, ROCK, FIRE};
        BUG.strong = new TypeEnum[]{FIGHTING, GROUND, GRASS};
        BUG.noEffect = new TypeEnum[]{};
        //Ghost
        GHOST.weak = new TypeEnum[]{GHOST, DARK};
        GHOST.strong = new TypeEnum[]{POISON, BUG};
        GHOST.noEffect = new TypeEnum[]{NORMAL, FIGHTING};
        //Psychic
        PSYCHIC.weak = new TypeEnum[]{BUG, GHOST, DARK};
        PSYCHIC.strong = new TypeEnum[]{FIGHTING, PSYCHIC};
        PSYCHIC.noEffect = new TypeEnum[]{};
        //Steel
        STEEL.weak = new TypeEnum[]{FIGHTING, GROUND, FIRE};
        STEEL.strong = new TypeEnum[]{NORMAL, FLYING, ROCK, BUG, STEEL, GRASS, PSYCHIC, ICE, DRAGON, FAIRY};
        STEEL.noEffect = new TypeEnum[]{POISON};
        //Dark
        DARK.weak = new TypeEnum[]{FIGHTING, BUG, FAIRY};
        DARK.strong = new TypeEnum[]{GHOST, DARK};
        DARK.noEffect = new TypeEnum[]{PSYCHIC};
        //Flying
        FLYING.weak = new TypeEnum[]{ROCK, ELECTRIC, ICE};
        FLYING.strong = new TypeEnum[]{FIGHTING, BUG, GRASS};
        FLYING.noEffect = new TypeEnum[]{GROUND};
        //Ice
        ICE.weak = new TypeEnum[]{FIGHTING, ROCK, STEEL, FIRE};
        ICE.strong = new TypeEnum[]{ICE};
        ICE.noEffect = new TypeEnum[]{};
        //Poison
        POISON.weak = new TypeEnum[]{GROUND, PSYCHIC};
        POISON.strong = new TypeEnum[]{FIGHTING, POISON, GRASS, FAIRY};
        POISON.noEffect = new TypeEnum[]{};
        //Ground
        GROUND.weak = new TypeEnum[]{WATER, GRASS, ICE};
        GROUND.strong = new TypeEnum[]{POISON, ROCK};
        GROUND.noEffect = new TypeEnum[]{ELECTRIC};
        //Rock
        ROCK.weak = new TypeEnum[]{FIGHTING, GROUND, STEEL, WATER, GRASS};
        ROCK.strong = new TypeEnum[]{NORMAL, FLYING, POISON, FIRE};
        ROCK.noEffect = new TypeEnum[]{};
        //Dragon
        DRAGON.weak = new TypeEnum[]{ICE, DRAGON, FAIRY};
        DRAGON.strong = new TypeEnum[]{FIRE, WATER, GRASS, ELECTRIC};
        DRAGON.noEffect = new TypeEnum[]{};
        //Fighting
        FIGHTING.weak = new TypeEnum[]{FLYING, PSYCHIC, FAIRY};
        FIGHTING.strong = new TypeEnum[]{ROCK, BUG, DARK};
        FIGHTING.noEffect = new TypeEnum[]{};
        //Fairy
        FAIRY.weak = new TypeEnum[]{POISON, STEEL};
        FAIRY.strong = new TypeEnum[]{FIGHTING, BUG, DARK};
        FAIRY.noEffect = new TypeEnum[]{DRAGON};
        //None to avoid null reference errors
        NONE.weak = new TypeEnum[]{};
        NONE.strong = new TypeEnum[]{};
        NONE.noEffect = new TypeEnum[]{};
    }
}