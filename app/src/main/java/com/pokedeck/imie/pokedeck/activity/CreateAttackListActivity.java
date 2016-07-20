package com.pokedeck.imie.pokedeck.activity;

import com.pokedeck.imie.pokedeck.entity.Attack;
import com.pokedeck.imie.pokedeck.enumeration.TypeEnum;

/**
 * Created by Fab on 19/07/2016.
 */
public class CreateAttackListActivity {

    //Create some attacks (list is not exhaustive)
    public void onCreate(){

        //Normal attacks
        Attack attack1 = new Attack(1, "Pound", 40, TypeEnum.NORMAL);
        Attack attack2 = new Attack(2, "Double Slap", 15, TypeEnum.NORMAL);
        Attack attack3 = new Attack(3, "Comet Punch", 18, TypeEnum.NORMAL);
        Attack attack4 = new Attack(4, "Mega Punch", 80, TypeEnum.NORMAL);
        Attack attack5 = new Attack(5, "Pay Day", 40, TypeEnum.NORMAL);
        Attack attack6 = new Attack(6, "Cut", 50, TypeEnum.NORMAL);

        //Fighting attacks
        Attack attack7 = new Attack(7, "Karate Chop", 50, TypeEnum.FIGHTING);
        Attack attack8 = new Attack(9, "Mach Punch", 40, TypeEnum.FIGHTING);
        Attack attack9 = new Attack(9, "Triple Kick", 10, TypeEnum.FIGHTING);
        Attack attack10 = new Attack(10, "Dynamic Punch", 100, TypeEnum.FIGHTING);
        Attack attack11 = new Attack(11, "Focus Punch", 150, TypeEnum.FIGHTING);
        Attack attack12 = new Attack(12, "Brick Break", 75, TypeEnum.FIGHTING);

        //Bug attacks
        Attack attack13 = new Attack(13, "Megahorn", 120, TypeEnum.BUG);
        Attack attack14 = new Attack(14, "Silver Wind", 60, TypeEnum.BUG);
        Attack attack15 = new Attack(15, "Signal Beam", 75, TypeEnum.BUG);
        Attack attack16 = new Attack(16, "Bug Bite", 60, TypeEnum.BUG);
        Attack attack17 = new Attack(17, "Infestation", 20, TypeEnum.BUG);
        Attack attack18 = new Attack(18, "Bu Buzz", 90, TypeEnum.BUG);

        //Dark attacks
        Attack attack19 = new Attack(19, "Bite", 60, TypeEnum.DARK);
        Attack attack20 = new Attack(20, "Crunch", 80, TypeEnum.DARK);
        Attack attack21 = new Attack(21, "Night Slash", 70, TypeEnum.DARK);
        Attack attack22 = new Attack(22, "Sucker Punch", 80, TypeEnum.DARK);
        Attack attack23 = new Attack(23, "Payback", 50, TypeEnum.DARK);
        Attack attack24 = new Attack(24, "Pursuit", 40, TypeEnum.DARK);

        //Dragon attacks
        Attack attack25 = new Attack(25, "Outrage", 120, TypeEnum.DRAGON);
        Attack attack26 = new Attack(26, "Dragon Claw", 80, TypeEnum.DRAGON);
        Attack attack27 = new Attack(27, "Draco Meteor", 130, TypeEnum.DRAGON);
        Attack attack28 = new Attack(28, "Twister", 40, TypeEnum.DRAGON);
        Attack attack29 = new Attack(29, "Roar of Time", 150, TypeEnum.DRAGON);
        Attack attack30 = new Attack(30, "Dragon Breath", 60, TypeEnum.DRAGON);

        //Electric attacks
        Attack attack31 = new Attack(31, "Thunder Punch", 75, TypeEnum.ELECTRIC);
        Attack attack32 = new Attack(32, "Thunder Shock", 40, TypeEnum.ELECTRIC);
        Attack attack33 = new Attack(33, "Thunder", 110, TypeEnum.ELECTRIC);
        Attack attack34 = new Attack(34, "Spark", 65, TypeEnum.ELECTRIC);
        Attack attack35 = new Attack(35, "Shock wave", 60, TypeEnum.ELECTRIC);
        Attack attack36 = new Attack(36, "Electroweb", 55, TypeEnum.ELECTRIC);

        //Fairy attacks
        Attack attack37 = new Attack(37, "Disarming Voice", 40, TypeEnum.FAIRY);
        Attack attack38 = new Attack(38, "Fairy Wind", 40, TypeEnum.FAIRY);
        Attack attack39 = new Attack(39, "Draining Kiss", 50, TypeEnum.FAIRY);
        Attack attack40 = new Attack(40, "Play Rough", 90, TypeEnum.FAIRY);
        Attack attack41 = new Attack(41, "Moonblast", 95, TypeEnum.FAIRY);
        Attack attack42 = new Attack(42, "Dazzling Gleam", 95, TypeEnum.FAIRY);

        //Fire attacks
        Attack attack43 = new Attack(43, "Fire Punch", 75, TypeEnum.FIRE);
        Attack attack44 = new Attack(44, "Flamethrower", 90, TypeEnum.FIRE);
        Attack attack45 = new Attack(45, "Fire spin", 35, TypeEnum.FIRE);
        Attack attack46 = new Attack(46, "Blast Burn", 150, TypeEnum.FIRE);
        Attack attack47 = new Attack(47, "Flare Blitz", 120, TypeEnum.FIRE);
        Attack attack48 = new Attack(48, "Inferno", 180, TypeEnum.FIRE);

        //Flying attacks
        Attack attack49 = new Attack(49, "Wing Attack", 60, TypeEnum.FLYING);
        Attack attack50 = new Attack(50, "Aeroblast", 100, TypeEnum.FLYING);
        Attack attack51 = new Attack(51, "Pluck", 60, TypeEnum.FLYING);
        Attack attack52 = new Attack(52, "Air Slash", 75, TypeEnum.FLYING);
        Attack attack53 = new Attack(53, "Brave Bird", 120, TypeEnum.FLYING);
        Attack attack54 = new Attack(54, "Sky Attack", 140, TypeEnum.FLYING);

        //Ghost attacks
        Attack attack55 = new Attack(55, "Lick", 30, TypeEnum.GHOST);
        Attack attack56 = new Attack(56, "Shadow Ball", 80, TypeEnum.GHOST);
        Attack attack57 = new Attack(57, "Shadow Punch", 60, TypeEnum.GHOST);
        Attack attack58 = new Attack(58, "Shadow Force", 120, TypeEnum.GHOST);
        Attack attack59 = new Attack(59, "Ominous Wind", 60, TypeEnum.GHOST);
        Attack attack60 = new Attack(60, "Phantom Force", 90, TypeEnum.GHOST);

        //Grass attacks
        Attack attack61 = new Attack(60, "Razor Leaf", 55, TypeEnum.GRASS);
        Attack attack62 = new Attack(62, "Giga Dain", 75, TypeEnum.GRASS);
        Attack attack63 = new Attack(63, "Bullet Seed", 30, TypeEnum.GRASS);
        Attack attack64 = new Attack(64, "Leaf Storm", 130, TypeEnum.GRASS);
        Attack attack65 = new Attack(65, "Vine Weap", 45, TypeEnum.GRASS);
        Attack attack66 = new Attack(66, "Frenzy Plant", 150, TypeEnum.GRASS);

        //Ground attacks
        Attack attack67 = new Attack(67, "Earthquake", 100, TypeEnum.GROUND);
        Attack attack68 = new Attack(68, "Bone Club", 65, TypeEnum.GROUND);
        Attack attack69 = new Attack(69, "Sand Tomb", 35, TypeEnum.GROUND);
        Attack attack70 = new Attack(70, "Earth Power", 90, TypeEnum.GROUND);
        Attack attack71 = new Attack(71, "Precipice Blades", 120, TypeEnum.GROUND);
        Attack attack72 = new Attack(72, "Mud Bomb", 65, TypeEnum.GROUND);

        //Ice attacks
        Attack attack73 = new Attack(73, "Ice punch", 75, TypeEnum.ICE);
        Attack attack74 = new Attack(74, "Aurora Beam", 65, TypeEnum.ICE);
        Attack attack75 = new Attack(75, "Ice Beam", 90, TypeEnum.ICE);
        Attack attack76 = new Attack(76, "Blizzard", 110, TypeEnum.ICE);
        Attack attack77 = new Attack(77, "Ice Burn", 140, TypeEnum.ICE);
        Attack attack78 = new Attack(78, "Icicle Crash", 85, TypeEnum.ICE);

        //Poison attacks
        Attack attack79 = new Attack(79, "Acid", 40, TypeEnum.POISON);
        Attack attack80 = new Attack(80, "Smog", 30, TypeEnum.POISON);
        Attack attack81 = new Attack(81, "Sludge Bomb", 90, TypeEnum.POISON);
        Attack attack82 = new Attack(82, "Guk Shot", 120, TypeEnum.POISON);
        Attack attack83 = new Attack(83, "Cross Poison", 70, TypeEnum.POISON);
        Attack attack84 = new Attack(84, "Poison Fang", 50, TypeEnum.POISON);

        //psychic attacks
        Attack attack85 = new Attack(85, "Psybeam", 65, TypeEnum.PSYCHIC);
        Attack attack86 = new Attack(86, "Confusion", 50, TypeEnum.PSYCHIC);
        Attack attack87 = new Attack(87, "Dream Eater", 100, TypeEnum.PSYCHIC);
        Attack attack88 = new Attack(88, "Psychic", 90, TypeEnum.PSYCHIC);
        Attack attack89 = new Attack(89, "Future Sight", 120, TypeEnum.PSYCHIC);
        Attack attack90 = new Attack(90, "Psycho Boost", 140, TypeEnum.PSYCHIC);

        //Rock attacks
        Attack attack91 = new Attack(91, "Rock Throw", 50, TypeEnum.ROCK);
        Attack attack92 = new Attack(92, "Rock Slide", 75, TypeEnum.ROCK);
        Attack attack93 = new Attack(93, "Power Gem", 80, TypeEnum.ROCK);
        Attack attack94 = new Attack(94, "Diamond Storm", 100, TypeEnum.ROCK);
        Attack attack95 = new Attack(95, "Head Smash", 150, TypeEnum.ROCK);
        Attack attack96 = new Attack(96, "Rock Blast", 25, TypeEnum.ROCK);

        //Steel attacks
        Attack attack97 = new Attack(97, "Steel Wing", 70, TypeEnum.STEEL);
        Attack attack98 = new Attack(98, "Iron Tail", 100, TypeEnum.STEEL);
        Attack attack99 = new Attack(99, "Metal Claw", 50, TypeEnum.STEEL);
        Attack attack100 = new Attack(100, "Meteor Mash", 90, TypeEnum.STEEL);
        Attack attack101 = new Attack(101, "Doom Desire", 140, TypeEnum.STEEL);
        Attack attack102 = new Attack(102, "Mirror Shot", 65, TypeEnum.STEEL);

        //Water attacks
        Attack attack103 = new Attack(103, "Bubble Beam", 65, TypeEnum.WATER);
        Attack attack104 = new Attack(104, "Hydro Cannon", 150, TypeEnum.WATER);
        Attack attack105 = new Attack(105, "Steam Erruption", 15, TypeEnum.WATER);
        Attack attack106 = new Attack(106, "Water Pledge", 80, TypeEnum.WATER);
        Attack attack107 = new Attack(107, "Origin Pulse", 110, TypeEnum.WATER);
        Attack attack108 = new Attack(108, "Aqua Jet", 40, TypeEnum.WATER);
    }


}
