package com.pokedeck.imie.pokedeck.enumeration;

/**
 * Created by Fab on 22/07/2016.
 */
public enum AttackEnum {
    Pound,
    DoubleSlap,
    CometPunch,
    MegaPunch,
    PayDay,
    Cut,
    KarateChop,
    MachPunch,
    TripleKick,
    DynamicPunch,
    FocusPunch,
    BrickBreak,
    Megahorn,
    SilverWind,
    SignalBeam,
    BugBite,
    Infestation,
    BuBuzz,
    Bite,
    Crunch,
    NightSlash,
    SuckerPunch,
    Payback,
    Pursuit,
    Outrage,
    DragonClaw,
    DracoMeteor,
    Twister,
    RoarofDragon,
    DragonBreath,
    ThunderPunch,
    ThunderShock,
    Thunder,
    Spark,
    Shockwave,
    Electroweb,
    DisarmingVoice,
    FairyWind,
    DrainingKiss,
    PlayRough,
    Moonblast,
    DazzlingGleam,
    FirePunch,
    Flamethrower,
    Firespin,
    BlastBurn,
    FlareBlitz,
    Inferno,
    WingAttack,
    Aeroblast,
    Pluck,
    AirSlash,
    BraveBird,
    SkyAttack,
    Lick,
    ShadowBall,
    ShadowPunch,
    ShadowForce,
    OminousWind,
    PhantomForce,
    RazorLeaf,
    GigaDain,
    BulletSeed,
    LeafStorm,
    VineWeap,
    FrenzyPlant,
    Earthquake,
    BoneClub,
    SandTomb,
    EarthPower,
    PrecipiceBlades,
    MudBomb,
    IcePunch,
    AuroraBeam,
    IceBeam,
    Blizzard,
    IceBurn,
    IcicleCrash,
    Acid,
    Smog,
    SludgeBomb,
    GukShot,
    CrossPoison,
    PoisonFang,
    Psybeam,
    Confusion,
    DreamEater,
    Psychic,
    FutureSight,
    PsychoBoost,
    RockThrow,
    RockSlide,
    PowerGem,
    DiamondStorm,
    HeadSmash,
    RockBlast,
    SteelWing,
    IronTail,
    MetalClaw,
    MeteorMash,
    DoomDesire,
    MirrorShot,
    BubbleBeam,
    HydroCannon,
    SteamErruption,
    WaterPledge,
    OriginPulse,
    AquaJet;

    public String name;
    public int power;
    public TypeEnum type;

    static{
        Pound.name =  "Pound";
        Pound.power = 40;
        Pound.type =  TypeEnum.NORMAL;

        DoubleSlap.name = "Double Slap";
        DoubleSlap.power = 15;
        DoubleSlap.type = TypeEnum.NORMAL;

        CometPunch.name = "Comet Punch";
        CometPunch.power = 18;
        CometPunch.type = TypeEnum.NORMAL;

        MegaPunch.name = "Mega Punch";
        MegaPunch.power = 80;
        MegaPunch.type = TypeEnum.NORMAL;

        PayDay.name = "Pay Day";
        PayDay.power = 40;
        PayDay.type = TypeEnum.NORMAL;

        Cut.name =  "Cut";
        Cut.power = 50;
        Cut.type =  TypeEnum.NORMAL;

        KarateChop.name = "Karate Chop";
        KarateChop.power = 50;
        KarateChop.type = TypeEnum.FIGHTING;

        MachPunch.name = "Mach Punch";
        MachPunch.power = 40;
        MachPunch.type = TypeEnum.FIGHTING;

        TripleKick.name = "Triple Kick";
        TripleKick.power = 10;
        TripleKick.type = TypeEnum.FIGHTING;

        DynamicPunch.name = "Dynamic Punch";
        DynamicPunch.power = 100;
        DynamicPunch.type = TypeEnum.FIGHTING;

        FocusPunch.name = "Focus Punch";
        FocusPunch.power = 150;
        FocusPunch.type = TypeEnum.FIGHTING;

        BrickBreak.name = "Brick Break";
        BrickBreak.power = 75;
        BrickBreak.type = TypeEnum.FIGHTING;

        Megahorn.name =  "Megahorn";
        Megahorn.power = 120;
        Megahorn.type =  TypeEnum.BUG;

        SilverWind.name = "Silver Wind";
        SilverWind.power = 60;
        SilverWind.type = TypeEnum.BUG;

        SignalBeam.name = "Signal Beam";
        SignalBeam.power = 75;
        SignalBeam.type = TypeEnum.BUG;

        BugBite.name = "Bug Bite";
        BugBite.power = 60;
        BugBite.type = TypeEnum.BUG;

        Infestation.name =  "Infestation";
        Infestation.power = 20;
        Infestation.type =  TypeEnum.BUG;

        BuBuzz.name = "Bu Buzz";
        BuBuzz.power = 90;
        BuBuzz.type = TypeEnum.BUG;

        Bite.name =  "Bite";
        Bite.power = 60;
        Bite.type =  TypeEnum.DARK;

        Crunch.name =  "Crunch";
        Crunch.power = 80;
        Crunch.type =  TypeEnum.DARK;

        NightSlash.name = "Night Slash";
        NightSlash.power = 70;
        NightSlash.type = TypeEnum.DARK;

        SuckerPunch.name = "Sucker Punch";
        SuckerPunch.power = 80;
        SuckerPunch.type = TypeEnum.DARK;

        Payback.name =  "Payback";
        Payback.power = 50;
        Payback.type =  TypeEnum.DARK;

        Pursuit.name =  "Pursuit";
        Pursuit.power = 40;
        Pursuit.type =  TypeEnum.DARK;

        Outrage.name =  "Outrage";
        Outrage.power = 120;
        Outrage.type =  TypeEnum.DRAGON;

        DragonClaw.name = "Dragon Claw";
        DragonClaw.power = 80;
        DragonClaw.type = TypeEnum.DRAGON;

        DracoMeteor.name = "Draco Meteor";
        DracoMeteor.power = 130;
        DracoMeteor.type = TypeEnum.DRAGON;

        Twister.name =  "Twister";
        Twister.power = 40;
        Twister.type =  TypeEnum.DRAGON;

        RoarofDragon.name = "Roar of Dragon";
        RoarofDragon.power = 150;
        RoarofDragon.type = TypeEnum.DRAGON;

        DragonBreath.name = "Dragon Breath";
        DragonBreath.power = 60;
        DragonBreath.type = TypeEnum.DRAGON;

        ThunderPunch.name = "Thunder Punch";
        ThunderPunch.power = 75;
        ThunderPunch.type = TypeEnum.ELECTRIC;

        ThunderShock.name = "Thunder Shock";
        ThunderShock.power = 40;
        ThunderShock.type = TypeEnum.ELECTRIC;

        Thunder.name =  "Thunder";
        Thunder.power = 110;
        Thunder.type =  TypeEnum.ELECTRIC;

        Spark.name =  "Spark";
        Spark.power = 65;
        Spark.type =  TypeEnum.ELECTRIC;

        Shockwave.name = "Shock wave";
        Shockwave.power = 60;
        Shockwave.type = TypeEnum.ELECTRIC;

        Electroweb.name =  "Electroweb";
        Electroweb.power = 55;
        Electroweb.type =  TypeEnum.ELECTRIC;

        DisarmingVoice.name = "Disarming Voice";
        DisarmingVoice.power =40;
        DisarmingVoice.type = TypeEnum.FAIRY;

        FairyWind.name = "Fairy Wind";
        FairyWind.power = 40;
        FairyWind.type = TypeEnum.FAIRY;

        DrainingKiss.name = "Draining Kiss";
        DrainingKiss.power = 50;
        DrainingKiss.type = TypeEnum.FAIRY;

        PlayRough.name = "Play Rough";
        PlayRough.power = 90;
        PlayRough.type = TypeEnum.FAIRY;

        Moonblast.name =  "Moonblast";
        Moonblast.power = 95;
        Moonblast.type =  TypeEnum.FAIRY;

        DazzlingGleam.name = "Dazzling Gleam";
        DazzlingGleam.power = 95;
        DazzlingGleam.type = TypeEnum.FAIRY;

        FirePunch.name = "Fire Punch";
        FirePunch.power = 75;
        FirePunch.type = TypeEnum.FIRE;

        Flamethrower.name =  "Flamethrower";
        Flamethrower.power = 90;
        Flamethrower.type =  TypeEnum.FIRE;

        Firespin.name = "Fire spin";
        Firespin.power = 35;
        Firespin.type = TypeEnum.FIRE;

        BlastBurn.name = "Blast Burn";
        BlastBurn.power = 150;
        BlastBurn.type = TypeEnum.FIRE;

        FlareBlitz.name = "Flare Blitz";
        FlareBlitz.power = 120;
        FlareBlitz.type = TypeEnum.FIRE;

        Inferno.name =  "Inferno";
        Inferno.power = 180;
        Inferno.type =  TypeEnum.FIRE;

        WingAttack.name = "Wing Attack";
        WingAttack.power = 60;
        WingAttack.type = TypeEnum.FLYING;

        Aeroblast.name =  "Aeroblast";
        Aeroblast.power = 100;
        Aeroblast.type =  TypeEnum.FLYING;

        Pluck.name =  "Pluck";
        Pluck.power = 60;
        Pluck.type =  TypeEnum.FLYING;

        AirSlash.name = "Air Slash";
        AirSlash.power = 75;
        AirSlash.type = TypeEnum.FLYING;

        BraveBird.name = "Brave Bird";
        BraveBird.power = 120;
        BraveBird.type = TypeEnum.FLYING;

        SkyAttack.name = "Sky Attack";
        SkyAttack.power = 140;
        SkyAttack.type = TypeEnum.FLYING;

        Lick.name =  "Lick";
        Lick.power = 30;
        Lick.type =  TypeEnum.GHOST;

        ShadowBall.name = "Shadow Ball";
        ShadowBall.power = 80;
        ShadowBall.type = TypeEnum.GHOST;

        ShadowPunch.name = "Shadow Punch";
        ShadowPunch.power = 60;
        ShadowPunch.type = TypeEnum.GHOST;

        ShadowForce.name = "Shadow Force";
        ShadowForce.power = 120;
        ShadowForce.type = TypeEnum.GHOST;

        OminousWind.name = "Ominous Wind";
        OminousWind.power = 60;
        OminousWind.type = TypeEnum.GHOST;

        PhantomForce.name = "Phantom Force";
        PhantomForce.power = 90;
        PhantomForce.type = TypeEnum.GHOST;

        RazorLeaf.name = "Razor Leaf";
        RazorLeaf.power = 55;
        RazorLeaf.type = TypeEnum.GRASS;

        GigaDain.name = "Giga Dain";
        GigaDain.power = 75;
        GigaDain.type = TypeEnum.GRASS;

        BulletSeed.name = "Bullet Seed";
        BulletSeed.power = 30;
        BulletSeed.type = TypeEnum.GRASS;

        LeafStorm.name = "Leaf Storm";
        LeafStorm.power = 130;
        LeafStorm.type = TypeEnum.GRASS;

        VineWeap.name = "Vine Weap";
        VineWeap.power = 45;
        VineWeap.type = TypeEnum.GRASS;

        FrenzyPlant.name = "Frenzy Plant";
        FrenzyPlant.power = 150;
        FrenzyPlant.type = TypeEnum.GRASS;

        Earthquake.name =  "Earthquake";
        Earthquake.power = 100;
        Earthquake.type =  TypeEnum.GROUND;

        BoneClub.name = "Bone Club";
        BoneClub.power = 65;
        BoneClub.type = TypeEnum.GROUND;

        SandTomb.name = "Sand Tomb";
        SandTomb.power = 35;
        SandTomb.type = TypeEnum.GROUND;

        EarthPower.name = "Earth Power";
        EarthPower.power = 90;
        EarthPower.type = TypeEnum.GROUND;

        PrecipiceBlades.name = "Precipice Blades";
        PrecipiceBlades.power = 120;
        PrecipiceBlades.type = TypeEnum.GROUND;

        MudBomb.name = "Mud Bomb";
        MudBomb.power = 65;
        MudBomb.type = TypeEnum.GROUND;

        IcePunch.name = "Ice punch";
        IcePunch.power = 75;
        IcePunch.type = TypeEnum.ICE;

        AuroraBeam.name = "Aurora Beam";
        AuroraBeam.power = 65;
        AuroraBeam.type = TypeEnum.ICE;

        IceBeam.name = "Ice Beam";
        IceBeam.power = 90;
        IceBeam.type = TypeEnum.ICE;

        Blizzard.name =  "Blizzard";
        Blizzard.power = 110;
        Blizzard.type =  TypeEnum.ICE;

        IceBurn.name = "Ice Burn";
        IceBurn.power = 140;
        IceBurn.type = TypeEnum.ICE;

        IcicleCrash.name = "Icicle Crash";
        IcicleCrash.power = 85;
        IcicleCrash.type = TypeEnum.ICE;

        Acid.name =  "Acid";
        Acid.power = 40;
        Acid.type =  TypeEnum.POISON;

        Smog.name =  "Smog";
        Smog.power = 30;
        Smog.type =  TypeEnum.POISON;

        SludgeBomb.name = "Sludge Bomb";
        SludgeBomb.power = 90;
        SludgeBomb.type = TypeEnum.POISON;

        GukShot.name = "Guk Shot";
        GukShot.power = 120;
        GukShot.type = TypeEnum.POISON;

        CrossPoison.name = "Cross Poison";
        CrossPoison.power = 70;
        CrossPoison.type = TypeEnum.POISON;

        PoisonFang.name = "Poison Fang";
        PoisonFang.power = 50;
        PoisonFang.type = TypeEnum.POISON;

        Psybeam.name =  "Psybeam";
        Psybeam.power = 65;
        Psybeam.type =  TypeEnum.PSYCHIC;

        Confusion.name =  "Confusion";
        Confusion.power = 50;
        Confusion.type =  TypeEnum.PSYCHIC;

        DreamEater.name = "Dream Eater";
        DreamEater.power = 100;
        DreamEater.type = TypeEnum.PSYCHIC;

        Psychic.name =  "Psychic";
        Psychic.power = 90;
        Psychic.type =  TypeEnum.PSYCHIC;

        FutureSight.name = "Future Sight";
        FutureSight.power = 120;
        FutureSight.type = TypeEnum.PSYCHIC;

        PsychoBoost.name = "Psycho Boost";
        PsychoBoost.power = 140;
        PsychoBoost.type = TypeEnum.PSYCHIC;

        RockThrow.name = "Rock Throw";
        RockThrow.power = 50;
        RockThrow.type = TypeEnum.ROCK;

        RockSlide.name = "Rock Slide";
        RockSlide.power = 75;
        RockSlide.type = TypeEnum.ROCK;

        PowerGem.name = "Power Gem";
        PowerGem.power = 80;
        PowerGem.type = TypeEnum.ROCK;

        DiamondStorm.name = "Diamond Storm";
        DiamondStorm.power = 100;
        DiamondStorm.type = TypeEnum.ROCK;

        HeadSmash.name = "Head Smash";
        HeadSmash.power = 150;
        HeadSmash.type = TypeEnum.ROCK;

        RockBlast.name = "Rock Blast";
        RockBlast.power = 25;
        RockBlast.type = TypeEnum.ROCK;

        SteelWing.name = "Steel Wing";
        SteelWing.power = 70;
        SteelWing.type = TypeEnum.STEEL;

        IronTail.name = "Iron Tail";
        IronTail.power = 100;
        IronTail.type = TypeEnum.STEEL;

        MetalClaw.name = "Metal Claw";
        MetalClaw.power = 50;
        MetalClaw.type = TypeEnum.STEEL;

        MeteorMash.name = "Meteor Mash";
        MeteorMash.power = 90;
        MeteorMash.type = TypeEnum.STEEL;

        DoomDesire.name = "Doom Desire";
        DoomDesire.power = 140;
        DoomDesire.type = TypeEnum.STEEL;

        MirrorShot.name = "Mirror Shot";
        MirrorShot.power = 65;
        MirrorShot.type = TypeEnum.STEEL;

        BubbleBeam.name = "Bubble Beam";
        BubbleBeam.power = 65;
        BubbleBeam.type = TypeEnum.WATER;

        HydroCannon.name = "Hydro Cannon";
        HydroCannon.power = 150;
        HydroCannon.type = TypeEnum.WATER;

        SteamErruption.name = "Steam Erruption";
        SteamErruption.power= 15;
        SteamErruption.type = TypeEnum.WATER;

        WaterPledge.name = "Water Pledge";
        WaterPledge.power = 80;
        WaterPledge.type = TypeEnum.WATER;

        OriginPulse.name = "Origin Pulse";
        OriginPulse.power = 110;
        OriginPulse.type = TypeEnum.WATER;

        AquaJet.name = "Aqua Jet";
        AquaJet.power = 40;
        AquaJet.type = TypeEnum.WATER;

    }

}
