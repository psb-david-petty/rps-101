/*
 * RPS101.java
 *
 * @author David C. Petty // http://j.mp/psb_david_petty
 */

public class RPS101 {
    private String name;
    public RPS101(String name) { this.name = name; }

    public static void echo(String message) { System.out.printf("%s", message); }
    public void win() { echo(String.format("%s win! ", name)); }
    public void lose() { echo(String.format("%s lose! ", name)); }
    public void tie() { echo(String.format("A tie!")); }
    public void bad() { echo(String.format("Bad move!")); }

    /** Return random Move101.
     * @return random Move101.
     */
    public Move101 randomMove() {
        Move101 move = Move101.values()[(int) (Math.random() * Move101.values().length)];
        System.out.printf("%s:%s ", name, move);
        return move;
    }
 
    /** Call randomMove() for this and competitor then invoke
     * win(), lose(), and tie() appropriately for us.
     * @param competitor RPS101 competitor
     */
    public void move(RPS101 competitor) {
        Move101 us = this.randomMove();
        Move101 them = competitor.randomMove();
        switch (us) {
            case AIR:
                switch (them) {
                    case AIR:
                        tie();
                        break;
                    case ALIEN      :   // AIR CHOKES ALIEN
                    case BEER       :   // AIR STALES BEER
                    case BOWL       :   // AIR TIPS OVER BOWL
                    case CAMERA     :   // AIR KNOCKS OVER CAMERA
                    case CHAIN      :   // AIR TARNISHES CHAIN
                    case CHAINSAW   :   // AIR ECHOES CHAINSAW
                    case CUP        :   // AIR TIPS OVER CUP
                    case DEATH      :   // AIR CARRIES SMELL OF DEATH
                    case DEVIL      :   // AIR CHOKES DEVIL
                    case DIAMOND    :   // AIR SCATTERS DIAMONDS
                    case DRAGON     :   // AIR FREEZES DRAGON
                    case DYNAMITE   :   // AIR BLOWS OUT DYNAMITE
                    case ELECTRICITY:   // AIR CONDUCTS ELECTRICITY
                    case FENCE      :   // AIR WOBBLES FENCE
                    case FIRE       :   // AIR SPREADS FIRE
                    case GOLD       :   // AIR COOLS GOLD
                    case GUITAR     :   // AIR GUITAR
                    case GUN        :   // AIR TARNISHES GUN
                    case HEART      :   // AIR FEEDS HEART
                    case HELICOPTER :   // AIR TOSSES HELICOPTER
                    case LASER      :   // AIR WEAKENS LASER
                    case LAW        :   // AIR SCATTERS LAW PAPERS
                    case LIGHTNING  :   // AIR CONDUCTS LIGHTNING
                    case MATH       :   // AIR SCATTERS MATH HOMEWORK
                    case MEDUSA     :   // AIR FREEZES MEDUSA
                    case MOUNTAIN   :   // AIR CHILLS MOUNTAIN
                    case NUKE       :   // AIR BLOWS ASTRAY NUKE
                    case PIT        :   // AIR FILLS PIT
                    case PLANET     :   // AIR COVERS PLANET
                    case PLATINUM   :   // AIR COOLS PLATINUM
                    case POWER      :   // AIR MAKES WIND POWER
                    case PRAYER     :   // AIR ECHOES PRAYER
                    case QUICKSAND  :   // AIR ESCAPES QUICKSAND
                    case RAIN       :   // AIR CREATES RAIN
                    case RAINBOW    :   // AIR SUSPENDS RAINBOW
                    case ROBOT      :   // AIR TARNISHES ROBOT
                    case ROCK       :   // AIR ERODES ROCK
                    case SATAN      :   // AIR CHOKES SATAN
                    case SCHOOL     :   // AIR HEADED SCHOOLKIDS
                    case SKY        :   // AIR BECOMES SKY
                    case SUN        :   // AIR COOLS HEAT OF SUN
                    case SWORD      :   // AIR TARNISHES SWORD
                    case TANK       :   // AIR TANK
                    case TORNADO    :   // AIR CREATES TORNADO
                    case TV         :   // AIR HEADED TV
                    case UFO        :   // AIR CHOKES UFO
                    case VIDEO_GAME :   // AIR FREEZES VIDEO GAME
                    case WALL       :   // AIR BUFFETS WALL
                    case WATER      :   // AIR EVAPORATES WATER
                    case WHIP       :   // AIR ECHOES WHIP
                        win();
                        break;
                    case AIRPLANE   :
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BOOK       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAGE       :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PEACE      :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case AIRPLANE:
                switch (them) {
                    case AIRPLANE:
                        tie();
                        break;
                    case AIR        :   // AIRPLANE FLIES THROUGH AIR
                    case ALIEN      :   // AIRPLANE SPOTS ALIEN SHIP
                    case BEER       :   // AIRPLANE SERVES BEER
                    case BOWL       :   // AIRPLANE CARRIES BOWL
                    case CHAIN      :   // AIRPLANE FLIES OVER CHAIN
                    case CUP        :   // AIRPLANE CARRIES CUP
                    case DEATH      :   // AIRPLANE CAN CAUSE DEATH
                    case DEVIL      :   // AIRPLANE SCARIER THAN DEVIL
                    case DIAMOND    :   // AIRPLANE PRICIER THAN DIAMOND
                    case DRAGON     :   // AIRPLANE FASTER THAN DRAGON
                    case DYNAMITE   :   // AIRPLANE FLIES OVER DYNAMITE
                    case ELECTRICITY:   // AIRPLANE USES ELECTRICITY
                    case FENCE      :   // AIRPLANE FLIES OVER FENCE
                    case FILM       :   // AIRPLANE SHOWS FILM
                    case GOLD       :   // AIRPLANE PRICIER THAN GOLD
                    case GRASS      :   // AIRPLANE FLIES OVER GRASS
                    case GUITAR     :   // AIRPLANE CARRIES GUITAR
                    case GUN        :   // AIRPLANE BANS GUN
                    case HEART      :   // AIRPLANE STOPS HEART
                    case HELICOPTER :   // AIRPLANE OUTFLIES HELICOPTER
                    case LASER      :   // AIRPLANE CARRIES LASER
                    case LAW        :   // AIRPLANE HAS MANY LAWS
                    case LIGHTNING  :   // AIRPLANE ATTRACTS LIGHTNING
                    case MATH       :   // AIRPLANE PILOT USES MATH
                    case MEDUSA     :   // AIRPLANE FLIES OVER MEDUSA
                    case MOON       :   // AIRPLANE ECLIPSES MOON
                    case MOUNTAIN   :   // AIRPLANE FLIES OVER MOUNTAIN
                    case NUKE       :   // AIRPLANE CARRIES NUKE
                    case PIT        :   // AIRPLANE FLIES OVER PIT
                    case PLANET     :   // AIRPLANE TRAVELS PLANET
                    case PLATINUM   :   // AIRPLANE PRICIER THAN PLATINUM
                    case POWER      :   // AIRPLANE CONSUMES POWER
                    case PRAYER     :   // AIRPLANE INSPIRES PRAYER
                    case QUICKSAND  :   // AIRPLANE FLIES OVER QUICKSAND
                    case RAIN       :   // AIRPLANE FLIES OVER RAIN
                    case RAINBOW    :   // AIRPLANE FLIES OVER RAINBOW
                    case ROBOT      :   // AIRPLANE HAS ROBOT PILOT
                    case ROCK       :   // AIRPLANE FLIES OVER ROCK
                    case SATAN      :   // AIRPLANE SCARIER THAN SATAN
                    case SKY        :   // AIRPLANE TRAVERSES SKY
                    case SWORD      :   // AIRPLANE BANS SWORD
                    case TANK       :   // AIRPLANE FLIES OVER TANK
                    case TOILET     :   // AIRPLANE HAS TOILET
                    case TORNADO    :   // AIRPLANE FLIES OVER TORNADO
                    case TV         :   // AIRPLANE HAS TV
                    case UFO        :   // AIRPLANE SPOTS UFO
                    case VIDEO_GAME :   // AIRPLANE IN VIDEO GAME
                    case WALL       :   // AIRPLANE FLIES OVER WALL
                    case WATER      :   // AIRPLANE HAS WATER
                    case WHIP       :   // AIRPLANE BANS WHIP
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BOOK       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAINSAW   :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DUCK       :
                    case FIRE       :
                    case FISH       :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case NOISE      :
                    case PAPER      :
                    case PEACE      :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case SUN        :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case ALIEN:
                switch (them) {
                    case ALIEN:
                        tie();
                        break;
                    case AXE        :   // ALIEN VAPORIZES AXE
                    case BLOOD      :   // ALIEN HAS BLOOD
                    case CAGE       :   // ALIEN VAPORIZES CAGE
                    case CAMERA     :   // ALIEN EVADES CAMERA
                    case CASTLE     :   // ALIEN EXPLORES CASTLE
                    case CHAIN      :   // ALIEN VAPORIZES CHAIN
                    case CHAINSAW   :   // ALIEN VAPORIZES CHAINSAW
                    case COMPUTER   :   // ALIEN USES COMPUTER
                    case DEATH      :   // ALIEN CAUSES DEATH
                    case DEVIL      :   // ALIEN UNAWARE OF DEVIL
                    case DIAMOND    :   // ALIEN STEALS DIAMOND
                    case DRAGON     :   // ALIEN VAPORIZES DRAGON
                    case DYNAMITE   :   // ALIEN VAPORIZES DYNAMITE
                    case ELECTRICITY:   // ALIEN USES ELECTRICITY
                    case FENCE      :   // ALIEN VAPORIZES FENCE
                    case FIRE       :   // ALIEN STARTS FIRE
                    case GOLD       :   // ALIEN COLORED GOLD
                    case GUN        :   // ALIEN VAPORIZES GUN
                    case HEART      :   // ALIEN DISSECTS HEART
                    case HELICOPTER :   // ALIEN VAPORIZES HELICOPTER
                    case LASER      :   // ALIEN SHOOTS LASER
                    case LAW        :   // ALIEN BREAKS PHYSICAL LAW
                    case LIGHTNING  :   // ALIEN SHOOTS LIGHTNING
                    case MATH       :   // ALIEN USES ADVANCED MATH
                    case MEDUSA     :   // ALIEN VAPORIZES MEDUSA
                    case MOUNTAIN   :   // ALIEN TERRAFORMS MOUNTAIN
                    case NUKE       :   // ALIEN DISARMS NUKE
                    case PEACE      :   // ALIEN DISTURBS PEACE
                    case PIT        :   // ALIEN FLIES OVER PIT
                    case PLATINUM   :   // ALIEN COLORED PLATINUM
                    case POISON     :   // ALIEN IMMUNE TO POISON
                    case PORCUPINE  :   // ALIEN VAPORIZES PORCUPINE
                    case POWER      :   // ALIEN USES ADVANCED POWER
                    case PRAYER     :   // ALIEN DOESN'T USE PRAYER
                    case QUICKSAND  :   // ALIEN SOLIDIFIES QUICKSAND
                    case ROBOT      :   // ALIEN COMMANDS ROBOT
                    case ROCK       :   // ALIEN VAPORIZES ROCK
                    case SATAN      :   // ALIEN UNAWARE OF SATAN
                    case SCHOOL     :   // ALIEN VAPORIZES SCHOOL
                    case SCISSORS   :   // ALIEN VAPORIZES SCISSORS
                    case SKY        :   // ALIEN FROM SKY
                    case SNAKE      :   // ALIEN VAPORIZES SNAKE
                    case SUN        :   // ALIEN FLIES TO SUN
                    case SWORD      :   // ALIEN VAPORIZES SWORD
                    case TANK       :   // ALIEN VAPORIZES TANK
                    case TORNADO    :   // ALIEN DISPELS TORNADO
                    case VIDEO_GAME :   // ALIEN IN VIDEO GAME
                    case VULTURE    :   // ALIEN VAPORIZES VULTURE
                    case WALL       :   // ALIEN VAPORIZES WALL
                    case WHIP       :   // ALIEN VAPORIZES WHIP
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case BABY       :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case POLICE     :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case RAIN       :
                    case RAINBOW    :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case WATER      :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case AXE:
                switch (them) {
                    case AXE:
                        tie();
                        break;
                    case AIR        :   // AXE FLIES THROUGH AIR
                    case AIRPLANE   :   // AXE TERRORIZES AIRPLANE
                    case BABY       :   // AXE HURTS BABY
                    case BICYCLE    :   // AXE CHOPS BICYCLE
                    case BIRD       :   // AXE CHOPS BIRD
                    case BLOOD      :   // AXE SPLATTERS BLOOD
                    case BOOK       :   // AXE CHOPS BOOK
                    case BOWL       :   // AXE CHOPS BOWL
                    case BRAIN      :   // AXE CLEAVES BRAIN
                    case BUTTER     :   // AXE CHOPS BUTTER
                    case CAR        :   // AXE CHOPS CAR
                    case CASTLE     :   // AXE SIEGES CASTLE
                    case CAT        :   // AXE CHOPS CAT
                    case CHURCH     :   // AXE TERRORIZES CHURCH
                    case CLOUD      :   // AXE CREATES BLOOD CLOUD
                    case COCKROACH  :   // AXE CHOPS COCKROACH
                    case COMMUNITY  :   // AXE CLEARS WAY FOR COMMUNITY
                    case COMPUTER   :   // AXE CHOPS COMPUTER
                    case CROSS      :   // AXE CHOPS DOWN CROSS
                    case DUCK       :   // AXE CHOPS DUCK
                    case FILM       :   // AXE CHOPS FILM
                    case FISH       :   // AXE CHOPS FISH
                    case GRASS      :   // AXE CHOPS GRASS
                    case GUITAR     :   // AXE CHOPS GUITAR
                    case HOME       :   // AXE TERRORIZES HOME
                    case KING       :   // AXE CLEAVES KING
                    case MAN        :   // AXE CLEAVES MAN
                    case MONEY      :   // AXE COSTS MONEY
                    case MONKEY     :   // AXE CLEAVES MONKEY
                    case MOON       :   // AXE REFLECTS MOON
                    case NOISE      :   // AXE MAKES NOISE
                    case PAPER      :   // AXE CHOPS PAPER
                    case PEACE      :   // AXE DISTURBS PEACE
                    case PLANET     :   // AXE CHANGES PLANET
                    case POLICE     :   // AXE CLEAVES POLICE
                    case PORCUPINE  :   // AXE CHOPS PORCUPINE
                    case PRINCE     :   // AXE CLEAVES PRINCE
                    case PRINCESS   :   // AXE CLEAVES PRINCESS
                    case QUEEN      :   // AXE CLEAVES QUEEN
                    case SNAKE      :   // AXE CHOPS SNAKE
                    case SPIDER     :   // AXE CHOPS SPIDER
                    case SPONGE     :   // AXE CHOPS SPONGE
                    case TOILET     :   // AXE SMASHES TOILET
                    case TRAIN      :   // AXE HOLDS UP TRAIN
                    case TREE       :   // AXE CHOPS DOWN TREE
                    case TURNIP     :   // AXE CHOPS TURNIP
                    case VAMPIRE    :   // AXE BEHEADS VAMPIRE
                    case VULTURE    :   // AXE CHOPS VULTURE
                    case WOLF       :   // AXE CLEAVES WOLF
                    case WOMAN      :   // AXE CLEAVES WOMAN
                        win();
                        break;
                    case ALIEN      :
                    case BEER       :
                    case CAGE       :
                    case CAMERA     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case CUP        :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PIT        :
                    case PLATINUM   :
                    case POISON     :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WALL       :
                    case WATER      :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case BABY:
                switch (them) {
                    case BABY:
                        tie();
                        break;
                    case AIR        :   // BABY BREATHES AIR
                    case AIRPLANE   :   // BABY ANNOYS AIRPLANE
                    case ALIEN      :   // BABY DRAWS ALIEN
                    case BEER       :   // BABY SPILLS BEER
                    case BICYCLE    :   // BABY CARRIED ON BICYCLE
                    case BIRD       :   // BABY SCARES BIRD
                    case BOOK       :   // BABY TEARS UP BOOK
                    case BOWL       :   // BABY EATS FROM BOWL
                    case BRAIN      :   // BABY HAS BRAIN
                    case BUTTER     :   // BABY EATS BUTTER
                    case CAR        :   // BABY RIDES IN CAR
                    case CAT        :   // BABY SCARES CAT
                    case CHURCH     :   // BABY DISRUPTS CHURCH
                    case CLOUD      :   // BABY MAKES GAS CLOUD
                    case COCKROACH  :   // BABY EATS COCKROACH
                    case COMMUNITY  :   // BABY LIVES IN COMMUNITY
                    case CROSS      :   // BABY MAKES PARENTS CROSS
                    case CUP        :   // BABY DRINKS FROM CUP
                    case DIAMOND    :   // BABY SWALLOWS DIAMOND
                    case DRAGON     :   // BABY SUBDUES DRAGON
                    case DUCK       :   // BABY CHASES DUCK
                    case FILM       :   // BABY ON FILM
                    case FISH       :   // BABY EATS FISH
                    case GOLD       :   // BABY PLAYS WITH GOLD
                    case GRASS      :   // BABY CRAWLS IN GRASS
                    case GUITAR     :   // BABY RUINS GUITAR
                    case HOME       :   // BABY LIVES IN HOME
                    case MAN        :   // BABY TIRES MAN
                    case MONEY      :   // BABY COSTS MONEY
                    case MOON       :   // BABY LOOKS AT MOON
                    case MOUNTAIN   :   // BABY LIVES ON MOUNTAIN
                    case NOISE      :   // BABY MAKES NOISE
                    case PAPER      :   // BABY RIPS UP PAPER
                    case PLANET     :   // BABY LIVES ON PLANET
                    case PLATINUM   :   // BABY PLAYS WITH PLATINUM
                    case PRAYER     :   // BABY ANSWERS PRAYER
                    case RAIN       :   // BABY PLAYS IN RAIN
                    case RAINBOW    :   // BABY LOOKS AT RAINBOW
                    case SATAN      :   // BABY UNAWARE OF SATAN
                    case SPIDER     :   // BABY EATS SPIDER
                    case SPONGE     :   // BABY EATS SPONGE
                    case TOILET     :   // BABY TOILET TRAINED
                    case TRAIN      :   // BABY RIDES ON TRAIN
                    case TREE       :   // BABY UP IN A TREE
                    case TURNIP     :   // BABY THROWS TURNIP
                    case TV         :   // BABY ON TV
                    case UFO        :   // BABY DRAWS UFO
                    case VAMPIRE    :   // BABY BECOMES VAMPIRE
                    case WATER      :   // BABY DRINKS WATER
                    case WOLF       :   // BABY RIDES ON WOLF
                        win();
                        break;
                    case AXE        :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DEVIL      :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case KING       :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONKEY     :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case POWER      :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROBOT      :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case VIDEO_GAME :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case BEER:
                switch (them) {
                    case BEER:
                        tie();
                        break;
                    case ALIEN      :   // BEER CHOKES ALIEN
                    case AXE        :   // BEER RUSTS AXE
                    case CAGE       :   // BEER RUSTS CAGE
                    case CAMERA     :   // BEER INSPIRES CAMERA
                    case CHAIN      :   // BEER RUSTS CHAIN
                    case CHAINSAW   :   // BEER AFFECTS CHAINSAW USE
                    case DEATH      :   // BEER TOASTS DEATH
                    case DEVIL      :   // BEER DRINKER IS DEVIL
                    case DIAMOND    :   // BEER LOGO HAS DIAMOND
                    case DRAGON     :   // BEER LOGO HAS DRAGON
                    case DYNAMITE   :   // BEER SOAKS DYNAMITE
                    case ELECTRICITY:   // BEER CONDUCTS ELECTRICITY
                    case FENCE      :   // BEER SITS ON FENCE
                    case FIRE       :   // BEER BY THE FIRE
                    case GOLD       :   // BEER COLORED GOLD
                    case GUN        :   // BEER INSPIRES GUN
                    case HEART      :   // BEER AFFECTS HEART
                    case HELICOPTER :   // BEER AFFECTS HELICOPTER DRIVING
                    case LASER      :   // BEER DIFFRACTS LASER
                    case LAW        :   // BEER BREAKS LAW
                    case LIGHTNING  :   // BEER LOGO DEPICTS LIGHTNING
                    case MATH       :   // BEER MEASURED WITH MATH
                    case MEDUSA     :   // BEER CHOKES MEDUSA
                    case MOUNTAIN   :   // BEER LOGO HAS MOUNTAIN
                    case NUKE       :   // BEER SURVIVES NUKE
                    case PEACE      :   // BEER BRINGS PEACE
                    case PIT        :   // BEER FILLS PIT
                    case PLATINUM   :   // BEER COLORED PLATINUM
                    case POISON     :   // BEER CAN BE POISON
                    case POWER      :   // BEER GIVES FALSE POWER
                    case PRAYER     :   // BEER ANSWERS PRAYER
                    case QUICKSAND  :   // BEER FLOATS ON QUICKSAND
                    case RAIN       :   // BEER DESPITE RAIN
                    case RAINBOW    :   // BEER FLAVOR RAINBOW
                    case ROBOT      :   // BEER SHORT-CIRCUITS ROBOT
                    case ROCK       :   // BEER ROLLING ROCK
                    case SATAN      :   // BEER LOGO DEPICTS SATAN
                    case SCHOOL     :   // BEER ANGERS SCHOOL
                    case SCISSORS   :   // BEER RUSTS SCISSORS
                    case SKY        :   // BEER NO MATTER WHAT SKY
                    case SUN        :   // BEER CATCHES SUN
                    case SWORD      :   // BEER RUSTS SWORD
                    case TANK       :   // BEER AFFECTS TANK DRIVING
                    case TORNADO    :   // BEER AFTER TORNADO
                    case TV         :   // BEER SITS ON TV
                    case UFO        :   // BEER INVOKES UFO SIGHTING
                    case VIDEO_GAME :   // BEER INSPIRES VIDEO GAME
                    case WALL       :   // BEER ON THE WALL
                    case WATER      :   // BEER TASTIER THAN WATER
                    case WHIP       :   // BEER INSPIRES WHIP
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case CUP        :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case BICYCLE:
                switch (them) {
                    case BICYCLE:
                        tie();
                        break;
                    case AIR        :   // BICYCLE DISPLACES AIR
                    case AIRPLANE   :   // BICYCLE SAFER THAN AIRPLANE
                    case ALIEN      :   // BICYCLE INTRIGUES ALIEN
                    case BEER       :   // BICYCLE INSPIRES BEER
                    case BIRD       :   // BICYCLE SCARES BIRD
                    case BOOK       :   // BICYCLE CARRIES BOOK
                    case BOWL       :   // BICYCLE HELMET IS BOWL
                    case BRAIN      :   // BICYCLE STIMULATES BRAIN
                    case BUTTER     :   // BICYCLE CARRIES BUTTER
                    case CAT        :   // BICYCLE SCARES CAT
                    case CHURCH     :   // BICYCLE TO CHURCH
                    case CLOUD      :   // BICYCLE MAKES DUST CLOUD
                    case COCKROACH  :   // BICYCLE RUNS OVER COCKROACH
                    case COMMUNITY  :   // BICYCLE ACROSS COMMUNITY
                    case CROSS      :   // BICYCLE CROSSING
                    case CUP        :   // BICYCLE WINS CUP
                    case DEVIL      :   // BICYCLE FASTER THAN DEVIL
                    case DIAMOND    :   // BICYCLE SHINES LIKE DIAMOND
                    case DRAGON     :   // BICYCLE OUTRUNS DRAGON
                    case DUCK       :   // BICYCLE SCARES DUCK
                    case FENCE      :   // BICYCLE HOPS FENCE
                    case FILM       :   // BICYCLE IN FILM
                    case FISH       :   // BICYCLE RUNS OVER FISH
                    case GOLD       :   // BICYCLE WINS GOLD
                    case GRASS      :   // BICYCLE RIDES IN GRASS
                    case GUITAR     :   // BICYCLE CARRIES GUITAR
                    case HEART      :   // BICYCLE STIMULATES HEART
                    case MATH       :   // BICYCLE TO MATH CLASS
                    case MONEY      :   // BICYCLE COSTS MONEY
                    case MOON       :   // BICYCLE REFLECTS MOON
                    case MOUNTAIN   :   // BICYCLE CLIMBS MOUNTAIN
                    case PAPER      :   // BICYCLE DELIVERS PAPER
                    case PLANET     :   // BICYCLE ACROSS PLANET
                    case PLATINUM   :   // BICYCLE USES PLATINUM
                    case PRAYER     :   // BICYCLE INSPIRES PRAYER
                    case RAIN       :   // BICYCLE RIDES IN RAIN
                    case RAINBOW    :   // BICYCLE REFLECTS RAINBOW
                    case ROBOT      :   // BICYCLE CONFUSES ROBOT
                    case SATAN      :   // BICYCLE AMUSES SATAN
                    case SPIDER     :   // BICYCLE RUNS OVER SPIDER
                    case SPONGE     :   // BICYCLE CARRIES SPONGE
                    case TOILET     :   // BICYCLE HAS NO TOILET
                    case TREE       :   // BICYCLE HITS TREE
                    case TURNIP     :   // BICYCLE RUNS OVER TURNIP
                    case TV         :   // BICYCLE ON TV
                    case UFO        :   // BICYCLE ATTRACTS UFO
                    case VAMPIRE    :   // BICYCLE OUTRUNS VAMPIRE
                    case VIDEO_GAME :   // BICYCLE IN VIDEO GAME
                    case WATER      :   // BICYCLE SPLASHES WATER
                    case WOLF       :   // BICYCLE OUTRUNS WOLF
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FIRE       :
                    case GUN        :
                    case HELICOPTER :
                    case HOME       :
                    case KING       :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MAN        :
                    case MEDUSA     :
                    case MONKEY     :
                    case NOISE      :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case POWER      :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TRAIN      :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case BIRD:
                switch (them) {
                    case BIRD:
                        tie();
                        break;
                    case AIR        :   // BIRD BREATHES AIR
                    case AIRPLANE   :   // BIRD FLIES LIKE AIRPLANE
                    case ALIEN      :   // BIRD INTRIGUES ALIEN
                    case BEER       :   // BIRD DRINKS BEER
                    case BOOK       :   // BIRD CARRIES OFF BOOK
                    case BOWL       :   // BIRD BATHES IN BOWL
                    case BRAIN      :   // BIRD HAS BRAIN
                    case BUTTER     :   // BIRD DIRTIES BUTTER
                    case CHURCH     :   // BIRD PERCHES ON CHURCH
                    case CLOUD      :   // BIRD FLIES ABOVE CLOUD
                    case COCKROACH  :   // BIRD EATS COCKROACH
                    case COMMUNITY  :   // BIRD BEAUTIFIES COMMUNITY
                    case CROSS      :   // BIRD PERCHES ON CROSS
                    case CUP        :   // BIRD KNOCKS OVER CUP
                    case DEVIL      :   // BIRD RECOGNIZES DEVIL
                    case DIAMOND    :   // BIRD CARRIES OFF DIAMOND
                    case DRAGON     :   // BIRD FASTER THAN DRAGON
                    case ELECTRICITY:   // BIRD ON WIRE DESPITE ELECTRICITY
                    case FENCE      :   // BIRD FLIES OVER FENCE
                    case FILM       :   // BIRD ON FILM
                    case FISH       :   // BIRD EATS FISH
                    case GOLD       :   // BIRD COLORED GOLD
                    case GRASS      :   // BIRD FLIES OVER GRASS
                    case GUITAR     :   // BIRD NESTS IN GUITAR
                    case HEART      :   // BIRD HAS HEART
                    case LASER      :   // BIRD DODGES LASER
                    case LIGHTNING  :   // BIRD ATTRACTS LIGHTNING
                    case MATH       :   // BIRD DOESN'T NEED MATH
                    case MEDUSA     :   // BIRD ESCAPES MEDUSA
                    case MONEY      :   // BIRD COSTS MONEY
                    case MOON       :   // BIRD HUNTS BY MOON
                    case MOUNTAIN   :   // BIRD LIVES ON MOUNTAIN
                    case NUKE       :   // BIRD OF PEACE PREVENTS NUKE
                    case PAPER      :   // BIRD NESTS IN PAPER
                    case PLANET     :   // BIRD LIVES ON PLANET
                    case PLATINUM   :   // BIRD COLORED PLATINUM
                    case POWER      :   // BIRD HAS SPIRITUAL POWER
                    case PRAYER     :   // BIRD IN PRAYER
                    case RAIN       :   // BIRD FLIES ABOVE RAIN
                    case RAINBOW    :   // BIRD FLIES OVER RAINBOW
                    case ROBOT      :   // BIRD PERCHES ON ROBOT
                    case SATAN      :   // BIRD RECOGNIZES SATAN
                    case SPIDER     :   // BIRD EATS SPIDER
                    case SPONGE     :   // BIRD CARRIES OFF SPONGE
                    case TOILET     :   // BIRD DOESN'T USE TOILET
                    case TV         :   // BIRD ON TV
                    case UFO        :   // BIRD HIDES FROM UFO
                    case VAMPIRE    :   // BIRD ESCAPES VAMPIRE
                    case VIDEO_GAME :   // BIRD BRAINED VIDEO GAME
                    case WATER      :   // BIRD DRINKS WATER
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DUCK       :
                    case DYNAMITE   :
                    case FIRE       :
                    case GUN        :
                    case HELICOPTER :
                    case HOME       :
                    case KING       :
                    case LAW        :
                    case MAN        :
                    case MONKEY     :
                    case NOISE      :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case BLOOD:
                switch (them) {
                    case BLOOD:
                        tie();
                        break;
                    case AIR        :   // BLOOD CONSUMES AIR
                    case AIRPLANE   :   // BLOOD TURNS AROUND AIRPLANE
                    case BABY       :   // BLOOD POWERS BABY
                    case BEER       :   // BLOOD DRIPS IN BEER
                    case BICYCLE    :   // BLOOD STAINS BICYCLE
                    case BIRD       :   // BLOOD POWERS BIRD
                    case BOOK       :   // BLOOD STAINS BOOK
                    case BOWL       :   // BLOOD DRIPS IN BOWL
                    case BRAIN      :   // BLOOD POWERS BRAIN
                    case BUTTER     :   // BLOOD STAINS BUTTER
                    case CAR        :   // BLOOD STAINS CAR
                    case CAT        :   // BLOOD POWERS CAT
                    case CHURCH     :   // BLOOD STAINS CHURCH
                    case CLOUD      :   // BLOOD RED CLOUD
                    case COCKROACH  :   // BLOOD POWERS COCKROACH
                    case COMMUNITY  :   // BLOOD DONATIONS FOR COMMUNITY
                    case CROSS      :   // BLOOD ON THE CROSS
                    case CUP        :   // BLOOD DRIPS IN CUP
                    case DUCK       :   // BLOOD POWERS DUCK
                    case FILM       :   // BLOOD ON FILM
                    case FISH       :   // BLOOD POWERS FISH
                    case GRASS      :   // BLOOD COVERS GRASS
                    case GUITAR     :   // BLOOD STAINS GUITAR
                    case HOME       :   // BLOOD STAINS HOME
                    case KING       :   // BLOOD POWERS KING
                    case MAN        :   // BLOOD POWERS MAN
                    case MONEY      :   // BLOOD MONEY
                    case MONKEY     :   // BLOOD POWERS MONKEY
                    case MOON       :   // BLOOD RED MOON
                    case NOISE      :   // BLOOD MAKES NO NOISE
                    case PAPER      :   // BLOOD STAINS PAPER
                    case PLANET     :   // BLOOD RED PLANET
                    case POLICE     :   // BLOOD POWERS POLICE
                    case PORCUPINE  :   // BLOOD POWERS PORCUPINE
                    case PRINCE     :   // BLOOD POWERS PRINCE
                    case PRINCESS   :   // BLOOD POWERS PRINCESS
                    case QUEEN      :   // BLOOD POWERS QUEEN
                    case RAIN       :   // BLOOD FLOWS LIKE RAIN
                    case SPIDER     :   // BLOOD POWERS SPIDER
                    case SPONGE     :   // BLOOD STAINS SPONGE
                    case TOILET     :   // BLOOD FILLS TOILET
                    case TRAIN      :   // BLOOD COARSES LIKE TRAIN
                    case TREE       :   // BLOOD MARKS TREE
                    case TURNIP     :   // BLOOD STAINS TURNIP
                    case TV         :   // BLOOD ON TV
                    case VAMPIRE    :   // BLOOD FEEDS VAMPIRE
                    case VULTURE    :   // BLOOD POWERS VULTURE
                    case WATER      :   // BLOOD THICKER THAN WATER
                    case WOLF       :   // BLOOD POWERS WOLF
                    case WOMAN      :   // BLOOD POWERS WOMAN
                        win();
                        break;
                    case ALIEN      :
                    case AXE        :
                    case CAGE       :
                    case CAMERA     :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case PLATINUM   :
                    case POISON     :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAINBOW    :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case UFO        :
                    case VIDEO_GAME :
                    case WALL       :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case BOOK:
                switch (them) {
                    case BOOK:
                        tie();
                        break;
                    case AIR        :   // BOOK MAKES MUSTY AIR
                    case AIRPLANE   :   // BOOK ABOUT AIRPLANES
                    case ALIEN      :   // BOOK ABOUT ALIENS
                    case BEER       :   // BOOK ABOUT BEER
                    case BOWL       :   // BOOK ABOUT BOWLS
                    case CHAIN      :   // BOOK STARTS CHAIN REACTION
                    case CLOUD      :   // BOOK ABOUT CLOUDS
                    case CUP        :   // BOOK ABOUT CUPS
                    case DEVIL      :   // BOOK ABOUT DEVIL
                    case DIAMOND    :   // BOOK ABOUT DIAMOND
                    case DRAGON     :   // BOOK ABOUT DRAGON
                    case DYNAMITE   :   // BOOK EXPLAINS DYNAMITE
                    case ELECTRICITY:   // BOOK ABOUT ELECTRICITY
                    case FENCE      :   // BOOK SITS ON FENCE
                    case FILM       :   // BOOK BETTER THAN FILM
                    case GOLD       :   // BOOK ABOUT GOLD
                    case GRASS      :   // BOOK ABOUT GRASS
                    case GUITAR     :   // BOOK TEACHES GUITAR
                    case GUN        :   // BOOK ABOUT GUNS
                    case HEART      :   // BOOK ABOUT THE HEART
                    case HELICOPTER :   // BOOK ABOUT HELICOPTERS
                    case LASER      :   // BOOK ABOUT LASERS
                    case LAW        :   // BOOK OF LAW
                    case LIGHTNING  :   // BOOK ABOUT LIGHTNING
                    case MATH       :   // BOOK TEACHES MATH
                    case MEDUSA     :   // BOOK ABOUT MEDUSA
                    case MOON       :   // BOOK ABOUT MOON
                    case MOUNTAIN   :   // BOOK ABOUT MOUNTAIN
                    case NUKE       :   // BOOK ABOUT NUKES
                    case PAPER      :   // BOOK USES PAPER
                    case PIT        :   // BOOK FILLS BOREDOM PIT
                    case PLANET     :   // BOOK ABOUT PLANETS
                    case PLATINUM   :   // BOOK ABOUT PLATINUM
                    case POWER      :   // BOOK KNOWLEDGE IS POWER
                    case PRAYER     :   // BOOK OF PRAYER
                    case QUICKSAND  :   // BOOK STORY HAS QUICKSAND
                    case RAIN       :   // BOOK BLOCKS RAIN
                    case RAINBOW    :   // BOOK DEPICTS RAINBOW
                    case ROBOT      :   // BOOK ABOUT ROBOTS
                    case SATAN      :   // BOOK ABOUT SATAN
                    case SKY        :   // BOOK EXPLAINS SKY
                    case SWORD      :   // BOOK ABOUT SWORDS
                    case TANK       :   // BOOK ABOUT TANKS
                    case TOILET     :   // BOOK ENTERTAINS ON TOILET
                    case TORNADO    :   // BOOK EXPLAINS TORNADO
                    case TV         :   // BOOK BETTER THAN TV
                    case UFO        :   // BOOK ON UFOS
                    case VIDEO_GAME :   // BOOK BETTER THAN VIDEO GAME
                    case WATER      :   // BOOK JACKET RESISTS WATER
                    case WHIP       :   // BOOK MAKES YOU SMART AS WHIP
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BRAIN      :
                    case BUTTER     :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAINSAW   :
                    case CHURCH     :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DEATH      :
                    case DUCK       :
                    case FIRE       :
                    case FISH       :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case NOISE      :
                    case PEACE      :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case SUN        :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WALL       :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case BOWL:
                switch (them) {
                    case BOWL:
                        tie();
                        break;
                    case ALIEN      :   // BOWL SHAPES ALIEN SHIP
                    case BEER       :   // BOWL -ING INSPIRES BEER
                    case CAGE       :   // BOWL RATTLES CAGE
                    case CAMERA     :   // BOWL LENSED CAMERA
                    case CHAIN      :   // BOWL HOLDS CHAIN
                    case CHAINSAW   :   // BOWL SPLASHES CHAINSAW
                    case CUP        :   // BOWL BIGGER THAN CUP
                    case DEATH      :   // BOWL BLESSING TRANSCENDS DEATH
                    case DEVIL      :   // BOWL BLESSES DEVIL
                    case DIAMOND    :   // BOWL HOLDS DIAMOND
                    case DRAGON     :   // BOWL DROWNS DRAGON
                    case DYNAMITE   :   // BOWL SPLASHES DYNAMITE
                    case ELECTRICITY:   // BOWL FOCUSES ELECTRICITY
                    case FENCE      :   // BOWL SITS ON FENCES
                    case FIRE       :   // BOWL SNUFFS OUT FIRE
                    case GOLD       :   // BOWL MADE OF GOLD
                    case GUN        :   // BOWL SPLASHES GUN
                    case HEART      :   // BOWL HOLDS HEART
                    case HELICOPTER :   // BOWL SHAPED HELICOPTER COCKPIT
                    case LASER      :   // BOWL REFLECTS LASER
                    case LAW        :   // BOWL KNOWS NO LAW
                    case LIGHTNING  :   // BOWL FOCUSES LIGHTNING
                    case MATH       :   // BOWL PARABOLIC MATH
                    case MEDUSA     :   // BOWL DROWNS MEDUSA
                    case MOUNTAIN   :   // BOWL HOLDS FOOD MOUNTAIN
                    case NUKE       :   // BOWL ENCASES CORE OF NUKE
                    case PIT        :   // BOWL EMERGES FROM WELL PIT
                    case PLATINUM   :   // BOWL MADE OF PLATINUM
                    case POISON     :   // BOWL HOLDS POISON
                    case POWER      :   // BOWL FOCUSES POWER
                    case PRAYER     :   // BOWL BLESSES PRAYER
                    case QUICKSAND  :   // BOWL FLOATS ON QUICKSAND
                    case RAIN       :   // BOWL CATCHES RAIN
                    case RAINBOW    :   // BOWL REFLECTS RAINBOW
                    case ROBOT      :   // BOWL SPLASHES ROBOT
                    case ROCK       :   // BOWL MADE OF ROCK
                    case SATAN      :   // BOWL BLESSES SATAN
                    case SCHOOL     :   // BOWL -ING AFTER SCHOOL
                    case SCISSORS   :   // BOWL SPLASHES SCISSORS
                    case SKY        :   // BOWL SHAPED SKY
                    case SUN        :   // BOWL FOCUSES SUN
                    case SWORD      :   // BOWL SPLASHES SWORD
                    case TANK       :   // BOWL TURRETED TANK
                    case TORNADO    :   // BOWL SHAPED TORNADO SHELTER
                    case TV         :   // BOWL SITS ON TV
                    case UFO        :   // BOWL SHAPES UFO
                    case VIDEO_GAME :   // BOWL -ING VIDEO GAME
                    case WALL       :   // BOWL SMASHES AGAINST WALL
                    case WATER      :   // BOWL HOLDS WATER
                    case WHIP       :   // BOWL RESISTS WHIP
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BOOK       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PEACE      :
                    case PLANET     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case BRAIN:
                switch (them) {
                    case BRAIN:
                        tie();
                        break;
                    case AIR        :   // BRAIN CLEANS AIR
                    case AIRPLANE   :   // BRAIN INVENTS AIRPLANE
                    case ALIEN      :   // BRAIN OUTSMARTS ALIEN
                    case BEER       :   // BRAIN BREWS BEER
                    case BOOK       :   // BRAIN WRITES BOOK
                    case BOWL       :   // BRAIN INVENTS BOWL
                    case BUTTER     :   // BRAIN INVENTS BUTTER
                    case CHURCH     :   // BRAIN BUILDS CHURCH
                    case CLOUD      :   // BRAIN NAMES CLOUD
                    case COMMUNITY  :   // BRAIN BUILDS COMMUNITY
                    case CROSS      :   // BRAIN ENVISIONS CROSS
                    case CUP        :   // BRAIN INVENTS CUP
                    case DEVIL      :   // BRAIN INVENTS DEVIL
                    case DIAMOND    :   // BRAIN DESIRES DIAMONDS
                    case DRAGON     :   // BRAIN CONCOCTS DRAGON
                    case DYNAMITE   :   // BRAIN INVENTS DYNAMITE
                    case ELECTRICITY:   // BRAIN CONDUCTS ELECTRICITY
                    case FENCE      :   // BRAIN BUILDS FENCE
                    case FILM       :   // BRAIN DIRECTS FILM
                    case GOLD       :   // BRAIN DESIRES GOLD
                    case GRASS      :   // BRAIN LANDSCAPES GRASS
                    case GUITAR     :   // BRAIN LEARNS GUITAR
                    case HEART      :   // BRAIN REGULATES HEART
                    case HELICOPTER :   // BRAIN INVENTS HELICOPTER
                    case LASER      :   // BRAIN INVENTS LASER
                    case LIGHTNING  :   // BRAIN HARNESSES LIGHTNING
                    case MATH       :   // BRAIN PERFORMS MATH
                    case MEDUSA     :   // BRAIN FOILS MEDUSA
                    case MONEY      :   // BRAIN DESIRES MONEY
                    case MOON       :   // BRAIN TRAVELS TO MOON
                    case MOUNTAIN   :   // BRAIN CONQUERS MOUNTAIN
                    case NUKE       :   // BRAIN INVENTS NUKE
                    case PAPER      :   // BRAIN WRITES PAPER
                    case PLANET     :   // BRAIN DISCOVERS PLANET
                    case PLATINUM   :   // BRAIN DESIRES PLATINUM
                    case POWER      :   // BRAIN POWER
                    case PRAYER     :   // BRAIN WRITES PRAYER
                    case RAIN       :   // BRAIN ADAPTS TO RAIN
                    case RAINBOW    :   // BRAIN REPLICATES RAINBOW
                    case ROBOT      :   // BRAIN INVENTS ROBOT
                    case SATAN      :   // BRAIN INVENTS SATAN
                    case SKY        :   // BRAIN CONQUERS SKY
                    case SPONGE     :   // BRAIN LIKE SPONGE
                    case TANK       :   // BRAIN INVENTS TANK
                    case TOILET     :   // BRAIN INVENTS TOILET
                    case TV         :   // BRAIN INVENTS TV
                    case UFO        :   // BRAIN PERCEIVES UFO
                    case VAMPIRE    :   // BRAIN FOILS VAMPIRE
                    case VIDEO_GAME :   // BRAIN DESIGNS VIDEO GAME
                    case WATER      :   // BRAIN REFINES WATER
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COCKROACH  :
                    case COMPUTER   :
                    case DEATH      :
                    case DUCK       :
                    case FIRE       :
                    case FISH       :
                    case GUN        :
                    case HOME       :
                    case KING       :
                    case LAW        :
                    case MAN        :
                    case MONKEY     :
                    case NOISE      :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SUN        :
                    case SWORD      :
                    case TORNADO    :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case BUTTER:
                switch (them) {
                    case BUTTER:
                        tie();
                        break;
                    case AIR        :   // BUTTER AROMA FILLS AIR
                    case AIRPLANE   :   // BUTTER FOR AIRPLANE FOOD
                    case ALIEN      :   // BUTTER TRIPS ALIEN
                    case BEER       :   // BUTTER RUINS BEER
                    case BOOK       :   // BUTTER STAINS BOOK
                    case BOWL       :   // BUTTER FILLS BOWL
                    case CHAIN      :   // BUTTER GREASES CHAIN
                    case CLOUD      :   // BUTTER AROMA CLOUD
                    case CUP        :   // BUTTER FILLS CUP
                    case DEVIL      :   // BUTTER DISGUSTS DEVIL
                    case DIAMOND    :   // BUTTER SMEARS DIAMOND
                    case DRAGON     :   // BUTTER DISGUSTS DRAGON
                    case DYNAMITE   :   // BUTTER COATS DYNAMITE
                    case ELECTRICITY:   // BUTTER BEFORE ELECTRICITY
                    case FENCE      :   // BUTTER STAINS FENCE
                    case FILM       :   // BUTTER STAINS FILM
                    case GOLD       :   // BUTTER SMEARS GOLD
                    case GRASS      :   // BUTTER FLAVORS GRASS
                    case GUITAR     :   // BUTTER GREASES GUITAR
                    case GUN        :   // BUTTER GREASES GUN
                    case HEART      :   // BUTTER BAD FOR HEART
                    case HELICOPTER :   // BUTTER GREASES HELICOPTER
                    case LASER      :   // BUTTER SMEARS LASER OPTICS
                    case LAW        :   // BUTTER STAINS LAW
                    case LIGHTNING  :   // BUTTER SURVIVES LIGHTNING
                    case MATH       :   // BUTTER ACCOUNTS USE MATH
                    case MEDUSA     :   // BUTTER TRIPS MEDUSA
                    case MOON       :   // BUTTER COLOR OF MOON
                    case MOUNTAIN   :   // BUTTER POPCORN MOUNTAIN
                    case NUKE       :   // BUTTER GREASES NUKE
                    case PAPER      :   // BUTTER STAINS PAPER
                    case PIT        :   // BUTTER FILLS HUNGER PIT
                    case PLANET     :   // BUTTER USED ACROSS PLANET
                    case PLATINUM   :   // BUTTER SMEARS PLATINUM
                    case POWER      :   // BUTTER FLAVOR POWER
                    case PRAYER     :   // BUTTER ANSWERS PRAYER
                    case QUICKSAND  :   // BUTTER FLOATS ON QUICKSAND
                    case RAIN       :   // BUTTER RESISTS RAIN
                    case RAINBOW    :   // BUTTER GREASE RAINBOW
                    case ROBOT      :   // BUTTER TRIPS ROBOT
                    case SATAN      :   // BUTTER DISGUSTS SATAN
                    case SKY        :   // BUTTER SMEARS SKYLIGHT
                    case TANK       :   // BUTTER GREASES TANK
                    case TOILET     :   // BUTTER ENDS UP IN TOILET
                    case TORNADO    :   // BUTTER TASTE TORNADO
                    case TV         :   // BUTTER SMEARS TV
                    case UFO        :   // BUTTER SMEARS UFO
                    case VIDEO_GAME :   // BUTTER RUINS VIDEO GAME
                    case WATER      :   // BUTTER RESISTS WATER
                    case WHIP       :   // BUTTER GREASES WHIP
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BRAIN      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAINSAW   :
                    case CHURCH     :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DEATH      :
                    case DUCK       :
                    case FIRE       :
                    case FISH       :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case NOISE      :
                    case PEACE      :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case SUN        :
                    case SWORD      :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WALL       :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case CAGE:
                switch (them) {
                    case CAGE:
                        tie();
                        break;
                    case AIR        :   // CAGE STAGNATES AIR
                    case AIRPLANE   :   // CAGE STRUCTURE IN AIRPLANE
                    case AXE        :   // CAGE NOT AFFECTED BY AXE
                    case BABY       :   // CAGE TRAPS BABY
                    case BICYCLE    :   // CAGE CONTAINS BICYCLE
                    case BIRD       :   // CAGE TRAPS BIRD
                    case BLOOD      :   // CAGE BOILS BLOOD
                    case BOOK       :   // CAGE HAS NO BOOK
                    case BRAIN      :   // CAGE TRAPS BRAIN
                    case BUTTER     :   // CAGE HAS NO BUTTER
                    case CAR        :   // CAGE (ROLLCAGE) PROTECTS CAR
                    case CASTLE     :   // CAGE MORE FORTIFIED THAN CASTLE
                    case CAT        :   // CAGE TRAPS CAT
                    case CHURCH     :   // CAGE SADDENS CHURCH
                    case CLOUD      :   // CAGE CLOUDS FREEDOM
                    case COCKROACH  :   // CAGE TRAPS COCKROACH
                    case COMMUNITY  :   // CAGE PROTECTS COMMUNITY
                    case COMPUTER   :   // CAGE CONTAINS COMPUTER
                    case CROSS      :   // CAGE MAKES YOU CROSS
                    case DUCK       :   // CAGE TRAPS DUCK
                    case FILM       :   // CAGE HAS NO FILM
                    case FISH       :   // CAGE TRAPS FISH
                    case GRASS      :   // CAGE HAS NO GRASS
                    case GUITAR     :   // CAGE HAS NO GUITAR
                    case HOME       :   // CAGE BECOMES HOME
                    case KING       :   // CAGE TRAPS KING
                    case MAN        :   // CAGE IMPRISONS MAN
                    case MONEY      :   // CAGE COSTS MONEY
                    case MONKEY     :   // CAGE TRAPS MONKEY
                    case MOON       :   // CAGE BLOCKS MOONLIGHT
                    case NOISE      :   // CAGE DOOR MAKES NOISE
                    case PAPER      :   // CAGE HAS NO PAPER
                    case PEACE      :   // CAGE KEEPS PEACE
                    case PLANET     :   // CAGE TEACHES PLANET
                    case POLICE     :   // CAGE TRAPS POLICE
                    case PORCUPINE  :   // CAGE TRAPS PORCUPINE
                    case PRINCE     :   // CAGE TRAPS PRINCE
                    case PRINCESS   :   // CAGE TRAPS PRINCESS
                    case QUEEN      :   // CAGE TRAPS QUEEN
                    case SNAKE      :   // CAGE TRAPS SNAKE
                    case SPIDER     :   // CAGE TRAPS SPIDER
                    case SPONGE     :   // CAGE KNOWS NO SPONGE
                    case TOILET     :   // CAGE HAS POOR TOILET
                    case TRAIN      :   // CAGE STRUCTURE IN TRAIN
                    case TREE       :   // CAGE BLOCKS TREE
                    case TURNIP     :   // CAGE CONTAINS TURNIP
                    case VAMPIRE    :   // CAGE TRAPS VAMPIRE
                    case VULTURE    :   // CAGE TRAPS VULTURE
                    case WOLF       :   // CAGE TRAPS WOLF
                    case WOMAN      :   // CAGE IMPRISONS WOMAN
                        win();
                        break;
                    case ALIEN      :
                    case BEER       :
                    case BOWL       :
                    case CAMERA     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case CUP        :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PIT        :
                    case PLATINUM   :
                    case POISON     :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WALL       :
                    case WATER      :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case CAMERA:
                switch (them) {
                    case CAMERA:
                        tie();
                        break;
                    case AIRPLANE   :   // CAMERA CAPTURES AIRPLANE
                    case AXE        :   // CAMERA CAPTURES AXE
                    case BABY       :   // CAMERA CAPTURES BABY
                    case BICYCLE    :   // CAMERA CAPTURES BICYCLE
                    case BIRD       :   // CAMERA CAPTURES BIRD
                    case BLOOD      :   // CAMERA CAPTURES BLOOD
                    case BOOK       :   // CAMERA OUTCLASSES BOOK
                    case BRAIN      :   // CAMERA CAPTURES BRAIN
                    case BUTTER     :   // CAMERA CAPTURES BUTTER
                    case CAGE       :   // CAMERA CAPTURES CAGE
                    case CAR        :   // CAMERA CAPTURES CAR
                    case CASTLE     :   // CAMERA CAPTURES CASTLE
                    case CAT        :   // CAMERA CAPTURES CAT
                    case CHAINSAW   :   // CAMERA CAPTURES CHAINSAW
                    case CHURCH     :   // CAMERA CAPTURES CHURCH
                    case CLOUD      :   // CAMERA CAPTURES CLOUD
                    case COCKROACH  :   // CAMERA CAPTURES COCKROACH
                    case COMMUNITY  :   // CAMERA CAPTURES COMMUNITY
                    case COMPUTER   :   // CAMERA DOWNLOADS ONTO COMPUTER
                    case CROSS      :   // CAMERA HAS CROSSHAIR
                    case DUCK       :   // CAMERA CAPTURES DUCK
                    case FIRE       :   // CAMERA CAPTURES FIRE
                    case FISH       :   // CAMERA CAPTURES FISH
                    case HOME       :   // CAMERA CAPTURES HOME
                    case KING       :   // CAMERA CAPTURES KING
                    case MAN        :   // CAMERA CAPTURES MAN
                    case MONEY      :   // CAMERA COSTS MONEY
                    case MONKEY     :   // CAMERA CAPTURES MONKEY
                    case MOON       :   // CAMERA CAPTURES MOON
                    case NOISE      :   // CAMERA MAKES NOISE
                    case PAPER      :   // CAMERA PICTURES USE PAPER
                    case PEACE      :   // CAMERA CAPTURES PEACE
                    case POISON     :   // CAMERA CAPTURES POISON
                    case POLICE     :   // CAMERA CAPTURES POLICE
                    case PORCUPINE  :   // CAMERA CAPTURES PORCUPINE
                    case PRINCE     :   // CAMERA CAPTURES PRINCE
                    case PRINCESS   :   // CAMERA CAPTURES PRINCESS
                    case QUEEN      :   // CAMERA CAPTURES QUEEN
                    case SCHOOL     :   // CAMERA CAPTURES SCHOOL
                    case SCISSORS   :   // CAMERA CAPTURES SCISSORS
                    case SNAKE      :   // CAMERA CAPTURES SNAKE
                    case SPIDER     :   // CAMERA CAPTURES SPIDER
                    case SPONGE     :   // CAMERA CAPTURES SPONGE
                    case TRAIN      :   // CAMERA CAPTURES TRAIN
                    case TREE       :   // CAMERA CAPTURES TREE
                    case TURNIP     :   // CAMERA CAPTURES TURNIP
                    case VAMPIRE    :   // CAMERA CAPTURES VAMPIRE
                    case VULTURE    :   // CAMERA CAPTURES VULTURE
                    case WOLF       :   // CAMERA CAPTURES WOLF
                    case WOMAN      :   // CAMERA CAPTURES WOMAN
                        win();
                        break;
                    case AIR        :
                    case ALIEN      :
                    case BEER       :
                    case BOWL       :
                    case CHAIN      :
                    case CUP        :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PIT        :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SKY        :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TOILET     :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WALL       :
                    case WATER      :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case CAR:
                switch (them) {
                    case CAR:
                        tie();
                        break;
                    case AIR        :   // CAR IS AIR CONDITIONED
                    case AIRPLANE   :   // CAR TO AIRPLANE
                    case ALIEN      :   // CAR INTRIGUES ALIEN
                    case BEER       :   // CAR MAKES BEER RUN
                    case BICYCLE    :   // CAR FASTER THAN BICYCLE
                    case BIRD       :   // CAR HITS BIRD
                    case BOOK       :   // CAR HAS BOOK VALUE
                    case BOWL       :   // CAR CARRIES BOWL
                    case BRAIN      :   // CAR REQUIRES BRAINS
                    case BUTTER     :   // CAR SEXIER THAN BUTTER
                    case CAT        :   // CAR HITS CAT
                    case CHURCH     :   // CAR COZIER THAN CHURCH
                    case CLOUD      :   // CAR CREATES CLOUD
                    case COCKROACH  :   // CAR HOUSES COCKROACH
                    case COMMUNITY  :   // CAR CONGESTS COMMUNITY
                    case CROSS      :   // CAR CROSSES
                    case CUP        :   // CAR HAS CUP HOLDER
                    case DEVIL      :   // CAR AMUSES DEVIL
                    case DIAMOND    :   // CAR PRICIER THAN DIAMOND
                    case DRAGON     :   // CAR OUTRUNS DRAGON
                    case DUCK       :   // CAR HITS DUCK
                    case FENCE      :   // CAR WRECKS FENCE
                    case FILM       :   // CAR IN FILM
                    case FISH       :   // CAR CARRIES FISH
                    case GOLD       :   // CAR PRICIER THAN GOLD
                    case GRASS      :   // CAR DESTROYS GRASS
                    case GUITAR     :   // CAR RADIO PLAYS GUITAR
                    case MATH       :   // CAR TO MATH CLASS
                    case MONEY      :   // CAR COSTS MONEY
                    case MOON       :   // CAR REFLECTS MOON
                    case MOUNTAIN   :   // CAR CLIMBS MOUNTAIN
                    case NOISE      :   // CAR MAKES NOISE
                    case PAPER      :   // CAR HAS PAPERWORK
                    case PLANET     :   // CAR TRAVELS PLANET
                    case PLATINUM   :   // CAR PRICIER THAN PLATINUM
                    case PRAYER     :   // CAR INSPIRES PRAYER
                    case RAIN       :   // CAR DRIVES IN RAIN
                    case RAINBOW    :   // CAR REFLECTS RAINBOW
                    case SATAN      :   // CAR AMUSES SATAN
                    case SPIDER     :   // CAR HOUSES SPIDER
                    case SPONGE     :   // CAR IS MONEY SPONGE
                    case TOILET     :   // CAR HAS NO TOILET
                    case TREE       :   // CAR HITS TREE
                    case TURNIP     :   // CAR CARRIES TURNIP
                    case TV         :   // CAR CAN HAVE TV
                    case UFO        :   // CAR ATTRACTS UFO
                    case VAMPIRE    :   // CAR OUTRUNS VAMPIRE
                    case VIDEO_GAME :   // CAR IN VIDEO GAME
                    case WATER      :   // CAR COOLANT IS WATER
                    case WOLF       :   // CAR SCARES WOLF
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FIRE       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case HOME       :
                    case KING       :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MAN        :
                    case MEDUSA     :
                    case MONKEY     :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case POWER      :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROBOT      :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TRAIN      :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case CASTLE:
                switch (them) {
                    case CASTLE:
                        tie();
                        break;
                    case AIR        :   // CASTLE DISPLACES AIR
                    case AIRPLANE   :   // CASTLE PRICIER THAN AIRPLANE
                    case BABY       :   // CASTLE HOUSES BABY
                    case BEER       :   // CASTLE HAS BEER
                    case BICYCLE    :   // CASTLE PRICIER THAN BICYCLE
                    case BIRD       :   // CASTLE HOUSES BIRD
                    case BLOOD      :   // CASTLE COSTS BLOOD
                    case BOOK       :   // CASTLE IN BOOK
                    case BOWL       :   // CASTLE CONTAINS BOWL
                    case BRAIN      :   // CASTLE INTIMIDATES BRAIN
                    case BUTTER     :   // CASTLE CONTAINS BUTTER
                    case CAR        :   // CASTLE PRICIER THAN CAR
                    case CAT        :   // CASTLE HOUSES CAT
                    case CHURCH     :   // CASTLE TALLER THAN CHURCH
                    case CLOUD      :   // CASTLE IN THE CLOUDS
                    case COCKROACH  :   // CASTLE HOUSES COCKROACH
                    case COMMUNITY  :   // CASTLE TOWERS OVER COMMUNITY
                    case CROSS      :   // CASTLE TALLER THAN CROSS
                    case CUP        :   // CASTLE CONTAINS CUP
                    case DUCK       :   // CASTLE CONTAINS DUCK
                    case FILM       :   // CASTLE IN FILM
                    case FISH       :   // CASTLE CONTAINS FISH
                    case GRASS      :   // CASTLE GROUNDS HAVE GRASS
                    case GUITAR     :   // CASTLE CONTAINS GUITAR
                    case HOME       :   // CASTLE OUTCLASSES HOME
                    case KING       :   // CASTLE HOUSES KING
                    case MAN        :   // CASTLE TOWERS OVER MAN
                    case MONEY      :   // CASTLE COSTS MONEY
                    case MONKEY     :   // CASTLE HOUSES MONKEY
                    case MOON       :   // CASTLE BLOCKS MOON
                    case NOISE      :   // CASTLE ECHOES NOISE
                    case PAPER      :   // CASTLE IN PAPER
                    case PLANET     :   // CASTLE ON PLANET
                    case POLICE     :   // CASTLE ENLISTS POLICE
                    case PORCUPINE  :   // CASTLE PROTECTS PORCUPINE
                    case PRINCE     :   // CASTLE HOUSES PRINCE
                    case PRINCESS   :   // CASTLE HOUSES PRINCESS
                    case QUEEN      :   // CASTLE HOUSES QUEEN
                    case RAIN       :   // CASTLE BLOCKS RAIN
                    case SNAKE      :   // CASTLE HOUSES SNAKE
                    case SPIDER     :   // CASTLE HOUSES SPIDER
                    case SPONGE     :   // CASTLE IS MONEY SPONGE
                    case TOILET     :   // CASTLE HAS TOILET
                    case TRAIN      :   // CASTLE PRICIER THAN TRAIN
                    case TREE       :   // CASTLE TALLER THAN TREE
                    case TURNIP     :   // CASTLE CONTAINS TURNIP
                    case VAMPIRE    :   // CASTLE HOUSES VAMPIRE
                    case VULTURE    :   // CASTLE ATTRACTS VULTURE
                    case WOLF       :   // CASTLE PROTECTS WOLF
                    case WOMAN      :   // CASTLE TOWERS OVER WOMAN
                        win();
                        break;
                    case ALIEN      :
                    case AXE        :
                    case CAGE       :
                    case CAMERA     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case PLATINUM   :
                    case POISON     :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAINBOW    :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WALL       :
                    case WATER      :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case CAT:
                switch (them) {
                    case CAT:
                        tie();
                        break;
                    case AIR        :   // CAT BREATHES AIR
                    case AIRPLANE   :   // CAT RIDES ON AIRPLANE
                    case ALIEN      :   // CAT ALLERGY KILLS ALIEN
                    case BEER       :   // CAT DRINKS BEER
                    case BIRD       :   // CAT CHASES BIRD
                    case BOOK       :   // CAT RIPS UP BOOK
                    case BOWL       :   // CAT DRINKS FROM BOWL
                    case BRAIN      :   // CAT HAS BRAIN
                    case BUTTER     :   // CAT LICKS BUTTER
                    case CHURCH     :   // CAT DISRUPTS CHURCH
                    case CLOUD      :   // CAT CREATES DUST CLOUD
                    case COCKROACH  :   // CAT EATS COCKROACH
                    case COMMUNITY  :   // CAT AMUSES COMMUNITY
                    case CROSS      :   // CAT ACTS CROSS
                    case CUP        :   // CAT KNOCKS OVER CUP
                    case DEVIL      :   // CAT RECOGNIZES DEVIL
                    case DIAMOND    :   // CAT PLAYS WITH DIAMOND
                    case DRAGON     :   // CAT OUTRUNS DRAGON
                    case ELECTRICITY:   // CAT 9 LIVES DESPITE ELECTRICITY
                    case FENCE      :   // CAT ATOP FENCE
                    case FILM       :   // CAT ON FILM
                    case FISH       :   // CAT EATS FISH
                    case GOLD       :   // CAT COLORED GOLD
                    case GRASS      :   // CAT IN GRASS
                    case GUITAR     :   // CAT GUT GUITAR STRINGS
                    case HEART      :   // CAT HAS HEART
                    case LASER      :   // CAT CHASES LASER DOT
                    case LIGHTNING  :   // CAT 9 LIVES DESPITE LIGHTNING
                    case MATH       :   // CAT DOESN'T NEED MATH
                    case MEDUSA     :   // CAT OUTRUNS MEDUSA
                    case MONEY      :   // CAT STEALS MONEY
                    case MOON       :   // CAT HUNTS BY MOON
                    case MOUNTAIN   :   // CAT LIVES ON MOUNTAIN
                    case PAPER      :   // CAT RIPS UP PAPER
                    case PLANET     :   // CAT LIVES ON PLANET
                    case PLATINUM   :   // CAT COLORED PLATINUM
                    case POWER      :   // CAT HAS SPIRITUAL POWER
                    case PRAYER     :   // CAT IN PRAYER
                    case RAIN       :   // CAT HATES RAIN
                    case RAINBOW    :   // CAT LOOKS AT RAINBOW
                    case ROBOT      :   // CAT OUTRUNS ROBOT
                    case SATAN      :   // CAT RECOGNIZES SATAN
                    case SPIDER     :   // CAT EATS SPIDER
                    case SPONGE     :   // CAT PLAYS WITH SPONGE
                    case TOILET     :   // CAT DOESN'T USE TOILET
                    case TV         :   // CAT SLEEPS ON TV
                    case UFO        :   // CAT HIDES FROM UFO
                    case VAMPIRE    :   // CAT ENTERTAINS VAMPIRE
                    case VIDEO_GAME :   // CAT HAIR RUINS VIDEO GAME
                    case WATER      :   // CAT DRINKS WATER
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DUCK       :
                    case DYNAMITE   :
                    case FIRE       :
                    case GUN        :
                    case HELICOPTER :
                    case HOME       :
                    case KING       :
                    case LAW        :
                    case MAN        :
                    case MONKEY     :
                    case NOISE      :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case CHAIN:
                switch (them) {
                    case CHAIN:
                        tie();
                        break;
                    case AXE        :   // CHAIN NICKS AXE
                    case BABY       :   // CHAIN RESTRAINS BABY
                    case BICYCLE    :   // CHAIN LOCKS BICYCLE
                    case BIRD       :   // CHAIN CRUSHES BIRD
                    case BLOOD      :   // CHAIN CONSTRICTS BLOOD
                    case BRAIN      :   // CHAIN PUZZLES BRAIN
                    case CAGE       :   // CHAIN LOCKS CAGE
                    case CAMERA     :   // CHAIN HOLDS DOWN CAMERA
                    case CAR        :   // CHAIN HOLDS BACK CAR
                    case CASTLE     :   // CHAIN LOCKS CASTLE
                    case CAT        :   // CHAIN RESTRAINS CAT
                    case CHAINSAW   :   // CHAIN HOLDS DOWN CHAINSAW
                    case COCKROACH  :   // CHAIN CRUSHES COCKROACH
                    case COMMUNITY  :   // CHAIN PROTECTS COMMUNITY
                    case COMPUTER   :   // CHAIN SMASHES COMPUTER
                    case CROSS      :   // CHAIN HOLDS CROSS
                    case DEATH      :   // CHAIN CHOKES FOR DEATH
                    case DUCK       :   // CHAIN CRUSHES DUCK
                    case FIRE       :   // CHAIN RESISTS FIRE
                    case FISH       :   // CHAIN SMOOSHES FISH
                    case GUN        :   // CHAIN HOLDS DOWN GUN
                    case HOME       :   // CHAIN LOCKS HOME
                    case KING       :   // CHAIN RESTRAINS KING
                    case LAW        :   // CHAIN GUARDS LAW
                    case MAN        :   // CHAIN RESTRAINS MAN
                    case MONEY      :   // CHAIN COSTS MONEY
                    case MONKEY     :   // CHAIN RESTRAINS MONKEY
                    case NOISE      :   // CHAIN CLINKS NOISE
                    case PEACE      :   // CHAIN KEEPS PEACE
                    case POISON     :   // CHAIN IMMUNE TO POISON
                    case POLICE     :   // CHAIN RESTRAINS POLICE
                    case PORCUPINE  :   // CHAIN RESTRAINS PORCUPINE
                    case PRINCE     :   // CHAIN RESTRAINS PRINCE
                    case PRINCESS   :   // CHAIN RESTRAINS PRINCESS
                    case QUEEN      :   // CHAIN RESTRAINS QUEEN
                    case ROCK       :   // CHAIN PINS DOWN ROCK
                    case SCHOOL     :   // CHAIN LOCKS SCHOOL
                    case SCISSORS   :   // CHAIN DULLS SCISSORS
                    case SNAKE      :   // CHAIN STRONGER THAN SNAKE
                    case SPIDER     :   // CHAIN CRUSHES SPIDER
                    case SUN        :   // CHAIN REFLECTS SUN
                    case SWORD      :   // CHAIN NICKS SWORD
                    case TRAIN      :   // CHAIN HOLDS BACK TRAIN
                    case TREE       :   // CHAIN AROUND TREE
                    case TURNIP     :   // CHAIN PROTECTS TURNIP
                    case VULTURE    :   // CHAIN RESTRAINS VULTURE
                    case WALL       :   // CHAIN PROTECTS WALL
                    case WHIP       :   // CHAIN OUTCLASSES WHIP
                    case WOLF       :   // CHAIN RESTRAINS WOLF
                    case WOMAN      :   // CHAIN RESTRAINS WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BOOK       :
                    case BOWL       :
                    case BUTTER     :
                    case CHURCH     :
                    case CLOUD      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOON       :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PAPER      :
                    case PIT        :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SKY        :
                    case SPONGE     :
                    case TANK       :
                    case TOILET     :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case CHAINSAW:
                switch (them) {
                    case CHAINSAW:
                        tie();
                        break;
                    case AIRPLANE   :   // CHAINSAW TERRORIZES AIRPLANE
                    case AXE        :   // CHAINSAW OUTCLASSES AXE
                    case BABY       :   // CHAINSAW SCARES BABY
                    case BICYCLE    :   // CHAINSAW DESTROYS BICYCLE
                    case BIRD       :   // CHAINSAW SCARES BIRD
                    case BLOOD      :   // CHAINSAW SPLATTERS BLOOD
                    case BOOK       :   // CHAINSAW TEARS UP BOOK
                    case BRAIN      :   // CHAINSAW BURNS BRAIN
                    case BUTTER     :   // CHAINSAW SPLATTERS BUTTER
                    case CAGE       :   // CHAINSAW CUTS THROUGH CAGE
                    case CAR        :   // CHAINSAW DESTROYS CAR
                    case CASTLE     :   // CHAINSAW RUINS CASTLE
                    case CAT        :   // CHAINSAW WOUNDS CAT
                    case CHURCH     :   // CHAINSAW TERRORIZES CHURCH
                    case CLOUD      :   // CHAINSAW PRODUCES CLOUD
                    case COCKROACH  :   // CHAINSAW DICES COCKROACH
                    case COMMUNITY  :   // CHAINSAW MAKES WAY FOR COMMUNITY
                    case COMPUTER   :   // CHAINSAW GLEEFULLY RAVAGES COMPUTER
                    case CROSS      :   // CHAINSAW CHOPS DOWN CROSS
                    case DUCK       :   // CHAINSAW KILLS DUCK
                    case FILM       :   // CHAINSAW MASSACRE FILM
                    case FISH       :   // CHAINSAW SPLATTERS FISH
                    case GRASS      :   // CHAINSAW CUTS GRASS
                    case HOME       :   // CHAINSAW DESTROYS HOME
                    case KING       :   // CHAINSAW WOUNDS KING
                    case MAN        :   // CHAINSAW WOUNDS MAN
                    case MONEY      :   // CHAINSAW COSTS MONEY
                    case MONKEY     :   // CHAINSAW KILLS MONKEY
                    case MOON       :   // CHAINSAW USER DRINKS MOONSHINE
                    case NOISE      :   // CHAINSAW MAKES NOISE
                    case PAPER      :   // CHAINSAW TEARS UP PAPER
                    case PEACE      :   // CHAINSAW DISTURBS PEACE
                    case POISON     :   // CHAINSAW MORE DIRECT THAN POISON
                    case POLICE     :   // CHAINSAW WOUNDS POLICE
                    case PORCUPINE  :   // CHAINSAW KILLS PORCUPINE
                    case PRINCE     :   // CHAINSAW WOUNDS PRINCE
                    case PRINCESS   :   // CHAINSAW WOUNDS PRINCESS
                    case QUEEN      :   // CHAINSAW WOUNDS QUEEN
                    case SCHOOL     :   // CHAINSAW DESTROYS SCHOOL
                    case SCISSORS   :   // CHAINSAW OUTCLASSES SCISSORS
                    case SNAKE      :   // CHAINSAW CHOPS UP SNAKE
                    case SPIDER     :   // CHAINSAW SLICES SPIDER
                    case SPONGE     :   // CHAINSAW CUTS UP SPONGE
                    case TRAIN      :   // CHAINSAW HOLDS UP TRAIN
                    case TREE       :   // CHAINSAW CUTS DOWN TREE
                    case TURNIP     :   // CHAINSAW DICES TURNIP
                    case VAMPIRE    :   // CHAINSAW BEHEADS VAMPIRE
                    case VULTURE    :   // CHAINSAW KILLS VULTURE
                    case WOLF       :   // CHAINSAW WOUNDS WOLF
                    case WOMAN      :   // CHAINSAW WOUNDS WOMAN
                        win();
                        break;
                    case AIR        :
                    case ALIEN      :
                    case BEER       :
                    case BOWL       :
                    case CAMERA     :
                    case CHAIN      :
                    case CUP        :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUITAR     :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PIT        :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SKY        :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TOILET     :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WALL       :
                    case WATER      :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case CHURCH:
                switch (them) {
                    case CHURCH:
                        tie();
                        break;
                    case AIR        :   // CHURCH CLEARS THE AIR
                    case AIRPLANE   :   // CHURCH BLESSES AIRPLANE
                    case ALIEN      :   // CHURCH DISBELIEVES ALIEN
                    case BEER       :   // CHURCH FROWNS ON BEER
                    case BOOK       :   // CHURCH TEACHES BOOK
                    case BOWL       :   // CHURCH HAS BOWL
                    case BUTTER     :   // CHURCH BLESSES BUTTER
                    case CHAIN      :   // CHURCH BINDS LIKE CHAIN
                    case CLOUD      :   // CHURCH DISPELLS CLOUD
                    case CUP        :   // CHURCH WORSHIPS WITH CUP
                    case DEVIL      :   // CHURCH RENOUNCES DEVIL
                    case DIAMOND    :   // CHURCH COLLECTS DIAMOND
                    case DRAGON     :   // CHURCH HUNTS DRAGON
                    case DYNAMITE   :   // CHURCH SURVIVES DYNAMITE
                    case ELECTRICITY:   // CHURCH USES ELECTRICITY
                    case FENCE      :   // CHURCH HAS FENCE
                    case FILM       :   // CHURCH BANS FILM
                    case GOLD       :   // CHURCH COLLECTS GOLD
                    case GRASS      :   // CHURCH SITS ON GRASS
                    case GUITAR     :   // CHURCH BANS GUITAR
                    case GUN        :   // CHURCH BANS GUN
                    case HEART      :   // CHURCH HEALS HEART
                    case HELICOPTER :   // CHURCH BANS HELICOPTER
                    case LASER      :   // CHURCH BANS LASER
                    case LAW        :   // CHURCH CREATES LAW
                    case LIGHTNING  :   // CHURCH ATTRACTS LIGHTNING
                    case MATH       :   // CHURCH ACCOUNTS USE MATH
                    case MEDUSA     :   // CHURCH HUNTS MEDUSA
                    case MOON       :   // CHURCH BLOCKS MOON
                    case MOUNTAIN   :   // CHURCH ATOP MOUNTAIN
                    case NUKE       :   // CHURCH BANS NUKE
                    case PAPER      :   // CHURCH PROGRAM PAPER
                    case PIT        :   // CHURCH THREATENS PIT
                    case PLANET     :   // CHURCH ACROSS PLANET
                    case PLATINUM   :   // CHURCH COLLECTS PLATINUM
                    case POWER      :   // CHURCH HAS HEALING POWER
                    case PRAYER     :   // CHURCH IN PRAYER
                    case QUICKSAND  :   // CHURCH TOO BIG FOR QUICKSAND
                    case RAIN       :   // CHURCH BLOCKS RAIN
                    case RAINBOW    :   // CHURCH BLOCKS RAINBOW
                    case ROBOT      :   // CHURCH FROWNS ON ROBOT
                    case SATAN      :   // CHURCH RENOUNCES SATAN
                    case SKY        :   // CHURCH LIGHTS UP SKY
                    case TANK       :   // CHURCH BANS TANK
                    case TOILET     :   // CHURCH HAS TOILET
                    case TORNADO    :   // CHURCH SURVIVES TORNADO
                    case TV         :   // CHURCH ON TV
                    case UFO        :   // CHURCH DISBELIEVES UFO
                    case VIDEO_GAME :   // CHURCH BANS VIDEO GAME
                    case WATER      :   // CHURCH BLESSES WATER
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BRAIN      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAINSAW   :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DEATH      :
                    case DUCK       :
                    case FIRE       :
                    case FISH       :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case NOISE      :
                    case PEACE      :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case SUN        :
                    case SWORD      :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case CLOUD:
                switch (them) {
                    case CLOUD:
                        tie();
                        break;
                    case AIR        :   // CLOUD MADE OF AIR
                    case AIRPLANE   :   // CLOUD DIVERTS AIRPLANE
                    case ALIEN      :   // CLOUD BLOCKS ALIEN SHIP
                    case BEER       :   // CLOUD RAINS IN BEER
                    case BOWL       :   // CLOUD RAINS IN BOWL
                    case CHAIN      :   // CLOUD STARTS CHAIN REACTION
                    case CUP        :   // CLOUD RAINS IN CUP
                    case DEATH      :   // CLOUD INDICATES DEATH
                    case DEVIL      :   // CLOUD INDICATES DEVIL
                    case DIAMOND    :   // CLOUD OVER DIAMOND
                    case DRAGON     :   // CLOUD OVER DRAGON
                    case DYNAMITE   :   // CLOUD RAINS ON DYNAMITE
                    case ELECTRICITY:   // CLOUD CONDUCTS ELECTRICITY
                    case FENCE      :   // CLOUD OVER FENCE
                    case FILM       :   // CLOUD RUINS FILM
                    case GOLD       :   // CLOUD OVER GOLD
                    case GRASS      :   // CLOUD OVER GRASS
                    case GUITAR     :   // CLOUD ADORNS GUITAR
                    case GUN        :   // CLOUD TOO FAR FOR GUN
                    case HEART      :   // CLOUD MAKES HEART DOUBTFUL
                    case HELICOPTER :   // CLOUD OVER HELICOPTER
                    case LASER      :   // CLOUD NOT AFFECTED BY LASER
                    case LAW        :   // CLOUD KNOWS NO LAW
                    case LIGHTNING  :   // CLOUD BRINGS LIGHTNING
                    case MATH       :   // CLOUD CANCELS MATH CLASS
                    case MEDUSA     :   // CLOUD OVER MEDUSA
                    case MOON       :   // CLOUD BLOCKS MOON
                    case MOUNTAIN   :   // CLOUD OVER MOUNTAIN
                    case NUKE       :   // CLOUD DIVERTS NUKE
                    case PIT        :   // CLOUD OVER PIT
                    case PLANET     :   // CLOUD COVERS PLANET
                    case PLATINUM   :   // CLOUD OVER PLATINUM
                    case POWER      :   // CLOUD DISRUPTS SOLAR POWER
                    case PRAYER     :   // CLOUD DESPITE PRAYER
                    case QUICKSAND  :   // CLOUD OVER QUICKSAND
                    case RAIN       :   // CLOUD PRODUCES RAIN
                    case RAINBOW    :   // CLOUD BLOCKS RAINBOW
                    case ROBOT      :   // CLOUD OVER ROBOT
                    case ROCK       :   // CLOUD OVER ROCK
                    case SATAN      :   // CLOUD INDICATES SATAN
                    case SKY        :   // CLOUD DECORATES SKY
                    case SWORD      :   // CLOUD OVER SWORD
                    case TANK       :   // CLOUD OVER TANK
                    case TOILET     :   // CLOUD SURROUNDS TOILET
                    case TORNADO    :   // CLOUD BECOMES TORNADO
                    case TV         :   // CLOUD ON TV
                    case UFO        :   // CLOUD BLOCKS UFO
                    case VIDEO_GAME :   // CLOUD IN VIDEO GAME
                    case WATER      :   // CLOUD CONTAINS WATER
                    case WHIP       :   // CLOUD OVER WHIP
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BOOK       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAINSAW   :
                    case CHURCH     :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DUCK       :
                    case FIRE       :
                    case FISH       :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case NOISE      :
                    case PAPER      :
                    case PEACE      :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case SUN        :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WALL       :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case COCKROACH:
                switch (them) {
                    case COCKROACH:
                        tie();
                        break;
                    case AIR        :   // COCKROACH BREATHES AIR
                    case AIRPLANE   :   // COCKROACH CREEPS INTO AIRPLANE
                    case ALIEN      :   // COCKROACH STOWS AWAY WITH ALIEN
                    case BEER       :   // COCKROACH IN YOUR BEER
                    case BOOK       :   // COCKROACH BEHIND BOOK
                    case BOWL       :   // COCKROACH HIDES UNDER BOWL
                    case BRAIN      :   // COCKROACH HAS BRAIN
                    case BUTTER     :   // COCKROACH CRAWLS ACROSS BUTTER
                    case CHURCH     :   // COCKROACH CREEPS INTO CHURCH
                    case CLOUD      :   // COCKROACH SWARMS LIKE CLOUD
                    case COMMUNITY  :   // COCKROACH ANNOYS COMMUNITY
                    case CROSS      :   // COCKROACH CRAWLS UP CROSS
                    case CUP        :   // COCKROACH CRAWLS INTO CUP
                    case DEVIL      :   // COCKROACH MAKES MEN DEVILS
                    case DIAMOND    :   // COCKROACH CRAWLS ACROSS DIAMONDS
                    case DRAGON     :   // COCKROACH EATS DRAGON EGGS
                    case ELECTRICITY:   // COCKROACH HIDES FROM ELECTRICITY
                    case FENCE      :   // COCKROACH CRAWLS OVER FENCE
                    case FILM       :   // COCKROACH NESTS IN FILM
                    case GOLD       :   // COCKROACH CRAWLS ACROSS GOLD
                    case GRASS      :   // COCKROACH IN GRASS
                    case GUITAR     :   // COCKROACH HIDES IN GUITAR
                    case HEART      :   // COCKROACH HAS HEART
                    case HELICOPTER :   // COCKROACH CREEPS INTO HELICOPTER
                    case LASER      :   // COCKROACH TOO NUMEROUS FOR LASER
                    case LIGHTNING  :   // COCKROACH HIDES FROM LIGHTNING
                    case MATH       :   // COCKROACH DOESN'T NEED MATH
                    case MEDUSA     :   // COCKROACH AMUSES MEDUSA
                    case MONEY      :   // COCKROACH NESTS IN MONEY
                    case MOON       :   // COCKROACH NOCTURNAL WITH MOON
                    case MOUNTAIN   :   // COCKROACH LIVES ON MOUNTAIN
                    case NUKE       :   // COCKROACH SURVIVES NUKE
                    case PAPER      :   // COCKROACH NESTS BETWEEN PAPERS
                    case PLANET     :   // COCKROACH LIVES ON PLANET
                    case PLATINUM   :   // COCKROACH CRAWLS ACROSS PLATINUM
                    case POWER      :   // COCKROACH HAS SURVIVAL POWER
                    case PRAYER     :   // COCKROACH DESPITE PRAYER
                    case RAIN       :   // COCKROACH DOESN'T MIND RAIN
                    case RAINBOW    :   // COCKROACH UNAWARE OF RAINBOW
                    case ROBOT      :   // COCKROACH CRAWLS OVER ROBOT
                    case SATAN      :   // COCKROACH AMUSES SATAN
                    case SKY        :   // COCKROACH UNAWARE OF SKY
                    case SPONGE     :   // COCKROACH NESTS IN SPONGE
                    case TANK       :   // COCKROACH CREEPS INTO TANK
                    case TOILET     :   // COCKROACH HIDES IN TOILET
                    case TV         :   // COCKROACH CRAWLS ACROSS TV
                    case UFO        :   // COCKROACH STOWS AWAY WITH UFO
                    case VAMPIRE    :   // COCKROACH AMUSES VAMPIRE
                    case VIDEO_GAME :   // COCKROACH NESTS IN VIDEO GAME
                    case WATER      :   // COCKROACH DRINKS WATER
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DUCK       :
                    case DYNAMITE   :
                    case FIRE       :
                    case FISH       :
                    case GUN        :
                    case HOME       :
                    case KING       :
                    case LAW        :
                    case MAN        :
                    case MONKEY     :
                    case NOISE      :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SUN        :
                    case SWORD      :
                    case TORNADO    :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case COMMUNITY:
                switch (them) {
                    case COMMUNITY:
                        tie();
                        break;
                    case AIR        :   // COMMUNITY POLLUTES AIR
                    case AIRPLANE   :   // COMMUNITY FINANCES AIRPLANE
                    case ALIEN      :   // COMMUNITY HUNTS ALIEN
                    case BEER       :   // COMMUNITY DRINKS BEER
                    case BOOK       :   // COMMUNITY LIBRARY BOOKS
                    case BOWL       :   // COMMUNITY USES BOWL
                    case BUTTER     :   // COMMUNITY EATS BUTTER
                    case CHURCH     :   // COMMUNITY BUILDS CHURCH
                    case CLOUD      :   // COMMUNITY POPULATION CLOUD
                    case CROSS      :   // COMMUNITY GATHERS BY CROSS
                    case CUP        :   // COMMUNITY USES CUP
                    case DEVIL      :   // COMMUNITY REBUKES DEVIL
                    case DIAMOND    :   // COMMUNITY POSSESSES DIAMONDS
                    case DRAGON     :   // COMMUNITY HUNTS DRAGON
                    case DYNAMITE   :   // COMMUNITY USES DYNAMITE
                    case ELECTRICITY:   // COMMUNITY USES ELECTRICITY
                    case FENCE      :   // COMMUNITY BUILDS FENCE
                    case FILM       :   // COMMUNITY PRODUCES FILM
                    case GOLD       :   // COMMUNITY POSSESSES GOLD
                    case GRASS      :   // COMMUNITY GATHERS IN GRASS
                    case GUITAR     :   // COMMUNITY PLAYS GUITAR
                    case HEART      :   // COMMUNITY HAS HEART
                    case HELICOPTER :   // COMMUNITY FUNDS HELICOPTER
                    case LASER      :   // COMMUNITY USES LASER
                    case LIGHTNING  :   // COMMUNITY SURVIVES LIGHTNING
                    case MATH       :   // COMMUNITY CENSUS USES MATH
                    case MEDUSA     :   // COMMUNITY HUNTS MEDUSA
                    case MONEY      :   // COMMUNITY MAKES MONEY
                    case MOON       :   // COMMUNITY GATHERS BY MOON
                    case MOUNTAIN   :   // COMMUNITY LIVES ON MOUNTAIN
                    case NUKE       :   // COMMUNITY BANS NUKE
                    case PAPER      :   // COMMUNITY NEWSPAPER
                    case PLANET     :   // COMMUNITY POPULATES PLANET
                    case PLATINUM   :   // COMMUNITY POSSESSES PLATINUM
                    case POWER      :   // COMMUNITY USES POWER
                    case PRAYER     :   // COMMUNITY IN PRAYER
                    case RAIN       :   // COMMUNITY ADAPTS TO RAIN
                    case RAINBOW    :   // COMMUNITY LOOKS AT RAINBOW
                    case ROBOT      :   // COMMUNITY USES ROBOTS
                    case SATAN      :   // COMMUNITY REBUKES SATAN
                    case SKY        :   // COMMUNITY POLLUTES SKY
                    case SPONGE     :   // COMMUNITY USES SPONGE
                    case TANK       :   // COMMUNITY FUNDS TANK
                    case TOILET     :   // COMMUNITY USES TOILET
                    case TORNADO    :   // COMMUNITY SURVIVES TORNADO
                    case TV         :   // COMMUNITY WATCHES TV
                    case UFO        :   // COMMUNITY SPOTS UFO
                    case VAMPIRE    :   // COMMUNITY HUNTS VAMPIRE
                    case VIDEO_GAME :   // COMMUNITY PLAYS VIDEO GAME
                    case WATER      :   // COMMUNITY POLLUTES WATER
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BRAIN      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COCKROACH  :
                    case COMPUTER   :
                    case DEATH      :
                    case DUCK       :
                    case FIRE       :
                    case FISH       :
                    case GUN        :
                    case HOME       :
                    case KING       :
                    case LAW        :
                    case MAN        :
                    case MONKEY     :
                    case NOISE      :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SUN        :
                    case SWORD      :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case COMPUTER:
                switch (them) {
                    case COMPUTER:
                        tie();
                        break;
                    case AIR        :   // COMPUTER MEASURES AIR
                    case AIRPLANE   :   // COMPUTER GUIDES AIRPLANE
                    case BABY       :   // COMPUTER PREVENTS BABY
                    case BEER       :   // COMPUTER INSPIRES BEER
                    case BICYCLE    :   // COMPUTER DESIGNS BICYCLE
                    case BIRD       :   // COMPUTER DEPICTS BIRD
                    case BLOOD      :   // COMPUTER BOILS BLOOD
                    case BOOK       :   // COMPUTER WRITES BOOK
                    case BOWL       :   // COMPUTER PRICIER THAN BOWL
                    case BRAIN      :   // COMPUTER TIRES BRAIN
                    case BUTTER     :   // COMPUTER SEXIER THAN BUTTER
                    case CAR        :   // COMPUTER ENHANCES CAR
                    case CASTLE     :   // COMPUTER DEPICTS CASTLE
                    case CAT        :   // COMPUTER DEPICTS CAT
                    case CHURCH     :   // COMPUTER ACCOUNTS FOR CHURCH
                    case CLOUD      :   // COMPUTER DEPICTS CLOUD
                    case COCKROACH  :   // COMPUTER HOUSES COCKROACH
                    case COMMUNITY  :   // COMPUTER SHRINKS COMMUNITY
                    case CROSS      :   // COMPUTER DEPICTS CROSS
                    case CUP        :   // COMPUTER PRICIER THAN CUP
                    case DUCK       :   // COMPUTER DEPICTS DUCK
                    case FILM       :   // COMPUTER DOWNLOADS FILM
                    case FISH       :   // COMPUTER SCREENSAVER FISH
                    case GRASS      :   // COMPUTER DEPICTS GRASS
                    case GUITAR     :   // COMPUTER DOWNLOADS GUITAR
                    case HOME       :   // COMPUTER IN EVERY HOME
                    case KING       :   // COMPUTER CONFUSES KING
                    case MAN        :   // COMPUTER CONFUSES MAN
                    case MONEY      :   // COMPUTER COSTS MONEY
                    case MONKEY     :   // COMPUTER ENRAGES MONKEY
                    case MOON       :   // COMPUTER DEPICTS MOON
                    case NOISE      :   // COMPUTER MAKES NOISE
                    case PAPER      :   // COMPUTER KILLS PAPER
                    case PLANET     :   // COMPUTER SHRINKS PLANET
                    case POLICE     :   // COMPUTER AIDS POLICE
                    case PORCUPINE  :   // COMPUTER DEPICTS PORCUPINE
                    case PRINCE     :   // COMPUTER CONFUSES PRINCE
                    case PRINCESS   :   // COMPUTER CONFUSES PRINCESS
                    case QUEEN      :   // COMPUTER CONFUSES QUEEN
                    case SNAKE      :   // COMPUTER DEPICTS SNAKE
                    case SPIDER     :   // COMPUTER HOUSES SPIDER
                    case SPONGE     :   // COMPUTER IS TIME SPONGE
                    case TOILET     :   // COMPUTER IS TOILET
                    case TRAIN      :   // COMPUTER CONTROLS TRAIN
                    case TREE       :   // COMPUTER DEPICTS TREE
                    case TURNIP     :   // COMPUTER TURNS BRAIN INTO TURNIP
                    case VAMPIRE    :   // COMPUTER ATTRACTS VAMPIRE
                    case VULTURE    :   // COMPUTER ATTRACTS VULTURE
                    case WOLF       :   // COMPUTER DEPICTS WOLF
                    case WOMAN      :   // COMPUTER CONFUSES WOMAN
                        win();
                        break;
                    case ALIEN      :
                    case AXE        :
                    case CAGE       :
                    case CAMERA     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case PLATINUM   :
                    case POISON     :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WALL       :
                    case WATER      :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case CROSS:
                switch (them) {
                    case CROSS:
                        tie();
                        break;
                    case AIR        :   // CROSS WINDS MOVE AIR
                    case AIRPLANE   :   // CROSS BLESSES AIRPLANE
                    case ALIEN      :   // CROSS DOESN'T INTEREST ALIEN
                    case BEER       :   // CROSS ADORNS BEER
                    case BOOK       :   // CROSS ON GOOD BOOK
                    case BOWL       :   // CROSS BLESSES BOWL
                    case BUTTER     :   // CROSS IMPALES BUTTER
                    case CHURCH     :   // CROSS ATOP CHURCH
                    case CLOUD      :   // CROSS CLEARS CLOUDS
                    case CUP        :   // CROSS ON HOLY CUP
                    case DEVIL      :   // CROSS DENOUNCES DEVIL
                    case DIAMOND    :   // CROSS JEWELRY HOLDS DIAMOND
                    case DRAGON     :   // CROSS DENOUNCES DRAGON
                    case DYNAMITE   :   // CROSS FINGERS BEFORE DYNAMITE
                    case ELECTRICITY:   // CROSS CONDUCTS ELECTRICITY
                    case FENCE      :   // CROSS TEARS DOWN FENCES
                    case FILM       :   // CROSS ON FILM
                    case GOLD       :   // CROSS MADE OF GOLD
                    case GRASS      :   // CROSS ERECTED IN GRASS
                    case GUITAR     :   // CROSS BLESSES GUITAR
                    case HEART      :   // CROSS YOUR HEART
                    case HELICOPTER :   // CROSS BLESSES HELICOPTER
                    case LASER      :   // CROSS REFLECTS LASER
                    case LIGHTNING  :   // CROSS ATTRACTS LIGHTNING
                    case MATH       :   // CROSS ADDS FOR MATH
                    case MEDUSA     :   // CROSS THWARTS MEDUSA
                    case MONEY      :   // CROSS COSTS MONEY
                    case MOON       :   // CROSS TRACKS ON MOON
                    case MOUNTAIN   :   // CROSS ATOP MOUNTAIN
                    case NUKE       :   // CROSS BANS NUKE
                    case PAPER      :   // CROSS DRAWN ON PAPER
                    case PLANET     :   // CROSS BLESSES PLANET
                    case PLATINUM   :   // CROSS MADE OF PLATINUM
                    case POWER      :   // CROSS REPRESENTS POWER
                    case PRAYER     :   // CROSS IN PRAYER
                    case QUICKSAND  :   // CROSS ABOVE QUICKSAND
                    case RAIN       :   // CROSS WINDS BRING RAIN
                    case RAINBOW    :   // CROSS REFLECTS RAINBOW
                    case ROBOT      :   // CROSS SECTION DIAGRAM OF ROBOT
                    case SATAN      :   // CROSS DENOUNCES SATAN
                    case SKY        :   // CROSS LIGHTS UP SKY
                    case SPONGE     :   // CROSS IMPALES SPONGE
                    case TANK       :   // CROSS BLESSES TANK
                    case TOILET     :   // CROSS BLESSES TOILET
                    case TORNADO    :   // CROSS FINGERS BEFORE TORNADO
                    case TV         :   // CROSS HANGS OVER TV
                    case UFO        :   // CROSS DOESN'T INTEREST UFO
                    case VAMPIRE    :   // CROSS THWARTS VAMPIRE
                    case VIDEO_GAME :   // CROSS PLATFORM VIDEO GAME
                    case WATER      :   // CROSS BLESSES HOLY WATER
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BRAIN      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case DEATH      :
                    case DUCK       :
                    case FIRE       :
                    case FISH       :
                    case GUN        :
                    case HOME       :
                    case KING       :
                    case LAW        :
                    case MAN        :
                    case MONKEY     :
                    case NOISE      :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SUN        :
                    case SWORD      :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case CUP:
                switch (them) {
                    case CUP:
                        tie();
                        break;
                    case ALIEN      :   // CUP SHAPES ALIEN SHIP
                    case AXE        :   // CUP SPLASHES AXE
                    case BEER       :   // CUP HOLDS BEER
                    case CAGE       :   // CUP RATTLES CAGE
                    case CAMERA     :   // CUP LENSED CAMERA
                    case CHAIN      :   // CUP HOLDS CHAIN
                    case CHAINSAW   :   // CUP SPLASHES CHAINSAW
                    case DEATH      :   // CUP TOASTS DEATH
                    case DEVIL      :   // CUP BLESSES DEVIL
                    case DIAMOND    :   // CUP HOLDS DIAMOND
                    case DRAGON     :   // CUP ATTRACTS DRAGON
                    case DYNAMITE   :   // CUP EARS FOR DYNAMITE
                    case ELECTRICITY:   // CUP CONDUCTS ELECTRICITY
                    case FENCE      :   // CUP SITS ON FENCES
                    case FIRE       :   // CUP SPLASHES FIRE
                    case GOLD       :   // CUP MADE OF GOLD
                    case GUN        :   // CUP SPLASHES GUN
                    case HEART      :   // CUP HAND OVER HEART
                    case HELICOPTER :   // CUP EARS FOR HELICOPTER
                    case LASER      :   // CUP REFLECTS LASER
                    case LAW        :   // CUP TOASTS LAW
                    case LIGHTNING  :   // CUP FOCUSES LIGHTNING
                    case MATH       :   // CUP FOR MATH CHAMP
                    case MEDUSA     :   // CUP ATTRACTS MEDUSA
                    case MOUNTAIN   :   // CUP FOR CLIMBING MOUNTAIN
                    case NUKE       :   // CUP SHAPED NUKE
                    case PIT        :   // CUP SHAPED PIT
                    case PLATINUM   :   // CUP MADE OF PLATINUM
                    case POISON     :   // CUP HOLDS POISON
                    case POWER      :   // CUP HOLDS HOLY POWER
                    case PRAYER     :   // CUP ACCOMPANIES PRAYER
                    case QUICKSAND  :   // CUP FLOATS ON QUICKSAND
                    case RAIN       :   // CUP CATCHES RAIN
                    case RAINBOW    :   // CUP REFLECTS RAINBOW
                    case ROBOT      :   // CUP SPLASHES ROBOT
                    case ROCK       :   // CUP MADE OF ROCK
                    case SATAN      :   // CUP BLESSES SATAN
                    case SCHOOL     :   // CUP FOR SCHOOL RECORD
                    case SCISSORS   :   // CUP SPLASHES SCISSORS
                    case SKY        :   // CUP REFLECTS SKY
                    case SUN        :   // CUP REFLECTS SUN
                    case SWORD      :   // CUP COMMANDS SWORD
                    case TANK       :   // CUP EARS FOR TANK
                    case TORNADO    :   // CUP EARS FOR TORNADO
                    case TV         :   // CUP SITS ON TV
                    case UFO        :   // CUP SHAPES UFO
                    case VIDEO_GAME :   // CUP SPLASHES VIDEO GAME
                    case WALL       :   // CUP SMASHES AGAINST WALL
                    case WATER      :   // CUP HOLDS WATER
                    case WHIP       :   // CUP EARS FOR WHIP
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PEACE      :
                    case PLANET     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case DEATH:
                switch (them) {
                    case DEATH:
                        tie();
                        break;
                    case AXE        :   // DEATH CARRIES AXE
                    case BABY       :   // DEATH CLAIMS BABY
                    case BICYCLE    :   // DEATH CRASHES BICYCLE
                    case BIRD       :   // DEATH CLAIMS BIRD
                    case BLOOD      :   // DEATH COOLS BLOOD
                    case BOOK       :   // DEATH CRUMBLES BOOK
                    case BRAIN      :   // DEATH CLAIMS BRAIN
                    case BUTTER     :   // DEATH SPOILS BUTTER
                    case CAGE       :   // DEATH INSIDE CAGE
                    case CAMERA     :   // DEATH RUINS CAMERA
                    case CAR        :   // DEATH CRASHES CAR
                    case CASTLE     :   // DEATH CRUMBLES CASTLE
                    case CAT        :   // DEATH CLAIMS CAT
                    case CHAINSAW   :   // DEATH DISMANTLES CHAINSAW
                    case CHURCH     :   // DEATH SADDENS CHURCH
                    case COCKROACH  :   // DEATH CLAIMS COCKROACH
                    case COMMUNITY  :   // DEATH SADDENS COMMUNITY
                    case COMPUTER   :   // DEATH CRASHES COMPUTER
                    case CROSS      :   // DEATH ON THE CROSS
                    case DUCK       :   // DEATH CLAIMS DUCK
                    case FIRE       :   // DEATH COOLS FIRE
                    case FISH       :   // DEATH CLAIMS FISH
                    case HOME       :   // DEATH SADDENS HOME
                    case KING       :   // DEATH CLAIMS KING
                    case MAN        :   // DEATH CLAIMS MAN
                    case MONEY      :   // DEATH (FUNERAL) COSTS MONEY
                    case MONKEY     :   // DEATH CLAIMS MONKEY
                    case NOISE      :   // DEATH RATTLE NOISE
                    case PAPER      :   // DEATH CRUMBLES PAPER
                    case PEACE      :   // DEATH - REST IN PEACE
                    case POISON     :   // DEATH POISONS ALL LIFE
                    case POLICE     :   // DEATH CLAIMS POLICE
                    case PORCUPINE  :   // DEATH CLAIMS PORCUPINE
                    case PRINCE     :   // DEATH CLAIMS PRINCE
                    case PRINCESS   :   // DEATH CLAIMS PRINCESS
                    case QUEEN      :   // DEATH CLAIMS QUEEN
                    case SCHOOL     :   // DEATH SADDENS SCHOOL
                    case SCISSORS   :   // DEATH NOT CAUSED BY SCISSORS
                    case SNAKE      :   // DEATH CLAIMS SNAKE
                    case SPIDER     :   // DEATH CLAIMS SPIDER
                    case SPONGE     :   // DEATH DRIES SPONGE
                    case SUN        :   // DEATH CLAIMS SUN
                    case TRAIN      :   // DEATH STOPS TRAIN
                    case TREE       :   // DEATH CLAIMS TREE
                    case TURNIP     :   // DEATH CLAIMS TURNIP
                    case VAMPIRE    :   // DEATH ELUDES VAMPIRE
                    case VULTURE    :   // DEATH FEEDS VULTURE
                    case WALL       :   // DEATH KNOWS NO WALL
                    case WOLF       :   // DEATH CLAIMS WOLF
                    case WOMAN      :   // DEATH CLAIMS WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BOWL       :
                    case CHAIN      :
                    case CLOUD      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOON       :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PIT        :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SKY        :
                    case SWORD      :
                    case TANK       :
                    case TOILET     :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WATER      :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case DEVIL:
                switch (them) {
                    case DEVIL:
                        tie();
                        break;
                    case AXE        :   // DEVIL WEILDS AXE
                    case BABY       :   // DEVIL POSSESSES BABY
                    case BLOOD      :   // DEVIL POISONS BLOOD
                    case CAGE       :   // DEVIL ESCAPES CAGE
                    case CAMERA     :   // DEVIL BLURS CAMERA
                    case CASTLE     :   // DEVIL HAS CASTLE
                    case CHAIN      :   // DEVIL BREAKS CHAIN
                    case CHAINSAW   :   // DEVIL WEILDS CHAINSAW
                    case COMPUTER   :   // DEVIL HACKS COMPUTER
                    case DEATH      :   // DEVIL AFTER DEATH
                    case DYNAMITE   :   // DEVIL LIGHTS DYNAMITE
                    case ELECTRICITY:   // DEVIL CUTS ELECTRICITY
                    case FENCE      :   // DEVIL HOPS FENCE
                    case FIRE       :   // DEVIL COMMANDS FIRE
                    case GUN        :   // DEVIL INSPIRES GUN
                    case HEART      :   // DEVIL DARKENS HEART
                    case HELICOPTER :   // DEVIL CRASHES HELICOPTER
                    case KING       :   // DEVIL TEMPTS KING
                    case LASER      :   // DEVIL REWIRES LASER
                    case LAW        :   // DEVIL BREAKS LAW
                    case LIGHTNING  :   // DEVIL BRINGS LIGHTNING
                    case MATH       :   // DEVIL QUIZZES MATH
                    case MEDUSA     :   // DEVIL COMMANDS MEDUSA
                    case MONKEY     :   // DEVIL BURNS MONKEY
                    case NUKE       :   // DEVIL INSPIRES NUKE
                    case PEACE      :   // DEVIL DISTURBS PEACE
                    case PIT        :   // DEVIL HIDES IN PIT
                    case POISON     :   // DEVIL USES POISON
                    case POLICE     :   // DEVIL EVADES POLICE
                    case PORCUPINE  :   // DEVIL SHARPER THAN PORCUPINE
                    case POWER      :   // DEVIL HAS POWER
                    case PRINCE     :   // DEVIL TEMPTS PRINCE
                    case PRINCESS   :   // DEVIL TEMPTS PRINCESS
                    case QUEEN      :   // DEVIL TEMPTS QUEEN
                    case QUICKSAND  :   // DEVIL LURES INTO QUICKSAND
                    case ROBOT      :   // DEVIL GLITCHES ROBOT
                    case ROCK       :   // DEVIL HURLS ROCK
                    case SCHOOL     :   // DEVIL SKIPS SCHOOL
                    case SCISSORS   :   // DEVIL RESISTS SCISSORS
                    case SKY        :   // DEVIL DARKENS SKY
                    case SNAKE      :   // DEVIL EATS SNAKES
                    case SUN        :   // DEVIL CURSES SUN
                    case SWORD      :   // DEVIL WEILDS SWORD
                    case TANK       :   // DEVIL DRIVES TANK
                    case TORNADO    :   // DEVIL COMMANDS TORNADO
                    case VIDEO_GAME :   // DEVIL INSPIRES VIDEO GAME
                    case VULTURE    :   // DEVIL IS SOUL VULTURE
                    case WALL       :   // DEVIL IN THE WALL
                    case WHIP       :   // DEVIL CRACKS WHIP
                    case WOMAN      :   // DEVIL POSSESSES WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DIAMOND    :
                    case DRAGON     :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case MAN        :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case WATER      :
                    case WOLF       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case DIAMOND:
                switch (them) {
                    case DIAMOND:
                        tie();
                        break;
                    case AXE        :   // DIAMOND ENGRAVES AXE
                    case BLOOD      :   // DIAMOND OUTLASTS BLOOD
                    case CAGE       :   // DIAMOND ENGRAVES CAGE
                    case CAMERA     :   // DIAMOND PRICIER THAN CAMERA
                    case CASTLE     :   // DIAMOND DECORATES CASTLE
                    case CHAIN      :   // DIAMOND HARDER THAN CHAIN
                    case CHAINSAW   :   // DIAMOND RESISTS CHAINSAW
                    case COMPUTER   :   // DIAMOND PRICIER THAN COMPUTER
                    case DEATH      :   // DIAMOND 'TILL DEATH
                    case DEVIL      :   // DIAMOND IMPRISONS DEVIL
                    case DYNAMITE   :   // DIAMOND SURVIVES DYNAMITE
                    case ELECTRICITY:   // DIAMOND WITHSTANDS ELECTRICITY
                    case FENCE      :   // DIAMOND HARDER THAN FENCE
                    case FIRE       :   // DIAMOND RESISTS FIRE
                    case GOLD       :   // DIAMOND PRICIER THAN GOLD
                    case GUN        :   // DIAMOND RESISTS GUN
                    case HEART      :   // DIAMOND WINS HEART
                    case HELICOPTER :   // DIAMOND ENGRAVES HELICOPTER
                    case KING       :   // DIAMOND ADORNS KING'S CROWN
                    case LASER      :   // DIAMOND DIFFRACTS LASER
                    case LAW        :   // DIAMOND BRIBES LAWMAN
                    case LIGHTNING  :   // DIAMOND WITHSTANDS LIGHTNING
                    case MATH       :   // DIAMOND GEOMETRIC MATH
                    case MEDUSA     :   // DIAMOND ENTHRALLS MEDUSA
                    case MONKEY     :   // DIAMOND HYPNOTIZES MONKEY
                    case NUKE       :   // DIAMOND SURVIVES NUKE
                    case PEACE      :   // DIAMOND DISTURBS PEACE
                    case PIT        :   // DIAMOND HIDES IN PIT
                    case PLATINUM   :   // DIAMOND PRICIER THAN PLATINUM
                    case POISON     :   // DIAMOND RESISTS POISON
                    case PORCUPINE  :   // DIAMOND SHARPER THAN PORCUPINE
                    case POWER      :   // DIAMOND FOCUSES POWER
                    case PRINCE     :   // DIAMOND ADORNS PRINCE'S CROWN
                    case PRINCESS   :   // DIAMOND ADORNS PRINCESS' CROWN
                    case QUEEN      :   // DIAMOND ADORNS QUEEN'S CROWN
                    case QUICKSAND  :   // DIAMOND HIDES IN QUICKSAND
                    case ROBOT      :   // DIAMOND PRICIER THAN ROBOT
                    case ROCK       :   // DIAMOND HARDEST ROCK
                    case SCHOOL     :   // DIAMOND MORE DESIRABLE THAN SCHOOL
                    case SCISSORS   :   // DIAMOND ENGRAVES SCISSORS
                    case SKY        :   // DIAMOND WITH LUCY IN SKY
                    case SNAKE      :   // DIAMOND CHARMS SNAKE
                    case SUN        :   // DIAMOND CATCHES SUN
                    case SWORD      :   // DIAMOND ENGRAVES SWORD
                    case TANK       :   // DIAMOND HARDER THAN TANK
                    case TORNADO    :   // DIAMOND SURVIVES TORNADO
                    case VIDEO_GAME :   // DIAMOND PRICIER THAN VIDEO GAME
                    case VULTURE    :   // DIAMOND ATTRACTS VULTURE
                    case WALL       :   // DIAMOND ENGRAVES WALL
                    case WHIP       :   // DIAMOND RESISTS WHIP
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BABY       :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DRAGON     :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case MAN        :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case POLICE     :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case WATER      :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case DRAGON:
                switch (them) {
                    case DRAGON:
                        tie();
                        break;
                    case AXE        :   // DRAGON RESISTS AXE
                    case BLOOD      :   // DRAGON SPILLS BLOOD
                    case CAGE       :   // DRAGON ESCAPES CAGE
                    case CAMERA     :   // DRAGON BEFORE CAMERA
                    case CASTLE     :   // DRAGON TERRORIZES CASTLE
                    case CHAIN      :   // DRAGON BREAKS CHAIN
                    case CHAINSAW   :   // DRAGON BEFORE CHAINSAW
                    case COMPUTER   :   // DRAGON BEFORE COMPUTER
                    case DEATH      :   // DRAGON CAUSES DEATH
                    case DEVIL      :   // DRAGON COMMANDS DEVIL
                    case DIAMOND    :   // DRAGON HOARDS DIAMOND
                    case DYNAMITE   :   // DRAGON BEFORE DYNAMITE
                    case ELECTRICITY:   // DRAGON CONDUCTS ELECTRICITY
                    case FENCE      :   // DRAGON FLIES OVER FENCE
                    case FIRE       :   // DRAGON BREATHES FIRE
                    case GOLD       :   // DRAGON HOARDS GOLD
                    case GUN        :   // DRAGON RESISTS GUN
                    case HEART      :   // DRAGON HEART
                    case HELICOPTER :   // DRAGON BEFORE HELICOPTER
                    case KING       :   // DRAGON ANGERS KING
                    case LASER      :   // DRAGON BEFORE LASER
                    case LAW        :   // DRAGON KNOWS NO LAW
                    case LIGHTNING  :   // DRAGON BREATHES LIGHTNING
                    case MATH       :   // DRAGON DOESN'T USE MATH
                    case MEDUSA     :   // DRAGON TORCHES MEDUSA
                    case MONKEY     :   // DRAGON TORCHES MONKEY
                    case NUKE       :   // DRAGON BEFORE NUKE
                    case PEACE      :   // DRAGON DISTURBS PEACE
                    case PIT        :   // DRAGON ESCAPES PIT
                    case PLATINUM   :   // DRAGON HOARDS PLATINUM
                    case POISON     :   // DRAGON BREATH IS POISON
                    case PORCUPINE  :   // DRAGON OUTCLASSES PORCUPINE
                    case POWER      :   // DRAGON HAS POWER
                    case PRINCE     :   // DRAGON EATS PRINCE
                    case QUEEN      :   // DRAGON ANGERS QUEEN
                    case QUICKSAND  :   // DRAGON TOO BIG FOR QUICKSAND
                    case ROBOT      :   // DRAGON TORCHES ROBOT
                    case ROCK       :   // DRAGON ATOP ROCK
                    case SCHOOL     :   // DRAGON TORCHES SCHOOL
                    case SCISSORS   :   // DRAGON RESISTS SCISSORS
                    case SKY        :   // DRAGON FLIES ACROSS SKY
                    case SNAKE      :   // DRAGON BIGGER THAN SNAKE
                    case SUN        :   // DRAGON FLIES ACROSS SUN
                    case SWORD      :   // DRAGON RESISTS SWORD
                    case TANK       :   // DRAGON BEFORE TANK
                    case TORNADO    :   // DRAGON FLIES OVER TORNADO
                    case VIDEO_GAME :   // DRAGON IN VIDEO GAME
                    case VULTURE    :   // DRAGON TORCHES VULTURE
                    case WALL       :   // DRAGON FLIES OVER WALL
                    case WHIP       :   // DRAGON TORCHES WHIP
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BABY       :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case MAN        :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case POLICE     :
                    case PRAYER     :
                    case PRINCESS   :
                    case RAIN       :
                    case RAINBOW    :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case WATER      :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case DUCK:
                switch (them) {
                    case DUCK:
                        tie();
                        break;
                    case AIR        :   // DUCK BREATHES AIR
                    case AIRPLANE   :   // DUCK BLOCKS AIRPLANE
                    case ALIEN      :   // DUCK HIDES FROM ALIEN
                    case BEER       :   // DUCK DRINKS BEER
                    case BIRD       :   // DUCK LARGER THAN BIRD
                    case BOOK       :   // DUCK RECIPE BOOK
                    case BOWL       :   // DUCK TIPS OVER BOWL
                    case BRAIN      :   // DUCK HAS BRAIN
                    case BUTTER     :   // DUCK EATS BUTTER
                    case CAT        :   // DUCK INTIMIDATES CAT
                    case CHURCH     :   // DUCK DISRUPTS CHURCH
                    case CLOUD      :   // DUCK FLIES IN CLOUD
                    case COCKROACH  :   // DUCK EATS COCKROACH
                    case COMMUNITY  :   // DUCK FEEDS COMMUNITY
                    case CROSS      :   // DUCK ACTS CROSS
                    case CUP        :   // DUCK TIPS OVER CUP
                    case DEVIL      :   // DUCK DOESN'T INTEREST DEVIL
                    case DIAMOND    :   // DUCK SWALLOWS DIAMOND
                    case DRAGON     :   // DUCK AT DRAGON RESTAURANT
                    case ELECTRICITY:   // DUCK ON WIRE DESPITE ELECTRICITY
                    case FENCE      :   // DUCK FLIES OVER FENCE
                    case FILM       :   // DUCK ON FILM
                    case FISH       :   // DUCK EATS FISH
                    case GOLD       :   // DUCK LAYS GOLD EGG
                    case GRASS      :   // DUCK NESTS IN GRASS
                    case GUITAR     :   // DUCK RUINS GUITAR
                    case HEART      :   // DUCK HAS HEART
                    case LIGHTNING  :   // DUCK HIDES FROM LIGHTNING
                    case MATH       :   // DUCK DOESN'T NEED MATH
                    case MEDUSA     :   // DUCK BITES MEDUSA
                    case MONEY      :   // DUCK COSTS MONEY
                    case MOON       :   // DUCK LOOKS AT MOON
                    case MOUNTAIN   :   // DUCK FLIES OVER MOUNTAIN
                    case PAPER      :   // DUCK CARRIES OFF PAPER
                    case PLANET     :   // DUCK LIVES ON PLANET
                    case PLATINUM   :   // DUCK SWALLOWS PLATINUM
                    case PRAYER     :   // DUCK ANSWERS PRAYER
                    case RAIN       :   // DUCK LOVES RAIN
                    case RAINBOW    :   // DUCK LOOKS AT RAINBOW
                    case ROBOT      :   // DUCK FLIES OVER ROBOT
                    case SATAN      :   // DUCK DOESN'T INTEREST SATAN
                    case SPIDER     :   // DUCK EATS SPIDER
                    case SPONGE     :   // DUCK EATS SPONGE
                    case TOILET     :   // DUCK GOES EVERYHERE BUT TOILET
                    case TV         :   // DUCK ON TV
                    case UFO        :   // DUCK HIDES FROM UFO
                    case VAMPIRE    :   // DUCK DISGUSTS VAMPIRE
                    case VIDEO_GAME :   // DUCK HUNT VIDEO GAME
                    case WATER      :   // DUCK DRINKS WATER
                    case WOLF       :   // DUCK FLIES FROM WOLF
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DYNAMITE   :
                    case FIRE       :
                    case GUN        :
                    case HELICOPTER :
                    case HOME       :
                    case KING       :
                    case LASER      :
                    case LAW        :
                    case MAN        :
                    case MONKEY     :
                    case NOISE      :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case POWER      :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case DYNAMITE:
                switch (them) {
                    case DYNAMITE:
                        tie();
                        break;
                    case AXE        :   // DYNAMITE EXPLODES AXE
                    case BABY       :   // DYNAMITE EXPLODES BABY
                    case BICYCLE    :   // DYNAMITE EXPLODES BICYCLE
                    case BIRD       :   // DYNAMITE EXPLODES BIRD
                    case BLOOD      :   // DYNAMITE SPILLS BLOOD
                    case CAGE       :   // DYNAMITE EXPLODES CAGE
                    case CAMERA     :   // DYNAMITE EXPLODES CAMERA
                    case CAR        :   // DYNAMITE EXPLODES CAR
                    case CASTLE     :   // DYNAMITE EXPLODES CASTLE
                    case CAT        :   // DYNAMITE EXPLODES CAT
                    case CHAIN      :   // DYNAMITE EXPLODES CHAIN
                    case CHAINSAW   :   // DYNAMITE EXPLODES CHAINSAW
                    case COCKROACH  :   // DYNAMITE EXPLODES COCKROACH
                    case COMPUTER   :   // DYNAMITE EXPLODES COMPUTER
                    case DEATH      :   // DYNAMITE CAUSES DEATH
                    case DUCK       :   // DYNAMITE EXPLODES DUCK
                    case FIRE       :   // DYNAMITE STARTS FIRE
                    case FISH       :   // DYNAMITE EXPLODES FISH
                    case GUN        :   // DYNAMITE OUTCLASSES GUN
                    case HOME       :   // DYNAMITE EXPLODES HOME
                    case KING       :   // DYNAMITE EXPLODES KING
                    case LAW        :   // DYNAMITE BREAKS LAW
                    case MAN        :   // DYNAMITE EXPLODES MAN
                    case MONKEY     :   // DYNAMITE EXPLODES MONKEY
                    case NOISE      :   // DYNAMITE MAKES NOISE
                    case PEACE      :   // DYNAMITE DISTURBS PEACE
                    case PIT        :   // DYNAMITE CREATES PIT
                    case POISON     :   // DYNAMITE EXPLODES POISON
                    case POLICE     :   // DYNAMITE EXPLODES POLICE
                    case PORCUPINE  :   // DYNAMITE EXPLODES PORCUPINE
                    case PRINCE     :   // DYNAMITE EXPLODES PRINCE
                    case PRINCESS   :   // DYNAMITE EXPLODES PRINCESS
                    case QUEEN      :   // DYNAMITE EXPLODES QUEEN
                    case QUICKSAND  :   // DYNAMITE CLEARS QUICKSAND
                    case ROCK       :   // DYNAMITE EXPLODES ROCK
                    case SCHOOL     :   // DYNAMITE EXPLODES SCHOOL
                    case SCISSORS   :   // DYNAMITE EXPLODES SCISSORS
                    case SNAKE      :   // DYNAMITE EXPLODES SNAKE
                    case SPIDER     :   // DYNAMITE EXPLODES SPIDER
                    case SUN        :   // DYNAMITE SMOKE BLOTS OUT SUN
                    case SWORD      :   // DYNAMITE EXPLODES SWORD
                    case TORNADO    :   // DYNAMITE OUTCLASSES TORNADO
                    case TRAIN      :   // DYNAMITE EXPLODES TRAIN
                    case TREE       :   // DYNAMITE EXPLODES TREE
                    case TURNIP     :   // DYNAMITE EXPLODES TURNIP
                    case VULTURE    :   // DYNAMITE EXPLODES VULTURE
                    case WALL       :   // DYNAMITE EXPLODES WALL
                    case WHIP       :   // DYNAMITE EXPLODES WHIP
                    case WOLF       :   // DYNAMITE EXPLODES WOLF
                    case WOMAN      :   // DYNAMITE EXPLODES WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CHURCH     :
                    case CLOUD      :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SKY        :
                    case SPONGE     :
                    case TANK       :
                    case TOILET     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case ELECTRICITY:
                switch (them) {
                    case ELECTRICITY:
                        tie();
                        break;
                    case AXE        :   // ELECTRICITY CHARGES AXE
                    case BABY       :   // ELECTRICITY ELECTROCUTES BABY
                    case BICYCLE    :   // ELECTRICITY CHARGES BICYCLE
                    case BLOOD      :   // ELECTRICITY FRIES BLOOD
                    case CAGE       :   // ELECTRICITY CHARGES CAGE
                    case CAMERA     :   // ELECTRICITY POWERS CAMERA
                    case CAR        :   // ELECTRICITY SHORT-CIRCUITS CAR
                    case CASTLE     :   // ELECTRICITY BILLS CASTLE
                    case CHAIN      :   // ELECTRICITY STARTS CHAIN REACTION
                    case CHAINSAW   :   // ELECTRICITY SHORT-CIRCUITS CHAINSAW
                    case COMPUTER   :   // ELECTRICITY SHORT-CIRCUITS COMPUTER
                    case DEATH      :   // ELECTRICITY CAUSES DEATH
                    case DYNAMITE   :   // ELECTRICITY NATURAL DYNAMITE
                    case FIRE       :   // ELECTRICITY STARTS FIRE
                    case GUN        :   // ELECTRICITY CHARGES GUN
                    case HELICOPTER :   // ELECTRICITY SHORT-CIRCUITS HELICOPTER
                    case HOME       :   // ELECTRICITY BILLS HOME
                    case KING       :   // ELECTRICITY ELECTROCUTES KING
                    case LASER      :   // ELECTRICITY POWERS LASER
                    case LAW        :   // ELECTRICITY HAS PHYSICAL LAW
                    case LIGHTNING  :   // ELECTRICITY PRODUCES LIGHTNING
                    case MAN        :   // ELECTRICITY ELECTROCUTES MAN
                    case MEDUSA     :   // ELECTRICITY FRIES MEDUSA
                    case MONKEY     :   // ELECTRICITY ELECTROCUTES MONKEY
                    case NOISE      :   // ELECTRICITY MAKES NOISE
                    case NUKE       :   // ELECTRICITY SHORT-CIRCUITS NUKE
                    case PEACE      :   // ELECTRICITY DISTURBS PEACE
                    case PIT        :   // ELECTRICITY BRIGHTENS PIT
                    case POISON     :   // ELECTRICITY MIXES POISON
                    case POLICE     :   // ELECTRICITY ELECTROCUTES POLICE
                    case PORCUPINE  :   // ELECTRICITY FRIES PORCUPINE
                    case POWER      :   // ELECTRICITY PRODUCES POWER
                    case PRINCE     :   // ELECTRICITY ELECTROCUTES PRINCE
                    case PRINCESS   :   // ELECTRICITY ELECTROCUTES PRINCESS
                    case QUEEN      :   // ELECTRICITY ELECTROCUTES QUEEN
                    case QUICKSAND  :   // ELECTRICITY CHARGES QUICKSAND
                    case ROCK       :   // ELECTRICITY POWERS ROCK MUSIC
                    case SCHOOL     :   // ELECTRICITY BILLS SCHOOL
                    case SCISSORS   :   // ELECTRICITY CHARGES SCISSORS
                    case SKY        :   // ELECTRICITY CHARGES SKY
                    case SNAKE      :   // ELECTRICITY IN CABLE SNAKE
                    case SUN        :   // ELECTRICITY REPLICATES SUN
                    case SWORD      :   // ELECTRICITY CHARGES SWORD
                    case TANK       :   // ELECTRICITY SHORT-CIRCUITS TANK
                    case TORNADO    :   // ELECTRICITY ENVELOPS TORNADO
                    case TRAIN      :   // ELECTRICITY SHORT-CIRCUITS TRAIN
                    case VULTURE    :   // ELECTRICITY REPELS VULTURE
                    case WALL       :   // ELECTRICITY IN WALL
                    case WHIP       :   // ELECTRICITY FRIES WHIP
                    case WOMAN      :   // ELECTRICITY ELECTROCUTES WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DUCK       :
                    case FENCE      :
                    case FILM       :
                    case FISH       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HEART      :
                    case MATH       :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                    case WOLF       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case FENCE:
                switch (them) {
                    case FENCE:
                        tie();
                        break;
                    case AXE        :   // FENCE RESISTS AXE
                    case BABY       :   // FENCE AROUND BABY
                    case BLOOD      :   // FENCE GUARDS BLOOD SUPPLY
                    case CAGE       :   // FENCE SURROUNDS CAGE
                    case CAMERA     :   // FENCE CONFUSES CAMERA FOCUS
                    case CASTLE     :   // FENCE AROUND CASTLE
                    case CHAIN      :   // FENCE MADE OF CHAIN
                    case CHAINSAW   :   // FENCE GUARDS CHAINSAW
                    case COMPUTER   :   // FENCE AROUND COMPUTER
                    case DEATH      :   // FENCE GUARDS FROM DEATH
                    case DYNAMITE   :   // FENCE GUARDS DYNAMITE
                    case ELECTRICITY:   // FENCE USES ELECTRICITY
                    case FIRE       :   // FENCE SURROUNDS FIRE
                    case GUN        :   // FENCE GUARDS GUN
                    case HEART      :   // FENCE SADDENS HEART
                    case HELICOPTER :   // FENCE GUARDS HELICOPTER
                    case KING       :   // FENCE AROUND KING
                    case LASER      :   // FENCE BLOCKS LASER
                    case LAW        :   // FENCE BREAKS ZONING LAW
                    case LIGHTNING  :   // FENCE ATTRACTS LIGHTNING
                    case MAN        :   // FENCE AROUND MAN
                    case MATH       :   // FENCE HEIGHT MATH
                    case MEDUSA     :   // FENCE BLOCKS MEDUSA
                    case MONKEY     :   // FENCE BLOCKS MONKEY
                    case NUKE       :   // FENCE GUARDS NUKE
                    case PEACE      :   // FENCE PROTECTS PEACE
                    case PIT        :   // FENCE AROUND PIT
                    case POISON     :   // FENCE RESISTS POISON
                    case POLICE     :   // FENCE BLOCKS POLICE
                    case PORCUPINE  :   // FENCE BLOCKS PORCUPINE
                    case POWER      :   // FENCE AROUND POWER COMPANY
                    case PRINCE     :   // FENCE AROUND PRINCE
                    case PRINCESS   :   // FENCE AROUND PRINCESS
                    case QUEEN      :   // FENCE AROUND QUEEN
                    case QUICKSAND  :   // FENCE ABOVE QUICKSAND
                    case ROBOT      :   // FENCE BLOCKS ROBOT
                    case ROCK       :   // FENCE MADE OF ROCK
                    case SCHOOL     :   // FENCE AROUND SCHOOL
                    case SCISSORS   :   // FENCE RESISTS SCISSORS
                    case SKY        :   // FENCE BLOCKS SKY
                    case SNAKE      :   // FENCE BLOCKS SNAKE
                    case SUN        :   // FENCE BLOCKS SUN
                    case SWORD      :   // FENCE RESISTS SWORD
                    case TANK       :   // FENCE BLOCKS TANK
                    case TORNADO    :   // FENCE SURVIVES TORNADO
                    case VIDEO_GAME :   // FENCE GUARDS VIDEO GAME
                    case VULTURE    :   // FENCE BLOCKS VULTURE
                    case WALL       :   // FENCE FORMS WALL
                    case WHIP       :   // FENCE RESISTS WHIP
                    case WOMAN      :   // FENCE AROUND WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case WATER      :
                    case WOLF       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case FILM:
                switch (them) {
                    case FILM:
                        tie();
                        break;
                    case AIR        :   // FILM DEVELOPER SPOILS AIR
                    case ALIEN      :   // FILM ABOUT ALIEN
                    case BEER       :   // FILM INSPIRES BEER
                    case BOWL       :   // FILM COVERS SUPERBOWL
                    case CAMERA     :   // FILM FILLS CAMERA
                    case CHAIN      :   // FILM EDITS CHAINED
                    case CUP        :   // FILM COVERS WORLD CUP
                    case DEATH      :   // FILM GLORIFIES DEATH
                    case DEVIL      :   // FILM ABOUT DEVIL
                    case DIAMOND    :   // FILM ABOUT DIAMOND THIEVES
                    case DRAGON     :   // FILM ABOUT DRAGON
                    case DYNAMITE   :   // FILM EFFECTS USE DYNAMITE
                    case ELECTRICITY:   // FILM TEACHES ELECTRICITY
                    case FENCE      :   // FILM PROJECTED ON FENCE
                    case FIRE       :   // FILM CAPTURES FIRE
                    case GOLD       :   // FILM PRICIER THAN GOLD
                    case GUITAR     :   // FILM SCORE USES GUITAR
                    case GUN        :   // FILM RENTS GUNS
                    case HEART      :   // FILM HAS HEART
                    case HELICOPTER :   // FILM RENTS HELICOPTER
                    case LASER      :   // FILM BECOMES LASER MEDIA
                    case LAW        :   // FILM ABOUT LAWMEN
                    case LIGHTNING  :   // FILM ABOUT LIGHTNING
                    case MATH       :   // FILM TEACHES MATH
                    case MEDUSA     :   // FILM FEATURES MEDUSA
                    case MOUNTAIN   :   // FILM SET ON MOUNTAIN
                    case NUKE       :   // FILM DEPICTS NUKE
                    case PIT        :   // FILM IS THE PITS
                    case PLANET     :   // FILM ENTERTAINS PLANET
                    case PLATINUM   :   // FILM PRICIER THAN PLATINUM
                    case POWER      :   // FILM GRANTS POWER
                    case PRAYER     :   // FILM DISRUPTS PRAYER
                    case QUICKSAND  :   // FILM SCENE WITH QUICKSAND
                    case RAIN       :   // FILM - SINGING IN THE RAIN
                    case RAINBOW    :   // FILM HAS TECHNICOLOR RAINBOW
                    case ROBOT      :   // FILM ABOUT ROBOTS
                    case ROCK       :   // FILM STARRING THE ROCK
                    case SATAN      :   // FILM ABOUT SATAN
                    case SKY        :   // FILM EARNINGS SKY HIGH
                    case SUN        :   // FILM PRODUCTION PREFERS SUN
                    case SWORD      :   // FILM HERO USES SWORD
                    case TANK       :   // FILM RENTS TANK
                    case TOILET     :   // FILM IN THE CAN (TOILET)
                    case TORNADO    :   // FILM ABOUT TORNADO
                    case TV         :   // FILM BEFORE TV
                    case UFO        :   // FILM ABOUT UFO
                    case VIDEO_GAME :   // FILM BASED ON VIDEO GAME
                    case WALL       :   // FILM PROJECTED ON WALL
                    case WATER      :   // FILM COATS WATER
                    case WHIP       :   // FILM HERO USES WHIP
                        win();
                        break;
                    case AIRPLANE   :
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BOOK       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAGE       :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAINSAW   :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DUCK       :
                    case FISH       :
                    case GRASS      :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PEACE      :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case FIRE:
                switch (them) {
                    case FIRE:
                        tie();
                        break;
                    case AIRPLANE   :   // FIRE CONSUMES AIRPLANE
                    case AXE        :   // FIRE MELTS AXE
                    case BABY       :   // FIRE BURNS BABY
                    case BICYCLE    :   // FIRE BURNS BICYCLE
                    case BIRD       :   // FIRE COOKS BIRD
                    case BLOOD      :   // FIRE BOILS BLOOD
                    case BOOK       :   // FIRE BURNS BOOK
                    case BRAIN      :   // FIRE BURNS BRAIN
                    case BUTTER     :   // FIRE MELTS BUTTER
                    case CAGE       :   // FIRE MELTS CAGE
                    case CAR        :   // FIRE BURNS CAR
                    case CASTLE     :   // FIRE BURNS CASTLE
                    case CAT        :   // FIRE BURNS CAT
                    case CHAINSAW   :   // FIRE MELTS CHAINSAW
                    case CHURCH     :   // FIRE BURNS CHURCH
                    case CLOUD      :   // FIRE CREATES SMOKE CLOUD
                    case COCKROACH  :   // FIRE BURNS COCKROACH
                    case COMMUNITY  :   // FIRE THREATENS COMMUNITY
                    case COMPUTER   :   // FIRE BURNS COMPUTER
                    case CROSS      :   // FIRE BURNS CROSS
                    case DUCK       :   // FIRE COOKS DUCK
                    case FISH       :   // FIRE COOKS FISH
                    case GRASS      :   // FIRE BURNS GRASS
                    case HOME       :   // FIRE BURNS HOME
                    case KING       :   // FIRE BURNS KING
                    case MAN        :   // FIRE BURNS MAN
                    case MONEY      :   // FIRE BURNS MONEY
                    case MONKEY     :   // FIRE BURNS MONKEY
                    case MOON       :   // FIRE (CAMPFIRE) BY MOONLIGHT
                    case NOISE      :   // FIRE CRACKLING NOISE
                    case PAPER      :   // FIRE BURNS PAPER
                    case PEACE      :   // FIRE BREAKS PEACE
                    case POISON     :   // FIRE BOILS POISON
                    case POLICE     :   // FIRE BURNS POLICE
                    case PORCUPINE  :   // FIRE BURNS PORCUPINE
                    case PRINCE     :   // FIRE BURNS PRINCE
                    case PRINCESS   :   // FIRE BURNS PRINCESS
                    case QUEEN      :   // FIRE BURNS QUEEN
                    case SCHOOL     :   // FIRE DESTROYS SCHOOL
                    case SCISSORS   :   // FIRE MELTS SCISSORS
                    case SNAKE      :   // FIRE BURNS SNAKE
                    case SPIDER     :   // FIRE BURNS SPIDER
                    case SPONGE     :   // FIRE BURNS SPONGE
                    case TRAIN      :   // FIRE BURNS TRAIN
                    case TREE       :   // FIRE BURNS DOWN TREE
                    case TURNIP     :   // FIRE COOKS TURNIP
                    case VAMPIRE    :   // FIRE THWARTS VAMPIRE
                    case VULTURE    :   // FIRE BURNS VULTURE
                    case WOLF       :   // FIRE BURNS WOLF
                    case WOMAN      :   // FIRE BURNS WOMAN
                        win();
                        break;
                    case AIR        :
                    case ALIEN      :
                    case BEER       :
                    case BOWL       :
                    case CAMERA     :
                    case CHAIN      :
                    case CUP        :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GUITAR     :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PIT        :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SKY        :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TOILET     :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WALL       :
                    case WATER      :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case FISH:
                switch (them) {
                    case FISH:
                        tie();
                        break;
                    case AIR        :   // FISH BREATHES OCCASIONAL AIR
                    case AIRPLANE   :   // FISH FEEDS AIRPLANE
                    case ALIEN      :   // FISH INTRIGUES ALIEN
                    case BEER       :   // FISH DRINKS BEER
                    case BOOK       :   // FISH RECIPE BOOK
                    case BOWL       :   // FISH BOWL
                    case BRAIN      :   // FISH HAS BRAIN
                    case BUTTER     :   // FISH IN BUTTER
                    case CHURCH     :   // FISH FEEDS CHURCH
                    case CLOUD      :   // FISH MAKES UNDERSEA CLOUD
                    case COCKROACH  :   // FISH EATS COCKROACH
                    case COMMUNITY  :   // FISH FEEDS COMMUNITY
                    case CROSS      :   // FISH THROWN AT CROSS
                    case CUP        :   // FISH SWIMS IN CUP
                    case DEVIL      :   // FISH UNAWARE OF DEVIL
                    case DIAMOND    :   // FISH EYES LIKE DIAMONDS
                    case DRAGON     :   // FISH UNAWARE OF DRAGON
                    case ELECTRICITY:   // FISH DIVES FROM ELECTRICITY
                    case FENCE      :   // FISH SWIMS UNDER FENCE
                    case FILM       :   // FISH ON FILM
                    case GOLD       :   // FISH COLORED GOLD
                    case GRASS      :   // FISH IN SEA GRASS
                    case GUITAR     :   // FISH SOAKS GUITAR
                    case HEART      :   // FISH HAS HEART
                    case LASER      :   // FISH DODGES LASER
                    case LIGHTNING  :   // FISH DIVES FROM LIGHTNING
                    case MATH       :   // FISH DOESN'T NEED MATH
                    case MEDUSA     :   // FISH DISGUSTS MEDUSA
                    case MONEY      :   // FISH COSTS MONEY
                    case MOON       :   // FISH UNAWARE OF MOON
                    case MOUNTAIN   :   // FISH IN MOUNTAIN LAKE
                    case NUKE       :   // FISH DODGES TORPEDO NUKE
                    case PAPER      :   // FISH SOAKS PAPER
                    case PLANET     :   // FISH LIVES ON PLANET
                    case PLATINUM   :   // FISH COLORED PLATINUM
                    case POWER      :   // FISH HAS SPIRITUAL POWER
                    case PRAYER     :   // FISH ANSWERS PRAYER
                    case RAIN       :   // FISH UNAWARE OF RAIN
                    case RAINBOW    :   // FISH IS RAINBOW TROUT
                    case ROBOT      :   // FISH UNAWARE OF ROBOT
                    case SATAN      :   // FISH UNAWARE OF SATAN
                    case SKY        :   // FISH UNAWARE OF SKY
                    case SPIDER     :   // FISH EATS SPIDER
                    case SPONGE     :   // FISH SWIMS OVER SPONGE
                    case TOILET     :   // FISH DOESN'T USE TOILET
                    case TV         :   // FISH ON TV
                    case UFO        :   // FISH HIDES FROM UFO
                    case VAMPIRE    :   // FISH AMUSES VAMPIRE
                    case VIDEO_GAME :   // FISH IN VIDEO GAME
                    case WATER      :   // FISH BREATHES WATER
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DUCK       :
                    case DYNAMITE   :
                    case FIRE       :
                    case GUN        :
                    case HELICOPTER :
                    case HOME       :
                    case KING       :
                    case LAW        :
                    case MAN        :
                    case MONKEY     :
                    case NOISE      :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case GOLD:
                switch (them) {
                    case GOLD:
                        tie();
                        break;
                    case AXE        :   // GOLD PLATED AXE
                    case BLOOD      :   // GOLD OUTLASTS BLOOD
                    case CAGE       :   // GOLD PLATED CAGE
                    case CAMERA     :   // GOLD PRICIER THAN CAMERA
                    case CASTLE     :   // GOLD FUNDS CASTLE
                    case CHAIN      :   // GOLD CHAIN
                    case CHAINSAW   :   // GOLD RESISTS CHAINSAW
                    case COMPUTER   :   // GOLD WIRED COMPUTER
                    case DEATH      :   // GOLD OUTLASTS DEATH
                    case DEVIL      :   // GOLD TEMPTS DEVIL
                    case DYNAMITE   :   // GOLD SURVIVES DYNAMITE
                    case ELECTRICITY:   // GOLD CONDUCTS ELECTRICITY
                    case FENCE      :   // GOLD FUNDS FENCE
                    case FIRE       :   // GOLD RESISTS FIRE
                    case GUN        :   // GOLD PLATED GUN
                    case HEART      :   // GOLD WINS HEART
                    case HELICOPTER :   // GOLD FUNDS HELICOPTER
                    case KING       :   // GOLD ADORNS KING'S CROWN
                    case LASER      :   // GOLD WIRED LASER
                    case LAW        :   // GOLD BRIBES LAWMAN
                    case LIGHTNING  :   // GOLD CONDUCTS LIGHTNING
                    case MATH       :   // GOLD MARKET USES MATH
                    case MEDUSA     :   // GOLD ENTHRALLS MEDUSA
                    case MONKEY     :   // GOLD HYPNOTIZES MONKEY
                    case NUKE       :   // GOLD WIRED NUKE
                    case PEACE      :   // GOLD DISTURBS PEACE
                    case PIT        :   // GOLD HIDES IN PIT
                    case POISON     :   // GOLD RESISTS POISON
                    case POLICE     :   // GOLD BADGED POLICE
                    case PORCUPINE  :   // GOLD HARDER THAN PORCUPINE
                    case POWER      :   // GOLD CONDUCTS POWER
                    case PRINCE     :   // GOLD ADORNS PRINCE'S CROWN
                    case PRINCESS   :   // GOLD ADORNS PRINCESS' CROWN
                    case QUEEN      :   // GOLD ADORNS QUEEN'S CROWN
                    case QUICKSAND  :   // GOLD HIDES IN QUICKSAND
                    case ROBOT      :   // GOLD PLATED ROBOT
                    case ROCK       :   // GOLD RARER THAN ROCK
                    case SCHOOL     :   // GOLD MORE DESIRABLE THAN SCHOOL
                    case SCISSORS   :   // GOLD PLATED SCISSORS
                    case SKY        :   // GOLD REFLECTS SKY
                    case SNAKE      :   // GOLD CHARMS SNAKE
                    case SUN        :   // GOLD REFLECTS SUN
                    case SWORD      :   // GOLD DECORATES SWORD
                    case TANK       :   // GOLD FUNDS TANK
                    case TORNADO    :   // GOLD SURVIVES TORNADO
                    case VIDEO_GAME :   // GOLD PRICIER THAN VIDEO GAME
                    case VULTURE    :   // GOLD ATTRACTS VULTURE
                    case WALL       :   // GOLD PLATED WALL
                    case WHIP       :   // GOLD RESISTS WHIP
                    case WOMAN      :   // GOLD ENTHRALLS WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BABY       :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DIAMOND    :
                    case DRAGON     :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case MAN        :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case WATER      :
                    case WOLF       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case GRASS:
                switch (them) {
                    case GRASS:
                        tie();
                        break;
                    case AIR        :   // GRASS PRODUCES AIR
                    case ALIEN      :   // GRASS CAUSES ALIEN SIGHTING
                    case BEER       :   // GRASS STRONGER THAN BEER
                    case BOWL       :   // GRASS FILLS BOWL
                    case CAMERA     :   // GRASS BLURRY IN CAMERA
                    case CHAIN      :   // GRASS HIDES CHAIN
                    case CUP        :   // GRASS HIDES CUP
                    case DEATH      :   // GRASS ANNUAL DESPITE DEATH
                    case DEVIL      :   // GRASS INSPIRES DEVIL MUSIC
                    case DIAMOND    :   // GRASS HIDES DIAMOND
                    case DRAGON     :   // GRASS CAUSES DRAGON SIGHTING
                    case DYNAMITE   :   // GRASS SURVIVES DYNAMITE
                    case ELECTRICITY:   // GRASS CONDUCTS ELECTRICITY
                    case FENCE      :   // GRASS OVERGROWS FENCE
                    case FILM       :   // GRASS BLURRY IN FILM
                    case GOLD       :   // GRASS HIDES GOLD
                    case GUITAR     :   // GRASS INSPIRES GUITAR
                    case GUN        :   // GRASS HIDES GUN
                    case HEART      :   // GRASS SPEEDS UP HEART
                    case HELICOPTER :   // GRASS TOO ROUGH FOR HELICOPTER
                    case LASER      :   // GRASS TOO WIDESPREAD FOR LASER
                    case LAW        :   // GRASS BREAKS LAW
                    case LIGHTNING  :   // GRASS SURVIVES LIGHTNING
                    case MATH       :   // GRASS UNLOCKS MATH
                    case MEDUSA     :   // GRASS STARTS MEDUSA CONVERSATION
                    case MOUNTAIN   :   // GRASS GROWS ON MOUNTAIN
                    case NUKE       :   // GRASS INSPIRES NUKE RALLY
                    case PIT        :   // GRASS HIDES PIT
                    case PLANET     :   // GRASS COVERS PLANET
                    case PLATINUM   :   // GRASS HIDES PLATINUM
                    case POWER      :   // GRASS BRINGS FLOWER POWER
                    case PRAYER     :   // GRASS MORE VISCERAL THAN PRAYER
                    case QUICKSAND  :   // GRASS HIDES QUICKSAND
                    case RAIN       :   // GRASS LOVES RAIN
                    case RAINBOW    :   // GRASS CAUSES RAINBOW VISION
                    case ROBOT      :   // GRASS TURNS YOU INTO ROBOT
                    case ROCK       :   // GRASS OVERGROWS ROCK
                    case SATAN      :   // GRASS INSPIRES SATAN
                    case SKY        :   // GRASS SMOKE CLOUDS SKY
                    case SUN        :   // GRASS PREFERS MODERATE SUN
                    case SWORD      :   // GRASS HIDES SWORD
                    case TANK       :   // GRASS GIVES COVER FROM TANK
                    case TOILET     :   // GRASS BECOMES TOILET
                    case TORNADO    :   // GRASS SURVIVES TORNADO
                    case TV         :   // GRASS INSPIRES TV
                    case UFO        :   // GRASS CAUSES UFO SIGHTING
                    case VIDEO_GAME :   // GRASS INSPIRES VIDEO GAME
                    case WALL       :   // GRASS OVERGROWS WALL
                    case WATER      :   // GRASS DRINKS WATER
                    case WHIP       :   // GRASS CONSTRUCTS WHIP
                        win();
                        break;
                    case AIRPLANE   :
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BOOK       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAGE       :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAINSAW   :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DUCK       :
                    case FIRE       :
                    case FISH       :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PEACE      :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case GUITAR:
                switch (them) {
                    case GUITAR:
                        tie();
                        break;
                    case ALIEN      :   // GUITAR INTRIGUES ALIEN
                    case BEER       :   // GUITAR INSPIRES BEER
                    case BOWL       :   // GUITAR AT HOLLYWOOD BOWL
                    case CAMERA     :   // GUITAR PRICIER THAN CAMERA
                    case CHAIN      :   // GUITAR BREAKS CHAIN
                    case CHAINSAW   :   // GUITAR SOUNDS LIKE CHAINSAW
                    case CUP        :   // GUITAR FILLS DONATION CUP
                    case DEATH      :   // GUITAR SONG ABOUT DEATH
                    case DEVIL      :   // GUITAR INVOKES DEVIL
                    case DIAMOND    :   // GUITAR SHINES LIKE DIAMOND
                    case DRAGON     :   // GUITAR SUBDUES DRAGON
                    case DYNAMITE   :   // GUITAR RALLIES AGAINST DYNAMITE
                    case ELECTRICITY:   // GUITAR USES ELECTRICITY
                    case FENCE      :   // GUITAR HEARD OVER FENCES
                    case FIRE       :   // GUITAR ON FIRE
                    case GOLD       :   // GUITAR ALBUM GOES GOLD
                    case GUN        :   // GUITAR RALLIES AGAINST GUN
                    case HEART      :   // GUITAR PLAYED WITH HEART
                    case HELICOPTER :   // GUITAR RALLIES AGAINST HELICOPTER
                    case LASER      :   // GUITAR CONCERT USES LASER
                    case LAW        :   // GUITAR BREAKS LAW
                    case LIGHTNING  :   // GUITAR FINGERED LIKE LIGHTNING
                    case MATH       :   // GUITAR NOTES USE MATH
                    case MEDUSA     :   // GUITAR HYPNOTIZES MEDUSA
                    case MOUNTAIN   :   // GUITAR ECHOES ACROSS MOUNTAIN
                    case NUKE       :   // GUITAR RALLIES AGAINST NUKE
                    case PIT        :   // GUITAR ECHOES PIT
                    case PLATINUM   :   // GUITAR ALBUM GOES PLATINUM
                    case POISON     :   // GUITAR POISONS EARS
                    case POWER      :   // GUITAR POWER BALLAD
                    case PRAYER     :   // GUITAR ACCOMPANIES PRAYER
                    case QUICKSAND  :   // GUITAR FLOATS IN QUICKSAND
                    case RAIN       :   // GUITAR NOTES LIKE RAIN
                    case RAINBOW    :   // GUITAR SONG ABOUT RAINBOW
                    case ROBOT      :   // GUITAR CONFUSES ROBOT
                    case ROCK       :   // GUITAR PLAYS ROCK
                    case SATAN      :   // GUITAR INVOKES SATAN
                    case SCHOOL     :   // GUITAR DISTRACTS SCHOOL
                    case SCISSORS   :   // GUITAR STRINGS RESISTS SCISSORS
                    case SKY        :   // GUITAR ECHOES ACROSS SKY
                    case SUN        :   // GUITAR REFLECTS SUN
                    case SWORD      :   // GUITAR STAYS SWORD
                    case TANK       :   // GUITAR RALLIES AGAINST TANK
                    case TORNADO    :   // GUITAR CHEERS TORNADO VICTIM
                    case TV         :   // GUITAR ON TV
                    case UFO        :   // GUITAR GROUP UFO
                    case VIDEO_GAME :   // GUITAR SOUNTRACKS VIDEO GAME
                    case WALL       :   // GUITAR ECHOES OFF WALL
                    case WATER      :   // GUITAR ECHOES ACROSS WATER
                    case WHIP       :   // GUITAR ACCOMPANIES WHIP
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BOOK       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAGE       :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PEACE      :
                    case PLANET     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case GUN:
                switch (them) {
                    case GUN:
                        tie();
                        break;
                    case AXE        :   // GUN OUTCLASSES AXE
                    case BABY       :   // GUN SHOOTS BABY
                    case BICYCLE    :   // GUN SHOOTS BICYCLE TIRES
                    case BIRD       :   // GUN SHOOTS BIRD
                    case BLOOD      :   // GUN SPILLS BLOOD
                    case BRAIN      :   // GUN SPLATTERS BRAIN
                    case CAGE       :   // GUN SHOOTS THROUGH CAGE
                    case CAMERA     :   // GUN SHOOTS AT CAMERA
                    case CAR        :   // GUN HIJACKS CAR
                    case CASTLE     :   // GUN FIRES INTO CASTLE
                    case CAT        :   // GUN SHOOTS CAT
                    case CHAINSAW   :   // GUN OUTCLASSES CHAINSAW
                    case COCKROACH  :   // GUN SHOOTS COCKROACH
                    case COMMUNITY  :   // GUN THREATENS COMMUNITY
                    case COMPUTER   :   // GUN SHOOTS COMPUTER
                    case CROSS      :   // GUN CROSSHAIR
                    case DEATH      :   // GUN CAUSES DEATH
                    case DUCK       :   // GUN SHOOTS DUCK
                    case FIRE       :   // GUN FIRES
                    case FISH       :   // GUN SHOOTS FISH
                    case HOME       :   // GUN PROTECTS HOME
                    case KING       :   // GUN SHOOTS KING
                    case LAW        :   // GUN BREAKS LAW
                    case MAN        :   // GUN SHOOTS MAN
                    case MONEY      :   // GUN ROBS MONEY
                    case MONKEY     :   // GUN SHOOTS MONKEY
                    case NOISE      :   // GUN MAKES NOISE
                    case PEACE      :   // GUN DISTURBS PEACE
                    case POISON     :   // GUN DEADLIER THAN POISON
                    case POLICE     :   // GUN SHOOTS POLICE
                    case PORCUPINE  :   // GUN SHOOTS PORCUPINE
                    case PRINCE     :   // GUN SHOOTS PRINCE
                    case PRINCESS   :   // GUN SHOOTS PRINCESS
                    case QUEEN      :   // GUN SHOOTS QUEEN
                    case ROCK       :   // GUN TARGETS ROCK
                    case SCHOOL     :   // GUN CLOSES SCHOOL
                    case SCISSORS   :   // GUN OUTCLASSES SCISSORS
                    case SNAKE      :   // GUN SHOOTS SNAKE
                    case SPIDER     :   // GUN SHOOTS SPIDER
                    case SUN        :   // GUN SHOOTS AT SUN
                    case SWORD      :   // GUN OUTCLASSES SWORD
                    case TRAIN      :   // GUN HOLDS UP TRAIN
                    case TREE       :   // GUN TARGETS TREE
                    case TURNIP     :   // GUN BLASTS APART TURNIP
                    case VAMPIRE    :   // GUN (SILVER BULLET) SHOOTS VAMPIRE
                    case VULTURE    :   // GUN SHOOTS VULTURE
                    case WALL       :   // GUN TARGETS WALL
                    case WHIP       :   // GUN OUTCLASSES WHIP
                    case WOLF       :   // GUN SHOOTS WOLF
                    case WOMAN      :   // GUN SHOOTS WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BOOK       :
                    case BOWL       :
                    case BUTTER     :
                    case CHAIN      :
                    case CHURCH     :
                    case CLOUD      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOON       :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PAPER      :
                    case PIT        :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SKY        :
                    case SPONGE     :
                    case TANK       :
                    case TOILET     :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WATER      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case HEART:
                switch (them) {
                    case HEART:
                        tie();
                        break;
                    case AXE        :   // HEART STAYS AXE
                    case BABY       :   // HEART PROTECTS BABY
                    case BLOOD      :   // HEART PUMPS BLOOD
                    case CAGE       :   // HEART TRANSCENDS CAGE
                    case CAMERA     :   // HEART GUIDES CAMERA
                    case CAR        :   // HEART INVENTS ECO CAR
                    case CASTLE     :   // HEART BUILDS CASTLE
                    case CHAIN      :   // HEART UNCHAINED
                    case CHAINSAW   :   // HEART BANS CHAINSAW
                    case COMPUTER   :   // HEART EXCELS AT COMPUTER
                    case DEATH      :   // HEART TRANSCENDS DEATH
                    case DYNAMITE   :   // HEART BANS DYNAMITE
                    case ELECTRICITY:   // HEART USES BIOELECTRICITY
                    case FIRE       :   // HEART ON FIRE
                    case GUN        :   // HEART BANS GUN
                    case HELICOPTER :   // HEART SOARS LIKE HELICOPTER
                    case HOME       :   // HEART BUILDS HOME
                    case KING       :   // HEART GUIDES KING
                    case LASER      :   // HEART LASER SURGERY
                    case LAW        :   // HEART UPHOLDS LAW
                    case LIGHTNING  :   // HEART SURVIVES LIGHTNING
                    case MAN        :   // HEART GUIDES MAN
                    case MEDUSA     :   // HEART PITIES MEDUSA
                    case MONKEY     :   // HEART GUIDES MONKEY
                    case NOISE      :   // HEART MAKES NOISE
                    case NUKE       :   // HEART BANS NUKE
                    case PEACE      :   // HEART UPHOLDS PEACE
                    case PIT        :   // HEART SURVIVES PITFALLS
                    case POISON     :   // HEART BANS POISON
                    case POLICE     :   // HEART BOLSTERS POLICE
                    case PORCUPINE  :   // HEART OUTSMARTS PORCUPINE
                    case POWER      :   // HEART PROVIDES POWER
                    case PRINCE     :   // HEART GUIDES PRINCE
                    case PRINCESS   :   // HEART GUIDES PRINCESS
                    case QUEEN      :   // HEART GUIDES QUEEN
                    case QUICKSAND  :   // HEART RESCUES FROM QUICKSAND
                    case ROCK       :   // HEART LIKE A ROCK
                    case SCHOOL     :   // HEART EXCELS AT SCHOOL
                    case SCISSORS   :   // HEART GUIDES SCISSORS
                    case SKY        :   // HEART CLEARS SKY
                    case SNAKE      :   // HEART RESISTS SNAKE
                    case SUN        :   // HEART OF THE SUN
                    case SWORD      :   // HEART STAYS SWORD
                    case TANK       :   // HEART BANS TANK
                    case TORNADO    :   // HEART SURVIVES TORNADO
                    case TRAIN      :   // HEART PREFERS TRAIN
                    case VULTURE    :   // HEART OUTSMARTS VULTURE
                    case WALL       :   // HEART KNOWS NO WALL
                    case WHIP       :   // HEART STAYS WHIP
                    case WOMAN      :   // HEART GUIDES WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DUCK       :
                    case FENCE      :
                    case FILM       :
                    case FISH       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case MATH       :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                    case WOLF       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case HELICOPTER:
                switch (them) {
                    case HELICOPTER:
                        tie();
                        break;
                    case AXE        :   // HELICOPTER FLIES OVER AXE
                    case BABY       :   // HELICOPTER CARRIES BABY
                    case BICYCLE    :   // HELICOPTER FASTER THAN BICYCLE
                    case BIRD       :   // HELICOPTER FASTER THAN BIRD
                    case BLOOD      :   // HELICOPTER GETS BLOOD PUMPING
                    case CAGE       :   // HELICOPTER FLIES OVER CAGE
                    case CAMERA     :   // HELICOPTER CARRIES CAMERA
                    case CAR        :   // HELICOPTER FASTER THAN CAR
                    case CASTLE     :   // HELICOPTER FLIES OVER CASTLE
                    case CAT        :   // HELICOPTER FLIES OVER CAT
                    case CHAIN      :   // HELICOPTER BREAKS CHAIN
                    case CHAINSAW   :   // HELICOPTER FLIES OVER CHAINSAW
                    case COMPUTER   :   // HELICOPTER USES COMPUTER
                    case DEATH      :   // HELICOPTER CAUSES DEATH
                    case DUCK       :   // HELICOPTER FLIES OVER DUCK
                    case DYNAMITE   :   // HELICOPTER DROPS DYNAMITE
                    case FIRE       :   // HELICOPTER FLIES OVER FIRE
                    case FISH       :   // HELICOPTER FLIES OVER FISH
                    case GUN        :   // HELICOPTER HAS GUN
                    case HOME       :   // HELICOPTER FLIES OVER HOME
                    case KING       :   // HELICOPTER CARRIES KING
                    case LAW        :   // HELICOPTER IMPOSES LAW
                    case MAN        :   // HELICOPTER CARRIES MAN
                    case MONKEY     :   // HELICOPTER FLIES OVER MONKEY
                    case NOISE      :   // HELICOPTER MAKES NOISE
                    case PEACE      :   // HELICOPTER DISTURBS PEACE
                    case PIT        :   // HELICOPTER FLIES OVER PIT
                    case POISON     :   // HELICOPTER FLIES OVER POISON
                    case POLICE     :   // HELICOPTER CARRIES POLICE
                    case PORCUPINE  :   // HELICOPTER FLIES OVER PORCUPINE
                    case PRINCE     :   // HELICOPTER CARRIES PRINCE
                    case PRINCESS   :   // HELICOPTER CARRIES PRINCESS
                    case QUEEN      :   // HELICOPTER CARRIES QUEEN
                    case QUICKSAND  :   // HELICOPTER FLIES OVER QUICKSAND
                    case ROCK       :   // HELICOPTER FLIES OVER ROCK
                    case SCHOOL     :   // HELICOPTER FLIES OVER SCHOOL
                    case SCISSORS   :   // HELICOPTER FLIES OVER SCISSORS
                    case SNAKE      :   // HELICOPTER FLIES OVER SNAKE
                    case SPIDER     :   // HELICOPTER FLIES OVER SPIDER
                    case SUN        :   // HELICOPTER CLOUD BLOCKS SUN
                    case SWORD      :   // HELICOPTER FLIES OVER SWORD
                    case TORNADO    :   // HELICOPTER FLIES OVER TORNADO
                    case TRAIN      :   // HELICOPTER FASTER THAN TRAIN
                    case TREE       :   // HELICOPTER FLIES OVER TREE
                    case TURNIP     :   // HELICOPTER FLIES OVER TURNIP
                    case VULTURE    :   // HELICOPTER FLIES OVER VULTURE
                    case WALL       :   // HELICOPTER FLIES OVER WALL
                    case WHIP       :   // HELICOPTER FLIES OVER WHIP
                    case WOLF       :   // HELICOPTER FLIES OVER WOLF
                    case WOMAN      :   // HELICOPTER CARRIES WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HEART      :
                    case LASER      :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SKY        :
                    case SPONGE     :
                    case TANK       :
                    case TOILET     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case HOME:
                switch (them) {
                    case HOME:
                        tie();
                        break;
                    case AIR        :   // HOME HAS CENTRAL AIR
                    case AIRPLANE   :   // HOME COZIER THAN AIRPLANE
                    case ALIEN      :   // HOME KEEPS OUT ALIEN
                    case BEER       :   // HOME CONTAINS BEER
                    case BICYCLE    :   // HOME PRICIER THAN BICYCLE
                    case BIRD       :   // HOME CONTAINS BIRD
                    case BOOK       :   // HOME CONTAINS BOOK
                    case BOWL       :   // HOME CONTAINS BOWL
                    case BRAIN      :   // HOME REQUIRES BRAINS
                    case BUTTER     :   // HOME CONTAINS BUTTER
                    case CAR        :   // HOME PRICIER THAN CAR
                    case CAT        :   // HOME CONTAINS CAT
                    case CHURCH     :   // HOME COZIER THAN CHURCH
                    case CLOUD      :   // HOME BLOCKS CLOUD
                    case COCKROACH  :   // HOME HOUSES COCKROACH
                    case COMMUNITY  :   // HOME POPULATES COMMUNITY
                    case CROSS      :   // HOME CONTAINS CROSS
                    case CUP        :   // HOME CONTAINS CUP
                    case DEVIL      :   // HOME ENVIED BY DEVIL
                    case DIAMOND    :   // HOME PRICIER THAN DIAMOND
                    case DRAGON     :   // HOME BLOCKS DRAGON
                    case DUCK       :   // HOME YARD HAS DUCK
                    case FENCE      :   // HOME HAS FENCE
                    case FILM       :   // HOME IN FILM
                    case FISH       :   // HOME CONTAINS FISH
                    case GOLD       :   // HOME PRICIER THAN GOLD
                    case GRASS      :   // HOME YARD HAS GRASS
                    case GUITAR     :   // HOME CONTAINS GUITAR
                    case MONEY      :   // HOME COSTS MONEY
                    case MOON       :   // HOME BLOCKS MOON
                    case MOUNTAIN   :   // HOME ATOP MOUNTAIN
                    case NOISE      :   // HOME BLOCKS NOISE
                    case PAPER      :   // HOME CONTAINS PAPER
                    case PLANET     :   // HOME ON PLANET
                    case PLATINUM   :   // HOME PRICIER THAN PLATINUM
                    case PRAYER     :   // HOME ANSWERS PRAYER
                    case RAIN       :   // HOME BLOCKS RAIN
                    case RAINBOW    :   // HOME BLOCKS RAINBOW
                    case SATAN      :   // HOME DENOUNCES SATAN
                    case SPIDER     :   // HOME HOUSES SPIDER
                    case SPONGE     :   // HOME CONTAINS SPONGE
                    case TOILET     :   // HOME HAS TOILET
                    case TRAIN      :   // HOME COZIER THAN TRAIN
                    case TREE       :   // HOME YARD HAS TREE
                    case TURNIP     :   // HOME GARDEN HAS TURNIP
                    case TV         :   // HOME HAS TV
                    case UFO        :   // HOME BLOCKS UFO
                    case VAMPIRE    :   // HOME BLOCKS VAMPIRE
                    case WATER      :   // HOME PLUMBS WATER
                    case WOLF       :   // HOME KEEPS OUT WOLF
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FIRE       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case KING       :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MAN        :
                    case MATH       :
                    case MEDUSA     :
                    case MONKEY     :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case POWER      :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROBOT      :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case VIDEO_GAME :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case KING:
                switch (them) {
                    case KING:
                        tie();
                        break;
                    case AIR        :   // KING BREATHES AIR
                    case AIRPLANE   :   // KING FLIES ON AIRPLANE
                    case ALIEN      :   // KING DISBELIEVES ALIEN
                    case BABY       :   // KING SIRES BABY
                    case BEER       :   // KING DRINKS BEER
                    case BICYCLE    :   // KING RIDES BICYCLE
                    case BIRD       :   // KING EATS BIRD
                    case BOOK       :   // KING INSPIRES BOOK
                    case BOWL       :   // KING EATS FROM BOWL
                    case BRAIN      :   // KING HAS BRAIN
                    case BUTTER     :   // KING EATS BUTTER
                    case CAR        :   // KING RIDES IN CAR
                    case CAT        :   // KING OWNS CAT
                    case CHURCH     :   // KING FUNDS CHURCH
                    case CLOUD      :   // KING LOOKS AT CLOUD
                    case COCKROACH  :   // KING STEPS ON COCKROACH
                    case COMMUNITY  :   // KING RULES COMMUNITY
                    case CROSS      :   // KING ERECTS CROSS
                    case CUP        :   // KING DRINKS FROM CUP
                    case DUCK       :   // KING EATS DUCK
                    case FILM       :   // KING INSPIRES FILM
                    case FISH       :   // KING EATS FISH
                    case GRASS      :   // KING WALKS ON GRASS
                    case GUITAR     :   // KING OUTLAWS GUITAR
                    case HOME       :   // KING TAXES HOME
                    case MAN        :   // KING RULES MAN
                    case MONEY      :   // KING HAS MONEY
                    case MOON       :   // KING LOOKS AT MOON
                    case NOISE      :   // KING OUTLAWS NOISE
                    case PAPER      :   // KING WRITES PAPER
                    case PLANET     :   // KING DECLARES FLAT PLANET
                    case POLICE     :   // KING GOVERNS POLICE
                    case PRAYER     :   // KING IN PRAYER
                    case PRINCE     :   // KING RULES OVER PRINCE
                    case PRINCESS   :   // KING RULES OVER PRINCESS
                    case QUEEN      :   // KING RULES OVER QUEEN
                    case RAIN       :   // KING WALKS IN RAIN
                    case RAINBOW    :   // KING LOOKS AT RAINBOW
                    case SPIDER     :   // KING STEPS ON SPIDER
                    case SPONGE     :   // KING OWNS SPONGE
                    case TOILET     :   // KING USES TOILET
                    case TRAIN      :   // KING RIDES ON TRAIN
                    case TREE       :   // KING OWNS TREE
                    case TURNIP     :   // KING EATS TURNIP
                    case TV         :   // KING ON TV
                    case UFO        :   // KING DISBELIEVES UFO
                    case VAMPIRE    :   // KING COULD BE VAMPIRE
                    case WATER      :   // KING DRINKS WATER
                    case WOLF       :   // KING TAMES WOLF
                    case WOMAN      :   // KING RULES WOMAN
                        win();
                        break;
                    case AXE        :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONKEY     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case PLATINUM   :
                    case POISON     :
                    case PORCUPINE  :
                    case POWER      :
                    case QUICKSAND  :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case VIDEO_GAME :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case LASER:
                switch (them) {
                    case LASER:
                        tie();
                        break;
                    case AXE        :   // LASER OUTLCASSES AXE
                    case BABY       :   // LASER TARGETS BABY
                    case BICYCLE    :   // LASER MELTS BICYCLE
                    case BLOOD      :   // LASER COOKS BLOOD
                    case CAGE       :   // LASER MELTS CAGE
                    case CAMERA     :   // LASER BURNS CAMERA
                    case CAR        :   // LASER TARGETS CAR
                    case CASTLE     :   // LASER TARGETS CASTLE
                    case CHAIN      :   // LASER STARTS CHAIN REACTION
                    case CHAINSAW   :   // LASER OUTCLASSES CHAINSAW
                    case COMPUTER   :   // LASER BACKS UP COMPUTER
                    case DEATH      :   // LASER CAUSES DEATH
                    case DUCK       :   // LASER FRIES DUCK
                    case DYNAMITE   :   // LASER OUTCLASSES DYNAMITE
                    case FIRE       :   // LASER STARTS FIRE
                    case GUN        :   // LASER GUN
                    case HELICOPTER :   // LASER TARGETS HELICOPTER
                    case HOME       :   // LASER TARGETS HOME
                    case KING       :   // LASER TARGETS KING
                    case LAW        :   // LASER UPHOLDS LAW
                    case MAN        :   // LASER TARGETS MAN
                    case MONKEY     :   // LASER FRIES MONKEY
                    case NOISE      :   // LASER ZAP NOISE
                    case NUKE       :   // LASER GUIDES NUKE
                    case PEACE      :   // LASER DISTURBS PEACE
                    case PIT        :   // LASER LIGHTS PIT
                    case POISON     :   // LASER MORE EXACT THAN POISON
                    case POLICE     :   // LASER HELPS POLICE
                    case PORCUPINE  :   // LASER FRIES PORCUPINE
                    case PRINCE     :   // LASER TARGETS PRINCE
                    case PRINCESS   :   // LASER TARGETS PRINCESS
                    case QUEEN      :   // LASER TARGETS QUEEN
                    case QUICKSAND  :   // LASER BURNS OFF QUICKSAND
                    case ROCK       :   // LASER BURNS THROUGH ROCK
                    case SCHOOL     :   // LASER TEACHES SCHOOL
                    case SCISSORS   :   // LASER MELTS SCISSORS
                    case SKY        :   // LASER TRAVERSES SKY
                    case SNAKE      :   // LASER FRIES SNAKE
                    case SUN        :   // LASER HAS POWER OF SUN
                    case SWORD      :   // LASER OUTCLASSES SWORD
                    case TANK       :   // LASER TARGETS TANK
                    case TORNADO    :   // LASER PENETRATES TORNADO
                    case TRAIN      :   // LASER TARGETS TRAIN
                    case TREE       :   // LASER BURNS THROUGH TREE
                    case TURNIP     :   // LASER DISCINTIGRATES TURNIP
                    case VULTURE    :   // LASER FRIES VULTURE
                    case WALL       :   // LASER BURNS THROUGH WALL
                    case WHIP       :   // LASER OUTCLASSES WHIP
                    case WOLF       :   // LASER FRIES WOLF
                    case WOMAN      :   // LASER TARGETS WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case FISH       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HEART      :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case LAW:
                switch (them) {
                    case LAW:
                        tie();
                        break;
                    case AXE        :   // LAW MAKES AXE SAFE
                    case BABY       :   // LAW PROTECTS BABY
                    case BICYCLE    :   // LAW MAKES BICYCLE SAFE
                    case BIRD       :   // LAW PROTECTS BIRD
                    case BLOOD      :   // LAW PROTECTS BLOOD
                    case BRAIN      :   // LAW CONFOUNDS BRAIN
                    case CAGE       :   // LAW PUTS YOU IN CAGE
                    case CAMERA     :   // LAW RESTRICTS CAMERA
                    case CAR        :   // LAW PROTECTS CAR
                    case CASTLE     :   // LAW PROTECTS CASTLE
                    case CAT        :   // LAW PROTECTS CAT
                    case CHAINSAW   :   // LAW MAKES CHAINSAW SAFE
                    case COCKROACH  :   // LAW KILLS COCKROACH
                    case COMMUNITY  :   // LAW PROTECTS COMMUNITY
                    case COMPUTER   :   // LAW RESTRICTS COMPUTER
                    case CROSS      :   // LAW RESPECTS CROSS
                    case DEATH      :   // LAW PREVENTS DEATH
                    case DUCK       :   // LAW PROTECTS DUCK
                    case FIRE       :   // LAW RESTRICTS FIRE
                    case FISH       :   // LAW PROTECTS FISH
                    case HOME       :   // LAW PROTECTS HOME
                    case KING       :   // LAW PROTECTS KING
                    case MAN        :   // LAW PROTECTS MAN
                    case MONEY      :   // LAW COSTS MONEY
                    case MONKEY     :   // LAW PROTECTS MONKEY
                    case NOISE      :   // LAW RESTRICTS NOISE
                    case PEACE      :   // LAW KEEPS PEACE
                    case POISON     :   // LAW RESTRICTS POISON
                    case POLICE     :   // LAW PROTECTS POLICE
                    case PORCUPINE  :   // LAW PROTECTS PORCUPINE
                    case PRINCE     :   // LAW PROTECTS PRINCE
                    case PRINCESS   :   // LAW PROTECTS PRINCESS
                    case QUEEN      :   // LAW PROTECTS QUEEN
                    case ROCK       :   // LAW SET IN STONE (ROCK)
                    case SCHOOL     :   // LAW PROVIDES SCHOOLS
                    case SCISSORS   :   // LAW MAKES SCISSORS SAFE
                    case SNAKE      :   // LAW PROTECTS SNAKE
                    case SPIDER     :   // LAW PROTECTS RARE SPIDER
                    case SPONGE     :   // LAW CLEANS LIKE SPONGE
                    case SUN        :   // LAW EXPLAINS SUN
                    case SWORD      :   // LAW RESTRICTS SWORD
                    case TRAIN      :   // LAW PROTECTS TRAIN
                    case TREE       :   // LAW PROTECTS TREE
                    case TURNIP     :   // LAW PROTECTS TURNIP
                    case VAMPIRE    :   // LAW CHASES VAMPIRE
                    case VULTURE    :   // LAW PROTECTS VULTURE
                    case WALL       :   // LAW PROTECTS WALL
                    case WHIP       :   // LAW RESTRICTS WHIP
                    case WOLF       :   // LAW PROTECTS WOLF
                    case WOMAN      :   // LAW PROTECTS WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BOOK       :
                    case BOWL       :
                    case BUTTER     :
                    case CHAIN      :
                    case CHURCH     :
                    case CLOUD      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOON       :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PAPER      :
                    case PIT        :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SKY        :
                    case TANK       :
                    case TOILET     :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WATER      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case LIGHTNING:
                switch (them) {
                    case LIGHTNING:
                        tie();
                        break;
                    case AXE        :   // LIGHTNING CHARGES AXE
                    case BABY       :   // LIGHTNING SCARES BABY
                    case BICYCLE    :   // LIGHTNING STRIKES BICYCLE
                    case BLOOD      :   // LIGHTNING COOKS BLOOD
                    case CAGE       :   // LIGHTNING CHARGES CAGE
                    case CAMERA     :   // LIGHTNING CHALLENGES CAMERA
                    case CAR        :   // LIGHTNING (GREASED) CAR
                    case CASTLE     :   // LIGHTNING STRIKES CASTLE
                    case CHAIN      :   // LIGHTNING STARTS CHAIN REACTION
                    case CHAINSAW   :   // LIGHTNING OUTCLASSES CHAINSAW
                    case COMPUTER   :   // LIGHTNING SHORT-CIRCUITS COMPUTER
                    case DEATH      :   // LIGHTNING CAUSES DEATH
                    case DYNAMITE   :   // LIGHTNING IGNITES DYNAMITE
                    case FIRE       :   // LIGHTNING STARTS FIRE
                    case GUN        :   // LIGHTNING CHARGES GUN
                    case HELICOPTER :   // LIGHTNING STRIKES HELICOPTER
                    case HOME       :   // LIGHTNING STRIKES HOME
                    case KING       :   // LIGHTNING STRIKES KING
                    case LASER      :   // LIGHTNING OUTCLASSES LASER
                    case LAW        :   // LIGHTNING HAS PHYSICAL LAW
                    case MAN        :   // LIGHTNING STRIKES MAN
                    case MEDUSA     :   // LIGHTNING STRIKES MEDUSA
                    case MONKEY     :   // LIGHTNING STRIKES MONKEY
                    case NOISE      :   // LIGHTNING MAKES NOISE
                    case NUKE       :   // LIGHTNING SHORT-CIRCUITS NUKE
                    case PEACE      :   // LIGHTNING DISTURBS PEACE
                    case PIT        :   // LIGHTNING CREATES PIT
                    case POISON     :   // LIGHTNING DEADLIER THAN POISON
                    case POLICE     :   // LIGHTNING STRIKES POLICE
                    case PORCUPINE  :   // LIGHTNING STRIKES PORCUPINE
                    case POWER      :   // LIGHTNING PRODUCES POWER
                    case PRINCE     :   // LIGHTNING STRIKES PRINCE
                    case PRINCESS   :   // LIGHTNING STRIKES PRINCESS
                    case QUEEN      :   // LIGHTNING STRIKES QUEEN
                    case QUICKSAND  :   // LIGHTNING CREATES QUICKSAND
                    case ROCK       :   // LIGHTNING SPLITS ROCK
                    case SCHOOL     :   // LIGHTNING STRIKES SCHOOL
                    case SCISSORS   :   // LIGHTNING CHARGES SCISSORS
                    case SKY        :   // LIGHTNING DECORATES SKY
                    case SNAKE      :   // LIGHTNING STRIKES SNAKE
                    case SUN        :   // LIGHTNING STORM BLOCKS SUN
                    case SWORD      :   // LIGHTNING STRIKES SWORD
                    case TANK       :   // LIGHTNING STRIKES TANK
                    case TORNADO    :   // LIGHTNING ENVELOPS TORNADO
                    case TRAIN      :   // LIGHTNING STRIKES TRAIN
                    case TREE       :   // LIGHTNING STRIKES TREE
                    case VULTURE    :   // LIGHTNING STRIKES VULTURE
                    case WALL       :   // LIGHTNING STRIKES THROUGH WALL
                    case WHIP       :   // LIGHTNING FRIES WHIP
                    case WOMAN      :   // LIGHTNING STRIKES WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DUCK       :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case FISH       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HEART      :
                    case MATH       :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TURNIP     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                    case WOLF       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case MAN:
                switch (them) {
                    case MAN:
                        tie();
                        break;
                    case AIR        :   // MAN BREATHES AIR
                    case AIRPLANE   :   // MAN FLIES ON AIRPLANE
                    case ALIEN      :   // MAN DISPROVES ALIEN
                    case BEER       :   // MAN DRINKS BEER
                    case BICYCLE    :   // MAN RIDES BICYCLE
                    case BIRD       :   // MAN FLIPS BIRD
                    case BOOK       :   // MAN READS BOOK
                    case BOWL       :   // MAN EATS FROM BOWL
                    case BRAIN      :   // MAN HAS BRAIN
                    case BUTTER     :   // MAN EATS BUTTER
                    case CAR        :   // MAN DRIVES CAR
                    case CAT        :   // MAN OWNS CAT
                    case CHURCH     :   // MAN ATTENDS CHURCH
                    case CLOUD      :   // MAN LOOKS AT CLOUD
                    case COCKROACH  :   // MAN STEPS ON COCKROACH
                    case COMMUNITY  :   // MAN LIVES IN COMMUNITY
                    case CROSS      :   // MAN HANGS ON CROSS
                    case CUP        :   // MAN DRINKS FROM CUP
                    case DEVIL      :   // MAN EXORCISES DEVIL
                    case DIAMOND    :   // MAN MINES DIAMOND
                    case DRAGON     :   // MAN SLAYS DRAGON
                    case DUCK       :   // MAN EATS DUCK
                    case FILM       :   // MAN WATCHES FILM
                    case FISH       :   // MAN EATS FISH
                    case GOLD       :   // MAN MINES GOLD
                    case GRASS      :   // MAN WALKS ON GRASS
                    case GUITAR     :   // MAN PLAYS GUITAR
                    case HOME       :   // MAN LIVES IN HOME
                    case MONEY      :   // MAN SPENDS MONEY
                    case MOON       :   // MAN TRAVELS TO MOON
                    case MOUNTAIN   :   // MAN CLIMBS MOUNTAIN
                    case NOISE      :   // MAN MAKES NOISE
                    case PAPER      :   // MAN WRITES PAPER
                    case PLANET     :   // MAN LIVES ON PLANET
                    case PLATINUM   :   // MAN REFINES PLATINUM
                    case PRAYER     :   // MAN IN PRAYER
                    case RAIN       :   // MAN PLAYS IN RAIN
                    case RAINBOW    :   // MAN LOOKS AT RAINBOW
                    case SATAN      :   // MAN DENOUNCES SATAN
                    case SPIDER     :   // MAN STEPS ON SPIDER
                    case SPONGE     :   // MAN CLEANS WITH SPONGE
                    case TOILET     :   // MAN USES TOILET
                    case TRAIN      :   // MAN RIDES ON TRAIN
                    case TREE       :   // MAN PLANTS TREE
                    case TURNIP     :   // MAN EATS TURNIP
                    case TV         :   // MAN WATCHES TV
                    case UFO        :   // MAN DEBUNKS UFO
                    case VAMPIRE    :   // MAN BECOMES VAMPIRE
                    case WATER      :   // MAN DRINKS WATER
                    case WOLF       :   // MAN TAMES WOLF
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case KING       :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONKEY     :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case POWER      :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROBOT      :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case VIDEO_GAME :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case MATH:
                switch (them) {
                    case MATH:
                        tie();
                        break;
                    case AXE        :   // MATH WHIZ SHARPER THAN AXE
                    case BABY       :   // MATH CONFUSES BABY
                    case BLOOD      :   // MATH CALCULATES BLOOD COUNT
                    case CAGE       :   // MATH MENTAL CAGE
                    case CAMERA     :   // MATH SHAPES CAMERA LENS
                    case CASTLE     :   // MATH MEASURES CASTLE
                    case CHAIN      :   // MATH USES NUMBER CHAIN
                    case CHAINSAW   :   // MATH DIRECTS CHAINSAW USE
                    case COMPUTER   :   // MATH ON COMPUTER
                    case DEATH      :   // MATH TRANSCENDS DEATH
                    case DYNAMITE   :   // MATH MEASURES DYNAMITE
                    case ELECTRICITY:   // MATH CALCULATES ELECTRICITY
                    case FIRE       :   // MATH MEASURES FIRE
                    case GUN        :   // MATH TEST INSPIRES GUN
                    case HEART      :   // MATH DARKENS HEART
                    case HELICOPTER :   // MATH NAVIGATES HELICOPTER
                    case HOME       :   // MATH AFTER HOMEROOM
                    case KING       :   // MATH CONFUSES KING
                    case LASER      :   // MATH FORMULATES LASER
                    case LAW        :   // MATH FORMULATES LAW
                    case LIGHTNING  :   // MATH CALCULATES LIGHTNING
                    case MAN        :   // MATH CONFUSES MAN
                    case MEDUSA     :   // MATH CONFUSES MEDUSA
                    case MONKEY     :   // MATH ENRAGES MONKEY
                    case NUKE       :   // MATH FORMULATES NUKE
                    case PEACE      :   // MATH IS PEACEFUL
                    case PIT        :   // MATH IS THE PITS
                    case POISON     :   // MATH MEASURES POISON
                    case POLICE     :   // MATH CONFUSES POLICE
                    case PORCUPINE  :   // MATH COUNTS PORCUPINE QUILLS
                    case POWER      :   // MATH BRAIN POWER
                    case PRINCE     :   // MATH CONFUSES PRINCE
                    case PRINCESS   :   // MATH CONFUSES PRINCESS
                    case QUEEN      :   // MATH CONFUSES QUEEN
                    case QUICKSAND  :   // MATH TEST LIKE QUICKSAND
                    case ROBOT      :   // MATH NAVIGATES ROBOT
                    case ROCK       :   // MATH SCHOOLHOUSE ROCK
                    case SCHOOL     :   // MATH BORES SCHOOL
                    case SCISSORS   :   // MATH GUIDES SCISSORS
                    case SKY        :   // MATH CLASS DENIES SKY
                    case SNAKE      :   // MATH MEASURES SNAKE
                    case SUN        :   // MATH CALCULATES SUN PATH
                    case SWORD      :   // MATH MEASURES SWORD SWING
                    case TANK       :   // MATH NAVIGATES TANK
                    case TORNADO    :   // MATH PREDICTS TORNADO
                    case TRAIN      :   // MATH WORD PROBLEM W/ TRAINS
                    case VULTURE    :   // MATH TEST ATTRACTS VULTURE
                    case WALL       :   // MATH MEASURES WALL
                    case WHIP       :   // MATH WHIZ SHARP AS WHIP
                    case WOMAN      :   // MATH CONFUSES WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DUCK       :
                    case FENCE      :
                    case FILM       :
                    case FISH       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                    case WOLF       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case MEDUSA:
                switch (them) {
                    case MEDUSA:
                        tie();
                        break;
                    case AXE        :   // MEDUSA WEILDS AXE
                    case BABY       :   // MEDUSA PETRIFIES BABY
                    case BICYCLE    :   // MEDUSA BEFORE BICYCLE
                    case BLOOD      :   // MEDUSA FREEZES BLOOD
                    case CAGE       :   // MEDUSA ESCAPES CAGE
                    case CAMERA     :   // MEDUSA BEFORE CAMERA
                    case CAR        :   // MEDUSA BEFORE CAR
                    case CASTLE     :   // MEDUSA TERRORIZES CASTLE
                    case CHAIN      :   // MEDUSA BREAKS CHAIN
                    case CHAINSAW   :   // MEDUSA BEFORE CHAINSAW
                    case COMPUTER   :   // MEDUSA BEFORE COMPUTER
                    case DEATH      :   // MEDUSA CAUSES DEATH
                    case DYNAMITE   :   // MEDUSA BEFORE DYNAMITE
                    case FIRE       :   // MEDUSA STARTS FIRE
                    case GUN        :   // MEDUSA BEFORE GUN
                    case HELICOPTER :   // MEDUSA EVADES HELICOPTER
                    case HOME       :   // MEDUSA TERRIFIES HOME
                    case KING       :   // MEDUSA PETRIFIES KING
                    case LASER      :   // MEDUSA BEFORE LASER
                    case LAW        :   // MEDUSA BREAKS LAW
                    case MAN        :   // MEDUSA PETRIFIES MAN
                    case MONKEY     :   // MEDUSA PETRIFIES MONKEY
                    case NOISE      :   // MEDUSA SCREECHES NOISE
                    case NUKE       :   // MEDUSA BEFORE NUKE
                    case PEACE      :   // MEDUSA DISTURBS PEACE
                    case PIT        :   // MEDUSA LIVES IN PIT
                    case POISON     :   // MEDUSA DEADLIER THAN POISON
                    case POLICE     :   // MEDUSA PETRIFIES POLICE
                    case PORCUPINE  :   // MEDUSA PETRIFIES PORCUPINE
                    case POWER      :   // MEDUSA CRAVES POWER
                    case PRINCE     :   // MEDUSA PETRIFIES PRINCE
                    case PRINCESS   :   // MEDUSA PETRIFIES PRINCESS
                    case QUEEN      :   // MEDUSA PETRIFIES QUEEN
                    case QUICKSAND  :   // MEDUSA PLANTS QUICKSAND
                    case ROCK       :   // MEDUSA HURLS ROCK
                    case SCHOOL     :   // MEDUSA TERRORIZES SCHOOL
                    case SCISSORS   :   // MEDUSA RUNS WITH SCISSORS
                    case SKY        :   // MEDUSA CURSES SKY
                    case SNAKE      :   // MEDUSA HEAD SNAKES
                    case SUN        :   // MEDUSA CURSES SUN
                    case SWORD      :   // MEDUSA WEILDS SWORD
                    case TANK       :   // MEDUSA RESISTS TANK
                    case TORNADO    :   // MEDUSA HIDES FROM TORNADO
                    case TRAIN      :   // MEDUSA BEFORE TRAIN
                    case TREE       :   // MEDUSA HIDES BEHIND TREE
                    case TURNIP     :   // MEDUSA DISCARDS TURNIP
                    case VULTURE    :   // MEDUSA PETRIFIES VULTURE
                    case WALL       :   // MEDUSA HIDES BEHIND WALL
                    case WHIP       :   // MEDUSA CRACKS WHIP
                    case WOMAN      :   // MEDUSA PETRIFIES WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DUCK       :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case FISH       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HEART      :
                    case LIGHTNING  :
                    case MATH       :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                    case WOLF       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case MONEY:
                switch (them) {
                    case MONEY:
                        tie();
                        break;
                    case AIR        :   // MONEY POLLUTES AIR
                    case AIRPLANE   :   // MONEY BANKRUPTS AIRPLANE
                    case ALIEN      :   // MONEY DOESN'T INTEREST ALIEN
                    case BEER       :   // MONEY IMPORTS BEER
                    case BOOK       :   // MONEY FUNDS BOOK
                    case BOWL       :   // MONEY FILLS BOWL
                    case BUTTER     :   // MONEY EVADES BUTTERFINGERS
                    case CHURCH     :   // MONEY FUNDS CHURCH
                    case CLOUD      :   // MONEY CLEARS CLOUDS
                    case CUP        :   // MONEY FILLS CUP
                    case DEVIL      :   // MONEY MAKES MEN DEVILS
                    case DIAMOND    :   // MONEY MINES DIAMOND
                    case DRAGON     :   // MONEY ENTHRALLS DRAGON
                    case DYNAMITE   :   // MONEY FUNDS DYNAMITE
                    case ELECTRICITY:   // MONEY CONDUCTS ELECTRICITY
                    case FENCE      :   // MONEY REPAIRS FENCE
                    case FILM       :   // MONEY FUNDS FILM
                    case GOLD       :   // MONEY IS GOLD
                    case GRASS      :   // MONEY LANDSCAPES GRASS
                    case GUITAR     :   // MONEY FUNDS GUITAR LESSONS
                    case HEART      :   // MONEY TRICKS HEART
                    case HELICOPTER :   // MONEY FUNDS HELICOPTER
                    case LASER      :   // MONEY FUNDS LASER
                    case LIGHTNING  :   // MONEY VANISHES LIKE LIGHTNING
                    case MATH       :   // MONEY USES MATH
                    case MEDUSA     :   // MONEY BRIBES MEDUSA
                    case MOON       :   // MONEY FUNDS TRIP TO MOON
                    case MOUNTAIN   :   // MONEY BUYS MOUNTAIN
                    case NUKE       :   // MONEY FUNDS NUKE
                    case PAPER      :   // MONEY FUNDS NEWSPAPER
                    case PIT        :   // MONEY PIT
                    case PLANET     :   // MONEY CONQUERS PLANET
                    case PLATINUM   :   // MONEY IS PLATINUM
                    case POWER      :   // MONEY BRINGS POWER
                    case PRAYER     :   // MONEY ANSWERS PRAYER
                    case QUICKSAND  :   // MONEY DEBT IS QUICKSAND
                    case RAIN       :   // MONEY FLOWS LIKE RAIN
                    case RAINBOW    :   // MONEY HAS NEW RAINBOW COLORS
                    case ROBOT      :   // MONEY FUNDS ROBOT
                    case SATAN      :   // MONEY BRINGS SOULS TO SATAN
                    case SKY        :   // MONEY DEBT SKY HIGH
                    case SPONGE     :   // MONEY HIRES SPONGE
                    case TANK       :   // MONEY FUNDS TANK
                    case TOILET     :   // MONEY FIXES TOILET
                    case TORNADO    :   // MONEY FOR TORNADO REPAIRS
                    case TV         :   // MONEY CORRUPTS TV
                    case UFO        :   // MONEY DOESN'T INTEREST UFO
                    case VAMPIRE    :   // MONEY BRIBES VAMPIRE
                    case VIDEO_GAME :   // MONEY DEVELOPS VIDEO GAME
                    case WATER      :   // MONEY FLOATS ON WATER
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BRAIN      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DEATH      :
                    case DUCK       :
                    case FIRE       :
                    case FISH       :
                    case GUN        :
                    case HOME       :
                    case KING       :
                    case LAW        :
                    case MAN        :
                    case MONKEY     :
                    case NOISE      :
                    case PEACE      :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SUN        :
                    case SWORD      :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case MONKEY:
                switch (them) {
                    case MONKEY:
                        tie();
                        break;
                    case AIR        :   // MONKEY BREATHES AIR
                    case AIRPLANE   :   // MONKEY FLIES ON AIRPLANE
                    case ALIEN      :   // MONKEY INFURIATES ALIEN
                    case BABY       :   // MONKEY SCARES BABY
                    case BEER       :   // MONKEY CHUGS BEER
                    case BICYCLE    :   // MONKEY CLIMBS ON BICYCLE
                    case BIRD       :   // MONKEY SCARES BIRD
                    case BOOK       :   // MONKEY RIPS UP BOOK
                    case BOWL       :   // MONKEY SMASHES BOWL
                    case BRAIN      :   // MONKEY HAS BRAIN
                    case BUTTER     :   // MONKEY EATS BUTTER
                    case CAR        :   // MONKEY CLIMBS ON CAR
                    case CAT        :   // MONKEY SCARES CAT
                    case CHURCH     :   // MONKEY CLIMBS CHURCH
                    case CLOUD      :   // MONKEY SHRIEKS AT CLOUD
                    case COCKROACH  :   // MONKEY EATS COCKROACH
                    case COMMUNITY  :   // MONKEY IRRITATES COMMUNITY
                    case CROSS      :   // MONKEY CLIMBS CROSS
                    case CUP        :   // MONKEY SMASHES CUP
                    case DUCK       :   // MONKEY SCARES DUCK
                    case FILM       :   // MONKEY RIPS OUT FILM
                    case FISH       :   // MONKEY EATS FISH
                    case GRASS      :   // MONKEY SITS ON GRASS
                    case GUITAR     :   // MONKEY SMASHES GUITAR
                    case HOME       :   // MONKEY CLIMBS ON HOME
                    case KING       :   // MONKEY FLINGS POOP AT KING
                    case MAN        :   // MONKEY FLINGS POOP AT MAN
                    case MONEY      :   // MONKEY SHREDS MONEY
                    case MOON       :   // MONKEY SCREECHES AT MOON
                    case NOISE      :   // MONKEY MAKES NOISE
                    case PAPER      :   // MONKEY RIPS UP PAPER
                    case PLANET     :   // MONKEY LIVES ON PLANET
                    case POLICE     :   // MONKEY FLINGS POOP AT POLICE
                    case PRINCE     :   // MONKEY FLINGS POOP AT PRINCE
                    case PRINCESS   :   // MONKEY FLINGS POOP AT PRINCESS
                    case QUEEN      :   // MONKEY FLINGS POOP AT QUEEN
                    case RAIN       :   // MONKEY DOESN'T MIND RAIN
                    case RAINBOW    :   // MONKEY GLARES AT RAINBOW
                    case SPIDER     :   // MONKEY EATS SPIDER
                    case SPONGE     :   // MONKEY RIPS UP SPONGE
                    case TOILET     :   // MONKEY GOES EVERYWHERE BUT TOILET
                    case TRAIN      :   // MONKEY CLIMBS ON TRAIN
                    case TREE       :   // MONKEY CLIMBS TREE
                    case TURNIP     :   // MONKEY EATS TURNIP
                    case TV         :   // MONKEY SMASHES TV
                    case UFO        :   // MONKEY SHRIEKS AT UFO
                    case VAMPIRE    :   // MONKEY IRRITATES VAMPIRE
                    case WATER      :   // MONKEY DRINKS WATER
                    case WOLF       :   // MONKEY ENRAGES WOLF
                    case WOMAN      :   // MONKEY FLINGS POOP AT WOMAN
                        win();
                        break;
                    case AXE        :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case PLATINUM   :
                    case POISON     :
                    case PORCUPINE  :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case VIDEO_GAME :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case MOON:
                switch (them) {
                    case MOON:
                        tie();
                        break;
                    case AIR        :   // MOON HAS NO AIR
                    case ALIEN      :   // MOON HOUSES ALIEN
                    case BABY       :   // MOON -LIGHT WALK WITH SWEETHEART
                    case BEER       :   // MOON -SHINE STRONGER THAN BEER
                    case BOWL       :   // MOON SHAPED LIKE BOWL
                    case CHAIN      :   // MOON FAR ABOVE CHAIN
                    case CUP        :   // MOON -SHINE IN CUP
                    case DEATH      :   // MOON SYMBOLIZES DEATH
                    case DEVIL      :   // MOON TERRIFIES DEVIL
                    case DIAMOND    :   // MOON SHINES LIKE DIAMOND
                    case DRAGON     :   // MOON SHINES ON DRAGON
                    case DYNAMITE   :   // MOON SUFFOCATES DYNAMITE
                    case ELECTRICITY:   // MOON HAS NO ELECTRICITY
                    case FENCE      :   // MOON FAR ABOVE FENCE
                    case FILM       :   // MOON IN FILM
                    case GOLD       :   // MOON COLORED GOLD
                    case GRASS      :   // MOON HAS NO GRASS
                    case GUITAR     :   // MOON ADORNS GUITAR
                    case GUN        :   // MOON TOO FAR FOR GUN
                    case HELICOPTER :   // MOON TOO FAR FOR HELICOPTER
                    case LASER      :   // MOON TOO FAR FOR LASER
                    case LAW        :   // MOON HAS NO LAWS
                    case LIGHTNING  :   // MOON FAR ABOVE LIGHTNING
                    case MATH       :   // MOON LANDER USES MATH
                    case MEDUSA     :   // MOON FAR ABOVE MEDUSA
                    case MOUNTAIN   :   // MOON FAR ABOVE MOUNTAIN
                    case NUKE       :   // MOON TOO FAR FOR NUKE
                    case PIT        :   // MOON CRATER PIT
                    case PLANET     :   // MOON ORBITS PLANET
                    case PLATINUM   :   // MOON COLORED PLATINUM
                    case POWER      :   // MOON VISIT USES POWER
                    case PRAYER     :   // MOON SHINES ON PRAYER
                    case QUICKSAND  :   // MOON FAR ABOVE QUICKSAND
                    case RAIN       :   // MOON FAR ABOVE RAIN
                    case RAINBOW    :   // MOON FAR ABOVE RAINBOW
                    case ROBOT      :   // MOON LANDER USES ROBOTICS
                    case ROCK       :   // MOON IS GIANT ROCK
                    case SATAN      :   // MOON CONFUSES SATAN
                    case SKY        :   // MOON ADORNS SKY
                    case SUN        :   // MOON ECLIPSES SUN
                    case SWORD      :   // MOON ADORNS SWORD
                    case TANK       :   // MOON FAR ABOVE TANK
                    case TOILET     :   // MOON HAS NO TOILET
                    case TORNADO    :   // MOON FAR ABOVE TORNADO
                    case TV         :   // MOON ON TV
                    case UFO        :   // MOON HOUSES UFO
                    case VIDEO_GAME :   // MOON PATROL VIDEO GAME
                    case WALL       :   // MOON FAR ABOVE WALL
                    case WATER      :   // MOON HAS NO WATER
                    case WHIP       :   // MOON FAR ABOVE WHIP
                        win();
                        break;
                    case AIRPLANE   :
                    case AXE        :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BOOK       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAINSAW   :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DUCK       :
                    case FIRE       :
                    case FISH       :
                    case HEART      :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case NOISE      :
                    case PAPER      :
                    case PEACE      :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case MOUNTAIN:
                switch (them) {
                    case MOUNTAIN:
                        tie();
                        break;
                    case AXE        :   // MOUNTAIN SURVIVES AXE
                    case BLOOD      :   // MOUNTAIN OUTLASTS BLOOD
                    case CAGE       :   // MOUNTAIN OUTLASTS CAGE
                    case CAMERA     :   // MOUNTAIN CHALLENGES CAMERA
                    case CASTLE     :   // MOUNTAIN TALLER THAN CASTLE
                    case CHAIN      :   // MOUNTAIN CAN'T BE CHAINED
                    case CHAINSAW   :   // MOUNTAIN SURVIVES CHAINSAW
                    case COMPUTER   :   // MOUNTAIN OUTLASTS COMPUTER
                    case DEATH      :   // MOUNTAIN TRANSCENDS DEATH
                    case DEVIL      :   // MOUNTAIN HOUSES DEVIL
                    case DIAMOND    :   // MOUNTAIN CONTAINS DIAMOND
                    case DRAGON     :   // MOUNTAIN HOUSES DRAGON
                    case DYNAMITE   :   // MOUNTAIN SURVIVES DYNAMITE
                    case ELECTRICITY:   // MOUNTAIN CONDUCTS ELECTRICITY
                    case FENCE      :   // MOUNTAIN TALLER THAN FENCE
                    case FIRE       :   // MOUNTAIN SURVIVES FIRE
                    case GOLD       :   // MOUNTAIN CONTAINS GOLD
                    case GUN        :   // MOUNTAIN ECHOES GUN
                    case HEART      :   // MOUNTAIN STIMULATES HEART
                    case HELICOPTER :   // MOUNTAIN TOO HIGH FOR HELICOPTER
                    case KING       :   // MOUNTAIN CHALLENGES OLD KING
                    case LASER      :   // MOUNTAIN TOO BIG FOR LASER
                    case LAW        :   // MOUNTAIN OUTLASTS LAW
                    case LIGHTNING  :   // MOUNTAIN ATTRACTS LIGHTNING
                    case MATH       :   // MOUNTAIN HEIGHT MATH
                    case MEDUSA     :   // MOUNTAIN HOUSES MEDUSA
                    case MONKEY     :   // MOUNTAIN HOUSES MONKEY
                    case NUKE       :   // MOUNTAIN SURVIVES NUKE
                    case PEACE      :   // MOUNTAIN STANDS IN PEACE
                    case PIT        :   // MOUNTAIN HIDES PIT
                    case PLATINUM   :   // MOUNTAIN CONTAINS PLATINUM
                    case POISON     :   // MOUNTAIN UNAFFECTED BY POISON
                    case PORCUPINE  :   // MOUNTAIN HOUSES PORCUPINE
                    case POWER      :   // MOUNTAIN REPRESENTS POWER
                    case QUICKSAND  :   // MOUNTAIN CONTAINS QUICKSAND
                    case ROBOT      :   // MOUNTAIN TOO ROUGH FOR ROBOT
                    case ROCK       :   // MOUNTAIN MADE OF ROCK
                    case SATAN      :   // MOUNTAIN HOUSES SATAN
                    case SCHOOL     :   // MOUNTAIN RISES ABOVE SCHOOL
                    case SCISSORS   :   // MOUNTAIN UNAFFECTED BY SCISSORS
                    case SKY        :   // MOUNTAIN FILLS SKY
                    case SNAKE      :   // MOUNTAIN HOUSES SNAKE
                    case SUN        :   // MOUNTAIN BLOCKS SUN
                    case SWORD      :   // MOUNTAIN UNAFFECTED BY SWORD
                    case TANK       :   // MOUNTAIN TOO STEEP FOR TANK
                    case TORNADO    :   // MOUNTAIN BIGGER THAN TORNADO
                    case VIDEO_GAME :   // MOUNTAIN OUTLASTS VIDEO GAME
                    case VULTURE    :   // MOUNTAIN HOUSES VULTURE
                    case WALL       :   // MOUNTAIN FORMS WALL
                    case WHIP       :   // MOUNTAIN ECHOES WHIP
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BABY       :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case MAN        :
                    case MONEY      :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case POLICE     :
                    case PRAYER     :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case RAIN       :
                    case RAINBOW    :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case WATER      :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case NOISE:
                switch (them) {
                    case NOISE:
                        tie();
                        break;
                    case AIR        :   // NOISE PERMEATES AIR
                    case AIRPLANE   :   // NOISE DISRUPTS AIRPLANE
                    case ALIEN      :   // NOISE ATTRACTS ALIEN
                    case BEER       :   // NOISE INSPIRES BEER
                    case BICYCLE    :   // NOISE KNOCKS OVER BICYCLE
                    case BIRD       :   // NOISE SCARES BIRD
                    case BOOK       :   // NOISE RUINS BOOK
                    case BOWL       :   // NOISE THROUGH BOWL
                    case BRAIN      :   // NOISE STIMULATES BRAIN
                    case BUTTER     :   // NOISE MELTS BUTTER
                    case CAT        :   // NOISE SCARES CAT
                    case CHURCH     :   // NOISE DISRUPTS CHURCH
                    case CLOUD      :   // NOISE HEARD THROUGH CLOUD
                    case COCKROACH  :   // NOISE KILLS COCKROACH
                    case COMMUNITY  :   // NOISE ANNOYS COMMUNITY
                    case CROSS      :   // NOISE MAKES YOU CROSS
                    case CUP        :   // NOISE THROUGH CUP
                    case DEVIL      :   // NOISE LOUDER THAN DEVIL
                    case DIAMOND    :   // NOISE LOCATES DIAMOND
                    case DRAGON     :   // NOISE ATTRACTS DRAGON
                    case DUCK       :   // NOISE SCARES DUCK
                    case FENCE      :   // NOISE HEARD OVER FENCE
                    case FILM       :   // NOISE TRACK IN FILM
                    case FISH       :   // NOISE LOCATES FISH
                    case GOLD       :   // NOISE LOCATES GOLD
                    case GRASS      :   // NOISE IN GRASS
                    case GUITAR     :   // NOISE AMPLIFIED GUITAR
                    case MATH       :   // NOISE WAVE MATH
                    case MONEY      :   // NOISE FINE COSTS MONEY
                    case MOON       :   // NOISE TRAVELS TO MOON
                    case MOUNTAIN   :   // NOISE ECHOES ACROSS MOUNTAIN
                    case PAPER      :   // NOISE HEARD THROUGH PAPER
                    case PLANET     :   // NOISE HEARD ACROSS PLANET
                    case PLATINUM   :   // NOISE LOCATES PLATINUM
                    case PRAYER     :   // NOISE DISRUPTS PRAYER
                    case RAIN       :   // NOISE HEARD IN RAIN
                    case RAINBOW    :   // NOISE SPECTRUM RAINBOW
                    case ROBOT      :   // NOISE NAVIGATES ROBOT
                    case SATAN      :   // NOISE SUMMONS SATAN
                    case SPIDER     :   // NOISE ATTRACTS SPIDER
                    case SPONGE     :   // NOISE ENVELOPS SPONGE
                    case TOILET     :   // NOISE OF BROKEN TOILET
                    case TREE       :   // NOISE IN TREE
                    case TURNIP     :   // NOISE LOCATES TURNIP
                    case TV         :   // NOISE ON TV
                    case UFO        :   // NOISE ATTRACTS UFO
                    case VAMPIRE    :   // NOISE ANNOYS VAMPIRE
                    case VIDEO_GAME :   // NOISE IN VIDEO GAME
                    case WATER      :   // NOISE ACROSS WATER
                    case WOLF       :   // NOISE SCARES WOLF
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FIRE       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case HOME       :
                    case KING       :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MAN        :
                    case MEDUSA     :
                    case MONKEY     :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case POWER      :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TRAIN      :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case NUKE:
                switch (them) {
                    case NUKE:
                        tie();
                        break;
                    case AXE        :   // NUKE INCINERATES AXE
                    case BABY       :   // NUKE INCINERATES BABY
                    case BICYCLE    :   // NUKE INCINERATES BICYCLE
                    case BLOOD      :   // NUKE INCINERATES BLOOD
                    case CAGE       :   // NUKE INCINERATES CAGE
                    case CAMERA     :   // NUKE INCINERATES CAMERA
                    case CAR        :   // NUKE INCINERATES CAR
                    case CASTLE     :   // NUKE INCINERATES CASTLE
                    case CAT        :   // NUKE INCINERATES CAT
                    case CHAIN      :   // NUKE STARTS CHAIN REACTION
                    case CHAINSAW   :   // NUKE INCINERATES CHAINSAW
                    case COMPUTER   :   // NUKE INCINERATES COMPUTER
                    case DEATH      :   // NUKE CAUSES DEATH
                    case DUCK       :   // NUKE INCINERATES DUCK
                    case DYNAMITE   :   // NUKE OUTCLASSES DYNAMITE
                    case FIRE       :   // NUKE STARTS FIRE
                    case GUN        :   // NUKE OUTCLASSES GUN
                    case HELICOPTER :   // NUKE INCINERATES HELICOPTER
                    case HOME       :   // NUKE INCINERATES HOME
                    case KING       :   // NUKE INCINERATES KING
                    case LAW        :   // NUKE BREAKS LAW
                    case MAN        :   // NUKE INCINERATES MAN
                    case MONKEY     :   // NUKE INCINERATES MONKEY
                    case NOISE      :   // NUKE MAKES NOISE
                    case PEACE      :   // NUKE BREAKS PEACE
                    case PIT        :   // NUKE EMERGES FROM PIT
                    case POISON     :   // NUKE INCINERATES POISON
                    case POLICE     :   // NUKE INCINERATES POLICE
                    case PORCUPINE  :   // NUKE INCINERATES PORCUPINE
                    case PRINCE     :   // NUKE INCINERATES PRINCE
                    case PRINCESS   :   // NUKE INCINERATES PRINCESS
                    case QUEEN      :   // NUKE INCINERATES QUEEN
                    case QUICKSAND  :   // NUKE INCINERATES QUICKSAND
                    case ROCK       :   // NUKE INCINERATES ROCK
                    case SCHOOL     :   // NUKE INCINERATES SCHOOL
                    case SCISSORS   :   // NUKE INCINERATES SCISSORS
                    case SKY        :   // NUKE POISONS SKY
                    case SNAKE      :   // NUKE INCINERATES SNAKE
                    case SUN        :   // NUKE HAS POWER OF SUN
                    case SWORD      :   // NUKE INCINERATES SWORD
                    case TANK       :   // NUKE INCINERATES TANK
                    case TORNADO    :   // NUKE OUTCLASSES TORNADO
                    case TRAIN      :   // NUKE INCINERATES TRAIN
                    case TREE       :   // NUKE INCINERATES TREE
                    case TURNIP     :   // NUKE INCINERATES TURNIP
                    case VULTURE    :   // NUKE INCINERATES VULTURE
                    case WALL       :   // NUKE INCINERATES WALL
                    case WHIP       :   // NUKE INCINERATES WHIP
                    case WOLF       :   // NUKE INCINERATES WOLF
                    case WOMAN      :   // NUKE INCINERATES WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case FISH       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HEART      :
                    case LASER      :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case PAPER:
                switch (them) {
                    case PAPER:
                        tie();
                        break;
                    case AIR        :   // PAPER FANS AIR
                    case AIRPLANE   :   // PAPER AIRPLANE
                    case ALIEN      :   // PAPER DISPROVES ALIEN
                    case BEER       :   // PAPER BEER LABEL
                    case BOWL       :   // PAPER MACHE BOWL
                    case CHAIN      :   // PAPER STARTS CHAIN REACTION
                    case CLOUD      :   // PAPER FANS CLOUD
                    case CUP        :   // PAPER CUP
                    case DEVIL      :   // PAPER REBUKES DEVIL
                    case DIAMOND    :   // PAPER RECEIPT FOR DIAMOND
                    case DRAGON     :   // PAPER REBUKES DRAGON
                    case DYNAMITE   :   // PAPER ENCASES DYNAMITE
                    case ELECTRICITY:   // PAPER DEFINES ELECTRICITY
                    case FENCE      :   // PAPER THROWN OVER FENCE
                    case FILM       :   // PAPER REVIEWS FILM
                    case GOLD       :   // PAPER NOTE FOR GOLD
                    case GRASS      :   // PAPER COVERS GRASS
                    case GUITAR     :   // PAPER WRAPS GUITAR
                    case GUN        :   // PAPER OUTLAWS GUN
                    case HEART      :   // PAPER CUTOUT OF HEART
                    case HELICOPTER :   // PAPER ABOUT HELICOPTERS
                    case LASER      :   // PAPER DEFINES LASER
                    case LAW        :   // PAPER EXPLAINS LAW
                    case LIGHTNING  :   // PAPER DEFINES LIGHTNING
                    case MATH       :   // PAPER TESTS MATH
                    case MEDUSA     :   // PAPER ABOUT MEDUSA
                    case MOON       :   // PAPER MOON
                    case MOUNTAIN   :   // PAPER PILE MOUNTAIN
                    case NUKE       :   // PAPER DEFINES NUKE
                    case PIT        :   // PAPER COVERS PIT
                    case PLANET     :   // PAPER ABOUT PLANETS
                    case PLATINUM   :   // PAPER NOTE FOR PLATINUM
                    case POWER      :   // PAPER ABOUT POWER
                    case PRAYER     :   // PAPER CONTAINS PRAYER
                    case QUICKSAND  :   // PAPER FLOATS ON QUICKSAND
                    case RAIN       :   // PAPER BLOCKS RAIN
                    case RAINBOW    :   // PAPER CUTOUT OF RAINBOW
                    case ROBOT      :   // PAPER DESCRIBES ROBOT
                    case ROCK       :   // PAPER COVERS ROCK
                    case SATAN      :   // PAPER REBUKES SATAN
                    case SKY        :   // PAPER CONFETTI FILLS SKY
                    case SWORD      :   // PAPER WRAPS SWORD
                    case TANK       :   // PAPER ABOUT TANKS
                    case TOILET     :   // PAPER TOILET COVER
                    case TORNADO    :   // PAPER PREDICTS TORNADO
                    case TV         :   // PAPER MORE INFO THAN TV
                    case UFO        :   // PAPER DISPROVES UFO
                    case VIDEO_GAME :   // PAPER LABEL FOR VIDEO GAME
                    case WATER      :   // PAPER FLOATS ON WATER
                    case WHIP       :   // PAPER WRAPS WHIP
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BOOK       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAINSAW   :
                    case CHURCH     :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DEATH      :
                    case DUCK       :
                    case FIRE       :
                    case FISH       :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case NOISE      :
                    case PEACE      :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case SUN        :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WALL       :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case PEACE:
                switch (them) {
                    case PEACE:
                        tie();
                        break;
                    case AIR        :   // PEACE CLEANS AIR
                    case AIRPLANE   :   // PEACE PROTECTS AIRPLANE
                    case BABY       :   // PEACE PROTECTS BABY
                    case BICYCLE    :   // PEACE PROTECTS BICYCLE
                    case BIRD       :   // PEACE PROTECTS BIRD
                    case BLOOD      :   // PEACE SPILLS NO BLOOD
                    case BOOK       :   // PEACE INSPIRES BOOK
                    case BOWL       :   // PEACE CLEANS BOWL
                    case BRAIN      :   // PEACE OF MIND (BRAIN)
                    case BUTTER     :   // PEACE PURIFIES BUTTER
                    case CAR        :   // PEACE PROTECTS CAR
                    case CASTLE     :   // PEACE PROTECTS CASTLE
                    case CAT        :   // PEACE PROTECTS CAT
                    case CHURCH     :   // PEACE BE WITH YOU IN CHURCH
                    case CLOUD      :   // PEACE CLEARS CLOUD
                    case COCKROACH  :   // PEACE PROTECTS COCKROACH
                    case COMMUNITY  :   // PEACE PROTECTS COMMUNITY
                    case COMPUTER   :   // PEACE CLEANS UP COMPUTER
                    case CROSS      :   // PEACE BE WITH YOU ON CROSS
                    case CUP        :   // PEACE CLEANS CUP
                    case DUCK       :   // PEACE PROTECTS DUCK
                    case FILM       :   // PEACE ALLOWS FILM
                    case FISH       :   // PEACE PROTECTS FISH
                    case GRASS      :   // PEACE PROTECTS GRASS
                    case GUITAR     :   // PEACE INSPIRES GUITAR
                    case HOME       :   // PEACE PROTECTS HOME
                    case KING       :   // PEACE COMFORTS KING
                    case MAN        :   // PEACE COMFORTS MAN
                    case MONEY      :   // PEACE SAVES MONEY
                    case MONKEY     :   // PEACE PROTECTS MONKEY
                    case MOON       :   // PEACE BY MOONLIGHT
                    case NOISE      :   // PEACE WITHOUT NOISE
                    case PAPER      :   // PEACE INSPIRES PAPER
                    case PLANET     :   // PEACE SAVES PLANET
                    case POLICE     :   // PEACE KEEPING POLICE
                    case PORCUPINE  :   // PEACE PROTECTS PORCUPINE
                    case PRINCE     :   // PEACE COMFORTS PRINCE
                    case PRINCESS   :   // PEACE COMFORTS PRINCESS
                    case QUEEN      :   // PEACE COMFORTS QUEEN
                    case SNAKE      :   // PEACE PROTECTS SNAKE
                    case SPIDER     :   // PEACE PROTECTS SPIDER
                    case SPONGE     :   // PEACE CLEANSES LIKE SPONGE
                    case TOILET     :   // PEACE CLEANS TOILET
                    case TRAIN      :   // PEACE PROTECTS TRAIN
                    case TREE       :   // PEACE CHOPS DOWN TREE
                    case TURNIP     :   // PEACE NURTURES TURNIP
                    case VAMPIRE    :   // PEACE BORES VAMPIRE
                    case VULTURE    :   // PEACE PROTECTS VULTURE
                    case WOLF       :   // PEACE PROTECTS WOLF
                    case WOMAN      :   // PEACE COMFORTS WOMAN
                        win();
                        break;
                    case ALIEN      :
                    case AXE        :
                    case BEER       :
                    case CAGE       :
                    case CAMERA     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PIT        :
                    case PLATINUM   :
                    case POISON     :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WALL       :
                    case WATER      :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case PIT:
                switch (them) {
                    case PIT:
                        tie();
                        break;
                    case AXE        :   // PIT SWALLOWS AXE
                    case BABY       :   // PIT SWALLOWS BABY
                    case BICYCLE    :   // PIT SWALLOWS BICYCLE
                    case BIRD       :   // PIT SWALLOWS BIRD (NEST)
                    case BLOOD      :   // PIT CONTAINS BLOOD
                    case BRAIN      :   // PIT SWALLOWS BRAIN
                    case CAGE       :   // PIT BECOMES CAGE
                    case CAMERA     :   // PIT SWALLOWS CAMERA
                    case CAR        :   // PIT SWALLOWS CAR
                    case CASTLE     :   // PIT PROTECTS CASTLE
                    case CAT        :   // PIT SWALLOWS CAT
                    case CHAIN      :   // PIT SWALLOWS CHAIN
                    case CHAINSAW   :   // PIT SWALLOWS CHAINSAW
                    case COCKROACH  :   // PIT HOUSES COCKROACH
                    case COMMUNITY  :   // PIT THREATENS COMMUNITY
                    case COMPUTER   :   // PIT SWALLOWS COMPUTER
                    case CROSS      :   // PIT SWALLOWS CROSS
                    case DEATH      :   // PIT CAUSES DEATH
                    case DUCK       :   // PIT SWALLOWS DUCK
                    case FIRE       :   // PIT CONTAINS FIRE
                    case FISH       :   // PIT CONTAINS FISH
                    case GUN        :   // PIT SWALLOWS GUN
                    case HOME       :   // PIT WRECKS HOME
                    case KING       :   // PIT SWALLOWS KING
                    case LAW        :   // PIT KNOWS NO LAW
                    case MAN        :   // PIT SWALLOWS MAN
                    case MONKEY     :   // PIT SWALLOWS MONKEY
                    case NOISE      :   // PIT ECHOES NOISE
                    case PEACE      :   // PIT DISTURBS PEACE
                    case POISON     :   // PIT ENGULFS POISON
                    case POLICE     :   // PIT SWALLOWS POLICE
                    case PORCUPINE  :   // PIT SWALLOWS PORCUPINE
                    case PRINCE     :   // PIT SWALLOWS PRINCE
                    case PRINCESS   :   // PIT SWALLOWS PRINCESS
                    case QUEEN      :   // PIT SWALLOWS QUEEN
                    case ROCK       :   // PIT SWALLOWS ROCK
                    case SCHOOL     :   // PIT ENDANGERS SCHOOL
                    case SCISSORS   :   // PIT SWALLOWS SCISSORS
                    case SNAKE      :   // PIT SWALLOWS SNAKE
                    case SPIDER     :   // PIT HOUSES SPIDER
                    case SUN        :   // PIT REMOVES SUN
                    case SWORD      :   // PIT SWALLOWS SWORD
                    case TRAIN      :   // PIT WRECKS TRAIN
                    case TREE       :   // PIT PREVENTS TREE (GROWTH)
                    case TURNIP     :   // PIT SWALLOWS TURNIP
                    case VULTURE    :   // PIT SWALLOWS VULTURE
                    case WALL       :   // PIT PROTECTS WALL
                    case WHIP       :   // PIT TOO DEEP FOR WHIP
                    case WOLF       :   // PIT SWALLOWS WOLF
                    case WOMAN      :   // PIT SWALLOWS WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BOOK       :
                    case BOWL       :
                    case BUTTER     :
                    case CHURCH     :
                    case CLOUD      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SKY        :
                    case SPONGE     :
                    case TANK       :
                    case TOILET     :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case PLANET:
                switch (them) {
                    case PLANET:
                        tie();
                        break;
                    case ALIEN      :   // PLANET HOUSES ALIEN
                    case BEER       :   // PLANET DRINKS BEER
                    case BOWL       :   // PLANET DECORATES BOWL
                    case CAMERA     :   // PLANET TOO BIG FOR CAMERA
                    case CHAIN      :   // PLANET SUPPORTS FOOD CHAIN
                    case CHAINSAW   :   // PLANET SURVIVES CHAINSAW
                    case CUP        :   // PLANET DECORATES CUP
                    case DEATH      :   // PLANET RENEWS DEATH
                    case DEVIL      :   // PLANET REBUKES DEVIL
                    case DIAMOND    :   // PLANET CREATES DIAMOND
                    case DRAGON     :   // PLANET REBUKES DRAGON
                    case DYNAMITE   :   // PLANET SURVIVES DYNAMITE
                    case ELECTRICITY:   // PLANET CONDUCTS ELECTRICITY
                    case FENCE      :   // PLANET BUILDS FENCES
                    case FIRE       :   // PLANET MANTLE CONTAINS FIRE
                    case GOLD       :   // PLANET CREATES GOLD
                    case GUITAR     :   // PLANET REVERES GUITAR
                    case GUN        :   // PLANET SURVIVES GUN
                    case HEART      :   // PLANET HAS HEARTLAND
                    case HELICOPTER :   // PLANET SURVIVES HELICOPTER
                    case LASER      :   // PLANET SURVIVES LASER
                    case LAW        :   // PLANET ABOVE OUR LAWS
                    case LIGHTNING  :   // PLANET SUPPORTS LIGHTNING
                    case MATH       :   // PLANET ORBIT USES MATH
                    case MEDUSA     :   // PLANET REBUKES MEDUSA
                    case MOUNTAIN   :   // PLANET SUPPORTS MOUNTAIN
                    case NUKE       :   // PLANET SURVIVES NUKE
                    case PIT        :   // PLANET CRATER IS PIT
                    case PLATINUM   :   // PLANET CREATES PLATINUM
                    case POWER      :   // PLANET HAS UNTOLD POWER
                    case PRAYER     :   // PLANET IN PRAYER
                    case QUICKSAND  :   // PLANET SUPPORTS QUICKSAND
                    case RAIN       :   // PLANET DEVELOPS RAIN
                    case RAINBOW    :   // PLANET DIVERSE AS RAINBOW
                    case ROBOT      :   // PLANET USES ROBOTS
                    case ROCK       :   // PLANET SUPPORTS ROCK
                    case SATAN      :   // PLANET REBUKES SATAN
                    case SCHOOL     :   // PLANET GOES TO SCHOOL
                    case SCISSORS   :   // PLANET USES SCISSORS
                    case SKY        :   // PLANET SUPPORTS SKY
                    case SUN        :   // PLANET ORBITS SUN
                    case SWORD      :   // PLANET SURVIVES SWORD
                    case TANK       :   // PLANET SURVIVES TANK
                    case TORNADO    :   // PLANET SUPPORTS TORNADO
                    case TV         :   // PLANET WATCHES TV
                    case UFO        :   // PLANET HOUSES UFO
                    case VIDEO_GAME :   // PLANET PLAYS VIDEO GAMES
                    case WALL       :   // PLANET SUPPORTS WALL
                    case WATER      :   // PLANET SUPPORTS WATER
                    case WHIP       :   // PLANET WHIPS ABOUND AXIS
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BOOK       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAGE       :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PEACE      :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case PLATINUM:
                switch (them) {
                    case PLATINUM:
                        tie();
                        break;
                    case AXE        :   // PLATINUM DECORATES AXE
                    case BLOOD      :   // PLATINUM OUTLASTS BLOOD
                    case CAGE       :   // PLATINUM COATED CAGE
                    case CAMERA     :   // PLATINUM PRICIER THAN CAMERA
                    case CASTLE     :   // PLATINUM FUNDS CASTLE
                    case CHAIN      :   // PLATINUM CHAIN
                    case CHAINSAW   :   // PLATINUM RESISTS CHAINSAW
                    case COMPUTER   :   // PLATINUM WIRED COMPUTER
                    case DEATH      :   // PLATINUM OUTLASTS DEATH
                    case DEVIL      :   // PLATINUM TEMPTS DEVIL
                    case DYNAMITE   :   // PLATINUM SURVIVES DYNAMITE
                    case ELECTRICITY:   // PLATINUM CONDUCTS ELECTRICITY
                    case FENCE      :   // PLATINUM FUNDS FENCE
                    case FIRE       :   // PLATINUM RESISTS FIRE
                    case GOLD       :   // PLATINUM PRICIER THAN GOLD
                    case GUN        :   // PLATINUM DECORATES GUN
                    case HEART      :   // PLATINUM WINS HEART
                    case HELICOPTER :   // PLATINUM DECORATES HELICOPTER
                    case KING       :   // PLATINUM ADORNS KING'S CROWN
                    case LASER      :   // PLATINUM WIRED LASER
                    case LAW        :   // PLATINUM BRIBES LAWMAN
                    case LIGHTNING  :   // PLATINUM CONDUCTS LIGHTNING
                    case MATH       :   // PLATINUM MARKET USES MATH
                    case MEDUSA     :   // PLATINUM ENTHRALLS MEDUSA
                    case MONKEY     :   // PLATINUM HYPNOTIZES MONKEY
                    case NUKE       :   // PLATINUM WIRED NUKE
                    case PEACE      :   // PLATINUM DISTURBS PEACE
                    case PIT        :   // PLATINUM HIDES IN PIT
                    case POISON     :   // PLATINUM RESISTS POISON
                    case POLICE     :   // PLATINUM BADGED POLICE
                    case PORCUPINE  :   // PLATINUM HARDER THAN PORCUPINE
                    case POWER      :   // PLATINUM CONDUCTS POWER
                    case PRINCE     :   // PLATINUM ADORNS PRINCE'S CROWN
                    case PRINCESS   :   // PLATINUM ADORNS PRINCESS' CROWN
                    case QUEEN      :   // PLATINUM ADORNS QUEEN'S CROWN
                    case QUICKSAND  :   // PLATINUM HIDES IN QUICKSAND
                    case ROBOT      :   // PLATINUM WIRED ROBOT
                    case ROCK       :   // PLATINUM RARER THAN ROCK
                    case SCHOOL     :   // PLATINUM MORE DESIRABLE THAN SCHOOL
                    case SCISSORS   :   // PLATINUM COATED SCISSORS
                    case SKY        :   // PLATINUM REFLECTS SKY
                    case SNAKE      :   // PLATINUM CHARMS SNAKE
                    case SUN        :   // PLATINUM REFLECTS SUN
                    case SWORD      :   // PLATINUM DECORATES SWORD
                    case TANK       :   // PLATINUM WIRED TANK
                    case TORNADO    :   // PLATINUM SURVIVES TORNADO
                    case VIDEO_GAME :   // PLATINUM PRICIER THAN VIDEO GAME
                    case VULTURE    :   // PLATINUM ATTRACTS VULTURE
                    case WALL       :   // PLATINUM DECORATES WALL
                    case WHIP       :   // PLATINUM RESISTS WHIP
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BABY       :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DIAMOND    :
                    case DRAGON     :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case MAN        :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case WATER      :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case POISON:
                switch (them) {
                    case POISON:
                        tie();
                        break;
                    case AIR        :   // POISON CAN BE AIRBORNE
                    case AIRPLANE   :   // POISON ENDANGERS AIRPLANE
                    case AXE        :   // POISON ON AXE
                    case BABY       :   // POISON KILLS BABY
                    case BICYCLE    :   // POISON KILLS BICYCLE
                    case BIRD       :   // POISON KILLS BIRD
                    case BLOOD      :   // POISON TARGETS BLOOD
                    case BOOK       :   // POISON IN BOOK
                    case BRAIN      :   // POISON KILLS BRAIN
                    case BUTTER     :   // POISON IN BUTTER
                    case CAGE       :   // POISON FASTER THAN CAGE
                    case CAR        :   // POISON IMPAIRS CAR USE
                    case CASTLE     :   // POISON ENDANGERS CASTLE
                    case CAT        :   // POISON KILLS CAT
                    case CHURCH     :   // POISON ENDANGERS CHURCH
                    case CLOUD      :   // POISON IN ACID RAIN CLOUD
                    case COCKROACH  :   // POISON KILLS COCKROACH
                    case COMMUNITY  :   // POISON ENDANGERS COMMUNITY
                    case COMPUTER   :   // POISON SHORT-CIRCUITS COMPUTER
                    case CROSS      :   // POISON BRINGS RED CROSS
                    case DUCK       :   // POISON KILLS DUCK
                    case FILM       :   // POISON INSPIRES FILM
                    case FISH       :   // POISON KILLS FISH
                    case GRASS      :   // POISON KILLS GRASS
                    case HOME       :   // POISON ENDANGERS HOME
                    case KING       :   // POISON KILLS KING
                    case MAN        :   // POISON KILLS MAN
                    case MONEY      :   // POISON COSTS MONEY
                    case MONKEY     :   // POISON KILLS MONKEY
                    case MOON       :   // POISON BY MOONLIGHT
                    case NOISE      :   // POISON MAKES NO NOISE
                    case PAPER      :   // POISON SOAKS PAPER
                    case PEACE      :   // POISON RUINS PEACE
                    case PLANET     :   // POISON ENDANGERS PLANET
                    case POLICE     :   // POISON KILLS POLICE
                    case PORCUPINE  :   // POISON KILLS PORCUPINE
                    case PRINCE     :   // POISON KILLS PRINCE
                    case PRINCESS   :   // POISON KILLS PRINCESS
                    case QUEEN      :   // POISON KILLS QUEEN
                    case SNAKE      :   // POISON KILLS SNAKE
                    case SPIDER     :   // POISON KILLS SPIDER
                    case SPONGE     :   // POISON IN SPONGE
                    case TOILET     :   // POISON ON TOILET
                    case TRAIN      :   // POISON ENDANGERS TRAIN
                    case TREE       :   // POISON KILLS TREE
                    case TURNIP     :   // POISON IN TURNIP
                    case VAMPIRE    :   // POISON KNOCKS OUT VAMPIRE
                    case VULTURE    :   // POISON KILLS VULTURE
                    case WOLF       :   // POISON KILLS WOLF
                    case WOMAN      :   // POISON KILLS WOMAN
                        win();
                        break;
                    case ALIEN      :
                    case BEER       :
                    case BOWL       :
                    case CAMERA     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case CUP        :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUITAR     :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PIT        :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WALL       :
                    case WATER      :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case POLICE:
                switch (them) {
                    case POLICE:
                        tie();
                        break;
                    case AIR        :   // POLICE BREATHES AIR
                    case AIRPLANE   :   // POLICE FLIES ON AIRPLANE
                    case ALIEN      :   // POLICE DISBELIEVES ALIEN
                    case BABY       :   // POLICE SAVES BABY
                    case BEER       :   // POLICE DRINKS BEER
                    case BICYCLE    :   // POLICE RECOVERS BICYCLE
                    case BIRD       :   // POLICE EATS BIRD
                    case BOOK       :   // POLICE BOOKS 'EM
                    case BOWL       :   // POLICE EATS FROM BOWL
                    case BRAIN      :   // POLICE HAS BRAIN
                    case BUTTER     :   // POLICE EATS BUTTER
                    case CAR        :   // POLICE IMPOUNDS CAR
                    case CAT        :   // POLICE SAVES CAT
                    case CHURCH     :   // POLICE PATROLS CHURCH
                    case CLOUD      :   // POLICE LOOKS AT CLOUD
                    case COCKROACH  :   // POLICE STEPS ON COCKROACH
                    case COMMUNITY  :   // POLICE PROTECTS COMMUNITY
                    case CROSS      :   // POLICE ACTS CROSS
                    case CUP        :   // POLICE DRINKS FROM CUP
                    case DIAMOND    :   // POLICE RECOVERS DIAMOND
                    case DRAGON     :   // POLICE DISBELIEVES IN DRAGON
                    case DUCK       :   // POLICE EATS DUCK
                    case FILM       :   // POLICE INSPIRES FILM
                    case FISH       :   // POLICE EATS FISH
                    case GRASS      :   // POLICE WALKS ON GRASS
                    case GUITAR     :   // POLICE RECOVERS GUITAR
                    case HOME       :   // POLICE PROTECTS HOME
                    case MAN        :   // POLICE ARRESTS MAN
                    case MONEY      :   // POLICE RECOVERS MONEY
                    case MOON       :   // POLICE LOOKS AT MOON
                    case MOUNTAIN   :   // POLICE CLIMBS MOUNTAIN
                    case NOISE      :   // POLICE ARRESTS NOISEMAKER
                    case PAPER      :   // POLICE FILES PAPERWORK
                    case PLANET     :   // POLICE LIVES ON PLANET
                    case PRAYER     :   // POLICE HAS A PRAYER
                    case RAIN       :   // POLICE WORKS IN RAIN
                    case RAINBOW    :   // POLICE LOOKS AT RAINBOW
                    case SATAN      :   // POLICE DISBELIEVES IN SATAN
                    case SPIDER     :   // POLICE STEPS ON SPIDER
                    case SPONGE     :   // POLICE CLEANS WITH SPONGE
                    case TOILET     :   // POLICE USES TOILET
                    case TRAIN      :   // POLICE COMMANDEERS TRAIN
                    case TREE       :   // POLICE CLIMBS TREE
                    case TURNIP     :   // POLICE EATS TURNIP
                    case TV         :   // POLICE ON TV
                    case UFO        :   // POLICE DISBELIEVES UFO
                    case VAMPIRE    :   // POLICE COULD BE VAMPIRE
                    case WATER      :   // POLICE DRINKS WATER
                    case WOLF       :   // POLICE TRANQUILIZES WOLF
                    case WOMAN      :   // POLICE ARRESTS WOMAN
                        win();
                        break;
                    case AXE        :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DEVIL      :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case KING       :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONKEY     :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case PLATINUM   :
                    case POISON     :
                    case PORCUPINE  :
                    case POWER      :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROBOT      :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case VIDEO_GAME :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case PORCUPINE:
                switch (them) {
                    case PORCUPINE:
                        tie();
                        break;
                    case AIR        :   // PORCUPINE BREATHES AIR
                    case AIRPLANE   :   // PORCUPINE TERRORIZES AIRPLANE
                    case BABY       :   // PORCUPINE PRICKS BABY
                    case BEER       :   // PORCUPINE SPILLS BEER
                    case BICYCLE    :   // PORCUPINE PUNCTURES BICYCLE TIRES
                    case BIRD       :   // PORCUPINE PRICKS BIRD
                    case BOOK       :   // PORCUPINE SHREDS BOOK
                    case BOWL       :   // PORCUPINE TIPS OVER BOWL
                    case BRAIN      :   // PORCUPINE HAS BRAIN
                    case BUTTER     :   // PORCUPINE LICKS BUTTER
                    case CAR        :   // PORCUPINE PUNCTURES CAR TIRES
                    case CAT        :   // PORCUPINE PRICKS CAT
                    case CHURCH     :   // PORCUPINE SCURRIES INTO CHURCH
                    case CLOUD      :   // PORCUPINE MAKES FART CLOUD
                    case COCKROACH  :   // PORCUPINE EATS COCKROACH
                    case COMMUNITY  :   // PORCUPINE ANNOYS COMMUNITY
                    case CROSS      :   // PORCUPINE MAKES YOU CROSS
                    case CUP        :   // PORCUPINE TIPS OVER CUP
                    case DUCK       :   // PORCUPINE PRICKS DUCK
                    case FILM       :   // PORCUPINE TEARS FILM
                    case FISH       :   // PORCUPINE EATS FISH
                    case GRASS      :   // PORCUPINE EATS GRASS
                    case GUITAR     :   // PORCUPINE SLEEPS IN GUITAR
                    case HOME       :   // PORCUPINE SCURRIES INTO HOME
                    case KING       :   // PORCUPINE PRICKS KING
                    case MAN        :   // PORCUPINE PRICKS MAN
                    case MONEY      :   // PORCUPINE SHREDS MONEY
                    case MONKEY     :   // PORCUPINE PRICKS MONKEY
                    case MOON       :   // PORCUPINE HUNTS BY MOON
                    case NOISE      :   // PORCUPINE MAKES NO NOISE
                    case PAPER      :   // PORCUPINE SHREDS PAPER
                    case PLANET     :   // PORCUPINE LIVES ON PLANET
                    case POLICE     :   // PORCUPINE PRICKS POLICE
                    case PRINCE     :   // PORCUPINE PRICKS PRINCE
                    case PRINCESS   :   // PORCUPINE PRICKS PRINCESS
                    case QUEEN      :   // PORCUPINE PRICKS QUEEN
                    case RAIN       :   // PORCUPINE HUNTS DESPITE RAIN
                    case RAINBOW    :   // PORCUPINE LOOKS AT RAINBOW
                    case SPIDER     :   // PORCUPINE EATS SPIDER
                    case SPONGE     :   // PORCUPINE CATCHES SPONGE
                    case TOILET     :   // PORCUPINE SCRUBS TOILET
                    case TRAIN      :   // PORCUPINE CREEPS ONTO TRAIN
                    case TREE       :   // PORCUPINE LIVES AMONG TREES
                    case TURNIP     :   // PORCUPINE EATS TURNIP
                    case TV         :   // PORCUPINE ON TV
                    case VAMPIRE    :   // PORCUPINE PRICKS VAMPIRE
                    case VULTURE    :   // PORCUPINE PRICKS VULTURE
                    case WATER      :   // PORCUPINE DRINKS WATER
                    case WOLF       :   // PORCUPINE PRICKS WOLF
                    case WOMAN      :   // PORCUPINE PRICKS WOMAN
                        win();
                        break;
                    case ALIEN      :
                    case AXE        :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case PLATINUM   :
                    case POISON     :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case UFO        :
                    case VIDEO_GAME :
                    case WALL       :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case POWER:
                switch (them) {
                    case POWER:
                        tie();
                        break;
                    case AXE        :   // POWER GIVES YOU THE AXE
                    case BABY       :   // POWER ELECTROCUTES BABY
                    case BICYCLE    :   // POWER OUTPERFORMS BICYCLE
                    case BLOOD      :   // POWER SACRIFICES BLOOD
                    case CAGE       :   // POWER IMPOSES CAGE
                    case CAMERA     :   // POWER CHARGES CAMERA
                    case CAR        :   // POWER PLANT IN CAR
                    case CASTLE     :   // POWER SEIGES CASTLE
                    case CHAIN      :   // POWER STRUGGLE FOOD CHAIN
                    case CHAINSAW   :   // POWER CLEARS WITH CHAINSAW
                    case COMPUTER   :   // POWER CRASHES COMPUTER
                    case DEATH      :   // POWER OF LIFE AND DEATH
                    case DUCK       :   // POWER COOKS DUCK
                    case DYNAMITE   :   // POWER PLANTS DYNAMITE
                    case FIRE       :   // POWER TO FIRE YOU
                    case GUN        :   // POWER PLAY WITH GUN
                    case HELICOPTER :   // POWER DEPLOYS HELICOPTER
                    case HOME       :   // POWER LIGHTS HOME
                    case KING       :   // POWER OVERTHROWS KING
                    case LASER      :   // POWER CHARGES LASER
                    case LAW        :   // POWER IMPOSES LAW
                    case MAN        :   // POWER CORRUPTS MAN
                    case MONKEY     :   // POWER FRIES MONKEY
                    case NOISE      :   // POWER MAKES NOISE
                    case NUKE       :   // POWER CHARGES NUKE
                    case PEACE      :   // POWER BREAKS PEACE
                    case PIT        :   // POWER LIGHTS PIT
                    case POISON     :   // POWER ASSISSINATES W/ POISON
                    case POLICE     :   // POWER GOVERNS POLICE
                    case PORCUPINE  :   // POWER FRIES PORCUPINE
                    case PRINCE     :   // POWER SUPPLANTS PRINCE
                    case PRINCESS   :   // POWER SUPPLANTS PRINCESS
                    case QUEEN      :   // POWER OVERTHROWS QUEEN
                    case QUICKSAND  :   // POWER CLEARS QUICKSAND
                    case ROCK       :   // POWER MOVES ROCK
                    case SCHOOL     :   // POWER SUPERINTENDS SCHOOL
                    case SCISSORS   :   // POWER CHARGES SCISSORS
                    case SKY        :   // POWER LINES CLUTTER SKY
                    case SNAKE      :   // POWER HUNGRY SNAKE
                    case SUN        :   // POWER OF SUN
                    case SWORD      :   // POWER WEILDS SWORD
                    case TANK       :   // POWER ENGAGES TANK
                    case TORNADO    :   // POWER PLANT SURVIVES TORNADO
                    case TRAIN      :   // POWER RUNS TRAIN
                    case TREE       :   // POWER CONSUMES TREES
                    case TURNIP     :   // POWER COOKS TURNIP
                    case VULTURE    :   // POWER HUNGRY VULTURE
                    case WALL       :   // POWER IN WALL
                    case WHIP       :   // POWER CRACKS WHIP
                    case WOMAN      :   // POWER CORRUPTS WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case FISH       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HEART      :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                    case WOLF       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case PRAYER:
                switch (them) {
                    case PRAYER:
                        tie();
                        break;
                    case AXE        :   // PRAYER AGAINST AXE
                    case BLOOD      :   // PRAYER CALMS BLOOD
                    case CAGE       :   // PRAYER IN CAGE
                    case CAMERA     :   // PRAYER NOT CAPTURED ON CAMERA
                    case CASTLE     :   // PRAYER IN CASTLE
                    case CHAIN      :   // PRAYER BREAKS CHAIN
                    case CHAINSAW   :   // PRAYER AGAINST CHAINSAW
                    case COMPUTER   :   // PRAYER SALVAGES COMPUTER
                    case DEATH      :   // PRAYER AGAINST DEATH
                    case DEVIL      :   // PRAYER CASTS OUT DEVIL
                    case DIAMOND    :   // PRAYER FOR DIAMOND
                    case DRAGON     :   // PRAYER SUBDUES DRAGON
                    case DYNAMITE   :   // PRAYER AGAINST DYNAMITE
                    case ELECTRICITY:   // PRAYER FOR LOW ELECTRICITY BILL
                    case FENCE      :   // PRAYER KNOWS NO FENCE
                    case FIRE       :   // PRAYER AGAINST FIRE
                    case GOLD       :   // PRAYER FOR GOLD
                    case GUN        :   // PRAYER AGAINST GUN
                    case HEART      :   // PRAYER HEALS HEART
                    case HELICOPTER :   // PRAYER AGAINST HELICOPTER
                    case LASER      :   // PRAYER MORE ACCURATE THAN LASER
                    case LAW        :   // PRAYER FOR FAIR LAW
                    case LIGHTNING  :   // PRAYER FASTER THAN LIGHTNING
                    case MATH       :   // PRAYER FOR MATH GRADE
                    case MEDUSA     :   // PRAYER DISPELS MEDUSA
                    case MONKEY     :   // PRAYER CONFUSES MONKEY
                    case MOUNTAIN   :   // PRAYER ATOP MOUNTAIN
                    case NUKE       :   // PRAYER AGAINST NUKE
                    case PEACE      :   // PRAYER BRINGS PEACE
                    case PIT        :   // PRAYER IN PIT
                    case PLATINUM   :   // PRAYER FOR PLATINUM
                    case POISON     :   // PRAYER HEALS POISON
                    case PORCUPINE  :   // PRAYER PROTECTS LIKE PORCUPINE
                    case POWER      :   // PRAYER IS SPIRITUAL POWER
                    case QUICKSAND  :   // PRAYER SOLIDIFIES QUICKSAND
                    case ROBOT      :   // PRAYER ROUTINE LIKE ROBOT
                    case ROCK       :   // PRAYER ATOP ROCK
                    case SATAN      :   // PRAYER CASTS OUT SATAN
                    case SCHOOL     :   // PRAYER STARTS SCHOOL
                    case SCISSORS   :   // PRAYER FOR STRAIGHT SCISSORS CUT
                    case SKY        :   // PRAYER TO SKY
                    case SNAKE      :   // PRAYER REBUKES SNAKE
                    case SUN        :   // PRAYER FOR SUN
                    case SWORD      :   // PRAYER AGAINST SWORD
                    case TANK       :   // PRAYER AGAINST TANK
                    case TORNADO    :   // PRAYER AGAINST TORNADO
                    case VIDEO_GAME :   // PRAYER TO WIN VIDEO GAME
                    case VULTURE    :   // PRAYER DISPELS VULTURE
                    case WALL       :   // PRAYER KNOWS NO WALL
                    case WHIP       :   // PRAYER AGAINST WHIP
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BABY       :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case POLICE     :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case RAIN       :
                    case RAINBOW    :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case WATER      :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case PRINCE:
                switch (them) {
                    case PRINCE:
                        tie();
                        break;
                    case AIR        :   // PRINCE BREATHES AIR
                    case AIRPLANE   :   // PRINCE FLIES ON AIRPLANE
                    case ALIEN      :   // PRINCE DISBELIEVES ALIEN
                    case BABY       :   // PRINCE SIRES BABY
                    case BEER       :   // PRINCE DRINKS BEER
                    case BICYCLE    :   // PRINCE RIDES BICYCLE
                    case BIRD       :   // PRINCE EATS BIRD
                    case BOOK       :   // PRINCE INSPIRES BOOK
                    case BOWL       :   // PRINCE EATS FROM BOWL
                    case BRAIN      :   // PRINCE HAS BRAIN
                    case BUTTER     :   // PRINCE EATS BUTTER
                    case CAR        :   // PRINCE RIDES IN CAR
                    case CAT        :   // PRINCE OWNS CAT
                    case CHURCH     :   // PRINCE ATTENDS CHURCH
                    case CLOUD      :   // PRINCE LOOKS AT CLOUD
                    case COCKROACH  :   // PRINCE STEPS ON COCKROACH
                    case COMMUNITY  :   // PRINCE RULES COMMUNITY
                    case CROSS      :   // PRINCE WEARS CROSS
                    case CUP        :   // PRINCE DRINKS FROM CUP
                    case DUCK       :   // PRINCE EATS DUCK
                    case FILM       :   // PRINCE INSPIRES FILM
                    case FISH       :   // PRINCE EATS FISH
                    case GRASS      :   // PRINCE WALKS ON GRASS
                    case GUITAR     :   // PRINCE PLAYS GUITAR
                    case HOME       :   // PRINCE LIVES IN HOME
                    case MAN        :   // PRINCE RULES MAN
                    case MONEY      :   // PRINCE HAS MONEY
                    case MOON       :   // PRINCE LOOKS AT MOON
                    case MOUNTAIN   :   // PRINCE CLIMBS MOUNTAIN
                    case NOISE      :   // PRINCE MAKES NOISE
                    case PAPER      :   // PRINCE WRITES PAPER
                    case PLANET     :   // PRINCE LIVES ON PLANET
                    case POLICE     :   // PRINCE GOVERNS POLICE
                    case PRAYER     :   // PRINCE IN PRAYER
                    case PRINCESS   :   // PRINCE RULES OVER PRINCESS
                    case RAIN       :   // PRINCE WALKS IN RAIN
                    case RAINBOW    :   // PRINCE LOOKS AT RAINBOW
                    case SATAN      :   // PRINCE OF DARKNESS IS SATAN
                    case SPIDER     :   // PRINCE STEPS ON SPIDER
                    case SPONGE     :   // PRINCE OWNS SPONGE
                    case TOILET     :   // PRINCE USES TOILET
                    case TRAIN      :   // PRINCE RIDES ON TRAIN
                    case TREE       :   // PRINCE OWNS TREE
                    case TURNIP     :   // PRINCE EATS TURNIP
                    case TV         :   // PRINCE ON TV
                    case UFO        :   // PRINCE DISBELIEVES UFO
                    case VAMPIRE    :   // PRINCE COULD BE VAMPIRE
                    case WATER      :   // PRINCE DRINKS WATER
                    case WOLF       :   // PRINCE TAMES WOLF
                    case WOMAN      :   // PRINCE RULES WOMAN
                        win();
                        break;
                    case AXE        :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case KING       :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONKEY     :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case PLATINUM   :
                    case POISON     :
                    case PORCUPINE  :
                    case POWER      :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROBOT      :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case VIDEO_GAME :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case PRINCESS:
                switch (them) {
                    case PRINCESS:
                        tie();
                        break;
                    case AIR        :   // PRINCESS BREATHES AIR
                    case AIRPLANE   :   // PRINCESS FLIES ON AIRPLANE
                    case ALIEN      :   // PRINCESS DISBELIEVES ALIEN
                    case BABY       :   // PRINCESS HAS BABY
                    case BEER       :   // PRINCESS DRINKS BEER
                    case BICYCLE    :   // PRINCESS RIDES BICYCLE
                    case BIRD       :   // PRINCESS EATS BIRD
                    case BOOK       :   // PRINCESS INSPIRES BOOK
                    case BOWL       :   // PRINCESS EATS FROM BOWL
                    case BRAIN      :   // PRINCESS HAS BRAIN
                    case BUTTER     :   // PRINCESS EATS BUTTER
                    case CAR        :   // PRINCESS RIDES IN CAR
                    case CAT        :   // PRINCESS OWNS CAT
                    case CHURCH     :   // PRINCESS ATTENDS CHURCH
                    case CLOUD      :   // PRINCESS LOOKS AT CLOUD
                    case COCKROACH  :   // PRINCESS STEPS ON COCKROACH
                    case COMMUNITY  :   // PRINCESS RULES COMMUNITY
                    case CROSS      :   // PRINCESS ACTS CROSS
                    case CUP        :   // PRINCESS DRINKS FROM CUP
                    case DRAGON     :   // PRINCESS SUBDUES DRAGON
                    case DUCK       :   // PRINCESS EATS DUCK
                    case FILM       :   // PRINCESS INSPIRES FILM
                    case FISH       :   // PRINCESS EATS FISH
                    case GRASS      :   // PRINCESS WALKS ON GRASS
                    case GUITAR     :   // PRINCESS PLAYS GUITAR
                    case HOME       :   // PRINCESS LIVES IN HOME
                    case MAN        :   // PRINCESS RULES MAN
                    case MONEY      :   // PRINCESS HAS MONEY
                    case MOON       :   // PRINCESS LOOKS AT MOON
                    case MOUNTAIN   :   // PRINCESS CLIMBS MOUNTAIN
                    case NOISE      :   // PRINCESS MAKES NOISE
                    case PAPER      :   // PRINCESS WRITES PAPER
                    case PLANET     :   // PRINCESS LIVES ON PLANET
                    case POLICE     :   // PRINCESS GOVERNS POLICE
                    case PRAYER     :   // PRINCESS IN PRAYER
                    case RAIN       :   // PRINCESS WALKS IN RAIN
                    case RAINBOW    :   // PRINCESS LOOKS AT RAINBOW
                    case SATAN      :   // PRINCESS ENTHRALLS SATAN
                    case SPIDER     :   // PRINCESS STEPS ON SPIDER
                    case SPONGE     :   // PRINCESS OWNS SPONGE
                    case TOILET     :   // PRINCESS USES TOILET
                    case TRAIN      :   // PRINCESS RIDES ON TRAIN
                    case TREE       :   // PRINCESS OWNS TREE
                    case TURNIP     :   // PRINCESS EATS TURNIP
                    case TV         :   // PRINCESS ON TV
                    case UFO        :   // PRINCESS DISBELIEVES UFO
                    case VAMPIRE    :   // PRINCESS COULD BE VAMPIRE
                    case WATER      :   // PRINCESS DRINKS WATER
                    case WOLF       :   // PRINCESS TAMES WOLF
                    case WOMAN      :   // PRINCESS RULES WOMAN
                        win();
                        break;
                    case AXE        :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case KING       :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONKEY     :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case PLATINUM   :
                    case POISON     :
                    case PORCUPINE  :
                    case POWER      :
                    case PRINCE     :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROBOT      :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case VIDEO_GAME :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case QUEEN:
                switch (them) {
                    case QUEEN:
                        tie();
                        break;
                    case AIR        :   // QUEEN BREATHES AIR
                    case AIRPLANE   :   // QUEEN FLIES ON AIRPLANE
                    case ALIEN      :   // QUEEN DISBELIEVES ALIEN
                    case BABY       :   // QUEEN HAS BABY
                    case BEER       :   // QUEEN DRINKS BEER
                    case BICYCLE    :   // QUEEN RIDES BICYCLE
                    case BIRD       :   // QUEEN EATS BIRD
                    case BOOK       :   // QUEEN INSPIRES BOOK
                    case BOWL       :   // QUEEN EATS FROM BOWL
                    case BRAIN      :   // QUEEN HAS BRAIN
                    case BUTTER     :   // QUEEN EATS BUTTER
                    case CAR        :   // QUEEN RIDES IN CAR
                    case CAT        :   // QUEEN OWNS CAT
                    case CHURCH     :   // QUEEN FUNDS CHURCH
                    case CLOUD      :   // QUEEN LOOKS AT CLOUD
                    case COCKROACH  :   // QUEEN STEPS ON COCKROACH
                    case COMMUNITY  :   // QUEEN RULES COMMUNITY
                    case CROSS      :   // QUEEN ERECTS CROSS
                    case CUP        :   // QUEEN DRINKS FROM CUP
                    case DUCK       :   // QUEEN EATS DUCK
                    case FILM       :   // QUEEN INSPIRES FILM
                    case FISH       :   // QUEEN EATS FISH
                    case GRASS      :   // QUEEN WALKS ON GRASS
                    case GUITAR     :   // QUEEN ROCKS GUITAR
                    case HOME       :   // QUEEN TAXES HOME
                    case MAN        :   // QUEEN RULES MAN
                    case MONEY      :   // QUEEN HAS MONEY
                    case MOON       :   // QUEEN LOOKS AT MOON
                    case MOUNTAIN   :   // QUEEN BOSOM IS MOUNTAIN
                    case NOISE      :   // QUEEN OUTLAWS NOISE
                    case PAPER      :   // QUEEN WRITES PAPER
                    case PLANET     :   // QUEEN LIVES ON PLANET
                    case POLICE     :   // QUEEN GOVERNS POLICE
                    case PRAYER     :   // QUEEN IN PRAYER
                    case PRINCE     :   // QUEEN RULES OVER PRINCE
                    case PRINCESS   :   // QUEEN RULES OVER PRINCESS
                    case RAIN       :   // QUEEN WALKS IN RAIN
                    case RAINBOW    :   // QUEEN LOOKS AT RAINBOW
                    case SPIDER     :   // QUEEN STEPS ON SPIDER
                    case SPONGE     :   // QUEEN OWNS SPONGE
                    case TOILET     :   // QUEEN USES TOILET
                    case TRAIN      :   // QUEEN RIDES ON TRAIN
                    case TREE       :   // QUEEN OWNS TREE
                    case TURNIP     :   // QUEEN EATS TURNIP
                    case TV         :   // QUEEN ON TV
                    case UFO        :   // QUEEN DISBELIEVES UFO
                    case VAMPIRE    :   // QUEEN COULD BE VAMPIRE
                    case WATER      :   // QUEEN DRINKS WATER
                    case WOLF       :   // QUEEN TAMES WOLF
                    case WOMAN      :   // QUEEN RULES WOMAN
                        win();
                        break;
                    case AXE        :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case KING       :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONKEY     :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case PLATINUM   :
                    case POISON     :
                    case PORCUPINE  :
                    case POWER      :
                    case QUICKSAND  :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case VIDEO_GAME :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case QUICKSAND:
                switch (them) {
                    case QUICKSAND:
                        tie();
                        break;
                    case AXE        :   // QUICKSAND SWALLOWS AXE
                    case BABY       :   // QUICKSAND SWALLOWS BABY
                    case BICYCLE    :   // QUICKSAND SWALLOWS BICYCLE
                    case BIRD       :   // QUICKSAND SWALLOWS BIRD (NEST)
                    case BLOOD      :   // QUICKSAND SUFFOCATES BLOOD
                    case BRAIN      :   // QUICKSAND SWALLOWS BRAIN
                    case CAGE       :   // QUICKSAND SURROUNDS CAGE
                    case CAMERA     :   // QUICKSAND SWALLOWS CAMERA
                    case CAR        :   // QUICKSAND SWALLOWS CAR
                    case CASTLE     :   // QUICKSAND PROTECTS CASTLE
                    case CAT        :   // QUICKSAND SWALLOWS CAT
                    case CHAIN      :   // QUICKSAND SWALLOWS CHAIN
                    case CHAINSAW   :   // QUICKSAND SWALLOWS CHAINSAW
                    case COCKROACH  :   // QUICKSAND SWALLOWS COCKROACH
                    case COMMUNITY  :   // QUICKSAND THREATENS COMMUNITY
                    case COMPUTER   :   // QUICKSAND SWALLOWS COMPUTER
                    case DEATH      :   // QUICKSAND CAUSES DEATH
                    case DUCK       :   // QUICKSAND SWALLOWS DUCK
                    case FIRE       :   // QUICKSAND ENGULFS FIRE
                    case FISH       :   // QUICKSAND SWALLOWS FISH
                    case GUN        :   // QUICKSAND SWALLOWS GUN
                    case HOME       :   // QUICKSAND RUINS HOME
                    case KING       :   // QUICKSAND SWALLOWS KING
                    case LAW        :   // QUICKSAND KNOWS NO LAW
                    case MAN        :   // QUICKSAND SWALLOWS MAN
                    case MONKEY     :   // QUICKSAND SWALLOWS MONKEY
                    case NOISE      :   // QUICKSAND ENGULFS NOISE
                    case PEACE      :   // QUICKSAND DISTURBS PEACE
                    case PIT        :   // QUICKSAND BECOMES PIT
                    case POISON     :   // QUICKSAND ENGULFS POISON
                    case POLICE     :   // QUICKSAND SWALLOWS POLICE
                    case PORCUPINE  :   // QUICKSAND SWALLOWS PORCUPINE
                    case PRINCE     :   // QUICKSAND SWALLOWS PRINCE
                    case PRINCESS   :   // QUICKSAND SWALLOWS PRINCESS
                    case QUEEN      :   // QUICKSAND SWALLOWS QUEEN
                    case ROCK       :   // QUICKSAND SWALLOWS ROCK
                    case SCHOOL     :   // QUICKSAND CLOSES SCHOOL
                    case SCISSORS   :   // QUICKSAND SWALLOWS SCISSORS
                    case SNAKE      :   // QUICKSAND SWALLOWS SNAKE
                    case SPIDER     :   // QUICKSAND SWALLOWS SPIDER
                    case SUN        :   // QUICKSAND REMOVES SUN
                    case SWORD      :   // QUICKSAND SWALLOWS SWORD
                    case TRAIN      :   // QUICKSAND RUINS TRAIN (TRACK)
                    case TREE       :   // QUICKSAND TOPPLES TREE
                    case TURNIP     :   // QUICKSAND SWALLOWS TURNIP
                    case VULTURE    :   // QUICKSAND SWALLOWS VULTURE
                    case WALL       :   // QUICKSAND PROTECTS WALL
                    case WHIP       :   // QUICKSAND TOO BIG FOR WHIP
                    case WOLF       :   // QUICKSAND SWALLOWS WOLF
                    case WOMAN      :   // QUICKSAND SWALLOWS WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BOOK       :
                    case BOWL       :
                    case BUTTER     :
                    case CHURCH     :
                    case CLOUD      :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SKY        :
                    case SPONGE     :
                    case TANK       :
                    case TOILET     :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case RAIN:
                switch (them) {
                    case RAIN:
                        tie();
                        break;
                    case ALIEN      :   // RAIN DROWNS ALIEN
                    case AXE        :   // RAIN RUSTS AXE
                    case CAGE       :   // RAIN RUSTS CAGE
                    case CAMERA     :   // RAIN RUINS CAMERA
                    case CHAIN      :   // RAIN RUSTS CHAIN
                    case CHAINSAW   :   // RAIN THWARTS CHAINSAW USE
                    case COMPUTER   :   // RAIN SHORT-CIRCUITS COMPUTER
                    case DEATH      :   // RAIN MAKES LONELY DEATH
                    case DEVIL      :   // RAIN DROWNS DEVIL
                    case DIAMOND    :   // RAIN CLEANS DIAMOND
                    case DRAGON     :   // RAIN DROWNS DRAGON
                    case DYNAMITE   :   // RAIN SOAKS DYNAMITE
                    case ELECTRICITY:   // RAIN CONDUCTS ELECTRICITY
                    case FENCE      :   // RAIN RUSTS FENCE
                    case FIRE       :   // RAIN DOUSES FIRE
                    case GOLD       :   // RAIN CLEANS GOLD
                    case GUN        :   // RAIN RUSTS GUN
                    case HEART      :   // RAIN SADDENS HEART
                    case HELICOPTER :   // RAIN DIVERTS HELICOPTER
                    case LASER      :   // RAIN DIFFRACTS LASER
                    case LAW        :   // RAIN SOAKS LAW PAPERS
                    case LIGHTNING  :   // RAIN BRINGS LIGHTNING
                    case MATH       :   // RAIN MEASURED WITH MATH
                    case MEDUSA     :   // RAIN DROWNS MEDUSA
                    case MOUNTAIN   :   // RAIN ON THE MOUNTAIN
                    case NUKE       :   // RAIN DIVERTS NUKE
                    case PEACE      :   // RAIN DISTURBS PEACE
                    case PIT        :   // RAIN FILLS PIT
                    case PLATINUM   :   // RAIN CLEANS PLATINUM
                    case POISON     :   // RAIN ACIDIC POISON
                    case POWER      :   // RAIN BLACKS OUT POWER
                    case PRAYER     :   // RAIN ANSWERS PRAYER
                    case QUICKSAND  :   // RAIN CREATES QUICKSAND
                    case RAINBOW    :   // RAIN CREATES RAINBOW
                    case ROBOT      :   // RAIN SHORT-CIRCUITS ROBOT
                    case ROCK       :   // RAIN ERODES ROCK
                    case SATAN      :   // RAIN DROWNS SATAN
                    case SCHOOL     :   // RAIN CLOSES SCHOOL
                    case SCISSORS   :   // RAIN RUSTS SCISSORS
                    case SKY        :   // RAIN DARKENS SKY
                    case SUN        :   // RAIN BLOCKS SUN
                    case SWORD      :   // RAIN RUSTS SWORD
                    case TANK       :   // RAIN FALLS ON TANK
                    case TORNADO    :   // RAIN BRINGS TORNADO
                    case TV         :   // RAIN INSPIRES TV
                    case UFO        :   // RAIN DIVERTS UFO
                    case VIDEO_GAME :   // RAIN INSPIRES VIDEO GAME
                    case WALL       :   // RAIN LEAKS THROUGH WALL
                    case WATER      :   // RAIN MADE OF WATER
                    case WHIP       :   // RAIN SOAKS WHIP
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case BABY       :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case RAINBOW:
                switch (them) {
                    case RAINBOW:
                        tie();
                        break;
                    case ALIEN      :   // RAINBOW INTRIGUES ALIEN
                    case AXE        :   // RAINBOW RESISTS AXE
                    case BLOOD      :   // RAINBOW AFTER BLOODSHED
                    case CAGE       :   // RAINBOW BEYOND CAGE
                    case CAMERA     :   // RAINBOW CHALLENGES CAMERA
                    case CASTLE     :   // RAINBOW OVER CASTLE
                    case CHAIN      :   // RAINBOW COLOR CHAIN
                    case CHAINSAW   :   // RAINBOW OVER CHAINSAW
                    case COMPUTER   :   // RAINBOW COLORED COMPUTER
                    case DEATH      :   // RAINBOW DESPITE DEATH
                    case DEVIL      :   // RAINBOW IRRITATES DEVIL
                    case DIAMOND    :   // RAINBOW INDICATES DIAMOND
                    case DRAGON     :   // RAINBOW OVER DRAGON
                    case DYNAMITE   :   // RAINBOW OVER DYNAMITE
                    case ELECTRICITY:   // RAINBOW WIRED ELECTRICITY
                    case FENCE      :   // RAINBOW OVER FENCE
                    case FIRE       :   // RAINBOW OVER FIRE
                    case GOLD       :   // RAINBOW POINTS TO GOLD
                    case GUN        :   // RAINBOW RESISTS GUN
                    case HEART      :   // RAINBOW CHEERS HEART
                    case HELICOPTER :   // RAINBOW OVER HELICOPTER
                    case LASER      :   // RAINBOW COLORED LASERS
                    case LAW        :   // RAINBOW DESPITE LAW
                    case LIGHTNING  :   // RAINBOW AFTER LIGHTNING
                    case MATH       :   // RAINBOW OPTICS USE MATH
                    case MEDUSA     :   // RAINBOW IRRITATES MEDUSA
                    case MOUNTAIN   :   // RAINBOW OVER MOUNTAIN
                    case NUKE       :   // RAINBOW AFTER NUKE
                    case PEACE      :   // RAINBOW INDICATES PEACE
                    case PIT        :   // RAINBOW OVER PIT
                    case PLATINUM   :   // RAINBOW POINTS TO PLATINUM
                    case POISON     :   // RAINBOW RESISTS POISON
                    case POWER      :   // RAINBOW POWER
                    case PRAYER     :   // RAINBOW ENHANCES PRAYER
                    case QUICKSAND  :   // RAINBOW OVER QUICKSAND
                    case ROBOT      :   // RAINBOW OVER ROBOT
                    case ROCK       :   // RAINBOW OVER ROCK
                    case SATAN      :   // RAINBOW IRRITATES SATAN
                    case SCHOOL     :   // RAINBOW OVER SCHOOL
                    case SCISSORS   :   // RAINBOW COLORED SCISSORS
                    case SKY        :   // RAINBOW DECORATES SKY
                    case SNAKE      :   // RAINBOW COLORED SNAKES
                    case SUN        :   // RAINBOW DIFFRACTS SUN
                    case SWORD      :   // RAINBOW OVER SWORD
                    case TANK       :   // RAINBOW OVER TANK
                    case TORNADO    :   // RAINBOW AFTER TORNADO
                    case UFO        :   // RAINBOW ATTRACTS UFO
                    case VIDEO_GAME :   // RAINBOW COLORED VIDEO GAME
                    case WALL       :   // RAINBOW HITS WALL
                    case WHIP       :   // RAINBOW SHARP AS A WHIP
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case BABY       :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case RAIN       :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WATER      :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case ROBOT:
                switch (them) {
                    case ROBOT:
                        tie();
                        break;
                    case AXE        :   // ROBOT CARRIES AXE
                    case BABY       :   // ROBOT CARRIES OFF BABY
                    case BLOOD      :   // ROBOT HAS NO BLOOD
                    case CAGE       :   // ROBOT BENDS BARS OF CAGE
                    case CAMERA     :   // ROBOT HAS CAMERA
                    case CAR        :   // ROBOT BUILDS CAR
                    case CASTLE     :   // ROBOT EXPLORES CASTLE
                    case CHAIN      :   // ROBOT BREAKS CHAIN
                    case CHAINSAW   :   // ROBOT CARRIES CHAINSAW
                    case COMPUTER   :   // ROBOT USES COMPUTER
                    case DEATH      :   // ROBOT KNOWS NO DEATH
                    case DYNAMITE   :   // ROBOT THROWS DYNAMITE
                    case ELECTRICITY:   // ROBOT USES ELECTRICITY
                    case FIRE       :   // ROBOT RESISTS FIRE
                    case GUN        :   // ROBOT FIRES GUN
                    case HEART      :   // ROBOT ENVIES HEART
                    case HELICOPTER :   // ROBOT PILOTS HELICOPTER
                    case HOME       :   // ROBOT ENHANCES HOME
                    case KING       :   // ROBOT FRIGHTENS KING
                    case LASER      :   // ROBOT SHOOTS LASER
                    case LAW        :   // ROBOT THREE LAWS
                    case LIGHTNING  :   // ROBOT SHOOTS LIGHTNING
                    case MAN        :   // ROBOT OVERTHROWS MAN
                    case MEDUSA     :   // ROBOT TRAMPLES MEDUSA
                    case MONKEY     :   // ROBOT SCARES MONKEY
                    case NUKE       :   // ROBOT LAUNCHES NUKE
                    case PEACE      :   // ROBOT DISTURBS PEACE
                    case PIT        :   // ROBOT CLIMBS OUT OF PIT
                    case POISON     :   // ROBOT RESISTS POISON
                    case POLICE     :   // ROBOT TRAMPLES POLICE
                    case PORCUPINE  :   // ROBOT STEPS ON PORCUPINE
                    case POWER      :   // ROBOT CONSUMES POWER
                    case PRINCE     :   // ROBOT FRIGHTENS PRINCE
                    case PRINCESS   :   // ROBOT FRIGHTENS PRINCESS
                    case QUEEN      :   // ROBOT FRIGHTENS QUEEN
                    case QUICKSAND  :   // ROBOT DETECTS QUICKSAND
                    case ROCK       :   // ROBOT HURLS ROCK
                    case SCHOOL     :   // ROBOT TRAMPLES SCHOOL
                    case SCISSORS   :   // ROBOT CARRIES SCISSORS
                    case SKY        :   // ROBOT POLLUTES SKY
                    case SNAKE      :   // ROBOT STEPS ON SNAKE
                    case SUN        :   // ROBOT REFLECTS SUN
                    case SWORD      :   // ROBOT CARRIES SWORD
                    case TANK       :   // ROBOT PILOTS TANK
                    case TORNADO    :   // ROBOT CHASES TORNADO
                    case TRAIN      :   // ROBOT BUILDS TRAIN
                    case VULTURE    :   // ROBOT RESISTS VULTURE
                    case WALL       :   // ROBOT SMASHES THROUGH WALL
                    case WHIP       :   // ROBOT RESISTS WHIP
                    case WOMAN      :   // ROBOT CARRIES OFF WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DUCK       :
                    case FENCE      :
                    case FILM       :
                    case FISH       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case MATH       :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                    case WOLF       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case ROCK:
                switch (them) {
                    case ROCK:
                        tie();
                        break;
                    case AXE        :   // ROCK CHIPS AXE
                    case BABY       :   // ROCK CRUSHES BABY
                    case BICYCLE    :   // ROCK CRUSHES BICYCLE
                    case BIRD       :   // ROCK HITS BIRD
                    case BLOOD      :   // ROCK CONTAINS BLOOD
                    case BOOK       :   // ROCK CRUSHES BOOK
                    case BRAIN      :   // ROCK CRUSHES BRAIN
                    case BUTTER     :   // ROCK SPLATTERS BUTTER
                    case CAGE       :   // ROCK CRUSHES CAGE LOCK
                    case CAMERA     :   // ROCK SMASHES CAMERA
                    case CAR        :   // ROCK SMASHES CAR WINDOW
                    case CASTLE     :   // ROCK BUILDS CASTLE
                    case CAT        :   // ROCK CRUSHES CAT
                    case CHAINSAW   :   // ROCK DULLS CHAINSAW
                    case CHURCH     :   // ROCK SMASHES CHURCH WINDOW
                    case COCKROACH  :   // ROCK SQUISHES COCKROACH
                    case COMMUNITY  :   // ROCK SOLID COMMUNITY
                    case COMPUTER   :   // ROCK CRUSHES COMPUTER
                    case CROSS      :   // ROCK SUPPORTS CROSS
                    case DEATH      :   // ROCK INDICATES DEATH
                    case DUCK       :   // ROCK HITS DUCK
                    case FIRE       :   // ROCK POUNDS OUT FIRE
                    case FISH       :   // ROCK SMOOSHES FISH
                    case HOME       :   // ROCK BUILDS HOME
                    case KING       :   // ROCK CRUSHES KING
                    case MAN        :   // ROCK CRUSHES MAN
                    case MONEY      :   // ROCK (RARE) COSTS MONEY
                    case MONKEY     :   // ROCK CRUSHES MONKEY
                    case NOISE      :   // ROCK GRINDS NOISE
                    case PEACE      :   // ROCK MARKS ETERNAL PEACE
                    case POISON     :   // ROCK SMASHES POISON BOTTLE
                    case POLICE     :   // ROCK CRUSHES POLICE
                    case PORCUPINE  :   // ROCK CRUSHES PORCUPINE
                    case PRINCE     :   // ROCK CRUSHES PRINCE
                    case PRINCESS   :   // ROCK CRUSHES PRINCESS
                    case QUEEN      :   // ROCK CRUSHES QUEEN
                    case SCHOOL     :   // ROCK SMASHES SCHOOL WINDOW
                    case SCISSORS   :   // ROCK SMASHES SCISSORS
                    case SNAKE      :   // ROCK CRUSHES SNAKE
                    case SPIDER     :   // ROCK SQUISHES SPIDER
                    case SPONGE     :   // ROCK CRUSHES SPONGE
                    case SUN        :   // ROCK SHADES SUN
                    case TRAIN      :   // ROCK BLOCKS TRAIN
                    case TREE       :   // ROCK BLOCKS TREE ROOTS
                    case TURNIP     :   // ROCK BLOCKS TURNIP ROOTS
                    case VAMPIRE    :   // ROCK ENCASES VAMPIRE
                    case VULTURE    :   // ROCK HITS VULTURE
                    case WALL       :   // ROCK BUILDS WALL
                    case WOLF       :   // ROCK CRUSHES WOLF
                    case WOMAN      :   // ROCK CRUSHES WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BOWL       :
                    case CHAIN      :
                    case CLOUD      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOON       :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PAPER      :
                    case PIT        :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SKY        :
                    case SWORD      :
                    case TANK       :
                    case TOILET     :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WATER      :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case SATAN:
                switch (them) {
                    case SATAN:
                        tie();
                        break;
                    case AXE        :   // SATAN LAUGHS AT AXE
                    case BLOOD      :   // SATAN POISONS BLOOD
                    case CAGE       :   // SATAN ESCAPES CAGE
                    case CAMERA     :   // SATAN EVADES CAMERA
                    case CASTLE     :   // SATAN HAS CASTLE
                    case CHAIN      :   // SATAN UNCHAINED
                    case CHAINSAW   :   // SATAN EVADES CHAINSAW
                    case COMPUTER   :   // SATAN LAUGHS AT COMPUTER
                    case DEATH      :   // SATAN AFTER DEATH
                    case DEVIL      :   // SATAN COMMANDS DEVIL
                    case DIAMOND    :   // SATAN LIKES KING DIAMOND
                    case DRAGON     :   // SATAN COMMANDS DRAGON
                    case DYNAMITE   :   // SATAN LAUGHS AT DYNAMITE
                    case ELECTRICITY:   // SATAN DOESN'T NEED ELECTRICITY
                    case FENCE      :   // SATAN KNOWS NO FENCE
                    case FIRE       :   // SATAN COMMANDS FIRE
                    case GOLD       :   // SATAN TEMPTS WITH GOLD
                    case GUN        :   // SATAN LAUGHS AT GUN
                    case HEART      :   // SATAN DARKENS HEART
                    case HELICOPTER :   // SATAN LAUGHS AT HELICOPTER
                    case KING       :   // SATAN POSSESSES KING
                    case LASER      :   // SATAN LAUGHS AT LASER
                    case LAW        :   // SATAN KNOWS NO LAW
                    case LIGHTNING  :   // SATAN BRINGS LIGHTNING
                    case MATH       :   // SATAN GOOD AT MATH
                    case MEDUSA     :   // SATAN COMMANDS MEDUSA
                    case MONKEY     :   // SATAN OWNS MONKEY
                    case NUKE       :   // SATAN LAUGHS AT NUKE
                    case PEACE      :   // SATAN PREVENTS PEACE
                    case PIT        :   // SATAN COMMANDS PIT
                    case PLATINUM   :   // SATAN TEMPTS WITH PLATINUM
                    case POISON     :   // SATAN LAUGHS AT POISON
                    case PORCUPINE  :   // SATAN SHARPER THAN PORCUPINE
                    case POWER      :   // SATAN HAS POWER
                    case QUEEN      :   // SATAN POSSESSES QUEEN
                    case QUICKSAND  :   // SATAN DISPELS QUICKSAND
                    case ROBOT      :   // SATAN LAUGHS AT ROBOT
                    case ROCK       :   // SATAN HURLS ROCK
                    case SCHOOL     :   // SATAN ENTHRALLS SCHOOLKIDS
                    case SCISSORS   :   // SATAN LAUGHS AT SCISSORS
                    case SKY        :   // SATAN DARKENS SKY
                    case SNAKE      :   // SATAN IS SNAKE
                    case SUN        :   // SATAN CURSES SUN
                    case SWORD      :   // SATAN LAUGHS AT SWORD
                    case TANK       :   // SATAN LAUGHS AT TANK
                    case TORNADO    :   // SATAN COMMANDS TORNADO
                    case VIDEO_GAME :   // SATAN INSPIRES VIDEO GAME
                    case VULTURE    :   // SATAN IS SOUL VULTURE
                    case WALL       :   // SATAN KNOWS NO WALL
                    case WHIP       :   // SATAN CRACKS WHIP
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BABY       :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case MAN        :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case POLICE     :
                    case PRAYER     :
                    case PRINCE     :
                    case PRINCESS   :
                    case RAIN       :
                    case RAINBOW    :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case WATER      :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case SCHOOL:
                switch (them) {
                    case SCHOOL:
                        tie();
                        break;
                    case AIRPLANE   :   // SCHOOL TEACHES ABOUT AIRPLANE
                    case AXE        :   // SCHOOL MAKES YOU SHARPER THAN AXE
                    case BABY       :   // SCHOOL TEACHES BABY
                    case BICYCLE    :   // SCHOOL TEACHES BICYCLE SAFETY
                    case BIRD       :   // SCHOOL TEACHES ABOUT BIRD
                    case BLOOD      :   // SCHOOL TEACHES ABOUT BLOOD
                    case BOOK       :   // SCHOOL HAS BOOK
                    case BRAIN      :   // SCHOOL NOURISHES BRAIN
                    case BUTTER     :   // SCHOOL KITCHEN HAS BUTTER
                    case CAGE       :   // SCHOOL IS CAGE FOR CHILDREN
                    case CAR        :   // SCHOOL TEACHES CAR USE
                    case CASTLE     :   // SCHOOL TEACHES ABOUT CASTLE
                    case CAT        :   // SCHOOL TEACHES ABOUT CAT
                    case CHURCH     :   // SCHOOL IGNORES CHURCH
                    case CLOUD      :   // SCHOOL TEACHES ABOUT CLOUD
                    case COCKROACH  :   // SCHOOL HOUSES COCKROACH
                    case COMMUNITY  :   // SCHOOL EDUCATES COMMUNITY
                    case COMPUTER   :   // SCHOOL USES COMPUTER
                    case CROSS      :   // SCHOOL BANS CROSS
                    case DUCK       :   // SCHOOL TEACHES ABOUT DUCK
                    case FILM       :   // SCHOOL SHOWS FILM
                    case FISH       :   // SCHOOL TEACHES ABOUT FISH
                    case GRASS      :   // SCHOOL YARD HAS GRASS
                    case HOME       :   // SCHOOL AWAY FROM HOME
                    case KING       :   // SCHOOL TEACHES ABOUT KING
                    case MAN        :   // SCHOOL TEACHES MAN
                    case MONEY      :   // SCHOOL LUNCH MONEY
                    case MONKEY     :   // SCHOOL TEACHES ABOUT MONKEY
                    case MOON       :   // SCHOOL TEACHES ABOUT MOON
                    case NOISE      :   // SCHOOL BELL MAKES NOISE
                    case PAPER      :   // SCHOOL MAKES YOU WRITE PAPER
                    case PEACE      :   // SCHOOL REQUIRES PEACE
                    case POISON     :   // SCHOOL TEACHES ABOUT POISON
                    case POLICE     :   // SCHOOL TRAINS POLICE
                    case PORCUPINE  :   // SCHOOL TEACHES ABOUT PORCUPINE
                    case PRINCE     :   // SCHOOL TEACHES ABOUT PRINCE
                    case PRINCESS   :   // SCHOOL TEACHES ABOUT PRINCESS
                    case QUEEN      :   // SCHOOL TEACHES ABOUT QUEEN
                    case SCISSORS   :   // SCHOOL CHILDREN USE SCISSORS
                    case SNAKE      :   // SCHOOL TEACHES ABOUT SNAKE
                    case SPIDER     :   // SCHOOL HOUSES SPIDER
                    case SPONGE     :   // SCHOOL KITCHEN HAS SPONGE
                    case TOILET     :   // SCHOOL HAS TOILET
                    case TRAIN      :   // SCHOOL TRAINS
                    case TREE       :   // SCHOOL YARD HAS TREE
                    case TURNIP     :   // SCHOOL TEACHES ABOUT TURNIP
                    case VAMPIRE    :   // SCHOOL PLAY ABOUT VAMPIRE
                    case VULTURE    :   // SCHOOL TEACHES ABOUT VULTURE
                    case WOLF       :   // SCHOOL TEACHES ABOUT WOLF
                    case WOMAN      :   // SCHOOL TEACHES WOMAN
                        win();
                        break;
                    case AIR        :
                    case ALIEN      :
                    case BEER       :
                    case BOWL       :
                    case CAMERA     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case CUP        :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUITAR     :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PIT        :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SKY        :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WALL       :
                    case WATER      :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case SCISSORS:
                switch (them) {
                    case SCISSORS:
                        tie();
                        break;
                    case AIR        :   // SCISSORS SWISH THROUGH AIR
                    case AIRPLANE   :   // SCISSORS ALERT AIRPLANE SECURITY
                    case AXE        :   // SCISSORS SHARPER THAN AXE
                    case BABY       :   // SCISSORS CUT BABY'S HAIR
                    case BICYCLE    :   // SCISSORS STAB BICYCLE TIRE
                    case BIRD       :   // SCISSORS STAB BIRD
                    case BLOOD      :   // SCISSORS SPURT BLOOD
                    case BOOK       :   // SCISSORS CUT UP BOOK
                    case BRAIN      :   // SCISSORS STAB BRAIN
                    case BUTTER     :   // SCISSORS SPREAD BUTTER
                    case CAGE       :   // SCISSORS PICK LOCK OF CAGE
                    case CAR        :   // SCISSORS STAB CAR TIRE
                    case CASTLE     :   // SCISSORS CARVE INTO CASTLE
                    case CAT        :   // SCISSORS CUT CAT'S HAIR
                    case CHURCH     :   // SCISSORS CARVE INTO CHURCH
                    case CLOUD      :   // SCISSORS SWISH THROUGH CLOUD
                    case COCKROACH  :   // SCISSORS STAB COCKROACH
                    case COMMUNITY  :   // SCISSORS CUT COMMUNITY'S HAIR
                    case COMPUTER   :   // SCISSORS STAB COMPUTER KEYS
                    case CROSS      :   // SCISSORS CARVE INTO CROSS
                    case DUCK       :   // SCISSORS STAB DUCK
                    case FILM       :   // SCISSORS CUT FILM
                    case FISH       :   // SCISSORS GUT FISH
                    case GRASS      :   // SCISSORS CUT GRASS
                    case HOME       :   // SCISSORS CARVE INTO HOME
                    case KING       :   // SCISSORS CUT KING'S HAIR
                    case MAN        :   // SCISSORS CUT MAN'S HAIR
                    case MONEY      :   // SCISSORS CUT UP MONEY
                    case MONKEY     :   // SCISSORS CUT MONKEY'S HAIR
                    case MOON       :   // SCISSORS REFLECT MOON
                    case NOISE      :   // SCISSORS MAKE SNIPPING NOISE
                    case PAPER      :   // SCISSORS CUT PAPER
                    case PEACE      :   // SCISSORS CUT PEACE SYMBOL
                    case POISON     :   // SCISSORS MORE DIRECT THAN POISON
                    case POLICE     :   // SCISSORS CUT POLICE'S HAIR
                    case PORCUPINE  :   // SCISSORS STAB PORCUPINE
                    case PRINCE     :   // SCISSORS CUT PRINCE'S HAIR
                    case PRINCESS   :   // SCISSORS CUT PRINCESS' HAIR
                    case QUEEN      :   // SCISSORS CUT QUEEN'S HAIR
                    case SNAKE      :   // SCISSORS STAB SNAKE
                    case SPIDER     :   // SCISSORS STAB SPIDER
                    case SPONGE     :   // SCISSORS CUT UP SPONGE
                    case TOILET     :   // SCISSORS CLOG TOILET
                    case TRAIN      :   // SCISSORS TRIM DRESS TRAIN
                    case TREE       :   // SCISSORS CARVE INTO TREE
                    case TURNIP     :   // SCISSORS CUT TURNIP
                    case VAMPIRE    :   // SCISSORS IMPALE VAMPIRE
                    case VULTURE    :   // SCISSORS STAB VULTURE
                    case WOLF       :   // SCISSORS CUT WOLF'S HAIR
                    case WOMAN      :   // SCISSORS CUT WOMAN'S HAIR
                        win();
                        break;
                    case ALIEN      :
                    case BEER       :
                    case BOWL       :
                    case CAMERA     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case CUP        :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUITAR     :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PIT        :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SCHOOL     :
                    case SKY        :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WALL       :
                    case WATER      :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case SKY:
                switch (them) {
                    case SKY:
                        tie();
                        break;
                    case AXE        :   // SKY ABOVE AXE
                    case BABY       :   // SKY ABOVE BABY
                    case BICYCLE    :   // SKY ABOVE BICYCLE
                    case BIRD       :   // SKY ABOVE BIRD
                    case BLOOD      :   // SKY ABOVE BLOOD
                    case CAGE       :   // SKY EVADES CAGE
                    case CAMERA     :   // SKY CHALLENGES CAMERA
                    case CAR        :   // SKY ABOVE CAR
                    case CASTLE     :   // SKY ABOVE CASTLE
                    case CAT        :   // SKY ABOVE CAT
                    case CHAIN      :   // SKY ABOVE CHAIN
                    case CHAINSAW   :   // SKY ABOVE CHAINSAW
                    case COMPUTER   :   // SKY ABOVE COMPUTER
                    case DEATH      :   // SKY TRANSCENDS DEATH
                    case DUCK       :   // SKY ABOVE DUCK
                    case DYNAMITE   :   // SKY ABOVE DYNAMITE
                    case FIRE       :   // SKY ABOVE FIRE
                    case GUN        :   // SKY ABOVE GUN
                    case HELICOPTER :   // SKY ABOVE HELICOPTER
                    case HOME       :   // SKY ABOVE HOME
                    case KING       :   // SKY ABOVE KING
                    case LAW        :   // SKY IS LIMIT OF LAW
                    case MAN        :   // SKY ABOVE MAN
                    case MONKEY     :   // SKY ABOVE MONKEY
                    case NOISE      :   // SKY MAKES NO NOISE
                    case PEACE      :   // SKY AT PEACE
                    case PIT        :   // SKY EVADES PIT
                    case POISON     :   // SKY ABOVE POISON
                    case POLICE     :   // SKY ABOVE POLICE
                    case PORCUPINE  :   // SKY ABOVE PORCUPINE
                    case PRINCE     :   // SKY ABOVE PRINCE
                    case PRINCESS   :   // SKY ABOVE PRINCESS
                    case QUEEN      :   // SKY ABOVE QUEEN
                    case QUICKSAND  :   // SKY ABOVE QUICKSAND
                    case ROCK       :   // SKY ABOVE ROCK
                    case SCHOOL     :   // SKY ABOVE SCHOOL
                    case SCISSORS   :   // SKY ABOVE SCISSORS
                    case SNAKE      :   // SKY ABOVE SNAKE
                    case SUN        :   // SKY SURROUNDS SUN
                    case SWORD      :   // SKY ABOVE SWORD
                    case TANK       :   // SKY ABOVE TANK
                    case TORNADO    :   // SKY HOUSES TORNADO
                    case TRAIN      :   // SKY ABOVE TRAIN
                    case TREE       :   // SKY ABOVE TREE
                    case TURNIP     :   // SKY ABOVE TURNIP
                    case VULTURE    :   // SKY ABOVE VULTURE
                    case WALL       :   // SKY ABOVE WALL
                    case WHIP       :   // SKY ABOVE WHIP
                    case WOLF       :   // SKY ABOVE WOLF
                    case WOMAN      :   // SKY ABOVE WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case FISH       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HEART      :
                    case LASER      :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case SNAKE:
                switch (them) {
                    case SNAKE:
                        tie();
                        break;
                    case AIR        :   // SNAKE BREATHES AIR
                    case AIRPLANE   :   // SNAKE ON A PLANE
                    case BABY       :   // SNAKE SCARES BABY
                    case BEER       :   // SNAKE SPILLS BEER
                    case BICYCLE    :   // SNAKE ENTANGLES BICYCLE
                    case BIRD       :   // SNAKE EATS BIRD EGGS
                    case BLOOD      :   // SNAKE POISONS BLOOD
                    case BOOK       :   // SNAKE SWALLOWS BOOK
                    case BOWL       :   // SNAKE SLEEPS IN BOWL
                    case BRAIN      :   // SNAKE INTIMIDATES BRAIN
                    case BUTTER     :   // SNAKE EATS BUTTER
                    case CAR        :   // SNAKE CREEPS INTO CAR
                    case CAT        :   // SNAKE BITES CAT
                    case CHURCH     :   // SNAKE CREEPS INTO CHURCH
                    case CLOUD      :   // SNAKE NOT AFFECTED BY CLOUD
                    case COCKROACH  :   // SNAKE EATS COCKROACH
                    case COMMUNITY  :   // SNAKE TERRORIZES COMMUNITY
                    case CROSS      :   // SNAKE CLIMBS CROSS
                    case CUP        :   // SNAKE TIPS OVER CUP
                    case DUCK       :   // SNAKE EATS DUCK EGGS
                    case FILM       :   // SNAKE INSPIRES FILM
                    case FISH       :   // SNAKE EATS FISH
                    case GRASS      :   // SNAKE IN THE GRASS
                    case GUITAR     :   // SNAKE HIDES IN GUITAR
                    case HOME       :   // SNAKE CREEPS INTO HOME
                    case KING       :   // SNAKE BITES KING
                    case MAN        :   // SNAKE BITES MAN
                    case MONEY      :   // SNAKE SWALLOWS MONEY
                    case MONKEY     :   // SNAKE BITES MONKEY
                    case MOON       :   // SNAKE NOCTURNAL WITH MOON
                    case NOISE      :   // SNAKE RATTLES NOISE
                    case PAPER      :   // SNAKE NESTS IN PAPER
                    case PLANET     :   // SNAKE LIVES ON PLANET
                    case POLICE     :   // SNAKE BITES POLICE
                    case PORCUPINE  :   // SNAKE SCARES PORCUPINE
                    case PRINCE     :   // SNAKE BITES PRINCE
                    case PRINCESS   :   // SNAKE BITES PRINCESS
                    case QUEEN      :   // SNAKE BITES QUEEN
                    case RAIN       :   // SNAKE HUNTS DESPITE RAIN
                    case SPIDER     :   // SNAKE EATS SPIDER
                    case SPONGE     :   // SNAKE SWALLOWS SPONGE
                    case TOILET     :   // SNAKE HIDES IN TOILET
                    case TRAIN      :   // SNAKE TERRORIZES TRAIN
                    case TREE       :   // SNAKE CLIMBS TREE
                    case TURNIP     :   // SNAKE SWALLOWS TURNIP
                    case VAMPIRE    :   // SNAKE CHARMS VAMPIRE
                    case VULTURE    :   // SNAKE HIDES FROM VULTURE
                    case WATER      :   // SNAKE DRINKS WATER
                    case WOLF       :   // SNAKE BITES WOLF
                    case WOMAN      :   // SNAKE BITES WOMAN
                        win();
                        break;
                    case ALIEN      :
                    case AXE        :
                    case CAGE       :
                    case CAMERA     :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case PLATINUM   :
                    case POISON     :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAINBOW    :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WALL       :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case SPIDER:
                switch (them) {
                    case SPIDER:
                        tie();
                        break;
                    case AIR        :   // SPIDER BREATHES AIR
                    case AIRPLANE   :   // SPIDER CREEPS INTO AIRPLANE
                    case ALIEN      :   // SPIDER INTRIGUES ALIEN
                    case BEER       :   // SPIDER IN YOUR BEER
                    case BOOK       :   // SPIDER BEHIND BOOK
                    case BOWL       :   // SPIDER HIDES UNDER BOWL
                    case BRAIN      :   // SPIDER HAS BRAIN
                    case BUTTER     :   // SPIDER CRAWLS ACROSS BUTTER
                    case CHURCH     :   // SPIDER CREEPS INTO CHURCH
                    case CLOUD      :   // SPIDER WEB LIKE CLOUD
                    case COCKROACH  :   // SPIDER BIGGER THAN COCKROACH
                    case COMMUNITY  :   // SPIDER FRIGHTENS COMMUNITY
                    case CROSS      :   // SPIDER CRAWLS UP CROSS
                    case CUP        :   // SPIDER CRAWLS INTO CUP
                    case DEVIL      :   // SPIDER AMUSES DEVIL
                    case DIAMOND    :   // SPIDER EYES LIKE DIAMONDS
                    case DRAGON     :   // SPIDER AMUSES DRAGON
                    case ELECTRICITY:   // SPIDER HIDES FROM ELECTRICITY
                    case FENCE      :   // SPIDER CRAWLS OVER FENCE
                    case FILM       :   // SPIDER ON FILM
                    case GOLD       :   // SPIDER COLORED GOLD
                    case GRASS      :   // SPIDER IN GRASS
                    case GUITAR     :   // SPIDER HIDES IN GUITAR
                    case HEART      :   // SPIDER HAS HEART
                    case LASER      :   // SPIDER DODGES LASER
                    case LIGHTNING  :   // SPIDER HIDES FROM LIGHTNING
                    case MATH       :   // SPIDER DOESN'T NEED MATH
                    case MEDUSA     :   // SPIDER AMUSES MEDUSA
                    case MONEY      :   // SPIDER COSTS MONEY
                    case MOON       :   // SPIDER LIVES BY MOON
                    case MOUNTAIN   :   // SPIDER LIVES ON MOUNTAIN
                    case NUKE       :   // SPIDER SURVIVES NUKE
                    case PAPER      :   // SPIDER CRAWLS ACROSS PAPER
                    case PLANET     :   // SPIDER LIVES ON PLANET
                    case PLATINUM   :   // SPIDER WEB LIKE PLATINUM
                    case POWER      :   // SPIDER HAS POWER OF FEAR
                    case PRAYER     :   // SPIDER DESPITE PRAYER
                    case RAIN       :   // SPIDER DOESN'T MIND RAIN
                    case RAINBOW    :   // SPIDER UNAWARE OF RAINBOW
                    case ROBOT      :   // SPIDER CRAWLS OVER ROBOT
                    case SATAN      :   // SPIDER AMUSES SATAN
                    case SKY        :   // SPIDER UNAWARE OF SKY
                    case SPONGE     :   // SPIDER NESTS IN SPONGE
                    case TANK       :   // SPIDER CREEPS INTO TANK
                    case TOILET     :   // SPIDER HIDES IN TOILET
                    case TV         :   // SPIDER CRAWLS ACROSS TV
                    case UFO        :   // SPIDER UNDETECTED BY UFO
                    case VAMPIRE    :   // SPIDER ENTERTAINS VAMPIRE
                    case VIDEO_GAME :   // SPIDER IN VIDEO GAME
                    case WATER      :   // SPIDER DRINKS WATER
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DUCK       :
                    case DYNAMITE   :
                    case FIRE       :
                    case FISH       :
                    case GUN        :
                    case HELICOPTER :
                    case HOME       :
                    case KING       :
                    case LAW        :
                    case MAN        :
                    case MONKEY     :
                    case NOISE      :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TORNADO    :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case SPONGE:
                switch (them) {
                    case SPONGE:
                        tie();
                        break;
                    case AIR        :   // SPONGE USES AIR POCKETS
                    case AIRPLANE   :   // SPONGE CLEANS AIRPLANE
                    case ALIEN      :   // SPONGE INTRIGUES ALIEN
                    case BEER       :   // SPONGE ABSORBS BEER
                    case BOOK       :   // SPONGE SOAKS BOOK
                    case BOWL       :   // SPONGE CLEANS BOWL
                    case BUTTER     :   // SPONGE SOPS UP BUTTER
                    case CHAIN      :   // SPONGE CLEANS CHAIN
                    case CHURCH     :   // SPONGE CLEANS CHURCH
                    case CLOUD      :   // SPONGE DENSER THAN CLOUD
                    case CUP        :   // SPONGE CLEANS CUP
                    case DEVIL      :   // SPONGE CLEANSES DEVIL
                    case DIAMOND    :   // SPONGE CLEANS DIAMOND
                    case DRAGON     :   // SPONGE CLEANSES DRAGON
                    case DYNAMITE   :   // SPONGE SOAKS DYNAMITE
                    case ELECTRICITY:   // SPONGE CONDUCTS ELECTRICITY
                    case FENCE      :   // SPONGE CLEANS FENCE
                    case FILM       :   // SPONGE CLEANS FILM
                    case GOLD       :   // SPONGE CLEANS GOLD
                    case GRASS      :   // SPONGE SITS ON GRASS
                    case GUITAR     :   // SPONGE CLEANS GUITAR
                    case GUN        :   // SPONGE CLEANS GUN
                    case HEART      :   // SPONGE HAS NO HEART
                    case HELICOPTER :   // SPONGE CLEANS HELICOPTER
                    case LASER      :   // SPONGE CLEANS LASER
                    case LIGHTNING  :   // SPONGE CONDUCTS LIGHTNING
                    case MATH       :   // SPONGE DOESN'T USE MATH
                    case MEDUSA     :   // SPONGE CLEANSES MEDUSA
                    case MOON       :   // SPONGE LOOKS LIKE MOON
                    case MOUNTAIN   :   // SPONGE PILE MOUNTAIN
                    case NUKE       :   // SPONGE CLEANS NUKE
                    case PAPER      :   // SPONGE SOAKS PAPER
                    case PIT        :   // SPONGE CLEANS PIT
                    case PLANET     :   // SPONGE LIVES ON PLANET
                    case PLATINUM   :   // SPONGE CLEANS PLATINUM
                    case POWER      :   // SPONGE HAS CLEANING POWER
                    case PRAYER     :   // SPONGE ANSWERS PRAYER
                    case QUICKSAND  :   // SPONGE FLOATS ON QUICKSAND
                    case RAIN       :   // SPONGE ABSORBS RAIN
                    case RAINBOW    :   // SPONGE CREATES RAINBOW
                    case ROBOT      :   // SPONGE CLEANS ROBOT
                    case SATAN      :   // SPONGE CLEANSES SATAN
                    case SKY        :   // SPONGE CLEANS SKYLIGHT
                    case TANK       :   // SPONGE CLEANS TANK
                    case TOILET     :   // SPONGE CLEANS TOILET
                    case TORNADO    :   // SPONGE CLEANS AFTER TORNADO
                    case TV         :   // SPONGE BOB ON TV
                    case UFO        :   // SPONGE CLEANS UFO
                    case VIDEO_GAME :   // SPONGE CLEANS VIDEO GAME
                    case WATER      :   // SPONGE ABSORBS WATER
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BRAIN      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAINSAW   :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DEATH      :
                    case DUCK       :
                    case FIRE       :
                    case FISH       :
                    case HOME       :
                    case KING       :
                    case LAW        :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case NOISE      :
                    case PEACE      :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SUN        :
                    case SWORD      :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case SUN:
                switch (them) {
                    case SUN:
                        tie();
                        break;
                    case AIRPLANE   :   // SUN ABOVE AIRPLANE
                    case AXE        :   // SUN MELTS AXE
                    case BABY       :   // SUN WARMS BABY
                    case BICYCLE    :   // SUN SHINES ON BICYCLE
                    case BIRD       :   // SUN WARMS BIRD
                    case BLOOD      :   // SUN WARMS BLOOD
                    case BOOK       :   // SUN SHINES IN BOOK
                    case BRAIN      :   // SUN WARMS BRAIN
                    case BUTTER     :   // SUN MELTS BUTTER
                    case CAGE       :   // SUN HEATS CAGE
                    case CAMERA     :   // SUN RUINS CAMERA
                    case CAR        :   // SUN SHINES ON CAR
                    case CASTLE     :   // SUN SHINES ON CASTLE
                    case CAT        :   // SUN WARMS CAT
                    case CHAINSAW   :   // SUN WARMS CHAINSAW WORKER
                    case CHURCH     :   // SUN SHINES ON CHURCH
                    case CLOUD      :   // SUN BURNS OFF CLOUD
                    case COCKROACH  :   // SUN WARMS COCKROACH
                    case COMMUNITY  :   // SUN WARMS COMMUNITY
                    case COMPUTER   :   // SUN COOKS COMPUTER
                    case CROSS      :   // SUN SHINES ON CROSS
                    case DUCK       :   // SUN WARMS DUCK
                    case FIRE       :   // SUN MADE OF FIRE
                    case FISH       :   // SUN WARMS FISH
                    case HOME       :   // SUN WARMS HOME
                    case KING       :   // SUN WARMS KING
                    case MAN        :   // SUN WARMS MAN
                    case MONEY      :   // SUN SAVES MONEY
                    case MONKEY     :   // SUN WARMS MONKEY
                    case NOISE      :   // SUN MAKES NO NOISE
                    case PAPER      :   // SUN SHINES THROUGH PAPER
                    case PEACE      :   // SUN EMBODIES PEACE
                    case POISON     :   // SUN NOT AFFECTED BY POISON
                    case POLICE     :   // SUN WARMS POLICE
                    case PORCUPINE  :   // SUN WARMS PORCUPINE
                    case PRINCE     :   // SUN WARMS PRINCE
                    case PRINCESS   :   // SUN WARMS PRINCESS
                    case QUEEN      :   // SUN WARMS QUEEN
                    case SCHOOL     :   // SUN SHINES ON SCHOOL
                    case SCISSORS   :   // SUN MELTS SCISSORS
                    case SNAKE      :   // SUN WARMS SNAKE
                    case SPIDER     :   // SUN WARMS SPIDER
                    case SPONGE     :   // SUN DRIES UP SPONGE
                    case TRAIN      :   // SUN SHINES ON TRAIN
                    case TREE       :   // SUN FEEDS TREE
                    case TURNIP     :   // SUN FEEDS TURNIP
                    case VAMPIRE    :   // SUN KILLS VAMPIRE
                    case VULTURE    :   // SUN WARMS VULTURE
                    case WOLF       :   // SUN WARMS WOLF
                    case WOMAN      :   // SUN WARMS WOMAN
                        win();
                        break;
                    case AIR        :
                    case ALIEN      :
                    case BEER       :
                    case BOWL       :
                    case CHAIN      :
                    case CUP        :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOON       :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PIT        :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SKY        :
                    case SWORD      :
                    case TANK       :
                    case TOILET     :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WALL       :
                    case WATER      :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case SWORD:
                switch (them) {
                    case SWORD:
                        tie();
                        break;
                    case AXE        :   // SWORD OUTCLASSES AXE
                    case BABY       :   // SWORD STABS BABY
                    case BICYCLE    :   // SWORD PUNCTURES BICYCLE TIRES
                    case BIRD       :   // SWORD STABS BIRD
                    case BLOOD      :   // SWORD SPILLS BLOOD
                    case BRAIN      :   // SWORD CHOPS UP BRAIN
                    case BUTTER     :   // SWORD SPREADS BUTTER
                    case CAGE       :   // SWORD PICKS CAGE LOCK
                    case CAMERA     :   // SWORD CHOPS CAMERA
                    case CAR        :   // SWORD PUNCTURES CAR TIRES
                    case CASTLE     :   // SWORD PROTECTS CASTLE
                    case CAT        :   // SWORD DICES CAT
                    case CHAINSAW   :   // SWORD FASTER THAN CHAINSAW
                    case CHURCH     :   // SWORD DEFENDS CHURCH
                    case COCKROACH  :   // SWORD JULIENNES COCKROACH
                    case COMMUNITY  :   // SWORD PROTECTS COMMUNITY
                    case COMPUTER   :   // SWORD SMITES COMPUTER
                    case CROSS      :   // SWORD SERVES CROSS
                    case DEATH      :   // SWORD CAUSES DEATH
                    case DUCK       :   // SWORD STABS DUCK
                    case FIRE       :   // SWORD (FLAMING) HAS FIRE
                    case FISH       :   // SWORD GUTS FISH
                    case HOME       :   // SWORD PROTECTS HOME
                    case KING       :   // SWORD SLAYS KING
                    case MAN        :   // SWORD STABS MAN
                    case MONEY      :   // SWORD COSTS MONEY
                    case MONKEY     :   // SWORD STABS MONKEY
                    case NOISE      :   // SWORD MAKES NOISE
                    case PEACE      :   // SWORD BREAKS PEACE
                    case POISON     :   // SWORD FASTER THAN POISON
                    case POLICE     :   // SWORD STABS POLICE
                    case PORCUPINE  :   // SWORD STABS PORCUPINE
                    case PRINCE     :   // SWORD SLAYS PRINCE
                    case PRINCESS   :   // SWORD SLAYS PRINCESS
                    case QUEEN      :   // SWORD SLAYS QUEEN
                    case ROCK       :   // SWORD IN THE STONE (ROCK)
                    case SCHOOL     :   // SWORD TERRORIZES SCHOOL
                    case SCISSORS   :   // SWORD OUTCLASSES SCISSORS
                    case SNAKE      :   // SWORD CHOPS UP SNAKE
                    case SPIDER     :   // SWORD MINCES SPIDER
                    case SPONGE     :   // SWORD CHOPS SPONGE
                    case SUN        :   // SWORD REFLECTS SUN
                    case TRAIN      :   // SWORD UNHOOKS TRAIN CARS
                    case TREE       :   // SWORD CARVES TREE
                    case TURNIP     :   // SWORD CUTS UP TURNIP
                    case VAMPIRE    :   // SWORD IMPALES VAMPIRE
                    case VULTURE    :   // SWORD STABS VULTURE
                    case WALL       :   // SWORD SCARS WALL
                    case WOLF       :   // SWORD SLICES WOLF
                    case WOMAN      :   // SWORD STABS WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BOOK       :
                    case BOWL       :
                    case CHAIN      :
                    case CLOUD      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOON       :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PAPER      :
                    case PIT        :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SKY        :
                    case TANK       :
                    case TOILET     :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WATER      :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case TANK:
                switch (them) {
                    case TANK:
                        tie();
                        break;
                    case AXE        :   // TANK OUTCLASSES AXE
                    case BABY       :   // TANK SQUASHES BABY
                    case BICYCLE    :   // TANK FLATTENS BICYCLE
                    case BIRD       :   // TANK SQUASHES BIRD NEST
                    case BLOOD      :   // TANK SPILLS BLOOD
                    case CAGE       :   // TANK SMASHES THROUGH CAGE
                    case CAMERA     :   // TANK CRUSHES CAMERA
                    case CAR        :   // TANK FLATTENS CAR
                    case CASTLE     :   // TANK SEIGES CASTLE
                    case CAT        :   // TANK SQUASHES CAT
                    case CHAIN      :   // TANK BREAKS CHAIN
                    case CHAINSAW   :   // TANK OUTCLASSES CHAINSAW
                    case COMPUTER   :   // TANK FLATTENS COMPUTER
                    case DEATH      :   // TANK BRINGS DEATH
                    case DUCK       :   // TANK SQUASHES DUCK
                    case DYNAMITE   :   // TANK RESISTS DYNAMITE
                    case FIRE       :   // TANK RESISTS FIRE
                    case FISH       :   // TANK SQUOOSHES FISH
                    case GUN        :   // TANK HAS GUN
                    case HELICOPTER :   // TANK OUTCLASSES HELICOPTER
                    case HOME       :   // TANK FLATTENS HOME
                    case KING       :   // TANK SQUASHES KING
                    case LAW        :   // TANK IMPOSES LAW
                    case MAN        :   // TANK SQUASHES MAN
                    case MONKEY     :   // TANK SQUISHES MONKEY
                    case NOISE      :   // TANK MAKES NOISE
                    case PEACE      :   // TANK BREAKS PEACE
                    case PIT        :   // TANK CREATES PIT
                    case POISON     :   // TANK MORE DIRECT THAN POISON
                    case POLICE     :   // TANK OUTCLASSES POLICE
                    case PORCUPINE  :   // TANK SQUASHES PORCUPINE
                    case PRINCE     :   // TANK SQUASHES PRINCE
                    case PRINCESS   :   // TANK SQUASHES PRINCESS
                    case QUEEN      :   // TANK SQUASHES QUEEN
                    case QUICKSAND  :   // TANK PLOWS OVER QUICKSAND
                    case ROCK       :   // TANK CRUMBLES ROCK
                    case SCHOOL     :   // TANK CRUMBLES SCHOOL
                    case SCISSORS   :   // TANK CRUSHES SCISSORS
                    case SNAKE      :   // TANK FLATTENS SNAKE
                    case SUN        :   // TANK CLOUD BLOCKS SUN
                    case SWORD      :   // TANK OUTCLASSES SWORD
                    case TORNADO    :   // TANK SURVIVES TORNADO
                    case TRAIN      :   // TANK BARRELS THOUGH TRAIN
                    case TREE       :   // TANK KNOCKS DOWN TREE
                    case TURNIP     :   // TANK PULVERIZES TURNIP
                    case VULTURE    :   // TANK ATTRACTS VULTURE
                    case WALL       :   // TANK CRUMBLES WALL
                    case WHIP       :   // TANK OUTCLASSES WHIP
                    case WOLF       :   // TANK SQUASHES WOLF
                    case WOMAN      :   // TANK SQUASHES WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HEART      :
                    case LASER      :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SKY        :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case TOILET:
                switch (them) {
                    case TOILET:
                        tie();
                        break;
                    case AIR        :   // TOILET SPOILS AIR
                    case ALIEN      :   // TOILET INTRIGUES ALIEN
                    case BEER       :   // TOILET SOON CONTAINS BEER
                    case BOWL       :   // TOILET BOWL
                    case CAMERA     :   // TOILET FLUSHES CAMERA
                    case CHAIN      :   // TOILET USES CHAIN
                    case CHAINSAW   :   // TOILET RESISTS CHAINSAW
                    case CUP        :   // TOILET HOLDS MORE THAN CUP
                    case DEATH      :   // TOILET SMELLS OF DEATH
                    case DEVIL      :   // TOILET SMELLS LIKE DEVIL
                    case DIAMOND    :   // TOILET HIDES DIAMOND
                    case DRAGON     :   // TOILET CONFUSES DRAGON
                    case DYNAMITE   :   // TOILET STINKIER THAN DYNAMITE
                    case ELECTRICITY:   // TOILET CONDUCTS ELECTRICITY
                    case FENCE      :   // TOILET CAN BE FENCE
                    case FIRE       :   // TOILET DOUSES FIRE
                    case GOLD       :   // TOILET CONTAINS GOLD
                    case GUITAR     :   // TOILET -MOUTHED GUITARIST
                    case GUN        :   // TOILET RESISTS GUN
                    case HEART      :   // TOILET GOOD FOR HEART
                    case HELICOPTER :   // TOILET NEED DIVERTS HELICOPTER
                    case LASER      :   // TOILET REFLECTS LASER
                    case LAW        :   // TOILET FLUSHES LAW
                    case LIGHTNING  :   // TOILET ATTRACTS LIGHTNING
                    case MATH       :   // TOILET EASIER THAN MATH
                    case MEDUSA     :   // TOILET LESS STINKY THAN MEDUSA
                    case MOUNTAIN   :   // TOILET HOLDS MOUNTAIN
                    case NUKE       :   // TOILET SMELLS LIKE NUKE
                    case PIT        :   // TOILET IS THE PITS
                    case PLANET     :   // TOILET POLLUTES PLANET
                    case PLATINUM   :   // TOILET COLORED PLATINUM
                    case POWER      :   // TOILET HAS STINK POWER
                    case PRAYER     :   // TOILET ANSWERS PRAYER
                    case QUICKSAND  :   // TOILET CONTAINS QUICKSAND
                    case RAIN       :   // TOILET CATCHES RAIN
                    case RAINBOW    :   // TOILET REFLECTS RAINBOW
                    case ROBOT      :   // TOILET CONFUSES ROBOTS
                    case ROCK       :   // TOILET HARD AS ROCK
                    case SATAN      :   // TOILET SMELLS OF SATAN
                    case SKY        :   // TOILET STINKS SKY HIGH
                    case SUN        :   // TOILET BETTER WITHOUT SUN
                    case SWORD      :   // TOILET RESISTS SWORD
                    case TANK       :   // TOILET TANK
                    case TORNADO    :   // TOILET SURVIVES TORNADO
                    case TV         :   // TOILET LESS OFFENSIVE THAN TV
                    case UFO        :   // TOILET HOLDS UFO (Unidentified Floating Object)
                    case VIDEO_GAME :   // TOILET DISRUPTS VIDEO GAME
                    case WALL       :   // TOILET MORE LEGAL THAN WALL
                    case WATER      :   // TOILET USES WATER
                    case WHIP       :   // TOILET RESISTS WHIP
                        win();
                        break;
                    case AIRPLANE   :
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BOOK       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAGE       :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PEACE      :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case TORNADO:
                switch (them) {
                    case TORNADO:
                        tie();
                        break;
                    case AXE        :   // TORNADO SWEEPS AWAY AXE
                    case BABY       :   // TORNADO SWEEPS AWAY BABY
                    case BICYCLE    :   // TORNADO SWEEPS AWAY BICYCLE
                    case BIRD       :   // TORNADO SWEEPS AWAY BIRD
                    case BLOOD      :   // TORNADO SPILLS BLOOD
                    case BRAIN      :   // TORNADO CONFOUNDS BRAIN
                    case CAGE       :   // TORNADO SWEEPS AWAY CAGE
                    case CAMERA     :   // TORNADO CHALLENGES CAMERA
                    case CAR        :   // TORNADO SWEEPS AWAY CAR
                    case CASTLE     :   // TORNADO DESTROYS CASTLE
                    case CAT        :   // TORNADO SWEEPS AWAY CAT
                    case CHAIN      :   // TORNADO BREAKS CHAIN
                    case CHAINSAW   :   // TORNADO SWEEPS AWAY CHAINSAW
                    case COCKROACH  :   // TORNADO WRECKS HOME OF COCKROACH
                    case COMPUTER   :   // TORNADO DESTROYS COMPUTER
                    case DEATH      :   // TORNADO CAUSES DEATH
                    case DUCK       :   // TORNADO SWEEPS AWAY DUCK
                    case FIRE       :   // TORNADO STARTS FIRE
                    case FISH       :   // TORNADO SWEEPS AWAY FISH
                    case GUN        :   // TORNADO SWEEPS AWAY GUN
                    case HOME       :   // TORNADO DESTROYS HOME
                    case KING       :   // TORNADO SWEEPS AWAY KING
                    case LAW        :   // TORNADO KNOWS NO LAW
                    case MAN        :   // TORNADO SWEEPS AWAY MAN
                    case MONKEY     :   // TORNADO SWEEPS AWAY MONKEY
                    case NOISE      :   // TORNADO MAKES NOISE
                    case PEACE      :   // TORNADO DISTURBS PEACE
                    case PIT        :   // TORNADO IS AIR PIT
                    case POISON     :   // TORNADO SWEEPS AWAY POISON
                    case POLICE     :   // TORNADO SWEEPS AWAY POLICE
                    case PORCUPINE  :   // TORNADO SWEEPS AWAY PORCUPINE
                    case PRINCE     :   // TORNADO SWEEPS AWAY PRINCE
                    case PRINCESS   :   // TORNADO SWEEPS AWAY PRINCESS
                    case QUEEN      :   // TORNADO SWEEPS AWAY QUEEN
                    case QUICKSAND  :   // TORNADO OUTCLASSES QUICKSAND
                    case ROCK       :   // TORNADO SWEEPS AWAY ROCK
                    case SCHOOL     :   // TORNADO DESTROYS SCHOOL
                    case SCISSORS   :   // TORNADO SWEEPS AWAY SCISSORS
                    case SNAKE      :   // TORNADO SWEEPS AWAY SNAKE
                    case SPIDER     :   // TORNADO SWEEPS AWAY SPIDER
                    case SUN        :   // TORNADO BLOCKS SUN
                    case SWORD      :   // TORNADO SWEEPS AWAY SWORD
                    case TRAIN      :   // TORNADO DERAILS TRAIN
                    case TREE       :   // TORNADO SWEEPS AWAY TREE
                    case TURNIP     :   // TORNADO SWEEPS AWAY TURNIP
                    case VULTURE    :   // TORNADO SWEEPS AWAY VULTURE
                    case WALL       :   // TORNADO DESTROYS WALL
                    case WHIP       :   // TORNADO SWEEPS AWAY WHIP
                    case WOLF       :   // TORNADO SWEEPS AWAY WOLF
                    case WOMAN      :   // TORNADO SWEEPS AWAY WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BOOK       :
                    case BOWL       :
                    case BUTTER     :
                    case CHURCH     :
                    case CLOUD      :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SKY        :
                    case SPONGE     :
                    case TANK       :
                    case TOILET     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case VIDEO_GAME :
                    case WATER      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case TRAIN:
                switch (them) {
                    case TRAIN:
                        tie();
                        break;
                    case AIR        :   // TRAIN IS AIR CONDITIONED
                    case AIRPLANE   :   // TRAIN SAFER THAN AIRPLANE
                    case ALIEN      :   // TRAIN INTRIGUES ALIEN
                    case BEER       :   // TRAIN SELLS BEER
                    case BICYCLE    :   // TRAIN FASTER THAN BICYCLE
                    case BIRD       :   // TRAIN SCARES BIRD
                    case BOOK       :   // TRAIN CONTAINS BOOK
                    case BOWL       :   // TRAIN CARRIES BOWL
                    case BRAIN      :   // TRAIN REQUIRES BRAINS
                    case BUTTER     :   // TRAIN CONTAINS BUTTER
                    case CAR        :   // TRAIN FASTER THAN CAR
                    case CAT        :   // TRAIN SCARES CAT
                    case CHURCH     :   // TRAIN COZIER THAN CHURCH
                    case CLOUD      :   // TRAIN CREATES CLOUD
                    case COCKROACH  :   // TRAIN HOUSES COCKROACH
                    case COMMUNITY  :   // TRAIN SERVES COMMUNITY
                    case CROSS      :   // TRAIN CROSSING
                    case CUP        :   // TRAIN CARRIES CUP
                    case DEVIL      :   // TRAIN AMUSES DEVIL
                    case DIAMOND    :   // TRAIN PRICIER THAN DIAMOND
                    case DRAGON     :   // TRAIN OUTRUNS DRAGON
                    case DUCK       :   // TRAIN SCARES DUCK
                    case FENCE      :   // TRAIN CRASHES THROUGH FENCE
                    case FILM       :   // TRAIN IN FILM
                    case FISH       :   // TRAIN CONTAINS FISH
                    case GOLD       :   // TRAIN PRICIER THAN GOLD
                    case GRASS      :   // TRAIN WHIZZES THROUGH GRASS
                    case GUITAR     :   // TRAIN CARRIES GUITAR
                    case MONEY      :   // TRAIN COSTS MONEY
                    case MOON       :   // TRAIN REFLECTS MOON
                    case MOUNTAIN   :   // TRAIN CLIMBS MOUNTAIN
                    case NOISE      :   // TRAIN MAKES NOISE
                    case PAPER      :   // TRAIN CONTAINS PAPER
                    case PLANET     :   // TRAIN TRAVELS PLANET
                    case PLATINUM   :   // TRAIN PRICIER THAN PLATINUM
                    case PRAYER     :   // TRAIN ANSWERS PRAYER
                    case RAIN       :   // TRAIN BLOCKS RAIN
                    case RAINBOW    :   // TRAIN REFLECTS RAINBOW
                    case SATAN      :   // TRAIN AMUSES SATAN
                    case SPIDER     :   // TRAIN HOUSES SPIDER
                    case SPONGE     :   // TRAIN CARRIES SPONGE
                    case TOILET     :   // TRAIN HAS TOILET
                    case TREE       :   // TRAIN AROUND TREE
                    case TURNIP     :   // TRAIN CONTAINS TURNIP
                    case TV         :   // TRAIN HAS TV
                    case UFO        :   // TRAIN ATTRACTS UFO
                    case VAMPIRE    :   // TRAIN OUTRUNS VAMPIRE
                    case VIDEO_GAME :   // TRAIN IN VIDEO GAME
                    case WATER      :   // TRAIN PLUMBS WATER
                    case WOLF       :   // TRAIN SCARES WOLF
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FIRE       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case HOME       :
                    case KING       :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MAN        :
                    case MATH       :
                    case MEDUSA     :
                    case MONKEY     :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case POWER      :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROBOT      :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case TREE:
                switch (them) {
                    case TREE:
                        tie();
                        break;
                    case AIR        :   // TREE PRODUCES AIR
                    case AIRPLANE   :   // TREE DIVERTS AIRPLANE
                    case ALIEN      :   // TREE ENSNARES ALIEN SHIP
                    case BEER       :   // TREE INSPIRES BEER
                    case BIRD       :   // TREE HOUSES BIRD
                    case BOOK       :   // TREE CREATES BOOK
                    case BOWL       :   // TREE WOOD CREATES BOWL
                    case BRAIN      :   // TREE HAS NO BRAIN
                    case BUTTER     :   // TREE OUTLASTS BUTTER
                    case CAT        :   // TREE TRAPS CAT
                    case CHURCH     :   // TREE SHADES CHURCH
                    case CLOUD      :   // TREE BLOCKS CLOUD
                    case COCKROACH  :   // TREE SHELTERS COCKROACH
                    case COMMUNITY  :   // TREE BEAUTIFIES COMMUNITY
                    case CROSS      :   // TREE BUILDS CROSS
                    case CUP        :   // TREE WOOD CREATES CUP
                    case DEVIL      :   // TREE IMPRISONS DEVIL
                    case DIAMOND    :   // TREE ROOTS HIDE DIAMOND
                    case DRAGON     :   // TREE SHELTERS DRAGON
                    case DUCK       :   // TREE SHELTERS DUCK
                    case ELECTRICITY:   // TREE CONDUCTS ELECTRICITY
                    case FENCE      :   // TREE TALLER THAN FENCE
                    case FILM       :   // TREE IN FILM
                    case FISH       :   // TREE SHELTERS FISH
                    case GOLD       :   // TREE ROOTS HIDE GOLD
                    case GRASS      :   // TREE GROWS IN GRASS
                    case GUITAR     :   // TREE WOOD CREATES GUITAR
                    case HEART      :   // TREE HAS NO HEART
                    case MATH       :   // TREE DOESN'T NEED MATH
                    case MONEY      :   // TREE DOESN'T GROW MONEY
                    case MOON       :   // TREE BLOCKS MOON
                    case MOUNTAIN   :   // TREE GROWS ON MOUNTAIN
                    case PAPER      :   // TREE CREATES PAPER
                    case PLANET     :   // TREE GROWS ON PLANET
                    case PLATINUM   :   // TREE ROOTS HIDE PLATINUM
                    case PRAYER     :   // TREE SHELTERS PRAYER
                    case RAIN       :   // TREE LOVES RAIN
                    case RAINBOW    :   // TREE BLOCKS RAINBOW
                    case ROBOT      :   // TREE TALLER THAN ROBOT
                    case SATAN      :   // TREE IMPRISONS SATAN
                    case SPIDER     :   // TREE HOUSES SPIDER
                    case SPONGE     :   // TREE OUTLIVES SPONGE
                    case TOILET     :   // TREE BECOMES TOILET
                    case TURNIP     :   // TREE TALLER THAN TURNIP
                    case TV         :   // TREE ON TV
                    case UFO        :   // TREE ENSNARES UFO
                    case VAMPIRE    :   // TREE HIDES VAMPIRE
                    case VIDEO_GAME :   // TREE WISER THAN VIDEO GAME
                    case WATER      :   // TREE DRINKS WATER
                    case WOLF       :   // TREE SHELTERS WOLF
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DYNAMITE   :
                    case FIRE       :
                    case GUN        :
                    case HELICOPTER :
                    case HOME       :
                    case KING       :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MAN        :
                    case MEDUSA     :
                    case MONKEY     :
                    case NOISE      :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case POWER      :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TRAIN      :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case TURNIP:
                switch (them) {
                    case TURNIP:
                        tie();
                        break;
                    case AIR        :   // TURNIP ODORIZES AIR
                    case AIRPLANE   :   // TURNIP IN AIRPLANE FOOD
                    case ALIEN      :   // TURNIP DISGUSTS ALIEN
                    case BEER       :   // TURNIP FALLS IN BEER
                    case BIRD       :   // TURNIP THROWN AT BIRD
                    case BOOK       :   // TURNIP RECIPE BOOK
                    case BOWL       :   // TURNIP STAINS BOWL
                    case BRAIN      :   // TURNIP HAS NO BRAIN
                    case BUTTER     :   // TURNIP IN BUTTER
                    case CAT        :   // TURNIP THROWN AT CAT
                    case CHURCH     :   // TURNIP THROWN AT CHURCH
                    case CLOUD      :   // TURNIP GAS CLOUD
                    case COCKROACH  :   // TURNIP SQUASHES COCKROACH
                    case COMMUNITY  :   // TURNIP FEEDS COMMUNITY
                    case CROSS      :   // TURNIP ROOTS FORM CROSS
                    case CUP        :   // TURNIP STAINS CUP
                    case DEVIL      :   // TURNIP DISGUSTS DEVIL
                    case DIAMOND    :   // TURNIP ROOTS HIDE DIAMOND
                    case DRAGON     :   // TURNIP THROWN AT DRAGON
                    case DUCK       :   // TURNIP THROWN AT DUCK
                    case ELECTRICITY:   // TURNIP CONDUCTS ELECTRICITY
                    case FENCE      :   // TURNIP GROWS ALONG FENCE
                    case FILM       :   // TURNIP STAINS FILM
                    case FISH       :   // TURNIP SIMPLER THAN FISH
                    case GOLD       :   // TURNIP ROOTS HIDE GOLD
                    case GRASS      :   // TURNIP GROWS IN GRASS
                    case GUITAR     :   // TURNIP THROWN AT GUITAR
                    case HEART      :   // TURNIP GOOD FOR HEART
                    case LIGHTNING  :   // TURNIP HIDES FROM LIGHTNING
                    case MATH       :   // TURNIP DOESN'T NEED MATH
                    case MONEY      :   // TURNIP COSTS MONEY
                    case MOON       :   // TURNIP GROWS DESPITE MOON
                    case MOUNTAIN   :   // TURNIP GROWS ON MOUNTAIN
                    case PAPER      :   // TURNIP STAINS PAPER
                    case PLANET     :   // TURNIP GROWS ON PLANET
                    case PLATINUM   :   // TURNIP ROOTS HIDE PLATINUM
                    case PRAYER     :   // TURNIP ANSWERS PRAYER
                    case RAIN       :   // TURNIP LOVES RAIN
                    case RAINBOW    :   // TURNIP FLAVOR RAINBOW
                    case ROBOT      :   // TURNIP THROWN AT ROBOT
                    case SATAN      :   // TURNIP DISGUSTS SATAN
                    case SPIDER     :   // TURNIP SQUASHES SPIDER
                    case SPONGE     :   // TURNIP TASTIER THAN SPONGE
                    case TOILET     :   // TURNIP ENDS UP IN TOILET
                    case TV         :   // TURNIP THROWN AT TV
                    case UFO        :   // TURNIP THROWN AT UFO
                    case VAMPIRE    :   // TURNIP THROWN AT VAMPIRE
                    case VIDEO_GAME :   // TURNIP HEALTHIER THAN VIDEO GAME
                    case WATER      :   // TURNIP DRINKS WATER
                    case WOLF       :   // TURNIP THROWN AT WOLF
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DYNAMITE   :
                    case FIRE       :
                    case GUN        :
                    case HELICOPTER :
                    case HOME       :
                    case KING       :
                    case LASER      :
                    case LAW        :
                    case MAN        :
                    case MEDUSA     :
                    case MONKEY     :
                    case NOISE      :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case POWER      :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TRAIN      :
                    case TREE       :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case TV:
                switch (them) {
                    case TV:
                        tie();
                        break;
                    case ALIEN      :   // TV DEBUNKS ALIEN
                    case AXE        :   // TV SHOW AXED
                    case CAGE       :   // TV TURNS ROOM INTO CAGE
                    case CAMERA     :   // TV CAMERA
                    case CASTLE     :   // TV ABOUT CASTLE
                    case CHAIN      :   // TV STOLEN DESPITE CHAIN
                    case COMPUTER   :   // TV BEFORE COMPUTER
                    case DEATH      :   // TV GLORIFIES DEATH
                    case DEVIL      :   // TV INSPIRES DEVIL
                    case DIAMOND    :   // TV SHARP AS DIAMOND
                    case DRAGON     :   // TV ABOUT DRAGON
                    case DYNAMITE   :   // TV CHARACTER SAYS DYNAMITE
                    case ELECTRICITY:   // TV USES ELECTRICITY
                    case FENCE      :   // TV BROADCAST OVER FENCE
                    case FILM       :   // TV AIRS CHAINSAW FILM
                    case FIRE       :   // TV REPORTS FIRE
                    case GOLD       :   // TV WIRES ARE GOLD
                    case GUN        :   // TV GLORIFIES GUNS
                    case HEART      :   // TV BAD FOR HEART
                    case HELICOPTER :   // TV NEWS HELICOPTER
                    case LASER      :   // TV MEDIA USES LASER
                    case LAW        :   // TV REGULATORS MAKE LAWS
                    case LIGHTNING  :   // TV ATTRACTS LIGHTNING
                    case MATH       :   // TV TECH USES MATH
                    case MEDUSA     :   // TV ABOUT MEDUSA
                    case MOUNTAIN   :   // TV BROADCAST OVER MOUNTAIN
                    case NUKE       :   // TV ABOUT NUKES
                    case PEACE      :   // TV DISTURBS PEACE
                    case PIT        :   // TV IS THE PITS
                    case PLATINUM   :   // TV WIRES ARE PLATINUM
                    case POISON     :   // TV IS POISON
                    case POWER      :   // TV CONSUMES POWER
                    case PRAYER     :   // TV DELIVERS PRAYER
                    case QUICKSAND  :   // TV TIME QUICKSAND
                    case RAINBOW    :   // TV COLOR RAINBOW
                    case ROBOT      :   // TV BEFORE ROBOT
                    case ROCK       :   // TV AIRS ROCK CONCERT
                    case SATAN      :   // TV ABOUT SATAN
                    case SCHOOL     :   // TV TEACHES SCHOOL
                    case SCISSORS   :   // TV RESISTS SCISSORS
                    case SKY        :   // TV REPLACES SKY
                    case SNAKE      :   // TV RUN BY SNAKES
                    case SUN        :   // TV ABOUT SUN
                    case SWORD      :   // TV ABOUT SWORDS
                    case TANK       :   // TV GUIDES TANK
                    case TORNADO    :   // TV PREDICTS TORNADO
                    case UFO        :   // TV DEBUNKS UFO
                    case VIDEO_GAME :   // TV BEFORE VIDEO GAME
                    case WALL       :   // TV HANGS ON WALL
                    case WHIP       :   // TV SHARP AS A WHIP
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case BABY       :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CAT        :
                    case CHAINSAW   :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DUCK       :
                    case FISH       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case RAIN       :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WATER      :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case UFO:
                switch (them) {
                    case UFO:
                        tie();
                        break;
                    case ALIEN      :   // UFO CARRIES ALIEN
                    case AXE        :   // UFO RESISTS AXE
                    case BLOOD      :   // UFO COLLECTS BLOOD
                    case CAGE       :   // UFO EVADES CAGE
                    case CAMERA     :   // UFO EVADES CAMERA
                    case CASTLE     :   // UFO FLIES OVER CASTLE
                    case CHAIN      :   // UFO VAPORIZES CHAIN
                    case CHAINSAW   :   // UFO RESISTS CHAINSAW
                    case COMPUTER   :   // UFO USES COMPUTER
                    case DEATH      :   // UFO CAUSES DEATH
                    case DEVIL      :   // UFO UNAWARE OF DEVIL
                    case DIAMOND    :   // UFO USES DIAMOND
                    case DRAGON     :   // UFO SPIES ON DRAGON
                    case DYNAMITE   :   // UFO RESISTS DYNAMITE
                    case ELECTRICITY:   // UFO USES ELECTRICITY
                    case FENCE      :   // UFO FLIES OVER FENCE
                    case FIRE       :   // UFO STARTS FIRE
                    case GOLD       :   // UFO MADE OF GOLD
                    case GUN        :   // UFO RESISTS GUN
                    case HEART      :   // UFO ABDUCTS HEART
                    case HELICOPTER :   // UFO EVADES HELICOPTER
                    case LASER      :   // UFO SHOOTS LASER
                    case LAW        :   // UFO BREAKS PHYSICAL LAW
                    case LIGHTNING  :   // UFO SHOOTS LIGHTNING
                    case MATH       :   // UFO USES ADVANCED MATH
                    case MEDUSA     :   // UFO OUTCLASSES MEDUSA
                    case MOUNTAIN   :   // UFO FLIES OVER MOUNTAIN
                    case NUKE       :   // UFO STEALS NUKE
                    case PEACE      :   // UFO DISTURBS PEACE
                    case PIT        :   // UFO FLIES OVER PIT
                    case PLATINUM   :   // UFO MADE OF PLATINUM
                    case POISON     :   // UFO RESISTS POISON
                    case PORCUPINE  :   // UFO VAPORIZES PORCUPINE
                    case POWER      :   // UFO USES ADVANCED POWER
                    case PRAYER     :   // UFO DESPITE PRAYER
                    case QUICKSAND  :   // UFO FLIES OVER QUICKSAND
                    case ROBOT      :   // UFO COMMANDS ROBOT
                    case ROCK       :   // UFO VAPORIZES ROCK
                    case SATAN      :   // UFO UNAWARE OF SATAN
                    case SCHOOL     :   // UFO FLIES OVER SCHOOL
                    case SCISSORS   :   // UFO RESISTS SCISSORS
                    case SKY        :   // UFO FLIES ACROSS SKY
                    case SNAKE      :   // UFO ABDUCTS SNAKE
                    case SUN        :   // UFO FLIES TO SUN
                    case SWORD      :   // UFO RESISTS SWORD
                    case TANK       :   // UFO FLIES OVER TANK
                    case TORNADO    :   // UFO FLIES OVER TORNADO
                    case VIDEO_GAME :   // UFO IN VIDEO GAME
                    case WALL       :   // UFO FLIES OVER WALL
                    case WHIP       :   // UFO RESISTS WHIP
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case BABY       :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case POLICE     :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case RAIN       :
                    case RAINBOW    :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WATER      :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case VAMPIRE:
                switch (them) {
                    case VAMPIRE:
                        tie();
                        break;
                    case AIR        :   // VAMPIRE BREATHES AIR
                    case AIRPLANE   :   // VAMPIRE FLIES ON AIRPLANE
                    case ALIEN      :   // VAMPIRE BEFORE ALIEN
                    case BEER       :   // VAMPIRE SEDUCES WITH BEER
                    case BOOK       :   // VAMPIRE IN BOOK
                    case BOWL       :   // VAMPIRE DISCARDS BOWL
                    case BUTTER     :   // VAMPIRE DISCARDS BUTTER
                    case CHAIN      :   // VAMPIRE ESCAPES CHAIN
                    case CHURCH     :   // VAMPIRE ANGERS CHURCH
                    case CLOUD      :   // VAMPIRE PREFERS CLOUD
                    case CUP        :   // VAMPIRE DISCARDS CUP
                    case DEVIL      :   // VAMPIRE DEFINES DEVIL
                    case DIAMOND    :   // VAMPIRE SEDUCES WITH DIAMOND
                    case DRAGON     :   // VAMPIRE OUTLIVES DRAGON
                    case DYNAMITE   :   // VAMPIRE SURVIVES DYNAMITE
                    case ELECTRICITY:   // VAMPIRE CONDUCTS ELECTRICITY
                    case FENCE      :   // VAMPIRE FLIES OVER FENCE
                    case FILM       :   // VAMPIRE IN FILM
                    case GOLD       :   // VAMPIRE OWNS GOLD
                    case GRASS      :   // VAMPIRE WALKS ON GRASS
                    case GUITAR     :   // VAMPIRE PLAYS GUITAR
                    case HEART      :   // VAMPIRE HAS IMMORTAL HEART
                    case HELICOPTER :   // VAMPIRE FLIES HELICOPTER
                    case LASER      :   // VAMPIRE SURVIVES LASER
                    case LIGHTNING  :   // VAMPIRE RESISTS LIGHTNING
                    case MATH       :   // VAMPIRE TEACHES MATH
                    case MEDUSA     :   // VAMPIRE OUTLIVES MEDUSA
                    case MOON       :   // VAMPIRE LIVES BY MOON
                    case MOUNTAIN   :   // VAMPIRE FLIES OVER MOUNTAIN
                    case NUKE       :   // VAMPIRE SURVIVES NUKE
                    case PAPER      :   // VAMPIRE WRITES ON PAPER
                    case PIT        :   // VAMPIRE LIVES IN PIT
                    case PLANET     :   // VAMPIRE LEGENDARY ACROSS PLANET
                    case PLATINUM   :   // VAMPIRE OWNS PLATINUM
                    case POWER      :   // VAMPIRE HAS GREAT POWER
                    case PRAYER     :   // VAMPIRE LAUGHS AT PRAYER
                    case QUICKSAND  :   // VAMPIRE FLIES OVER QUICKSAND
                    case RAIN       :   // VAMPIRE STALKS IN RAIN
                    case RAINBOW    :   // VAMPIRE NEVER SEES RAINBOW
                    case ROBOT      :   // VAMPIRE BEFORE ROBOT
                    case SATAN      :   // VAMPIRE DEFINES SATAN
                    case SKY        :   // VAMPIRE FLIES IN SKY
                    case SPONGE     :   // VAMPIRE DISCARDS SPONGE
                    case TANK       :   // VAMPIRE SURVIVES TANK
                    case TOILET     :   // VAMPIRE USES TOILET
                    case TORNADO    :   // VAMPIRE FLIES IN TORNADO
                    case TV         :   // VAMPIRE ON TV
                    case UFO        :   // VAMPIRE BEFORE UFO
                    case VIDEO_GAME :   // VAMPIRE IN VIDEO GAME
                    case WATER      :   // VAMPIRE DISCARDS WATER
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BRAIN      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CAT        :
                    case CHAINSAW   :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case COMPUTER   :
                    case CROSS      :
                    case DEATH      :
                    case DUCK       :
                    case FIRE       :
                    case FISH       :
                    case GUN        :
                    case HOME       :
                    case KING       :
                    case LAW        :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case NOISE      :
                    case PEACE      :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SNAKE      :
                    case SPIDER     :
                    case SUN        :
                    case SWORD      :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case VIDEO_GAME:
                switch (them) {
                    case VIDEO_GAME:
                        tie();
                        break;
                    case AXE        :   // VIDEO_GAME HAS AXE
                    case BABY       :   // VIDEO_GAME CONFUSES BABY
                    case BLOOD      :   // VIDEO_GAME GLORIFIES BLOOD
                    case CAGE       :   // VIDEO_GAME MENTAL CAGE
                    case CAMERA     :   // VIDEO_GAME MULTIPLE CAMERA ANGLES
                    case CASTLE     :   // VIDEO_GAME BEFORE CASTLE
                    case CHAIN      :   // VIDEO_GAME HAS CHAIN WEAPON
                    case CHAINSAW   :   // VIDEO_GAME HAS CHAINSAW
                    case COMPUTER   :   // VIDEO_GAME ON COMPUTER
                    case DEATH      :   // VIDEO_GAME RESTARTS AFTER DEATH
                    case DYNAMITE   :   // VIDEO_GAME HAS DYNAMITE
                    case ELECTRICITY:   // VIDEO_GAME USES ELECTRICITY
                    case FIRE       :   // VIDEO_GAME CATCHES FIRE
                    case GUN        :   // VIDEO_GAME USES GUN
                    case HEART      :   // VIDEO_GAME AFFECTS HEART
                    case HELICOPTER :   // VIDEO_GAME HAS HELICOPTER
                    case HOME       :   // VIDEO_GAME CLUTTERS HOME
                    case KING       :   // VIDEO_GAME HAS KING
                    case LASER      :   // VIDEO_GAME HAS LASER
                    case LAW        :   // VIDEO_GAME BREAKS FCC LAW
                    case LIGHTNING  :   // VIDEO_GAME ATTRACTS LIGHTNING
                    case MAN        :   // VIDEO_GAME ENTERTAINS MAN
                    case MATH       :   // VIDEO_GAME CODE USES MATH
                    case MEDUSA     :   // VIDEO_GAME CONFUSES MEDUSA
                    case MONKEY     :   // VIDEO_GAME STARS MONKEY
                    case NUKE       :   // VIDEO_GAME HAS NUKE
                    case PEACE      :   // VIDEO_GAME DISTURBS PEACE
                    case PIT        :   // VIDEO_GAME MENTAL PIT
                    case POISON     :   // VIDEO_GAME MENTAL POISON
                    case POLICE     :   // VIDEO_GAME DISTRACTS POLICE
                    case PORCUPINE  :   // VIDEO_GAME RESISTS PORCUPINE
                    case POWER      :   // VIDEO_GAME CONSUMES POWER
                    case PRINCE     :   // VIDEO_GAME HAS PRINCE
                    case PRINCESS   :   // VIDEO_GAME HAS PRINCESS
                    case QUEEN      :   // VIDEO_GAME HAS QUEEN
                    case QUICKSAND  :   // VIDEO_GAME MENTAL QUICKSAND
                    case ROBOT      :   // VIDEO_GAME TURNS YOU INTO ROBOT
                    case ROCK       :   // VIDEO_GAME ROCK SOUNDTRACK
                    case SCHOOL     :   // VIDEO_GAME AFTER SCHOOL
                    case SCISSORS   :   // VIDEO_GAME MORE FUN THAN SCISSORS
                    case SKY        :   // VIDEO_GAME SIMULATES SKY
                    case SNAKE      :   // VIDEO_GAME CABLES SNAKE
                    case SUN        :   // VIDEO_GAME REPLACES SUN
                    case SWORD      :   // VIDEO_GAME HAS SWORD
                    case TANK       :   // VIDEO_GAME HAS TANK
                    case TORNADO    :   // VIDEO_GAME GRAPHICS TORNADO
                    case VULTURE    :   // VIDEO_GAME SOLD BY VULTURE
                    case WALL       :   // VIDEO_GAME SIMULATES WALLS
                    case WHIP       :   // VIDEO_GAME HAS WHIP
                    case WOMAN      :   // VIDEO_GAME ENTERTAINS WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DUCK       :
                    case FENCE      :
                    case FILM       :
                    case FISH       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case MONEY      :
                    case MOON       :
                    case MOUNTAIN   :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case PLATINUM   :
                    case PRAYER     :
                    case RAIN       :
                    case RAINBOW    :
                    case SATAN      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case TV         :
                    case UFO        :
                    case VAMPIRE    :
                    case WATER      :
                    case WOLF       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case VULTURE:
                switch (them) {
                    case VULTURE:
                        tie();
                        break;
                    case AIR        :   // VULTURE BREATHES AIR
                    case AIRPLANE   :   // VULTURE FLIES LIKE AIRPLANE
                    case BABY       :   // VULTURE EATS BABY
                    case BEER       :   // VULTURE SPILLS BEER
                    case BICYCLE    :   // VULTURE FLIES OVER BICYCLE
                    case BIRD       :   // VULTURE IS LARGE BIRD
                    case BOOK       :   // VULTURE TEARS UP BOOK
                    case BOWL       :   // VULTURE TIPS OVER BOWL
                    case BRAIN      :   // VULTURE HAS BRAIN
                    case BUTTER     :   // VULTURE EATS BUTTER
                    case CAR        :   // VULTURE FLIES OVER CAR
                    case CAT        :   // VULTURE EATS CAT
                    case CHURCH     :   // VULTURE FLIES OVER CHURCH
                    case CLOUD      :   // VULTURE FLIES AMONG CLOUDS
                    case COCKROACH  :   // VULTURE EATS COCKROACH
                    case COMMUNITY  :   // VULTURE ANNOYS COMMUNITY
                    case CROSS      :   // VULTURE PERCHES ON CROSS
                    case CUP        :   // VULTURE TIPS OVER CUP
                    case DUCK       :   // VULTURE LARGER THAN DUCK
                    case FILM       :   // VULTURE SHREDS FILM
                    case FISH       :   // VULTURE EATS FISH
                    case GRASS      :   // VULTURE LANDS IN GRASS
                    case GUITAR     :   // VULTURE SCRATCHES GUITAR
                    case HOME       :   // VULTURE FLIES OVER HOME
                    case KING       :   // VULTURE EATS KING
                    case MAN        :   // VULTURE EATS MAN
                    case MONEY      :   // VULTURE CARRIES OFF MONEY
                    case MONKEY     :   // VULTURE EATS MONKEY
                    case MOON       :   // VULTURE HUNTS BY MOON
                    case NOISE      :   // VULTURE MAKES NO NOISE
                    case PAPER      :   // VULTURE TEARS UP PAPER
                    case PLANET     :   // VULTURE LIVES ON PLANET
                    case POLICE     :   // VULTURE EATS POLICE
                    case PRINCE     :   // VULTURE EATS PRINCE
                    case PRINCESS   :   // VULTURE EATS PRINCESS
                    case QUEEN      :   // VULTURE EATS QUEEN
                    case RAIN       :   // VULTURE HUNTS DESPITE RAIN
                    case RAINBOW    :   // VULTURE LOOKS AT RAINBOW
                    case SPIDER     :   // VULTURE EATS SPIDER
                    case SPONGE     :   // VULTURE CARRIES OFF SPONGE
                    case TOILET     :   // VULTURE DOESN'T NEED TOILET
                    case TRAIN      :   // VULTURE FLIES OVER TRAIN
                    case TREE       :   // VULTURE FLIES OVER TREE
                    case TURNIP     :   // VULTURE FLIES OVER TURNIP
                    case TV         :   // VULTURE ON TV
                    case UFO        :   // VULTURE SPOTS UFO
                    case VAMPIRE    :   // VULTURE DELIVERS TO VAMPIRE
                    case WATER      :   // VULTURE DRINKS WATER
                    case WOLF       :   // VULTURE EATS WOLF
                    case WOMAN      :   // VULTURE EATS WOMAN
                        win();
                        break;
                    case ALIEN      :
                    case AXE        :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case PLATINUM   :
                    case POISON     :
                    case PORCUPINE  :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case VIDEO_GAME :
                    case WALL       :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case WALL:
                switch (them) {
                    case WALL:
                        tie();
                        break;
                    case AXE        :   // WALL RESISTS AXE
                    case BABY       :   // WALL BLOCKS BABY
                    case BICYCLE    :   // WALL BLOCKS BICYCLE
                    case BIRD       :   // WALL BLOCKS BIRD
                    case BLOOD      :   // WALL SHELF HOLDS BLOOD
                    case BOOK       :   // WALL SHELF HOLDS BOOK
                    case BRAIN      :   // WALL CHALLENGES BRAIN
                    case BUTTER     :   // WALL SHELF HOLDS BUTTER
                    case CAGE       :   // WALL CREATES CAGE
                    case CAMERA     :   // WALL BLOCKS CAMERA
                    case CAR        :   // WALL BLOCKS CAR
                    case CASTLE     :   // WALL SUPPORTS CASTLE
                    case CAT        :   // WALL BLOCKS CAT
                    case CHAINSAW   :   // WALL TOO THICK FOR CHAINSAW
                    case CHURCH     :   // WALL SUPPORTS CHURCH
                    case CLOUD      :   // WALL OUTLASTS CLOUD
                    case COCKROACH  :   // WALL HOUSES COCKROACH
                    case COMMUNITY  :   // WALL SURROUNDS COMMUNITY
                    case COMPUTER   :   // WALL (FIREWALL) PROTECTS COMPUTER
                    case CROSS      :   // WALL SUPPORTS CROSS
                    case DUCK       :   // WALL BLOCKS DUCK
                    case FIRE       :   // WALL BLOCKS FIRE
                    case FISH       :   // WALL BLOCKS FISH
                    case HOME       :   // WALL SUPPORTS HOME
                    case KING       :   // WALL BLOCKS KING
                    case MAN        :   // WALL BLOCKS MAN
                    case MONEY      :   // WALL COSTS MONEY
                    case MONKEY     :   // WALL BLOCKS MONKEY
                    case NOISE      :   // WALL BLOCKS NOISE
                    case PAPER      :   // WALL SHELF HOLDS PAPER
                    case PEACE      :   // WALL PREVENTS PEACE
                    case POISON     :   // WALL NOT AFFECTED BY POISON
                    case POLICE     :   // WALL BLOCKS POLICE
                    case PORCUPINE  :   // WALL BLOCKS PORCUPINE
                    case PRINCE     :   // WALL BLOCKS PRINCE
                    case PRINCESS   :   // WALL BLOCKS PRINCESS
                    case QUEEN      :   // WALL BLOCKS QUEEN
                    case SCHOOL     :   // WALL SUPPORTS SCHOOL
                    case SCISSORS   :   // WALL SHELF HOLDS SCISSORS
                    case SNAKE      :   // WALL BLOCKS SNAKE
                    case SPIDER     :   // WALL HOUSES SPIDER
                    case SPONGE     :   // WALL TOO BIG FOR SPONGE
                    case SUN        :   // WALL SHADES SUN
                    case TRAIN      :   // WALL BLOCKS TRAIN
                    case TREE       :   // WALL BLOCKS TREE ROOTS
                    case TURNIP     :   // WALL BLOCKS TURNIP ROOTS
                    case VAMPIRE    :   // WALL BLOCKS VAMPIRE
                    case VULTURE    :   // WALL BLOCKS VULTURE
                    case WOLF       :   // WALL BLOCKS WOLF
                    case WOMAN      :   // WALL BLOCKS WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BOWL       :
                    case CHAIN      :
                    case CUP        :
                    case DEATH      :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOON       :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PIT        :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case ROCK       :
                    case SATAN      :
                    case SKY        :
                    case SWORD      :
                    case TANK       :
                    case TOILET     :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WATER      :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case WATER:
                switch (them) {
                    case WATER:
                        tie();
                        break;
                    case ALIEN      :   // WATER TOXIC TO ALIEN
                    case AXE        :   // WATER RUSTS AXE
                    case CAGE       :   // WATER RUSTS CAGE
                    case CAMERA     :   // WATER RUINS CAMERA
                    case CASTLE     :   // WATER FLOODS CASTLE
                    case CHAIN      :   // WATER RUSTS CHAIN
                    case CHAINSAW   :   // WATER FLOODS CHAINSAW
                    case COMPUTER   :   // WATER SHORT-CIRCUITS COMPUTER
                    case DEATH      :   // WATER CAUSES DEATH
                    case DEVIL      :   // WATER DROWNS DEVIL
                    case DIAMOND    :   // WATER CLEANS DIAMOND
                    case DRAGON     :   // WATER DROWNS DRAGON
                    case DYNAMITE   :   // WATER SOAKS DYNAMITE
                    case ELECTRICITY:   // WATER CONDUCTS ELECTRICITY
                    case FENCE      :   // WATER RISES OVER FENCE
                    case FIRE       :   // WATER DOUSES FIRE
                    case GOLD       :   // WATER CLEANS GOLD
                    case GUN        :   // WATER RUSTS GUN
                    case HEART      :   // WATER STRENGTHENS HEART
                    case HELICOPTER :   // WATER SHORT-CIRCUITS HELICOPTER
                    case LASER      :   // WATER DIFFRACTS LASER
                    case LAW        :   // WATER HAS LAWS
                    case LIGHTNING  :   // WATER ATTRACTS LIGHTNING
                    case MATH       :   // WATER MEASURED WITH MATH
                    case MEDUSA     :   // WATER DROWNS MEDUSA
                    case MOUNTAIN   :   // WATER RAINS ON MOUNTAIN
                    case NUKE       :   // WATER SHORT-CIRCUITS NUKE
                    case PEACE      :   // WATER INSPIRES PEACE
                    case PIT        :   // WATER FILLS PIT
                    case PLATINUM   :   // WATER CLEANS PLATINUM
                    case POISON     :   // WATER DILUTES POISON
                    case POWER      :   // WATER CREATES HYDRO POWER
                    case PRAYER     :   // WATER ANSWERS PRAYER
                    case QUICKSAND  :   // WATER FLOATS ON QUICKSAND
                    case RAINBOW    :   // WATER CREATES RAINBOW
                    case ROBOT      :   // WATER SHORT-CIRCUITS ROBOT
                    case ROCK       :   // WATER ERODES ROCK
                    case SATAN      :   // WATER DROWNS SATAN
                    case SCHOOL     :   // WATER LEAK CLOSES SCHOOL
                    case SCISSORS   :   // WATER RUSTS SCISSORS
                    case SKY        :   // WATER REFLECTS SKY
                    case SUN        :   // WATER REFLECTS SUN
                    case SWORD      :   // WATER RUSTS SWORD
                    case TANK       :   // WATER SHORT-CIRCUITS TANK
                    case TORNADO    :   // WATER SPOUT TORNADO
                    case TV         :   // WATER DAMAGES TV
                    case UFO        :   // WATER DIVERTS UFO
                    case VIDEO_GAME :   // WATER DAMAGES VIDEO GAME
                    case WALL       :   // WATER CLEANS WALL
                    case WHIP       :   // WATER SOAKS WHIP
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case BABY       :
                    case BEER       :
                    case BICYCLE    :
                    case BIRD       :
                    case BLOOD      :
                    case BOOK       :
                    case BOWL       :
                    case BRAIN      :
                    case BUTTER     :
                    case CAR        :
                    case CAT        :
                    case CHURCH     :
                    case CLOUD      :
                    case COCKROACH  :
                    case COMMUNITY  :
                    case CROSS      :
                    case CUP        :
                    case DUCK       :
                    case FILM       :
                    case FISH       :
                    case GRASS      :
                    case GUITAR     :
                    case HOME       :
                    case KING       :
                    case MAN        :
                    case MONEY      :
                    case MONKEY     :
                    case MOON       :
                    case NOISE      :
                    case PAPER      :
                    case PLANET     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case RAIN       :
                    case SNAKE      :
                    case SPIDER     :
                    case SPONGE     :
                    case TOILET     :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VAMPIRE    :
                    case VULTURE    :
                    case WOLF       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case WHIP:
                switch (them) {
                    case WHIP:
                        tie();
                        break;
                    case AXE        :   // WHIP SNAGS AXE
                    case BABY       :   // WHIP SCARES BABY
                    case BICYCLE    :   // WHIP SNAGS BICYCLE
                    case BIRD       :   // WHIP KILLS BIRD
                    case BLOOD      :   // WHIP SPILLS BLOOD
                    case BRAIN      :   // WHIP INTIMIDATES BRAIN
                    case CAGE       :   // WHIP OPENS CAGE DOOR
                    case CAMERA     :   // WHIP SHATTERS CAMERA
                    case CAR        :   // WHIP SMASHES CAR WINDOW
                    case CASTLE     :   // WHIP BREAKS INTO CASTLE
                    case CAT        :   // WHIP SCARES CAT
                    case CHAINSAW   :   // WHIP SNAGS CHAINSAW
                    case CHURCH     :   // WHIP FRIGHTENS CHURCH
                    case COCKROACH  :   // WHIP SPLATTERS COCKROACH
                    case COMMUNITY  :   // WHIP THREATENS COMMUNITY
                    case COMPUTER   :   // WHIP SMASHES COMPUTER
                    case CROSS      :   // WHIP FORCES YOU ONTO CROSS
                    case DEATH      :   // WHIP CAUSES DEATH
                    case DUCK       :   // WHIP KILLS DUCK
                    case FIRE       :   // WHIP BURNS LIKE FIRE
                    case FISH       :   // WHIP KILLS FISH
                    case HOME       :   // WHIP BREAKS INTO HOME
                    case KING       :   // WHIP TORTURES KING
                    case MAN        :   // WHIP TORTURES MAN
                    case MONEY      :   // WHIP ROBS MONEY
                    case MONKEY     :   // WHIP CRACKS MONKEY
                    case NOISE      :   // WHIP RESTRICTS NOISE
                    case PEACE      :   // WHIP DISTURBS PEACE
                    case POISON     :   // WHIP SHATTERS POISON BOTTLE
                    case POLICE     :   // WHIP THWARTS POLICE
                    case PORCUPINE  :   // WHIP SCARES PORCUPINE
                    case PRINCE     :   // WHIP TORTURES PRINCE
                    case PRINCESS   :   // WHIP TORTURES PRINCESS
                    case QUEEN      :   // WHIP TORTURES QUEEN
                    case ROCK       :   // WHIP SHATTERS ROCK
                    case SCHOOL     :   // WHIP TERRORIZES SCHOOL
                    case SCISSORS   :   // WHIP SNAGS SCISSORS
                    case SNAKE      :   // WHIP STRONGER THAN SNAKE
                    case SPIDER     :   // WHIP SPLATTERS SPIDER
                    case SPONGE     :   // WHIP RIPS SPONGE
                    case SUN        :   // WHIP BURNS LIKE SUN
                    case SWORD      :   // WHIP SNAGS SWORD
                    case TRAIN      :   // WHIP HOLDS UP TRAIN
                    case TREE       :   // WHIP AROUND TREE
                    case TURNIP     :   // WHIP SPLATTERS TURNIP
                    case VAMPIRE    :   // WHIP THWARTS VAMPIRE
                    case VULTURE    :   // WHIP SCARES VULTURE
                    case WALL       :   // WHIP MARKS UP WALL
                    case WOLF       :   // WHIP DRIVES WOLF
                    case WOMAN      :   // WHIP TORTURES WOMAN
                        win();
                        break;
                    case AIR        :
                    case AIRPLANE   :
                    case ALIEN      :
                    case BEER       :
                    case BOOK       :
                    case BOWL       :
                    case BUTTER     :
                    case CHAIN      :
                    case CLOUD      :
                    case CUP        :
                    case DEVIL      :
                    case DIAMOND    :
                    case DRAGON     :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FILM       :
                    case GOLD       :
                    case GRASS      :
                    case GUITAR     :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MOON       :
                    case MOUNTAIN   :
                    case NUKE       :
                    case PAPER      :
                    case PIT        :
                    case PLANET     :
                    case PLATINUM   :
                    case POWER      :
                    case PRAYER     :
                    case QUICKSAND  :
                    case RAIN       :
                    case RAINBOW    :
                    case ROBOT      :
                    case SATAN      :
                    case SKY        :
                    case TANK       :
                    case TOILET     :
                    case TORNADO    :
                    case TV         :
                    case UFO        :
                    case VIDEO_GAME :
                    case WATER      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case WOLF:
                switch (them) {
                    case WOLF:
                        tie();
                        break;
                    case AIR        :   // WOLF BREATHES AIR
                    case AIRPLANE   :   // WOLF HOWLS AT AIRPLANE
                    case ALIEN      :   // WOLF CHASES ALIEN
                    case BEER       :   // WOLF DRINKS BEER
                    case BIRD       :   // WOLF CHASES BIRD
                    case BOOK       :   // WOLF RIPS UP BOOK
                    case BOWL       :   // WOLF DRINKS FROM BOWL
                    case BRAIN      :   // WOLF HAS BRAIN
                    case BUTTER     :   // WOLF EATS BUTTER
                    case CAT        :   // WOLF CHASES CAT
                    case CHURCH     :   // WOLF DISRUPTS CHURCH
                    case CLOUD      :   // WOLF CREATES DUST CLOUD
                    case COCKROACH  :   // WOLF EATS COCKROACH
                    case COMMUNITY  :   // WOLF FRIGHTENS COMMUNITY
                    case CROSS      :   // WOLF ACTS CROSS
                    case CUP        :   // WOLF KNOCKS OVER CUP
                    case DEVIL      :   // WOLF BITES DEVIL'S HEINY
                    case DIAMOND    :   // WOLF SWALLOWS DIAMOND
                    case DRAGON     :   // WOLF OUTRUNS DRAGON
                    case ELECTRICITY:   // WOLF OUTRUNS ELECTRICITY
                    case FENCE      :   // WOLF HOPS FENCE
                    case FILM       :   // WOLF ON FILM
                    case FISH       :   // WOLF EATS FISH
                    case GOLD       :   // WOLF SWALLOWS GOLD
                    case GRASS      :   // WOLF IN GRASS
                    case GUITAR     :   // WOLF BITES GUITAR
                    case HEART      :   // WOLF HAS HEART
                    case LIGHTNING  :   // WOLF OUTRUNS LIGHTNING
                    case MATH       :   // WOLF DOESN'T NEED MATH
                    case MEDUSA     :   // WOLF OUTRUNS MEDUSA
                    case MONEY      :   // WOLF STEALS MONEY
                    case MOON       :   // WOLF HOWLS AT MOON
                    case MOUNTAIN   :   // WOLF LIVES ON MOUNTAIN
                    case PAPER      :   // WOLF RIPS UP PAPER
                    case PLANET     :   // WOLF LIVES ON PLANET
                    case PLATINUM   :   // WOLF SWALLOWS PLATINUM
                    case POWER      :   // WOLF HAS POWER
                    case PRAYER     :   // WOLF CAUSES PRAYER
                    case RAIN       :   // WOLF LOVES RAIN
                    case RAINBOW    :   // WOLF HOWLS AT RAINBOW
                    case ROBOT      :   // WOLF OUTRUNS ROBOT
                    case SATAN      :   // WOLF BITES SATAN'S HEINY
                    case SPIDER     :   // WOLF EATS SPIDER
                    case SPONGE     :   // WOLF RIPS UP SPONGE
                    case TOILET     :   // WOLF DOESN'T USE TOILET
                    case TV         :   // WOLF ON TV
                    case UFO        :   // WOLF HIDES FROM UFO
                    case VAMPIRE    :   // WOLF AMUSES VAMPIRE
                    case VIDEO_GAME :   // WOLF RAVAGES VIDEO GAME
                    case WATER      :   // WOLF DRINKS WATER
                        win();
                        break;
                    case AXE        :
                    case BABY       :
                    case BICYCLE    :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CAR        :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DUCK       :
                    case DYNAMITE   :
                    case FIRE       :
                    case GUN        :
                    case HELICOPTER :
                    case HOME       :
                    case KING       :
                    case LASER      :
                    case LAW        :
                    case MAN        :
                    case MONKEY     :
                    case NOISE      :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case TRAIN      :
                    case TREE       :
                    case TURNIP     :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                    case WOMAN      :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            case WOMAN:
                switch (them) {
                    case WOMAN:
                        tie();
                        break;
                    case AIR        :   // WOMAN BREATHES AIR
                    case AIRPLANE   :   // WOMAN FLIES ON AIRPLANE
                    case ALIEN      :   // WOMAN DISPROVES ALIEN
                    case BABY       :   // WOMAN HAS BABY
                    case BEER       :   // WOMAN DRINKS BEER
                    case BICYCLE    :   // WOMAN RIDES BICYCLE
                    case BIRD       :   // WOMAN OWNS BIRD
                    case BOOK       :   // WOMAN READS BOOK
                    case BOWL       :   // WOMAN EATS FROM BOWL
                    case BRAIN      :   // WOMAN HAS BRAIN
                    case BUTTER     :   // WOMAN EATS BUTTER
                    case CAR        :   // WOMAN DRIVES CAR
                    case CAT        :   // WOMAN OWNS CAT
                    case CHURCH     :   // WOMAN ATTENDS CHURCH
                    case CLOUD      :   // WOMAN LOOKS AT CLOUD
                    case COCKROACH  :   // WOMAN STEPS ON COCKROACH
                    case COMMUNITY  :   // WOMAN LIVES IN COMMUNITY
                    case CROSS      :   // WOMAN ACTS CROSS
                    case CUP        :   // WOMAN DRINKS FROM CUP
                    case DIAMOND    :   // WOMAN WEARS DIAMOND
                    case DRAGON     :   // WOMAN TEMPTS DRAGON
                    case DUCK       :   // WOMAN EATS DUCK
                    case FILM       :   // WOMAN WATCHES FILM
                    case FISH       :   // WOMAN OWNS FISH
                    case GRASS      :   // WOMAN WALKS ON GRASS
                    case GUITAR     :   // WOMAN PLAYS GUITAR
                    case HOME       :   // WOMAN LIVES IN HOME
                    case MAN        :   // WOMAN TEMPTS MAN
                    case MONEY      :   // WOMAN SPENDS MONEY
                    case MOON       :   // WOMAN ALIGNS WITH MOON
                    case MOUNTAIN   :   // WOMAN CLIMBS MOUNTAIN
                    case NOISE      :   // WOMAN MAKES NOISE
                    case PAPER      :   // WOMAN WRITES PAPER
                    case PLANET     :   // WOMAN LIVES ON PLANET
                    case PLATINUM   :   // WOMAN HAIR COLORED PLATINUM
                    case PRAYER     :   // WOMAN IN PRAYER
                    case RAIN       :   // WOMAN WALKS IN RAIN
                    case RAINBOW    :   // WOMAN LOOKS AT RAINBOW
                    case SATAN      :   // WOMAN ENTHRALLS SATAN
                    case SPIDER     :   // WOMAN STEPS ON SPIDER
                    case SPONGE     :   // WOMAN CLEANS WITH SPONGE
                    case TOILET     :   // WOMAN USES TOILET
                    case TRAIN      :   // WOMAN RIDES ON TRAIN
                    case TREE       :   // WOMAN PLANTS TREE
                    case TURNIP     :   // WOMAN EATS TURNIP
                    case TV         :   // WOMAN WATCHES TV
                    case UFO        :   // WOMAN DEBUNKS UFO
                    case VAMPIRE    :   // WOMAN BECOMES VAMPIRE
                    case WATER      :   // WOMAN DRINKS WATER
                    case WOLF       :   // WOMAN TAMES WOLF
                        win();
                        break;
                    case AXE        :
                    case BLOOD      :
                    case CAGE       :
                    case CAMERA     :
                    case CASTLE     :
                    case CHAIN      :
                    case CHAINSAW   :
                    case COMPUTER   :
                    case DEATH      :
                    case DEVIL      :
                    case DYNAMITE   :
                    case ELECTRICITY:
                    case FENCE      :
                    case FIRE       :
                    case GOLD       :
                    case GUN        :
                    case HEART      :
                    case HELICOPTER :
                    case KING       :
                    case LASER      :
                    case LAW        :
                    case LIGHTNING  :
                    case MATH       :
                    case MEDUSA     :
                    case MONKEY     :
                    case NUKE       :
                    case PEACE      :
                    case PIT        :
                    case POISON     :
                    case POLICE     :
                    case PORCUPINE  :
                    case POWER      :
                    case PRINCE     :
                    case PRINCESS   :
                    case QUEEN      :
                    case QUICKSAND  :
                    case ROBOT      :
                    case ROCK       :
                    case SCHOOL     :
                    case SCISSORS   :
                    case SKY        :
                    case SNAKE      :
                    case SUN        :
                    case SWORD      :
                    case TANK       :
                    case TORNADO    :
                    case VIDEO_GAME :
                    case VULTURE    :
                    case WALL       :
                    case WHIP       :
                        lose();
                        break;
                    default:
                        bad();
                        break;
                }
                break;
            default:
                bad();
                break;
        }
    }
}
