package com.pokedeck.imie.pokedeck.enumeration;

public enum PokemonTypeEnum {
    BULBIZARRE,
    HERBIZARRE,
    FLORIZARRE,
    SALAMECHE,
    REPTINCEL,
    DRACAUFEU,
    CARAPUCE,
    CARABAFFE,
    TORTANK,
    CHENIPAN,
    CHRYSACIER,
    PAPILUSION,
    ASPICOT,
    COCONFORT,
    DARDARGNAN,
    ROUCOOL,
    ROUCOUPS,
    ROUCARNAGE,
    RATTATA,
    RATTATAC,
    PIAFABEC,
    RAPASDEPIC,
    ABO,
    ARBOK,
    PIKACHU,
    RAICHU,
    SABELETTE,
    SABLAIREAU,
    NIDORANF,
    NIDORINA,
    NIDOQUEEN,
    NIDORANM,
    NIDORINO,
    NIDOKING,
    MELOFEE,
    MELODELFE,
    GOUPIX,
    FEUNARD,
    RONDOUDOU,
    GRODOUDOU,
    NOSFERAPTI,
    NOSFERALTO,
    MYSTHERBE,
    ORTIDE,
    RAFFLESIA,
    PARAS,
    PARASECT,
    MIMITOSS,
    AEROMITE,
    TAUPIQUEUR,
    TRIOPIKEUR,
    MIAOUSS,
    PERSIAN,
    PSYKOKWAK,
    AKWAKWAK,
    FEROSINGE,
    COLOSSINGE,
    CANINOS,
    ARCANIN,
    PTITARD,
    TETARTE,
    TARTARD,
    ABRA,
    KADABRA,
    ALAKAZAM,
    MACHOC,
    MACHOPEUR,
    MACKOGNEUR,
    CHETIFLOR,
    BOUSTIFLOR,
    EMPIFLOR,
    TENTACOOL,
    TENTACRUEL,
    RACAILLOU,
    GRAVALANCH,
    GROLEM,
    PONYTA,
    GALOPA,
    RAMOLOSS,
    FLAGADOSS,
    MAGNETI,
    MAGNETON,
    CANARTICHO,
    DODUO,
    DODRIO,
    OTARIA,
    LAMANTINE,
    TADMORV,
    GROTADMORV,
    KOKIYAS,
    CRUSTABRI,
    FANTOMINUS,
    SPECTRUM,
    ECTOPLASMA,
    ONIX,
    SOPORIFIK,
    HYPNOMADE,
    KRABBY,
    KRABBOSS,
    VOLTORBE,
    ELECTRODE,
    NOEUNOEUF,
    NOADKOKO,
    OSSELAIT,
    OSSATUEUR,
    KICKLEE,
    TYGNON,
    EXCELANGUE,
    SMOGO,
    SMOGOGO,
    RHINOCORNE,
    RHINOFEROS,
    LEVEINARD,
    SAQUEDENEU,
    KANGOUREX,
    HYPOTREMPE,
    HYPOCEAN,
    POISSIRENE,
    POISSOROY,
    STARI,
    STAROSS,
    MMIME,
    INSECATEUR,
    LIPPOUTOU,
    ELEKTEK,
    MAGMAR,
    SCARABRUTE,
    TAUROS,
    MAGICARPE,
    LEVIATOR,
    LOKHLASS,
    METAMORPH,
    EVOLI,
    AQUALI,
    VOLTALI,
    PYROLI,
    PORYGON,
    AMONITA,
    AMONISTAR,
    KABUTO,
    KABUTOPS,
    PTERA,
    RONFLEX,
    ARTIKODIN,
    ELECTHOR,
    SULFURA,
    MINIDRACO,
    DRACO,
    DRACOLOSSE,
    MEWTWO,
    MEW;

    public String name;
    public Integer idPokedex;
    public TypeEnum[] types;

    static {
        //BULBIZARRE
        BULBIZARRE.name = "BULBIZARRE";
        BULBIZARRE.idPokedex = 1;
        BULBIZARRE.types = new TypeEnum[]{TypeEnum.POISON, TypeEnum.GRASS};

        //HERBIZARRE
        HERBIZARRE.name = "HERBIZARRE";
        HERBIZARRE.idPokedex = 2;
        HERBIZARRE.types = new TypeEnum[]{TypeEnum.POISON, TypeEnum.GRASS};

        //FLORIZARRE
        FLORIZARRE.name = "FLORIZARRE";
        FLORIZARRE.idPokedex = 3;
        FLORIZARRE.types = new TypeEnum[]{TypeEnum.POISON, TypeEnum.GRASS};

        //SALAMECHE
        SALAMECHE.name = "SALAMECHE";
        SALAMECHE.idPokedex = 4;
        SALAMECHE.types = new TypeEnum[]{TypeEnum.FIRE};

        //REPTINCEL
        REPTINCEL.name = "REPTINCEL";
        REPTINCEL.idPokedex = 5;
        REPTINCEL.types = new TypeEnum[]{TypeEnum.FIRE};

        //DRACAUFEU
        DRACAUFEU.name = "DRACAUFEU";
        DRACAUFEU.idPokedex = 6;
        DRACAUFEU.types = new TypeEnum[]{TypeEnum.FIRE, TypeEnum.FLYING};

        //CARAPUCE
        CARAPUCE.name = "CARAPUCE";
        CARAPUCE.idPokedex = 7;
        CARAPUCE.types = new TypeEnum[]{TypeEnum.WATER};

        //CARABAFFE
        CARABAFFE.name = "CARABAFFE";
        CARABAFFE.idPokedex = 8;
        CARABAFFE.types = new TypeEnum[]{TypeEnum.WATER};

        //TORTANK
        TORTANK.name = "TORTANK";
        TORTANK.idPokedex = 9;
        TORTANK.types = new TypeEnum[]{TypeEnum.WATER};

        //CHENIPAN
        CHENIPAN.name = "CHENIPAN";
        CHENIPAN.idPokedex = 10;
        CHENIPAN.types = new TypeEnum[]{TypeEnum.BUG};

        //CHRYSACIER
        CHRYSACIER.name = "CHRYSACIER";
        CHRYSACIER.idPokedex = 11;
        CHRYSACIER.types = new TypeEnum[]{TypeEnum.BUG};

        //PAPILUSION
        PAPILUSION.name = "PAPILUSION";
        PAPILUSION.idPokedex = 12;
        PAPILUSION.types = new TypeEnum[]{TypeEnum.BUG, TypeEnum.FLYING};

        //ASPICOT
        ASPICOT.name = "ASPICOT";
        ASPICOT.idPokedex = 13;
        ASPICOT.types = new TypeEnum[]{TypeEnum.BUG, TypeEnum.POISON};

        //COCONFORT
        COCONFORT.name = "COCONFORT";
        COCONFORT.idPokedex = 14;
        COCONFORT.types = new TypeEnum[]{TypeEnum.BUG, TypeEnum.POISON};

        //DARDARGNAN
        DARDARGNAN.name = "DARDARGNAN";
        DARDARGNAN.idPokedex = 15;
        DARDARGNAN.types = new TypeEnum[]{TypeEnum.BUG, TypeEnum.POISON};

        //ROUCOOL
        ROUCOOL.name = "ROUCOOL";
        ROUCOOL.idPokedex = 16;
        ROUCOOL.types = new TypeEnum[]{TypeEnum.NORMAL, TypeEnum.FLYING};

        //ROUCOUPS
        ROUCOUPS.name = "ROUCOUPS";
        ROUCOUPS.idPokedex = 17;
        ROUCOUPS.types = new TypeEnum[]{TypeEnum.NORMAL, TypeEnum.FLYING};

        //ROUCARNAGE
        ROUCARNAGE.name = "ROUCARNAGE";
        ROUCARNAGE.idPokedex = 18;
        ROUCARNAGE.types = new TypeEnum[]{TypeEnum.NORMAL, TypeEnum.FLYING};

        //RATTATA
        RATTATA.name = "RATTATA";
        RATTATA.idPokedex = 19;
        RATTATA.types = new TypeEnum[]{TypeEnum.NORMAL};

        //RATTATAC
        RATTATAC.name = "RATTATAC";
        RATTATAC.idPokedex = 20;
        RATTATAC.types = new TypeEnum[]{TypeEnum.NORMAL};

        //PIAFABEC
        PIAFABEC.name = "PIAFABEC";
        PIAFABEC.idPokedex = 21;
        PIAFABEC.types = new TypeEnum[]{TypeEnum.NORMAL, TypeEnum.FLYING};

        //RAPASDEPIC
        RAPASDEPIC.name = "RAPASDEPIC";
        RAPASDEPIC.idPokedex = 22;
        RAPASDEPIC.types = new TypeEnum[]{TypeEnum.NORMAL, TypeEnum.FLYING};

        //ABO
        ABO.name = "ABO";
        ABO.idPokedex = 23;
        ABO.types = new TypeEnum[]{TypeEnum.POISON};

        //ARBOK
        ARBOK.name = "ARBOK";
        ARBOK.idPokedex = 24;
        ARBOK.types = new TypeEnum[]{TypeEnum.POISON};

        //PIKACHU
        PIKACHU.name = "PIKACHU";
        PIKACHU.idPokedex = 25;
        PIKACHU.types = new TypeEnum[]{TypeEnum.ELECTRIC};

        //RAICHU
        RAICHU.name = "RAICHU";
        RAICHU.idPokedex = 26;
        RAICHU.types = new TypeEnum[]{TypeEnum.ELECTRIC};

        //SABELETTE
        SABELETTE.name = "SABELETTE";
        SABELETTE.idPokedex = 27;
        SABELETTE.types = new TypeEnum[]{TypeEnum.GROUND};

        //SABLAIREAU
        SABLAIREAU.name = "SABLAIREAU";
        SABLAIREAU.idPokedex = 28;
        SABLAIREAU.types = new TypeEnum[]{TypeEnum.GROUND};

        //NIDORANF
        NIDORANF.name = "NIDORANF";
        NIDORANF.idPokedex = 29;
        NIDORANF.types = new TypeEnum[]{TypeEnum.POISON};

        //NIDORINA
        NIDORINA.name = "NIDORINA";
        NIDORINA.idPokedex = 30;
        NIDORINA.types = new TypeEnum[]{TypeEnum.POISON};

        //NIDOQUEEN
        NIDOQUEEN.name = "NIDOQUEEN";
        NIDOQUEEN.idPokedex = 31;
        NIDOQUEEN.types = new TypeEnum[]{TypeEnum.POISON, TypeEnum.GROUND};

        //NIDORANM
        NIDORANM.name = "NIDORANM";
        NIDORANM.idPokedex = 32;
        NIDORANM.types = new TypeEnum[]{TypeEnum.POISON};

        //NIDORINO
        NIDORINO.name = "NIDORINO";
        NIDORINO.idPokedex = 33;
        NIDORINO.types = new TypeEnum[]{TypeEnum.POISON};

        //NIDOKING
        NIDOKING.name = "NIDOKING";
        NIDOKING.idPokedex = 34;
        NIDOKING.types = new TypeEnum[]{TypeEnum.POISON, TypeEnum.GROUND};

        //MELOFEE
        MELOFEE.name = "MELOFEE";
        MELOFEE.idPokedex = 35;
        MELOFEE.types = new TypeEnum[]{TypeEnum.FAIRY};

        //MELODELFE
        MELODELFE.name = "MELODELFE";
        MELODELFE.idPokedex = 36;
        MELODELFE.types = new TypeEnum[]{TypeEnum.FAIRY};

        //GOUPIX
        GOUPIX.name = "GOUPIX";
        GOUPIX.idPokedex = 37;
        GOUPIX.types = new TypeEnum[]{TypeEnum.FIRE};

        //FEUNARD
        FEUNARD.name = "FEUNARD";
        FEUNARD.idPokedex = 38;
        FEUNARD.types = new TypeEnum[]{TypeEnum.FIRE};

        //RONDOUDOU
        RONDOUDOU.name = "RONDOUDOU";
        RONDOUDOU.idPokedex = 39;
        RONDOUDOU.types = new TypeEnum[]{TypeEnum.NORMAL, TypeEnum.FAIRY};

        //GRODOUDOU
        GRODOUDOU.name = "GRODOUDOU";
        GRODOUDOU.idPokedex = 40;
        GRODOUDOU.types = new TypeEnum[]{TypeEnum.NORMAL, TypeEnum.FAIRY};

        //NOSFERAPTI
        NOSFERAPTI.name = "NOSFERAPTI";
        NOSFERAPTI.idPokedex = 41;
        NOSFERAPTI.types = new TypeEnum[]{TypeEnum.POISON, TypeEnum.FLYING};

        //NOSFERALTO
        NOSFERALTO.name = "NOSFERALTO";
        NOSFERALTO.idPokedex = 42;
        NOSFERALTO.types = new TypeEnum[]{TypeEnum.POISON, TypeEnum.FLYING};

        //MYSTHERBE
        MYSTHERBE.name = "MYSTHERBE";
        MYSTHERBE.idPokedex = 43;
        MYSTHERBE.types = new TypeEnum[]{TypeEnum.POISON, TypeEnum.GRASS};

        //ORTIDE
        ORTIDE.name = "ORTIDE";
        ORTIDE.idPokedex = 44;
        ORTIDE.types = new TypeEnum[]{TypeEnum.POISON, TypeEnum.GRASS};

        //RAFFLESIA
        RAFFLESIA.name = "RAFFLESIA";
        RAFFLESIA.idPokedex = 45;
        RAFFLESIA.types = new TypeEnum[]{TypeEnum.POISON, TypeEnum.GRASS};

        //PARAS
        PARAS.name = "PARAS";
        PARAS.idPokedex = 46;
        PARAS.types = new TypeEnum[]{TypeEnum.BUG, TypeEnum.GRASS};

        //PARASECT
        PARASECT.name = "PARASECT";
        PARASECT.idPokedex = 47;
        PARASECT.types = new TypeEnum[]{TypeEnum.BUG, TypeEnum.GRASS};

        //MIMITOSS
        MIMITOSS.name = "MIMITOSS";
        MIMITOSS.idPokedex = 48;
        MIMITOSS.types = new TypeEnum[]{TypeEnum.BUG, TypeEnum.POISON};

        //AEROMITE
        AEROMITE.name = "AEROMITE";
        AEROMITE.idPokedex = 49;
        AEROMITE.types = new TypeEnum[]{TypeEnum.BUG, TypeEnum.POISON};

        //TAUPIQUEUR
        TAUPIQUEUR.name = "TAUPIQUEUR";
        TAUPIQUEUR.idPokedex = 50;
        TAUPIQUEUR.types = new TypeEnum[]{TypeEnum.GROUND};

        //TRIOPIKEUR
        TRIOPIKEUR.name = "TRIOPIKEUR";
        TRIOPIKEUR.idPokedex = 51;
        TRIOPIKEUR.types = new TypeEnum[]{TypeEnum.GROUND};

        //MIAOUSS
        MIAOUSS.name = "MIAOUSS";
        MIAOUSS.idPokedex = 52;
        MIAOUSS.types = new TypeEnum[]{TypeEnum.NORMAL};

        //PERSIAN
        PERSIAN.name = "PERSIAN";
        PERSIAN.idPokedex = 53;
        PERSIAN.types = new TypeEnum[]{TypeEnum.NORMAL};

        //PSYKOKWAK
        PSYKOKWAK.name = "PSYKOKWAK";
        PSYKOKWAK.idPokedex = 54;
        PSYKOKWAK.types = new TypeEnum[]{TypeEnum.WATER, TypeEnum.PSYCHIC};

        //AKWAKWAK
        AKWAKWAK.name = "AKWAKWAK";
        AKWAKWAK.idPokedex = 55;
        AKWAKWAK.types = new TypeEnum[]{TypeEnum.WATER, TypeEnum.PSYCHIC};

        //FEROSINGE
        FEROSINGE.name = "FEROSINGE";
        FEROSINGE.idPokedex = 56;
        FEROSINGE.types = new TypeEnum[]{TypeEnum.FIGHTING};

        //COLOSSINGE
        COLOSSINGE.name = "COLOSSINGE";
        COLOSSINGE.idPokedex = 57;
        COLOSSINGE.types = new TypeEnum[]{TypeEnum.FIGHTING};

        //CANINOS
        CANINOS.name = "CANINOS";
        CANINOS.idPokedex = 58;
        CANINOS.types = new TypeEnum[]{TypeEnum.FIRE};

        //ARCANIN
        ARCANIN.name = "ARCANIN";
        ARCANIN.idPokedex = 59;
        ARCANIN.types = new TypeEnum[]{TypeEnum.FIRE};

        //PTITARD
        PTITARD.name = "PTITARD";
        PTITARD.idPokedex = 60;
        PTITARD.types = new TypeEnum[]{TypeEnum.WATER};

        //TETARTE
        TETARTE.name = "TETARTE";
        TETARTE.idPokedex = 61;
        TETARTE.types = new TypeEnum[]{TypeEnum.WATER};

        //TARTARD
        TARTARD.name = "TARTARD";
        TARTARD.idPokedex = 62;
        TARTARD.types = new TypeEnum[]{TypeEnum.WATER, TypeEnum.FIGHTING};

        //ABRA
        ABRA.name = "ABRA";
        ABRA.idPokedex = 63;
        ABRA.types = new TypeEnum[]{TypeEnum.PSYCHIC};

        //KADABRA
        KADABRA.name = "KADABRA";
        KADABRA.idPokedex = 64;
        KADABRA.types = new TypeEnum[]{TypeEnum.PSYCHIC};

        //ALAKAZAM
        ALAKAZAM.name = "ALAKAZAM";
        ALAKAZAM.idPokedex = 65;
        ALAKAZAM.types = new TypeEnum[]{TypeEnum.PSYCHIC};

        //MACHOC
        MACHOC.name = "MACHOC";
        MACHOC.idPokedex = 66;
        MACHOC.types = new TypeEnum[]{TypeEnum.FIGHTING};

        //MACHOPEUR
        MACHOPEUR.name = "MACHOPEUR";
        MACHOPEUR.idPokedex = 67;
        MACHOPEUR.types = new TypeEnum[]{TypeEnum.FIGHTING};

        //MACKOGNEUR
        MACKOGNEUR.name = "MACKOGNEUR";
        MACKOGNEUR.idPokedex = 68;
        MACKOGNEUR.types = new TypeEnum[]{TypeEnum.FIGHTING};

        //CHETIFLOR
        CHETIFLOR.name = "CHETIFLOR";
        CHETIFLOR.idPokedex = 69;
        CHETIFLOR.types = new TypeEnum[]{TypeEnum.GRASS, TypeEnum.POISON};

        //EMPIFLOR
        EMPIFLOR.name = "EMPIFLOR";
        EMPIFLOR.idPokedex = 70;
        EMPIFLOR.types = new TypeEnum[]{TypeEnum.GRASS, TypeEnum.POISON};

        //BOUSTIFLOR
        BOUSTIFLOR.name = "BOUSTIFLOR";
        BOUSTIFLOR.idPokedex = 71;
        BOUSTIFLOR.types = new TypeEnum[]{TypeEnum.GRASS, TypeEnum.POISON};

        //TENTACOOL
        TENTACOOL.name = "TENTACOOL";
        TENTACOOL.idPokedex = 72;
        TENTACOOL.types = new TypeEnum[]{TypeEnum.WATER, TypeEnum.POISON};

        //TENTACRUEL
        TENTACRUEL.name = "TENTACRUEL";
        TENTACRUEL.idPokedex = 73;
        TENTACRUEL.types = new TypeEnum[]{TypeEnum.WATER, TypeEnum.POISON};

        //RACAILLOU
        RACAILLOU.name = "RACAILLOU";
        RACAILLOU.idPokedex = 74;
        RACAILLOU.types = new TypeEnum[]{TypeEnum.ROCK, TypeEnum.GROUND};

        //GRAVALANCH
        GRAVALANCH.name = "GRAVALANCH";
        GRAVALANCH.idPokedex = 75;
        GRAVALANCH.types = new TypeEnum[]{TypeEnum.ROCK, TypeEnum.GROUND};

        //GROLEM
        GROLEM.name = "GROLEM";
        GROLEM.idPokedex = 76;
        GROLEM.types = new TypeEnum[]{TypeEnum.ROCK, TypeEnum.GROUND};

        //PONYTA
        PONYTA.name = "PONYTA";
        PONYTA.idPokedex = 77;
        PONYTA.types = new TypeEnum[]{TypeEnum.FIRE};

        //GALOPA
        GALOPA.name = "GALOPA";
        GALOPA.idPokedex = 78;
        GALOPA.types = new TypeEnum[]{TypeEnum.FIRE};

        //RAMOLOSS
        RAMOLOSS.name = "RAMOLOSS";
        RAMOLOSS.idPokedex = 79;
        RAMOLOSS.types = new TypeEnum[]{TypeEnum.WATER, TypeEnum.PSYCHIC};

        //FLAGADOSS
        FLAGADOSS.name = "FLAGADOSS";
        FLAGADOSS.idPokedex = 80;
        FLAGADOSS.types = new TypeEnum[]{TypeEnum.WATER, TypeEnum.PSYCHIC};

        //MAGNETI
        MAGNETI.name = "MAGNETI";
        MAGNETI.idPokedex = 81;
        MAGNETI.types = new TypeEnum[]{TypeEnum.ELECTRIC, TypeEnum.STEEL};

        //MAGNETON
        MAGNETON.name = "MAGNETON";
        MAGNETON.idPokedex = 82;
        MAGNETON.types = new TypeEnum[]{TypeEnum.ELECTRIC, TypeEnum.STEEL};

        //CANARTICHO
        CANARTICHO.name = "CANARTICHO";
        CANARTICHO.idPokedex = 83;
        CANARTICHO.types = new TypeEnum[]{TypeEnum.FLYING, TypeEnum.NORMAL};

        //DODUO
        DODUO.name = "DODUO";
        DODUO.idPokedex = 84;
        DODUO.types = new TypeEnum[]{TypeEnum.FLYING, TypeEnum.NORMAL};

        //DODRIO
        DODRIO.name = "DODRIO";
        DODRIO.idPokedex = 85;
        DODRIO.types = new TypeEnum[]{TypeEnum.FLYING, TypeEnum.NORMAL};

        //OTARIA
        OTARIA.name = "OTARIA";
        OTARIA.idPokedex = 86;
        OTARIA.types = new TypeEnum[]{TypeEnum.WATER};

        //LAMANTINE
        LAMANTINE.name = "LAMANTINE";
        LAMANTINE.idPokedex = 87;
        LAMANTINE.types = new TypeEnum[]{TypeEnum.WATER, TypeEnum.ICE};

        //TADMORV
        TADMORV.name = "TADMORV";
        TADMORV.idPokedex = 88;
        TADMORV.types = new TypeEnum[]{TypeEnum.POISON};

        //GROTADMORV
        GROTADMORV.name = "GROTADMORV";
        GROTADMORV.idPokedex = 89;
        GROTADMORV.types = new TypeEnum[]{TypeEnum.POISON};

        //KOKIYAS
        KOKIYAS.name = "KOKIYAS";
        KOKIYAS.idPokedex = 90;
        KOKIYAS.types = new TypeEnum[]{TypeEnum.WATER};

        //CRUSTABRI
        CRUSTABRI.name = "CRUSTABRI";
        CRUSTABRI.idPokedex = 91;
        CRUSTABRI.types = new TypeEnum[]{TypeEnum.WATER, TypeEnum.ICE};

        //FANTOMINUS
        FANTOMINUS.name = "FANTOMINUS";
        FANTOMINUS.idPokedex = 92;
        FANTOMINUS.types = new TypeEnum[]{TypeEnum.GHOST, TypeEnum.POISON};

        //SPECTRUM
        SPECTRUM.name = "SPECTRUM";
        SPECTRUM.idPokedex = 93;
        SPECTRUM.types = new TypeEnum[]{TypeEnum.GHOST, TypeEnum.POISON};

        //ECTOPLASMA
        ECTOPLASMA.name = "ECTOPLASMA";
        ECTOPLASMA.idPokedex = 94;
        ECTOPLASMA.types = new TypeEnum[]{TypeEnum.GHOST, TypeEnum.POISON};

        //ONIX
        ONIX.name = "ONIX";
        ONIX.idPokedex = 95;
        ONIX.types = new TypeEnum[]{TypeEnum.GROUND, TypeEnum.ROCK};

        //SOPORIFIK
        SOPORIFIK.name = "SOPORIFIK";
        SOPORIFIK.idPokedex = 96;
        SOPORIFIK.types = new TypeEnum[]{TypeEnum.PSYCHIC};

        //HYPNOMADE
        HYPNOMADE.name = "HYPNOMADE";
        HYPNOMADE.idPokedex = 97;
        HYPNOMADE.types = new TypeEnum[]{TypeEnum.PSYCHIC};

        //KRABBY
        KRABBY.name = "KRABBY";
        KRABBY.idPokedex = 98;
        KRABBY.types = new TypeEnum[]{TypeEnum.WATER};

        //KRABBOSS
        KRABBOSS.name = "KRABBOSS";
        KRABBOSS.idPokedex = 99;
        KRABBOSS.types = new TypeEnum[]{TypeEnum.WATER};

        //VOLTORBE
        VOLTORBE.name = "VOLTORBE";
        VOLTORBE.idPokedex = 100;
        VOLTORBE.types = new TypeEnum[]{TypeEnum.ELECTRIC};

        //ELECTRODE
        ELECTRODE.name = "ELECTRODE";
        ELECTRODE.idPokedex = 101;
        ELECTRODE.types = new TypeEnum[]{TypeEnum.ELECTRIC};

        //NOEUNOEUF
        NOEUNOEUF.name = "NOEUNOEUF";
        NOEUNOEUF.idPokedex = 102;
        NOEUNOEUF.types = new TypeEnum[]{TypeEnum.PSYCHIC, TypeEnum.GRASS};

        //NOADKOKO
        NOADKOKO.name = "NOADKOKO";
        NOADKOKO.idPokedex = 103;
        NOADKOKO.types = new TypeEnum[]{TypeEnum.PSYCHIC, TypeEnum.GRASS};

        //OSSELAIT
        OSSELAIT.name = "OSSELAIT";
        OSSELAIT.idPokedex = 104;
        OSSELAIT.types = new TypeEnum[]{TypeEnum.GROUND};

        //OSSATUEUR
        OSSATUEUR.name = "OSSATUEUR";
        OSSATUEUR.idPokedex = 105;
        OSSATUEUR.types = new TypeEnum[]{TypeEnum.GROUND};

        //KICKLEE
        KICKLEE.name = "KICKLEE";
        KICKLEE.idPokedex = 106;
        KICKLEE.types = new TypeEnum[]{TypeEnum.FIGHTING};

        //TYGNON
        TYGNON.name = "TYGNON";
        TYGNON.idPokedex = 107;
        TYGNON.types = new TypeEnum[]{TypeEnum.FIGHTING};

        //EXCELANGUE
        EXCELANGUE.name = "EXCELANGUE";
        EXCELANGUE.idPokedex = 108;
        EXCELANGUE.types = new TypeEnum[]{TypeEnum.NORMAL};

        //SMOGO
        SMOGO.name = "SMOGO";
        SMOGO.idPokedex = 109;
        SMOGO.types = new TypeEnum[]{TypeEnum.POISON};

        //SMOGOGO
        SMOGOGO.name = "SMOGOGO";
        SMOGOGO.idPokedex = 110;
        SMOGOGO.types = new TypeEnum[]{TypeEnum.POISON};

        //RHINOCORNE
        RHINOCORNE.name = "RHINOCORNE";
        RHINOCORNE.idPokedex = 111;
        RHINOCORNE.types = new TypeEnum[]{TypeEnum.GROUND, TypeEnum.ROCK};

        //RHINOFEROS
        RHINOFEROS.name = "RHINOFEROS";
        RHINOFEROS.idPokedex = 112;
        RHINOFEROS.types = new TypeEnum[]{TypeEnum.GROUND, TypeEnum.ROCK};

        //LEVEINARD
        LEVEINARD.name = "LEVEINARD";
        LEVEINARD.idPokedex = 113;
        LEVEINARD.types = new TypeEnum[]{TypeEnum.NORMAL};

        //SAQUEDENEU
        SAQUEDENEU.name = "SAQUEDENEU";
        SAQUEDENEU.idPokedex = 114;
        SAQUEDENEU.types = new TypeEnum[]{TypeEnum.GRASS};

        //KANGOUREX
        KANGOUREX.name = "KANGOUREX";
        KANGOUREX.idPokedex = 115;
        KANGOUREX.types = new TypeEnum[]{TypeEnum.NORMAL};

        //HYPOTREMPE
        HYPOTREMPE.name = "HYPOTREMPE";
        HYPOTREMPE.idPokedex = 116;
        HYPOTREMPE.types = new TypeEnum[]{TypeEnum.WATER};

        //HYPOCEAN
        HYPOCEAN.name = "HYPOCEAN";
        HYPOCEAN.idPokedex = 117;
        HYPOCEAN.types = new TypeEnum[]{TypeEnum.WATER};

        //POISSIRENE
        POISSIRENE.name = "POISSIRENE";
        POISSIRENE.idPokedex = 118;
        POISSIRENE.types = new TypeEnum[]{TypeEnum.WATER};

        //POISSOROY
        POISSOROY.name = "POISSOROY";
        POISSOROY.idPokedex = 119;
        POISSOROY.types = new TypeEnum[]{TypeEnum.WATER};

        //STARI
        STARI.name = "STARI";
        STARI.idPokedex = 120;
        STARI.types = new TypeEnum[]{TypeEnum.WATER};

        //STAROSS
        STAROSS.name = "STAROSS";
        STAROSS.idPokedex = 121;
        STAROSS.types = new TypeEnum[]{TypeEnum.WATER, TypeEnum.PSYCHIC};

        //MMIME
        MMIME.name = "MMIME";
        MMIME.idPokedex = 122;
        MMIME.types = new TypeEnum[]{TypeEnum.PSYCHIC, TypeEnum.FAIRY};

        //INSECATEUR
        INSECATEUR.name = "INSECATEUR";
        INSECATEUR.idPokedex = 123;
        INSECATEUR.types = new TypeEnum[]{TypeEnum.BUG, TypeEnum.FLYING};

        //LIPPOUTOU
        LIPPOUTOU.name = "LIPPOUTOU";
        LIPPOUTOU.idPokedex = 124;
        LIPPOUTOU.types = new TypeEnum[]{TypeEnum.ICE, TypeEnum.PSYCHIC};

        //ELEKTEK
        ELEKTEK.name = "ELEKTEK";
        ELEKTEK.idPokedex = 125;
        ELEKTEK.types = new TypeEnum[]{TypeEnum.ELECTRIC};

        //MAGMAR
        MAGMAR.name = "MAGMAR";
        MAGMAR.idPokedex = 126;
        MAGMAR.types = new TypeEnum[]{TypeEnum.FIRE};

        //SCARABRUTE
        SCARABRUTE.name = "SCARABRUTE";
        SCARABRUTE.idPokedex = 127;
        SCARABRUTE.types = new TypeEnum[]{TypeEnum.BUG};

        //TAUROS
        TAUROS.name = "TAUROS";
        TAUROS.idPokedex = 128;
        TAUROS.types = new TypeEnum[]{TypeEnum.NORMAL};

        //MAGICARPE
        MAGICARPE.name = "MAGICARPE";
        MAGICARPE.idPokedex = 129;
        MAGICARPE.types = new TypeEnum[]{TypeEnum.WATER};

        //LEVIATOR
        LEVIATOR.name = "LEVIATOR";
        LEVIATOR.idPokedex = 130;
        LEVIATOR.types = new TypeEnum[]{TypeEnum.WATER, TypeEnum.FLYING};

        //LOKHLASS
        LOKHLASS.name = "LOKHLASS";
        LOKHLASS.idPokedex = 131;
        LOKHLASS.types = new TypeEnum[]{TypeEnum.WATER, TypeEnum.ICE};

        //METAMORPH
        METAMORPH.name = "METAMORPH";
        METAMORPH.idPokedex = 132;
        METAMORPH.types = new TypeEnum[]{TypeEnum.NORMAL};

        //EVOLI
        EVOLI.name = "EVOLI";
        EVOLI.idPokedex = 133;
        EVOLI.types = new TypeEnum[]{TypeEnum.NORMAL};

        //AQUALI
        AQUALI.name = "AQUALI";
        AQUALI.idPokedex = 134;
        AQUALI.types = new TypeEnum[]{TypeEnum.WATER};

        //VOLTALI
        VOLTALI.name = "VOLTALI";
        VOLTALI.idPokedex = 135;
        VOLTALI.types = new TypeEnum[]{TypeEnum.ELECTRIC};

        //PYROLI
        PYROLI.name = "PYROLI";
        PYROLI.idPokedex = 136;
        PYROLI.types = new TypeEnum[]{TypeEnum.FIRE};

        //PORYGON
        PORYGON.name = "PORYGON";
        PORYGON.idPokedex = 137;
        PORYGON.types = new TypeEnum[]{TypeEnum.NORMAL};

        //AMONITA
        AMONITA.name = "AMONITA";
        AMONITA.idPokedex = 138;
        AMONITA.types = new TypeEnum[]{TypeEnum.ROCK, TypeEnum.WATER};

        //AMONISTAR
        AMONISTAR.name = "AMONISTAR";
        AMONISTAR.idPokedex = 139;
        AMONISTAR.types = new TypeEnum[]{TypeEnum.ROCK, TypeEnum.WATER};

        //KABUTO
        KABUTO.name = "KABUTO";
        KABUTO.idPokedex = 140;
        KABUTO.types = new TypeEnum[]{TypeEnum.ROCK, TypeEnum.WATER};

        //KABUTOPS
        KABUTOPS.name = "KABUTOPS";
        KABUTOPS.idPokedex = 141;
        KABUTOPS.types = new TypeEnum[]{TypeEnum.ROCK, TypeEnum.WATER};

        //PTERA
        PTERA.name = "PTERA";
        PTERA.idPokedex = 142;
        PTERA.types = new TypeEnum[]{TypeEnum.ROCK, TypeEnum.FLYING};

        //RONFLEX
        RONFLEX.name = "RONFLEX";
        RONFLEX.idPokedex = 143;
        RONFLEX.types = new TypeEnum[]{TypeEnum.NORMAL};

        //ARTIKODIN
        ARTIKODIN.name = "ARTIKODIN";
        ARTIKODIN.idPokedex = 144;
        ARTIKODIN.types = new TypeEnum[]{TypeEnum.ICE, TypeEnum.FLYING};

        //ELECTHOR
        ELECTHOR.name = "ELECTHOR";
        ELECTHOR.idPokedex = 145;
        ELECTHOR.types = new TypeEnum[]{TypeEnum.ELECTRIC, TypeEnum.FLYING};

        //SULFURA
        SULFURA.name = "SULFURA";
        SULFURA.idPokedex = 146;
        SULFURA.types = new TypeEnum[]{TypeEnum.FIRE, TypeEnum.FLYING};

        //MINIDRACO
        MINIDRACO.name = "MINIDRACO";
        MINIDRACO.idPokedex = 147;
        MINIDRACO.types = new TypeEnum[]{TypeEnum.DRAGON};

        //DRACO
        DRACO.name = "DRACO";
        DRACO.idPokedex = 148;
        DRACO.types = new TypeEnum[]{TypeEnum.DRAGON};

        //DRACOLOSSE
        DRACOLOSSE.name = "DRACOLOSSE";
        DRACOLOSSE.idPokedex = 149;
        DRACOLOSSE.types = new TypeEnum[]{TypeEnum.DRAGON, TypeEnum.FLYING};

        //MEWTWO
        MEWTWO.name = "MEWTWO";
        MEWTWO.idPokedex = 150;
        MEWTWO.types = new TypeEnum[]{TypeEnum.PSYCHIC};

        //MEW
        MEW.name = "MEW";
        MEW.idPokedex = 151;
        MEW.types = new TypeEnum[]{TypeEnum.PSYCHIC};
    }

    public static PokemonTypeEnum getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}