package sundstromar.neoclassic

/** Chordophone Cosmography
 *
 *  scala> import sundstromar.neoclassic.RuneStone
 */
object RuneStone {

  /** Databank of musical scales
   *
   *  scala> val ionian: String = RuneStone.Berzelian("n0")
   */
  val Berzelian: Map[String, String] = Map(
       "i0" -> "____ ____ ____ ____ ____ ____ ____ ____ ____ ____ ____ ____ ",
       "j2" -> "HgHg PuFe ____ ____ CuNp PbAu ____ AuPb ____ AgUr ____ FePu ",
       "j3" -> "HgSn ____ SnHg UrFe ____ PbAg ____ AuAu ____ AgPb ____ FeUr ",
       "j5" -> "PbCu ____ AuSn ____ AgHg TiFe FeTi ____ ____ SnAu ____ CuPb ",
       "j6" -> "HgAu ____ SnPb ____ CuUr PbSn ____ AuHg NpFe ____ ____ FeNp ",
       "k1" -> "____ FeUr HgSn ____ SnHg UrFe ____ PbAg ____ AuAu ____ AgPb ",
       "k2" -> "NpCu ____ ____ FePu HgHg PuFe ____ UrAg ____ PbAu ____ AuPb ",
       "k5" -> "UrCu ____ PbSn ____ AuHg NpFe ____ ____ FeNp HgAu ____ SnPb ",
       "k6" -> "HgAg ____ SnAu ____ CuPb PbCu ____ AuSn ____ ____ TiFe FeTi ",
       "n0" -> "HgCu ____ SnSn ____ CuHg PbFe ____ AuAg ____ AgAu ____ FePb ",
      "j17" -> "____ ____ SnAu ____ CuPb PbCu ____ AuSn ____ AgHg TiFe FeTi ",
      "j23" -> "HgHg PuFe ____ UrAg ____ PbAu ____ AuPb ____ AgUr ____ FePu ",
      "j25" -> "FeCu HgMn ____ ____ MnHg CuFe PbTi ____ ____ NpAu ____ TiPb ",
      "j26" -> "HgHg PuFe ____ ____ CuNp PbAu ____ AuPb NpCu ____ ____ FePu ",
      "j36" -> "HgAu ____ SnPb UrCu ____ PbSn ____ AuHg NpFe ____ ____ FeNp ",
      "j56" -> "UrCu ____ PbSn ____ AuHg NpFe AgTi ____ FeNp ____ ____ SnPb ",
      "k12" -> "____ AgUr ____ FePu HgHg PuFe ____ UrAg ____ PbAu ____ AuPb ",
      "k15" -> "____ CuUr PbSn ____ AuHg NpFe ____ ____ FeNp HgAu ____ SnPb ",
      "k25" -> "NpCu ____ ____ FePu HgHg PuFe ____ ____ CuNp PbAu ____ AuPb ",
      "k26" -> "HgMn ____ ____ MnHg CuFe PbTi ____ AuNp ____ ____ TiPb FeCu ",
      "k34" -> "PbCu ____ AuSn ____ ____ TiFe FeTi HgAg ____ SnAu ____ CuPb ",
      "k56" -> "HgAu ____ SnPb ____ CuUr PbSn ____ ____ NpFe ____ TiAg FeNp ",
     "j236" -> "HgHg PuFe ____ UrAg ____ PbAu ____ AuPb NpCu ____ ____ FePu ",
     "j256" -> "FeCu HgMn ____ ____ MnHg CuFe PbTi ____ AuNp ____ ____ TiPb ",
     "j2k5" -> "FeCu HgMn ____ ____ MnHg CuFe ____ ____ AuNp NpAu ____ TiPb ",
     "j2k6" -> "HgHg PuFe ____ ____ CuNp PbAu ____ AuPb ____ ____ TiSn FePu ",
     "j2w3" -> "HgHg PuFe SnTi ____ ____ PbAu ____ AuPb ____ AgUr ____ FePu ",
     "j3k5" -> "NpCu ____ TiSn FePu ____ PuFe ____ ____ CuNp PbAu ____ AuPb ",
     "j3k6" -> "HgTi ____ SnNp UrAu ____ PbPb ____ AuUr ____ ____ TiHg FeFe ",
     "j5w6" -> "PbCu ____ AuSn ____ AgHg TiFe FeTi HgAg ____ ____ ____ CuPb ",
     "k125" -> "____ AgUr ____ FePu HgHg PuFe ____ ____ CuNp PbAu ____ AuPb ",
     "k1j5" -> "____ AuUr NpSn ____ TiHg FeFe HgTi ____ ____ UrAu ____ PbPb ",
     "k1j6" -> "____ PuFe SnTi ____ CuNp PbAu ____ AuPb NpCu ____ ____ FePu ",
     "k256" -> "HgMn ____ ____ MnHg CuFe PbTi ____ ____ NpAu ____ TiPb FeCu ",
     "k2j5" -> "NpCu ____ ____ FePu HgHg PuFe SnTi ____ ____ PbAu ____ AuPb ",
     "k2j6" -> "HgMn ____ ____ MnHg CuFe PbTi ____ AuNp NpAu ____ ____ FeCu ",
     "k2m1" -> "____ ____ TiSn FePu HgHg PuFe ____ UrAg ____ PbAu ____ AuPb ",
     "k6m5" -> "HgAg ____ SnAu ____ CuPb PbCu ____ ____ ____ AgHg TiFe FeTi ",
     "n167" -> "NpCu ____ ____ FePu ____ PuFe SnTi ____ CuNp PbAu ____ AuPb ",
     "n345" -> "____ PuFe ____ ____ CuNp PbAu ____ AuPb NpCu ____ TiSn FePu ",
     "n5w2" -> "HgMn ____ ____ MnHg CuFe ____ ____ AuNp NpAu ____ TiPb FeCu ",
     "n6m2" -> "FeCu HgMn ____ ____ MnHg CuFe PbTi ____ AuNp NpAu ____ ____ ",
    "j17w2" -> "HgAg ____ ____ ____ CuPb PbCu ____ AuSn ____ AgHg TiFe FeTi ",
    "j23k6" -> "HgHg PuFe ____ UrAg ____ PbAu ____ AuPb ____ ____ TiSn FePu ",
    "j25w6" -> "TiCu FeMn ____ ____ SnHg MnFe CuTi PbAg ____ ____ ____ AgPb ",
    "j26w3" -> "HgHg PuFe SnTi ____ ____ PbAu ____ AuPb NpCu ____ ____ FePu ",
    "j2k34" -> "TiCu FeMn ____ ____ ____ MnFe CuTi PbAg ____ AuAu ____ AgPb ",
    "j2k56" -> "HgHg PuFe ____ ____ CuNp PbAu ____ ____ NpCu ____ TiSn FePu ",
    "j2k5h" -> "MnCu CuMn ____ ____ AuHg NpFe ____ ____ FeNp HgAu ____ SnPb ",
    "j34k6" -> "HgSn ____ SnHg MnFe CuTi ____ ____ AuAu ____ ____ TiCu FeMn ",
    "j56w7" -> "UrCu ____ PbSn ____ AuHg NpFe AgTi ____ FeNp HgAu ____ ____ ",
    "k12j5" -> "____ AgUr ____ FePu HgHg PuFe SnTi ____ ____ PbAu ____ AuPb ",
    "k17j5" -> "TiCu FeMn HgSn ____ SnHg MnFe CuTi ____ ____ AuAu ____ ____ ",
    "k25m1" -> "____ ____ TiSn FePu HgHg PuFe ____ ____ CuNp PbAu ____ AuPb ",
    "k26m5" -> "HgSn ____ ____ MnFe CuTi PbAg ____ ____ ____ AgPb TiCu FeMn ",
    "k2j17" -> "____ ____ ____ MnFe CuTi PbAg ____ AuAu ____ AgPb TiCu FeMn ",
    "k2j56" -> "NpCu ____ ____ FePu HgHg PuFe SnTi ____ CuNp ____ ____ AuPb ",
    "k2j6h" -> "HgAu ____ ____ MnCu CuMn PbSn ____ AuHg NpFe ____ ____ FeNp ",
    "k34m2" -> "PbCu ____ ____ ____ AgHg TiFe FeTi HgAg ____ SnAu ____ CuPb ",
    "k56m4" -> "HgAu ____ SnPb ____ CuUr ____ ____ AuHg NpFe ____ TiAg FeNp ",
    "n25m6" -> "TiCu FeMn HgSn ____ ____ MnFe CuTi PbAg ____ ____ ____ AgPb ",
    "n26w5" -> "____ ____ SnHg MnFe CuTi PbAg ____ ____ ____ AgPb TiCu FeMn ",
    "n45w2" -> "HgTi ____ ____ UrAu ____ PbPb ____ AuUr NpSn ____ TiHg FeFe ",
    "n67m2" -> "____ AuUr ____ ____ TiHg FeFe HgTi ____ SnNp UrAu ____ PbPb ",
   "j126w7" -> "____ AgUr ____ ____ HgHg PuFe ____ MnAg CuNp PbAu ____ AuPb ",
   "j136w7" -> "____ ____ SnPb UrCu ____ PbSn ____ AuHg NpFe AgTi ____ FeNp ",
   "j167w2" -> "HgAu ____ ____ ____ CuUr PbSn ____ AuHg NpFe ____ TiAg FeNp ",
   "j246w3" -> "HgHg PuFe SnTi ____ CuNp ____ ____ AuPb NpCu ____ ____ FePu ",
   "j26w34" -> "HgHg PuFe SnTi UrAg ____ ____ ____ AuPb NpCu ____ ____ FePu ",
   "j2k6m5" -> "HgHg PuFe ____ ____ CuNp PbAu ____ ____ ____ AgUr TiSn FePu ",
   "j2k6w3" -> "HgHg PuFe SnTi ____ ____ PbAu ____ AuPb ____ ____ TiSn FePu ",
   "j346w5" -> "NpCu ____ TiSn FePu HgHg PuFe ____ ____ CuNp ____ ____ AuPb ",
   "j3k5m4" -> "HgAu ____ SnPb UrCu ____ ____ ____ AuHg NpFe AgTi ____ FeNp ",
   "k135m4" -> "____ CuUr PbSn ____ ____ NpFe ____ TiAg FeNp HgAu ____ SnPb ",
   "k157m6" -> "HgHg PuFe SnTi ____ CuNp PbAu ____ ____ NpCu ____ ____ FePu ",
   "k1j6w7" -> "____ CuUr PbSn ____ AuHg NpFe ____ TiAg FeNp HgAu ____ ____ ",
   "k235m4" -> "HgHg ____ ____ UrAg ____ PbAu ____ AuPb NpCu AgMn ____ FePu ",
   "k257m1" -> "NpCu ____ TiSn FePu HgHg PuFe ____ ____ CuNp PbAu ____ ____ ",
   "k25m17" -> "____ AgUr TiSn FePu HgHg PuFe ____ ____ CuNp PbAu ____ ____ ",
   "k2j5m1" -> "____ ____ TiSn FePu HgHg PuFe SnTi ____ ____ PbAu ____ AuPb ",
   "k2j5w6" -> "NpCu ____ ____ FePu HgHg PuFe SnTi UrAg ____ ____ ____ AuPb ",
   "k345m2" -> "UrCu ____ ____ ____ AuHg NpFe AgTi ____ FeNp HgAu ____ SnPb ",
   "n167m4" -> "HgAu ____ ____ UrCu ____ PbSn ____ AuHg NpFe AgTi ____ FeNp ",
   "n345w7" -> "____ CuUr ____ ____ AuHg NpFe ____ TiAg FeNp HgAu ____ SnPb ",
  "j2k56m4" -> "HgHg PuFe ____ ____ CuNp ____ ____ AuPb NpCu ____ TiSn FePu ",
  "j3k56m4" -> "HgTi ____ SnNp UrAu ____ ____ ____ AuUr NpSn ____ TiHg FeFe ",
  "k1j56w7" -> "____ AuUr NpSn ____ TiHg FeFe HgTi ____ SnNp UrAu ____ ____ ",
  "k2j56w7" -> "NpCu ____ ____ FePu HgHg PuFe SnTi ____ CuNp PbAu ____ ____ ")

  /** Sorted list of string keys from Berzelian
   *
   *  scala> val clefs: List[String] = RuneStone.accids
   */
  val accids: List[String] = Berzelian.keys.toList.sorted

  /** Databank of indices used for slicing strings
   *
   *  scala> val zero: Int = RuneStone.Astral("oph")
   */
  val Astral: Map[String, Int] = Map(
    "aqr" -> 50,
    "ari" -> 40,
    "cap" -> 55,
    "cnc" -> 25,
    "gem" -> 30,
    "leo" -> 20,
    "lib" -> 10,
    "oph" ->  0,
    "psc" -> 45,
    "sco" ->  5,
    "sgr" -> 60,
    "tau" -> 35,
    "vir" -> 15)

  /** Sorted list of instrument tuning names
   *
   *  scala> val lutes: List[String] = RuneStone.stocks
   */
  val stocks: List[String] = List(
    "beadgcf", "bfbfb", "cgdae", "dgdgc", "eadgbe", "fkbjdn", "piano")

  /** Sorted list of utility process names
   *
   *  scala> val utils: List[String] = RuneStone.stools
   */
  val stools: List[String] = List(
    "fetch", "gamut", "metal", "polar", "query", "tutor", "usage")

  /** Timestamp used for version control
   *
   *  scala> var aeon: String = RuneStone.epoch.toString()
   */
  val epoch: Long = System.currentTimeMillis()

  /** Return index value from Astral, used for string slice
   *
   *  scala> val five: Int = RuneStone.obtain("sco")
   */
  def obtain(sign: String): Int = Astral.getOrElse(sign, 0)

  /** Return string value from Berzelian
   *
   *  scala> val minion: String = RuneStone.acquire("j3")
   */
  def acquire(clef: String): String = Berzelian.get(clef) match {
    case Some(wire) => wire
    case None => "____ " * 12
  }

  /** Return sorted list of Locrian keys from Berzelian
   *
   *  scala> val lats: List[String] = RuneStone.solaria
   */
  def solaria: List[String] = {
    val arid = new Array[String](Berzelian.size)
    var arms = new Array[String](12)
    var spot: Int = 0
    for ((clef, wire) <- Berzelian) {
      arms = wire.split((32).toChar)
      if (arms(5).startsWith("Pb") || arms(11).startsWith("Fe")) {
        arid(spot) = clef
        spot += 1
      }
    }
    val ares: Array[String] = arid.filter(item => item != null)
    val arks: Array[String] = ares.sorted
    arks.toList
  }

  /** Return sorted list of Lydian keys from Berzelian
   *
   *  scala> val legs: List[String] = RuneStone.selenic
   */
  def selenic: List[String] = {
    val arid = new Array[String](Berzelian.size)
    val logs: List[String] = solaria
    var slot: Int = 0
    for (stem <- accids) {
      if (!logs.contains(stem)) {
        arid(slot) = stem
        slot += 1
      }
    }
    arid(slot) = "n0"
    val ares: Array[String] = arid.filter(item => item != null)
    val arks: Array[String] = ares.tail.sorted
    arks.toList
  }

  /** Return sorted list of alloys from Berzelian
   *
   *  scala> val labs: List[String] = RuneStone.refinery
   */
  def refinery: List[String] = {
    val arid = new Array[String](Berzelian.size * 8)
    var arms = new Array[String](12)
    var spot: Int = 0
    for (yarn <- Berzelian.values) {
      arms = yarn.split((32).toChar)
      for (stem <- arms) {
        if (!stem.startsWith("__")) {
          arid(spot) = stem
          spot += 1
        }
      }
    }
    val ares: Array[String] = arid.filter(item => item != null)
    val arcs: Array[String] = ares.distinct
    val arts: Array[String] = arcs.sorted
    arts.toList
  }

  /** Return sorted list of prospective keys from Berzelian
   *
   *  scala> val lids: List[String] = RuneStone.beagle("NpFe")
   */
  def beagle(spat: String): List[String] = {
    val arid = new Array[String](Berzelian.size)
    var arms = new Array[String](12)
    var spot: Int = 0
    Berzelian.foreach(duo => {
      arms = duo._2.split((32).toChar)
      if (arms.contains(spat)) {
        arid(spot) = duo._1
        spot += 1
      }
    })
    val ares: Array[String] = arid.filter(item => item != null)
    val arks: Array[String] = ares.sorted
    arks.toList
  }

  /** Return sorted list of matched keys from Berzelian
   *
   *  scala> RuneStone.recycle(RuneStone.enclave("56"), 0)
   */
  def enclave(spat: String): List[String] = {
    val arid = new Array[String](accids.length)
    var spot: Int = 0
    for (stem <- accids if stem.contains(spat)) {
      arid(spot) = stem
      spot += 1
    }
    val ares: Array[String] = arid.filter(item => item != null)
    if (ares.isEmpty) List(spat.concat(" ?"))
    else ares.toList
  }

  /** Printout list members formatted horizontally
   *
   *  scala> RuneStone.trellis(lutes)
   */
  def trellis(lops: List[String] = Nil): Unit = {
    if (lops.isEmpty) println("\n\tlist empty")
    else {
      val cols: Int = 8
      var numb: Int = 0
      for (stem <- lops) {
        if ((numb % cols) == 0) println
        printf("\t%s", stem)
        numb += 1
      }
      println
    }
  }

  /** Printout list members formatted and columned
   *
   *  scala> RuneStone.recycle(clefs, 0)
   */
  def recycle(lots: List[String] = Nil, numb: Int = 0): Unit = {
    val cols: Int = 8
    val lend: Int = lots.length - 1
    val boon: Boolean = (numb % cols) == 0
    if (lots.isEmpty) println("\n\tlist empty")
    else if (numb > lend) println("\n\tout of range")
    else {
      if (boon) println
      if (numb >= lend) {
        printf("\t%s\n", lots(numb))
      } else {
        printf("\t%s", lots(numb))
        recycle(lots, (numb + 1))
      }
    }
  }

  /** Printout accidentals of Locrian and Lydian keys from Berzelian
   *
   *  scala> RuneStone.bipolar
   */
  def bipolar: Unit = {
    recycle(solaria, 0)
    recycle(selenic, 0)
    println
  }

  /** Printout process utilities, instrument tunings, and scale accidentals
   *
   *  scala> RuneStone.palette
   */
  def palette: Unit = {
    trellis(stools)
    trellis(stocks)
    recycle(accids, 0)
  }

  /** Return new string tuned according to passed index
   *
   *  scala> var yarn: String = RuneStone.tension(minion, 25)
   */
  def tension(wire: String, spot: Int): String = {
    val span: Int = wire.length
    if (spot <= span) {
      val head: String = wire.slice(spot, span)
      val tail: String = wire.slice( 0, spot)
      val sewn: String = head + tail
      val stub: String = sewn.slice(0, 4)
      sewn + stub
    } else acquire("i0")
  }

  /** ※ Return list of Astral key strings for tuning
   *
   *  scala> val p4t7: List[String] = RuneStone.beadgcf
   */
  def beadgcf: List[String] = {
    List("cnc", "sgr", "tau", "lib", "psc", "leo", "cap")
  }

  /** ※ ibidem
   *
   *  scala> val a4t5: List[String] = RuneStone.bfbfb
   */
  def bfbfb: List[String] = {
    List("cap", "cnc", "cap", "cnc", "cap")
  }

  /** ※ ibidem
   *
   *  scala> val sus5: List[String] = RuneStone.dgdgc
   */
  def dgdgc: List[String] = {
    List("sgr", "tau", "lib", "tau", "lib")
  }

  /** ※ ibidem
   *
   *  scala> val p5t5: List[String] = RuneStone.cgdae
   */
  def cgdae: List[String] = {
    List("leo", "psc", "lib", "tau", "sgr")
  }

  /** ※ ibidem
   *
   *  scala> val gtr6: List[String] = RuneStone.eadgbe
   */
  def eadgbe: List[String] = {
    List("leo", "cap", "tau", "lib", "psc", "leo")
  }

  /** ※ ibidem
   *
   *  scala> val m3t6: List[String] = RuneStone.fkbjdn
   */
  def fkbjdn: List[String] = {
    List("lib", "aqr", "gem", "lib", "aqr", "gem")
  }

  /** Printout fingerboard diagram
   *
   *  scala> RuneStone.lattice(gtr6, minion)
   */
  def lattice(sols: List[String], wire: String): Unit = {
    var cord: String = tension(wire, 0)
    for (sign <- sols) {
      cord = tension(wire, obtain(sign))
      printf("\t%s\n", cord)
    }
  }

  /** ※ ibidem
   *
   *  scala> val viol5: List[String] = RuneStone.pegasus("cgdae")
   */
  def pegasus(tune: String): List[String] = tune match {
    case "beadgcf" => beadgcf
    case "bfbfb" => bfbfb
    case "dgdgc" => dgdgc
    case "cgdae" => cgdae
    case "eadgbe" => eadgbe
    case "fkbjdn" => fkbjdn
    case _ => List("oph")
  }

  /** Printout diagram with tuning, key, and timestamp
   *
   *  scala> RuneStone.display("cgdae", "j6")
   */
  def display(tune: String, stem: String): Unit = {
    val aeon: String = epoch.toString()
    val wire: String = acquire(stem)
    val sols: List[String] = pegasus(tune)
    printf("\n\t%s-%s-i%s\n", tune, stem, aeon)
    lattice(sols, wire)
  }

  /** Printout all diagrams with selected tuning
   *
   *  scala> RuneStone.pleroma("bfbfb")
   */
  def pleroma(tune: String = "piano"): Unit = {
    if (stocks.contains(tune)) {
      for (stem <- accids) {
        display(tune, stem)
      }
    } else printf("\t%s ?\n\n", tune)
    println
  }

  /** Determine whether string begins with be, bf, cg, ea, fk, pi
   *
   *  scala> var boon: Boolean = RuneStone.guardian("cgdae")
   */
  def guardian(stem: String): Boolean = {
    stem.startsWith("be") ||
    stem.startsWith("bf") ||
    stem.startsWith("cg") ||
    stem.startsWith("dg") ||
    stem.startsWith("ea") ||
    stem.startsWith("fk") ||
    stem.startsWith("pi")
  }

  /** Determine whether string begins with j, k, n
   *
   *  scala> var bone: Boolean = RuneStone.sentinel("k5")
   */
  def sentinel(stem: String): Boolean = {
    stem.startsWith("i") ||
    stem.startsWith("j") ||
    stem.startsWith("k") ||
    stem.startsWith("n")
  }

  /** Determine whether string is valid stocks tuning name
   *
   *  scala> var bout: Boolean = RuneStone.tunisia("cgdae")
   */
  def tunisia(stem: String): Boolean = {
    guardian(stem) && stocks.contains(stem)
  }

  /** Determine whether string is valid Berzelian key
   *
   *  scala> var bozo: Boolean = RuneStone.whiskey("k5")
   */
  def whiskey(stem: String): Boolean = {
    sentinel(stem) && accids.contains(stem)
  }

  /** Preparation for passing tuning string to pleroma
   *
   *  scala> RuneStone.copious(List("piano"))
   */
  def copious(lobs: List[String] = Nil): Unit = {
    val salt: String = stocks.last
    if (lobs.isEmpty) pleroma(salt)
    else {
      val slot: Int = lobs.indexWhere(tunisia(_))
      if (slot >= 0) {
        pleroma(lobs(slot))
      } else pleroma(salt)
    }
  }

  /** Printout keys correlated to alloys columned
   *
   *  scala> RuneStone.gondola(List("fetch", "FeNp", "FePu"))
   */
  def gondola(lobs: List[String]): Unit = {
    val vats: List[String] = refinery
    val labs: List[String] = lobs.filter(stem =>
      stem.length < 5 && !sentinel(stem) &&
      vats.contains(stem))
    if (labs.isEmpty) {
      recycle(vats, 0)
      println
    } else {
      for (spat <- labs) {
        recycle(beagle(spat), 0)
      }
      println
    }
  }

  /** Printout matched keys from Berzelian columned
   *
   *  scala> RuneStone.keyhole(List("query", "56", "w7"))
   */
  def keyhole(lobs: List[String]): Unit = {
    val arid = new Array[String](accids.length)
    var spot: Int = 0
    for (stem <- lobs) {
      if (!stocks.contains(stem) && !stools.contains(stem)) {
        arid(spot) = stem
        spot += 1
      }
    }
    val ares: Array[String] = arid.filter(item => item != null)
    if (ares.isEmpty) recycle(accids, 0)
    else {
      for (stem <- ares if stem.length < 5) {
        recycle(enclave(stem))
      }
    }
    println
  }

  /** Printout diagrams with selected tuning and keys
   *
   *  scala> RuneStone.baggage(List("eadgbe", "n0", "j3"))
   */
  def baggage(lobs: List[String]): Unit = {
    val numb: Int = lobs.count(sentinel(_))
    var tune: String = "beadgcf" // default tuning
    if (numb == 0) palette
    else {
      for (stem <- lobs) {
        if (tunisia(stem)) tune = stem
        else if (whiskey(stem)) display(tune, stem)
        else if (stools.contains(stem)) ()
        else printf("\n\t%s ?\n", stem)
      }
    }
    println
  }

  /** Control flow branching between gondola, keyhole, and baggage
   *
   *  scala> RuneStone.freight(List("fetch", "AuHg", "AuPb"))
   */
  def freight(lobs: List[String]): Unit = {
    if (lobs.contains("fetch")) gondola(lobs)
    else if (lobs.contains("query")) keyhole(lobs)
    else baggage(lobs)
  }

  /** Printout tutorial of usage examples
   *
   * scala> RuneStone.exemplar
   */
  def exemplar: Unit = {
    val opts: List[String] = List("", "tutor", "query 56",
      "polar", "metal", "fetch AuSn", "k6 j17", "eadgbe n0 j3",
      "j23 cgdae j23", "cgdae gamut")
    val path: String = "sundstromar.neoclassic.RuneStone"
    println
    for (stem <- opts) {
      printf("\tscala %s %s\n\n", path, stem)
    }
  }

  /** Control flow branching for utility routines
   *
   *  scala> RuneStone.caboose(List("eadgbe", "metal"))
   */
  def caboose(lobs: List[String]): Unit = lobs.last match {
    case "gamut" => copious(lobs)
    case "metal" => { recycle(refinery, 0); println }
    case "polar" => bipolar
    case "query" => keyhole(lobs)
    case "tutor" => exemplar
    case "usage" => { palette ; println }
    case _ => freight(lobs)
  }

  /** Application entryway
   *
   *  scala> RuneStone.main(Array("eadgbe", "n0", "j3"))
   */
  def main(args: Array[String]): Unit = {
    val span: Int = 9
    val arid = new Array[String](accids.length)
    if (args.isEmpty) {
      palette
      println
    }
    else if (args.length > accids.length)
      println("Request denied!")
    else {
      var spot: Int = 0
      for (step <- args) {
        if (step.length < span) {
          arid(spot) = step
          spot += 1
        }
      }
      val ares: Array[String] = arid.filter(item => item != null)
      if (ares.isEmpty) {
        palette
        println
      } else caboose(ares.toList)
    }
  }

} // terminus

