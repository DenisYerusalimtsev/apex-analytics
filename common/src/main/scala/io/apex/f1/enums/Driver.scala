package io.apex.f1.enums

import scala.collection.immutable.HashMap
import scala.util.Try

sealed trait Driver

object Driver {

  def valueOf(season: Int, value: Int): Option[Driver] =
    season match {
      case 2020 => Driver2020.valueOf(value)
      case 2021 => Driver2021.valueOf(value)
      case 2022 => Driver2022.valueOf(value)
      case _ => throw new IllegalArgumentException(s"Season $season not supported")
    }
}

enum Driver2020(val value: Int) extends Driver {
  case CARLOS_SAINZ extends Driver2020(0)
  case DANIIL_KVYAT extends Driver2020(1)
  case DANIEL_RICCIARDO extends Driver2020(2)
  case KIMI_RAIKKONEN extends Driver2020(6)
  case LEWIS_HAMILTON extends Driver2020(7)
  case MAX_VERSTAPPEN extends Driver2020(9)
  case NICO_HULKENBERG extends Driver2020(10)
  case KEVIN_MAGNUSSEN extends Driver2020(11)
  case ROMAIN_GROSJEAN extends Driver2020(12)
  case SEBASTIAN_VETTEL extends Driver2020(13)
  case SERGIO_PEREZ extends Driver2020(14)
  case VALTTERI_BOTTAS extends Driver2020(15)
  case ESTEBAN_OCON extends Driver2020(17)
  case LANCE_STROLL extends Driver2020(19)
  case ARRON_BARNES extends Driver2020(20)
  case MARTIN_GILES extends Driver2020(21)
  case ALEX_MURRAY extends Driver2020(22)
  case LUCAS_ROTH extends Driver2020(23)
  case IGOR_CORREIA extends Driver2020(24)
  case SOPHIE_LEVASSEUR extends Driver2020(25)
  case JONAS_SCHIFFER extends Driver2020(26)
  case ALAIN_FOREST extends Driver2020(27)
  case JAY_LETOURNEAU extends Driver2020(28)
  case ESTO_SAARI extends Driver2020(29)
  case YASAR_ATIYEH extends Driver2020(30)
  case CALLISTO_CALABRESI extends Driver2020(31)
  case NAOTA_IZUM extends Driver2020(32)
  case HOWARD_CLARKE extends Driver2020(33)
  case WILHEIM_KAUFMANN extends Driver2020(34)
  case MARIE_LAURSEN extends Driver2020(35)
  case FLAVIO_NIEVES extends Driver2020(36)
  case PETER_BELOUSOV extends Driver2020(37)
  case KLIMEK_MICHALSKI extends Driver2020(38)
  case SANTIAGO_MORENO extends Driver2020(39)
  case BENJAMIN_COPPENS extends Driver2020(40)
  case NOAH_VISSER extends Driver2020(41)
  case GERT_WALDMULLER extends Driver2020(42)
  case JULIAN_QUESADA extends Driver2020(43)
  case DANIEL_JONES extends Driver2020(44)
  case ARTEM_MARKELOV extends Driver2020(45)
  case TADASUKE_MAKINO extends Driver2020(46)
  case SEAN_GELAEL extends Driver2020(47)
  case NYCK_DE_VRIES extends Driver2020(48)
  case JACK_AITKEN extends Driver2020(49)
  case GEORGE_RUSSELL extends Driver2020(50)
  case MAXIMILIAN_GUNTHER extends Driver2020(51)
  case NIREI_FUKUZUMI extends Driver2020(52)
  case LUCA_GHIOTTO extends Driver2020(53)
  case LANDO_NORRIS extends Driver2020(54)
  case SERGIO_SETTE_CAMARA extends Driver2020(55)
  case LOUIS_DELETRAZ extends Driver2020(56)
  case ANTONIO_FUOCO extends Driver2020(57)
  case CHARLES_LECLERC extends Driver2020(58)
  case PIERRE_GASLY extends Driver2020(59)
  case ALEXANDER_ALBON extends Driver2020(62)
  case NICHOLAS_LATIFI extends Driver2020(63)
  case DORIAN_BOCCOLACCI extends Driver2020(64)
  case NIKO_KARI extends Driver2020(65)
  case ROBERTO_MERHI extends Driver2020(66)
  case ARJUN_MAINI extends Driver2020(67)
  case ALESSIO_LORANDI extends Driver2020(68)
  case RUBEN_MEIJER extends Driver2020(69)
  case RASHID_NAIR extends Driver2020(70)
  case JACK_TREMBLAY extends Driver2020(71)
  case ANTONIO_GIOVINAZZI extends Driver2020(74)
  case ROBERT_KUBICA extends Driver2020(75)
  case NOBUHARU_MATSUSHITA extends Driver2020(78)
  case NIKITA_MAZEPIN extends Driver2020(79)
  case GUANYA_ZHOU extends Driver2020(80)
  case MICK_SHUMACHER extends Driver2020(81)
  case CALLUM_ILOTT extends Driver2020(82)
  case JUAN_MANUEL_CORREA extends Driver2020(83)
  case JORDAN_KING extends Driver2020(84)
  case MAHAVEER_RAGHUNATHAN extends Driver2020(85)
  case TATIANA_CALDERON extends Driver2020(86)
  case ANTHOINE_HUBERT extends Driver2020(87)
  case GUILIANO_ALESI extends Driver2020(88)
  case RALPH_BOSCHUNG extends Driver2020(89)
}

object Driver2020 {
  def valueOf(value: Int): Option[Driver2020] =
    Driver2020.values.find(_.value == value)
}

enum Driver2021(val value: Int) extends Driver {
  case CARLOS_SAINZ extends Driver2021(0)
  case DANIIL_KVYAT extends Driver2021(1)
  case DANIEL_RICCIARDO extends Driver2021(2)
  case FERNANDO_ALONSO extends Driver2021(3)
  case FELIPE_MASSA extends Driver2021(4)
  case KIMI_RAIKKONEN extends Driver2021(6)
  case LEWIS_HAMILTON extends Driver2021(7)
  case MAX_VERSTAPPEN extends Driver2021(9)
  case NICO_HULKENBURG extends Driver2021(10)
  case KEVIN_MAGNUSSEN extends Driver2021(11)
  case ROMAIN_GROSJEAN extends Driver2021(12)
  case SEBASTIAN_VETTEL extends Driver2021(13)
  case SERGIO_PEREZ extends Driver2021(14)
  case VALTTERI_BOTTAS extends Driver2021(15)
  case ESTEBAN_OCON extends Driver2021(17)
  case LANCE_STROLL extends Driver2021(19)
  case ARRON_BARNES extends Driver2021(20)
  case MARTIN_GILES extends Driver2021(21)
  case ALEX_MURRAY extends Driver2021(22)
  case LUCAS_ROTH extends Driver2021(23)
  case IGOR_CORREIA extends Driver2021(24)
  case SOPHIE_LEVASSEUR extends Driver2021(25)
  case JONAS_SCHIFFER extends Driver2021(26)
  case ALAIN_FOREST extends Driver2021(27)
  case JAY_LETOURNEAU extends Driver2021(28)
  case ESTO_SAARI extends Driver2021(29)
  case YASAR_ATIYEH extends Driver2021(30)
  case CALLISTO_CALABRESI extends Driver2021(31)
  case NAOTA_IZUM extends Driver2021(32)
  case HOWARD_CLARKE extends Driver2021(33)
  case WILHEIM_KAUFMANN extends Driver2021(34)
  case MARIE_LAURSEN extends Driver2021(35)
  case FLAVIO_NIEVES extends Driver2021(36)
  case PETER_BELOUSOV extends Driver2021(37)
  case KLIMEK_MICHALSKI extends Driver2021(38)
  case SANTIAGO_MORENO extends Driver2021(39)
  case BENJAMIN_COPPENS extends Driver2021(40)
  case NOAH_VISSER extends Driver2021(41)
  case GERT_WALDMULLER extends Driver2021(42)
  case JULIAN_QUESADA extends Driver2021(43)
  case DANIEL_JONES extends Driver2021(44)
  case ARTEM_MARKELOV extends Driver2021(45)
  case TADASUKE_MAKINO extends Driver2021(46)
  case SEAN_GELAEL extends Driver2021(47)
  case NYCK_DE_VRIES extends Driver2021(48)
  case JACK_AITKEN extends Driver2021(49)
  case GEORGE_RUSSELL extends Driver2021(50)
  case MAXIMILIAN_GÜNTHER extends Driver2021(51)
  case NIREI_FUKUZUMI extends Driver2021(52)
  case LUCA_GHIOTTO extends Driver2021(53)
  case LANDO_NORRIS extends Driver2021(54)
  case SÉRGIO_SETTE_CÂMARA extends Driver2021(55)
  case LOUIS_DELÉTRAZ extends Driver2021(56)
  case ANTONIO_FUOCO extends Driver2021(57)
  case CHARLES_LECLERC extends Driver2021(58)
  case PIERRE_GASLY extends Driver2021(59)
  case ALEXANDER_ALBON extends Driver2021(62)
  case NICHOLAS_LATIFI extends Driver2021(63)
  case DORIAN_BOCCOLACCI extends Driver2021(64)
  case NIKO_KARI extends Driver2021(65)
  case ROBERTO_MERHI extends Driver2021(66)
  case ARJUN_MAINI extends Driver2021(67)
  case ALESSIO_LORANDI extends Driver2021(68)
  case RUBEN_MEIJER extends Driver2021(69)
  case RASHID_NAIR extends Driver2021(70)
  case JACK_TREMBLAY extends Driver2021(71)
  case DEVON_BUTLER extends Driver2021(72)
  case LUKAS_WEBER extends Driver2021(73)
  case ANTONIO_GIOVINAZZI extends Driver2021(74)
  case ROBERT_KUBICA extends Driver2021(75)
  case ALAIN_PROST extends Driver2021(76)
  case AYRTON_SENNA extends Driver2021(77)
  case NOBUHARU_MATSUSHITA extends Driver2021(78)
  case NIKITA_MAZEPIN extends Driver2021(79)
  case GUANYA_ZHOU extends Driver2021(80)
  case MICK_SCHUMACHER extends Driver2021(81)
  case CALLUM_ILOTT extends Driver2021(82)
  case JUAN_MANUEL_CORREA extends Driver2021(83)
  case JORDAN_KING extends Driver2021(84)
  case MAHAVEER_RAGHUNATHAN extends Driver2021(85)
  case TATIANA_CALDERON extends Driver2021(86)
  case ANTHOINE_HUBERT extends Driver2021(87)
  case GUILIANO_ALESI extends Driver2021(88)
  case RALPH_BOSCHUNG extends Driver2021(89)
  case MICHAEL_SCHUMACHER extends Driver2021(90)
  case DAN_TICKTUM extends Driver2021(91)
  case MARCUS_ARMSTRONG extends Driver2021(92)
  case CHRISTIAN_LUNDGAARD extends Driver2021(93)
  case YUKI_TSUNODA extends Driver2021(94)
  case JEHAN_DARUVALA extends Driver2021(95)
  case GULHERME_SAMAIA extends Driver2021(96)
  case PEDRO_PIQUET extends Driver2021(97)
  case FELIPE_DRUGOVICH extends Driver2021(98)
  case ROBERT_SCHWARTZMAN extends Driver2021(99)
  case ROY_NISSANY extends Driver2021(100)
  case MARINO_SATO extends Driver2021(101)
  case AIDAN_JACKSON extends Driver2021(102)
  case CASPER_AKKERMAN extends Driver2021(103)
  case JENSON_BUTTON extends Driver2021(109)
  case DAVID_COULTHARD extends Driver2021(110)
  case NICO_ROSBERG extends Driver2021(111)
  case OSCAR_PIASTRI extends Driver2021(112)
  case LIAM_LAWSON extends Driver2021(113)
  case JURI_VIPS extends Driver2021(114)
  case THEO_POURCHAIRE extends Driver2021(115)
  case RICHARD_VERSCHOOR extends Driver2021(116)
  case LIRIM_ZENDELI extends Driver2021(117)
  case DAVID_BECKMANN extends Driver2021(118)
  case GIANLUCA_PETECOF extends Driver2021(119)
  case MATTEO_NANNINI extends Driver2021(120)
  case ALESSIO_DELEDDA extends Driver2021(121)
  case BENT_VISCAAL extends Driver2021(122)
  case ENZO_FITTIPALDI extends Driver2021(123)
}

object Driver2021 {
  def valueOf(value: Int): Option[Driver2021] =
    Driver2021.values.find(_.value == value)
}


enum Driver2022(val value: Int) extends Driver {
  case CARLOS_SAINZ extends Driver2022(0)
  case DANIIL_KVYAT extends Driver2022(1)
  case DANIEL_RICCIARDO extends Driver2022(2)
  case FERNANDO_ALONSO extends Driver2022(3)
  case FELIPE_MASSA extends Driver2022(4)
  case KIMI_RAIKKONEN extends Driver2022(6)
  case LEWIS_HAMILTON extends Driver2022(7)
  case MAX_VERSTAPPEN extends Driver2022(9)
  case NICO_HULKENBURG extends Driver2022(10)
  case KEVIN_MAGNUSSEN extends Driver2022(11)
  case ROMAIN_GROSJEAN extends Driver2022(12)
  case SEBASTIAN_VETTEL extends Driver2022(13)
  case SERGIO_PEREZ extends Driver2022(14)
  case VALTTERI_BOTTAS extends Driver2022(15)
  case ESTEBAN_OCON extends Driver2022(17)
  case LANCE_STROLL extends Driver2022(19)
  case ARRON_BARNES extends Driver2022(20)
  case MARTIN_GILES extends Driver2022(21)
  case ALEX_MURRAY extends Driver2022(22)
  case LUCAS_ROTH extends Driver2022(23)
  case IGOR_CORREIA extends Driver2022(24)
  case SOPHIE_LEVASSEUR extends Driver2022(25)
  case JONAS_SCHIFFER extends Driver2022(26)
  case ALAIN_FOREST extends Driver2022(27)
  case JAY_LETOURNEAU extends Driver2022(28)
  case ESTO_SAARI extends Driver2022(29)
  case YASAR_ATIYEH extends Driver2022(30)
  case CALLISTO_CALABRESI extends Driver2022(31)
  case NAOTA_IZUM extends Driver2022(32)
  case HOWARD_CLARKE extends Driver2022(33)
  case WILHEIM_KAUFMANN extends Driver2022(34)
  case MARIE_LAURSEN extends Driver2022(35)
  case FLAVIO_NIEVES extends Driver2022(36)
  case PETER_BELOUSOV extends Driver2022(37)
  case KLIMEK_MICHALSKI extends Driver2022(38)
  case SANTIAGO_MORENO extends Driver2022(39)
  case BENJAMIN_COPPENS extends Driver2022(40)
  case NOAH_VISSER extends Driver2022(41)
  case GERT_WALDMULLER extends Driver2022(42)
  case JULIAN_QUESADA extends Driver2022(43)
  case DANIEL_JONES extends Driver2022(44)
  case ARTEM_MARKELOV extends Driver2022(45)
  case TADASUKE_MAKINO extends Driver2022(46)
  case SEAN_GELAEL extends Driver2022(47)
  case NYCK_DE_VRIES extends Driver2022(48)
  case JACK_AITKEN extends Driver2022(49)
  case GEORGE_RUSSELL extends Driver2022(50)
  case MAXIMILIAN_GÜNTHER extends Driver2022(51)
  case NIREI_FUKUZUMI extends Driver2022(52)
  case LUCA_GHIOTTO extends Driver2022(53)
  case LANDO_NORRIS extends Driver2022(54)
  case SÉRGIO_SETTE_CÂMARA extends Driver2022(55)
  case LOUIS_DELÉTRAZ extends Driver2022(56)
  case ANTONIO_FUOCO extends Driver2022(57)
  case CHARLES_LECLERC extends Driver2022(58)
  case PIERRE_GASLY extends Driver2022(59)
  case ALEXANDER_ALBON extends Driver2022(62)
  case NICHOLAS_LATIFI extends Driver2022(63)
  case DORIAN_BOCCOLACCI extends Driver2022(64)
  case NIKO_KARI extends Driver2022(65)
  case ROBERTO_MERHI extends Driver2022(66)
  case ARJUN_MAINI extends Driver2022(67)
  case ALESSIO_LORANDI extends Driver2022(68)
  case RUBEN_MEIJER extends Driver2022(69)
  case RASHID_NAIR extends Driver2022(70)
  case JACK_TREMBLAY extends Driver2022(71)
  case DEVON_BUTLER extends Driver2022(72)
  case LUKAS_WEBER extends Driver2022(73)
  case ANTONIO_GIOVINAZZI extends Driver2022(74)
  case ROBERT_KUBICA extends Driver2022(75)
  case ALAIN_PROST extends Driver2022(76)
  case AYRTON_SENNA extends Driver2022(77)
  case NOBUHARU_MATSUSHITA extends Driver2022(78)
  case NIKITA_MAZEPIN extends Driver2022(79)
  case GUANYA_ZHOU extends Driver2022(80)
  case MICK_SCHUMACHER extends Driver2022(81)
  case CALLUM_ILOTT extends Driver2022(82)
  case JUAN_MANUEL_CORREA extends Driver2022(83)
  case JORDAN_KING extends Driver2022(84)
  case MAHAVEER_RAGHUNATHAN extends Driver2022(85)
  case TATIANA_CALDERON extends Driver2022(86)
  case ANTHOINE_HUBERT extends Driver2022(87)
  case GUILIANO_ALESI extends Driver2022(88)
  case RALPH_BOSCHUNG extends Driver2022(89)
  case MICHAEL_SCHUMACHER extends Driver2022(90)
  case DAN_TICKTUM extends Driver2022(91)
  case MARCUS_ARMSTRONG extends Driver2022(92)
  case CHRISTIAN_LUNDGAARD extends Driver2022(93)
  case YUKI_TSUNODA extends Driver2022(94)
  case JEHAN_DARUVALA extends Driver2022(95)
  case GULHERME_SAMAIA extends Driver2022(96)
  case PEDRO_PIQUET extends Driver2022(97)
  case FELIPE_DRUGOVICH extends Driver2022(98)
  case ROBERT_SCHWARTZMAN extends Driver2022(99)
  case ROY_NISSANY extends Driver2022(100)
  case MARINO_SATO extends Driver2022(101)
  case AIDAN_JACKSON extends Driver2022(102)
  case CASPER_AKKERMAN extends Driver2022(103)
  case JENSON_BUTTON extends Driver2022(109)
  case DAVID_COULTHARD extends Driver2022(110)
  case NICO_ROSBERG extends Driver2022(111)
  case OSCAR_PIASTRI extends Driver2022(112)
  case LIAM_LAWSON extends Driver2022(113)
  case JURI_VIPS extends Driver2022(114)
  case THEO_POURCHAIRE extends Driver2022(115)
  case RICHARD_VERSCHOOR extends Driver2022(116)
  case LIRIM_ZENDELI extends Driver2022(117)
  case DAVID_BECKMANN extends Driver2022(118)
  case ALESSIO_DELEDDA extends Driver2022(121)
  case BENT_VISCAAL extends Driver2022(122)
  case ENZO_FITTIPALDI extends Driver2022(123)
  case MARK_WEBBER extends Driver2022(125)
  case JACQUES_VILLENEUVE extends Driver2022(126)
}

object Driver2022 {
  def valueOf(value: Int): Option[Driver2022] =
    Driver2022.values.find(_.value == value)
}