package com.pokedeck.imie.pokedeck.activity;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.pokedeck.imie.pokedeck.entity.Attack;
import com.pokedeck.imie.pokedeck.enumeration.TypeEnum;
import com.pokedeck.imie.pokedeck.helper.LocalSQLiteOpenHelper;

import java.util.ArrayList;

/**
 * Created by Fab on 19/07/2016.
 */
public class CreateAttackListActivity {

    //Create some attacks (list is not exhaustive)
    public void onCreate(Context context){

        ArrayList<Attack> attacks= new ArrayList<>();

        //Normal attacks
        Attack attack1 = new Attack(1L, "Pound", 40, TypeEnum.NORMAL);
        attacks.add(attack1);
        Attack attack2 = new Attack(2L, "Double Slap", 15, TypeEnum.NORMAL);
        attacks.add(attack2);
        Attack attack3 = new Attack(3L, "Comet Punch", 18, TypeEnum.NORMAL);
        attacks.add(attack3);
        Attack attack4 = new Attack(4L, "Mega Punch", 80, TypeEnum.NORMAL);
        attacks.add(attack4);
        Attack attack5 = new Attack(5L, "Pay Day", 40, TypeEnum.NORMAL);
        attacks.add(attack5);
        Attack attack6 = new Attack(6L, "Cut", 50, TypeEnum.NORMAL);
        attacks.add(attack6);

        //Fighting attacks
        Attack attack7 = new Attack(7L, "Karate Chop", 50, TypeEnum.FIGHTING);
        attacks.add(attack7);
        Attack attack8 = new Attack(8L, "Mach Punch", 40, TypeEnum.FIGHTING);
        attacks.add(attack8);
        Attack attack9 = new Attack(9L, "Triple Kick", 10, TypeEnum.FIGHTING);
        attacks.add(attack9);
        Attack attack10 = new Attack(10L, "Dynamic Punch", 100, TypeEnum.FIGHTING);
        attacks.add(attack10);
        Attack attack11 = new Attack(11L, "Focus Punch", 150, TypeEnum.FIGHTING);
        attacks.add(attack11);
        Attack attack12 = new Attack(12L, "Brick Break", 75, TypeEnum.FIGHTING);
        attacks.add(attack12);

        //Bug attacks
        Attack attack13 = new Attack(13L, "Megahorn", 120, TypeEnum.BUG);
        attacks.add(attack13);
        Attack attack14 = new Attack(14L, "Silver Wind", 60, TypeEnum.BUG);
        attacks.add(attack14);
        Attack attack15 = new Attack(15L, "Signal Beam", 75, TypeEnum.BUG);
        attacks.add(attack15);
        Attack attack16 = new Attack(16L, "Bug Bite", 60, TypeEnum.BUG);
        attacks.add(attack16);
        Attack attack17 = new Attack(17L, "Infestation", 20, TypeEnum.BUG);
        attacks.add(attack17);
        Attack attack18 = new Attack(18L, "Bu Buzz", 90, TypeEnum.BUG);
        attacks.add(attack18);

        //Dark attacks
        Attack attack19 = new Attack(19L, "Bite", 60, TypeEnum.DARK);
        attacks.add(attack19);
        Attack attack20 = new Attack(20L, "Crunch", 80, TypeEnum.DARK);
        attacks.add(attack20);
        Attack attack21 = new Attack(21L, "Night Slash", 70, TypeEnum.DARK);
        attacks.add(attack21);
        Attack attack22 = new Attack(22L, "Sucker Punch", 80, TypeEnum.DARK);
        attacks.add(attack22);
        Attack attack23 = new Attack(23L, "Payback", 50, TypeEnum.DARK);
        attacks.add(attack23);
        Attack attack24 = new Attack(24L, "Pursuit", 40, TypeEnum.DARK);
        attacks.add(attack24);

        //Dragon attacks
        Attack attack25 = new Attack(25L, "Outrage", 120, TypeEnum.DRAGON);
        attacks.add(attack25);
        Attack attack26 = new Attack(26L, "Dragon Claw", 80, TypeEnum.DRAGON);
        attacks.add(attack26);
        Attack attack27 = new Attack(27L, "Draco Meteor", 130, TypeEnum.DRAGON);
        attacks.add(attack27);
        Attack attack28 = new Attack(28L, "Twister", 40, TypeEnum.DRAGON);
        attacks.add(attack28);
        Attack attack29 = new Attack(29L, "Roar of Time", 150, TypeEnum.DRAGON);
        attacks.add(attack29);
        Attack attack30 = new Attack(30L, "Dragon Breath", 60, TypeEnum.DRAGON);
        attacks.add(attack30);

        //Electric attacks
        Attack attack31 = new Attack(31L, "Thunder Punch", 75, TypeEnum.ELECTRIC);
        attacks.add(attack31);
        Attack attack32 = new Attack(32L, "Thunder Shock", 40, TypeEnum.ELECTRIC);
        attacks.add(attack32);
        Attack attack33 = new Attack(33L, "Thunder", 110, TypeEnum.ELECTRIC);
        attacks.add(attack33);
        Attack attack34 = new Attack(34L, "Spark", 65, TypeEnum.ELECTRIC);
        attacks.add(attack34);
        Attack attack35 = new Attack(35L, "Shock wave", 60, TypeEnum.ELECTRIC);
        attacks.add(attack35);
        Attack attack36 = new Attack(36L, "Electroweb", 55, TypeEnum.ELECTRIC);
        attacks.add(attack36);

        //Fairy attacks
        Attack attack37 = new Attack(37L, "Disarming Voice", 40, TypeEnum.FAIRY);
        attacks.add(attack37);
        Attack attack38 = new Attack(38L, "Fairy Wind", 40, TypeEnum.FAIRY);
        attacks.add(attack38);
        Attack attack39 = new Attack(39L, "Draining Kiss", 50, TypeEnum.FAIRY);
        attacks.add(attack39);
        Attack attack40 = new Attack(40L, "Play Rough", 90, TypeEnum.FAIRY);
        attacks.add(attack40);
        Attack attack41 = new Attack(41L, "Moonblast", 95, TypeEnum.FAIRY);
        attacks.add(attack41);
        Attack attack42 = new Attack(42L, "Dazzling Gleam", 95, TypeEnum.FAIRY);
        attacks.add(attack42);

        //Fire attacks
        Attack attack43 = new Attack(43L, "Fire Punch", 75, TypeEnum.FIRE);
        attacks.add(attack43);
        Attack attack44 = new Attack(44L, "Flamethrower", 90, TypeEnum.FIRE);
        attacks.add(attack44);
        Attack attack45 = new Attack(45L, "Fire spin", 35, TypeEnum.FIRE);
        attacks.add(attack45);
        Attack attack46 = new Attack(46L, "Blast Burn", 150, TypeEnum.FIRE);
        attacks.add(attack46);
        Attack attack47 = new Attack(47L, "Flare Blitz", 120, TypeEnum.FIRE);
        attacks.add(attack47);
        Attack attack48 = new Attack(48L, "Inferno", 180, TypeEnum.FIRE);
        attacks.add(attack48);

        //Flying attacks
        Attack attack49 = new Attack(49L, "Wing Attack", 60, TypeEnum.FLYING);
        attacks.add(attack49);
        Attack attack50 = new Attack(50L, "Aeroblast", 100, TypeEnum.FLYING);
        attacks.add(attack50);
        Attack attack51 = new Attack(51L, "Pluck", 60, TypeEnum.FLYING);
        attacks.add(attack51);
        Attack attack52 = new Attack(52L, "Air Slash", 75, TypeEnum.FLYING);
        attacks.add(attack52);
        Attack attack53 = new Attack(53L, "Brave Bird", 120, TypeEnum.FLYING);
        attacks.add(attack53);
        Attack attack54 = new Attack(54L, "Sky Attack", 140, TypeEnum.FLYING);
        attacks.add(attack54);

        //Ghost attacks
        Attack attack55 = new Attack(55L, "Lick", 30, TypeEnum.GHOST);
        attacks.add(attack55);
        Attack attack56 = new Attack(56L, "Shadow Ball", 80, TypeEnum.GHOST);
        attacks.add(attack56);
        Attack attack57 = new Attack(57L, "Shadow Punch", 60, TypeEnum.GHOST);
        attacks.add(attack57);
        Attack attack58 = new Attack(58L, "Shadow Force", 120, TypeEnum.GHOST);
        attacks.add(attack58);
        Attack attack59 = new Attack(59L, "Ominous Wind", 60, TypeEnum.GHOST);
        attacks.add(attack59);
        Attack attack60 = new Attack(60L, "Phantom Force", 90, TypeEnum.GHOST);
        attacks.add(attack60);

        //Grass attacks
        Attack attack61 = new Attack(60L, "Razor Leaf", 55, TypeEnum.GRASS);
        attacks.add(attack61);
        Attack attack62 = new Attack(62L, "Giga Dain", 75, TypeEnum.GRASS);
        attacks.add(attack62);
        Attack attack63 = new Attack(63L, "Bullet Seed", 30, TypeEnum.GRASS);
        attacks.add(attack63);
        Attack attack64 = new Attack(64L, "Leaf Storm", 130, TypeEnum.GRASS);
        attacks.add(attack64);
        Attack attack65 = new Attack(65L, "Vine Weap", 45, TypeEnum.GRASS);
        attacks.add(attack65);
        Attack attack66 = new Attack(66L, "Frenzy Plant", 150, TypeEnum.GRASS);
        attacks.add(attack66);

        //Ground attacks
        Attack attack67 = new Attack(67L, "Earthquake", 100, TypeEnum.GROUND);
        attacks.add(attack67);
        Attack attack68 = new Attack(68L, "Bone Club", 65, TypeEnum.GROUND);
        attacks.add(attack68);
        Attack attack69 = new Attack(69L, "Sand Tomb", 35, TypeEnum.GROUND);
        attacks.add(attack69);
        Attack attack70 = new Attack(70L, "Earth Power", 90, TypeEnum.GROUND);
        attacks.add(attack70);
        Attack attack71 = new Attack(71L, "Precipice Blades", 120, TypeEnum.GROUND);
        attacks.add(attack71);
        Attack attack72 = new Attack(72L, "Mud Bomb", 65, TypeEnum.GROUND);
        attacks.add(attack72);

        //Ice attacks
        Attack attack73 = new Attack(73L, "Ice punch", 75, TypeEnum.ICE);
        attacks.add(attack73);
        Attack attack74 = new Attack(74L, "Aurora Beam", 65, TypeEnum.ICE);
        attacks.add(attack74);
        Attack attack75 = new Attack(75L, "Ice Beam", 90, TypeEnum.ICE);
        attacks.add(attack75);
        Attack attack76 = new Attack(76L, "Blizzard", 110, TypeEnum.ICE);
        attacks.add(attack76);
        Attack attack77 = new Attack(77L, "Ice Burn", 140, TypeEnum.ICE);
        attacks.add(attack77);
        Attack attack78 = new Attack(78L, "Icicle Crash", 85, TypeEnum.ICE);
        attacks.add(attack78);

        //Poison attacks
        Attack attack79 = new Attack(79L, "Acid", 40, TypeEnum.POISON);
        attacks.add(attack79);
        Attack attack80 = new Attack(80L, "Smog", 30, TypeEnum.POISON);
        attacks.add(attack80);
        Attack attack81 = new Attack(81L, "Sludge Bomb", 90, TypeEnum.POISON);
        attacks.add(attack81);
        Attack attack82 = new Attack(82L, "Guk Shot", 120, TypeEnum.POISON);
        attacks.add(attack82);
        Attack attack83 = new Attack(83L, "Cross Poison", 70, TypeEnum.POISON);
        attacks.add(attack83);
        Attack attack84 = new Attack(84L, "Poison Fang", 50, TypeEnum.POISON);
        attacks.add(attack84);

        //psychic attacks
        Attack attack85 = new Attack(85L, "Psybeam", 65, TypeEnum.PSYCHIC);
        attacks.add(attack85);
        Attack attack86 = new Attack(86L, "Confusion", 50, TypeEnum.PSYCHIC);
        attacks.add(attack86);
        Attack attack87 = new Attack(87L, "Dream Eater", 100, TypeEnum.PSYCHIC);
        attacks.add(attack87);
        Attack attack88 = new Attack(88L, "Psychic", 90, TypeEnum.PSYCHIC);
        attacks.add(attack88);
        Attack attack89 = new Attack(89L, "Future Sight", 120, TypeEnum.PSYCHIC);
        attacks.add(attack89);
        Attack attack90 = new Attack(90L, "Psycho Boost", 140, TypeEnum.PSYCHIC);
        attacks.add(attack90);

        //Rock attacks
        Attack attack91 = new Attack(91L, "Rock Throw", 50, TypeEnum.ROCK);
        attacks.add(attack91);
        Attack attack92 = new Attack(92L, "Rock Slide", 75, TypeEnum.ROCK);
        attacks.add(attack92);
        Attack attack93 = new Attack(93L, "Power Gem", 80, TypeEnum.ROCK);
        attacks.add(attack93);
        Attack attack94 = new Attack(94L, "Diamond Storm", 100, TypeEnum.ROCK);
        attacks.add(attack94);
        Attack attack95 = new Attack(95L, "Head Smash", 150, TypeEnum.ROCK);
        attacks.add(attack95);
        Attack attack96 = new Attack(96L, "Rock Blast", 25, TypeEnum.ROCK);
        attacks.add(attack96);

        //Steel attacks
        Attack attack97 = new Attack(97L, "Steel Wing", 70, TypeEnum.STEEL);
        attacks.add(attack97);
        Attack attack98 = new Attack(98L, "Iron Tail", 100, TypeEnum.STEEL);
        attacks.add(attack98);
        Attack attack99 = new Attack(99L, "Metal Claw", 50, TypeEnum.STEEL);
        attacks.add(attack99);
        Attack attack100 = new Attack(100L, "Meteor Mash", 90, TypeEnum.STEEL);
        attacks.add(attack100);
        Attack attack101 = new Attack(101L, "Doom Desire", 140, TypeEnum.STEEL);
        attacks.add(attack101);
        Attack attack102 = new Attack(102L, "Mirror Shot", 65, TypeEnum.STEEL);
        attacks.add(attack102);

        //Water attacks
        Attack attack103 = new Attack(103L, "Bubble Beam", 65, TypeEnum.WATER);
        attacks.add(attack103);
        Attack attack104 = new Attack(104L, "Hydro Cannon", 150, TypeEnum.WATER);
        attacks.add(attack104);
        Attack attack105 = new Attack(105L, "Steam Erruption", 15, TypeEnum.WATER);
        attacks.add(attack105);
        Attack attack106 = new Attack(106L, "Water Pledge", 80, TypeEnum.WATER);
        attacks.add(attack106);
        Attack attack107 = new Attack(107L, "Origin Pulse", 110, TypeEnum.WATER);
        attacks.add(attack107);
        Attack attack108 = new Attack(108L, "Aqua Jet", 40, TypeEnum.WATER);
        attacks.add(attack108);


        //persists attack list in db
        /*LocalSQLiteOpenHelper helper = new LocalSQLiteOpenHelper(context);
        SQLiteDatabase db = helper.getWritableDatabase();

        ContentValues values = new ContentValues();
        for(int i=0; i<attacks.size(); i++){

            values.put("name", attacks.get(i).getName());
            values.put("power", attacks.get(i).getPower());
            values.put("type", attacks.get(i).getType().ordinal());
            attacks.get(i).setId(db.insert("attack", null, values));
            values.clear();
        }

        db.close();*/
    }


}
