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

  /** List of string keys from Berzelian
   *
   *  scala> val clefs: List[String] = RuneStone.accids
   */
  val accids: List[String] = Berzelian.keys.toList.sorted

  /** Databank of indices used for slicing strings
   *
   *  scala> val zero: Int = RuneStone.astral("oph")
   */
  val astral: Map[String, Int] = Map(
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

  /** List of instrument tunings
   *
   *  scala> val thirds: String = RuneStone.stocks(4)
   */
  val stocks: List[String] = List(
    "beadgcf", "bfbfb", "cgdae", "eadgbe", "fkbjdn", "piano")

  /** Timestamp used for version control
   *
   *  scala> var aeon: String = RuneStone.epoch.toString()
   */
  val epoch: Long = System.currentTimeMillis()

  /** Returns index used for string slice
   *
   *  scala> val five: Int = RuneStone.obtain("sco")
   */
  def obtain(sign: String): Int = astral.getOrElse(sign, 0)

  /** Returns string value from Berzelian
   *
   *  scala> val minion: String = RuneStone.acquire("j3")
   */
  def acquire(clef: String): String = {
    Berzelian.get(clef) match {
      case Some(wire) => wire
      case None => ""
    }
  }

  /** Printout List members formatted horizontally
   *
   *  scala> RuneStone.banner(RuneStone.stocks)
   */
  def banner(slats: List[String]): Unit = {
    print("\n\t")
    for (stem <- slats) print("\t%s".format(stem))
    println
  }

  /** Printout List members formatted columned
   *
   *  scala> RuneStone.recycle(clefs, 0); println
   */
  def recycle(keys: List[String], numb: Int): Unit = {
    if (numb >= (keys.length - 1)) {
      print("\t%s".format(keys(numb)))
    } else {
      if ((numb % 8) == 0) println
      print("\t%s".format(keys(numb)))
      recycle(keys, (numb + 1))
    }
  }

  /** Printout tunings from stocks and keys from Berzelian
   *
   *  scala> RuneStone.palette
   */
  def palette: Unit = {
    banner(stocks)
    recycle(accids, 0)
    println("\n")
  }

  /** Returns tuned string
   *
   *  scala> var twine: String = RuneStone.tension(minion, 25)
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

  /** ※ Returns List of strings for tuning
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
      println("\t%s".format(cord))
    }
    println
  }

  /** Returns List of strings for tuning
   *
   *  scala> val cello: List[String] = RuneStone.pegasus("cgdae")
   */
  def pegasus(tune: String): List[String] = {
    tune match {
      case "beadgcf" => beadgcf
      case "bfbfb" => bfbfb
      case "cgdae" => cgdae
      case "eadgbe" => eadgbe
      case "fkbjdn" => fkbjdn
      case _ => List("oph")
    }
  }

  /** Printout diagram with tuning, key, and timestamp
   *
   *  scala> RuneStone.display("cgdae", "j6")
   */
  def display(tune: String, stem: String): Unit = {
    if (accids.contains(stem)) {
      val aeon: String = epoch.toString()
      val wire: String = acquire(stem)
      val sols: List[String] = pegasus(tune)
      println("\t%s-%s-i%s".format(tune, stem, aeon))
      lattice(sols, wire)
    } else {
      println("\t%s ?\n".format(stem))
    }
  }

  /** Printout all diagrams with selected tuning
   *
   *  scala> RuneStone.pleroma("piano")
   */
  def pleroma(tune: String = "unison"): Unit = {
    println
    for (stem <- accids) {
      display(tune, stem)
    }
  }

  /** Determine whether string begins with be, bf, cg, ea, fk, pi
   *
   *  scala> var boon: Boolean = RuneStone.guardian("cgdae")
   */
  def guardian(stem: String): Boolean = {
    stem.startsWith("be") ||
    stem.startsWith("bf") ||
    stem.startsWith("cg") ||
    stem.startsWith("ea") ||
    stem.startsWith("fk") ||
    stem.startsWith("pi")
  }

  /** Determine whether string begins with j, k, n
   *
   *  scala> var bone: Boolean = RuneStone.sentinel("k5")
   */
  def sentinel(stem: String): Boolean = {
    stem.startsWith("j") ||
    stem.startsWith("k") ||
    stem.startsWith("n")
  }

  /** Preparation for passing tuning string to pleroma
   *
   *  scala> RuneStone.copious(List("piano"))
   */
  def copious(lops: List[String] = Nil): Unit = {
    val bozo: Boolean = lops.isEmpty
    var tune: String = "beadgcf"
    if (!bozo) {
      val slot: Int = lops.indexWhere(guardian(_))
      if (slot >= 0) {
        val kind: String = lops(slot)
        if (stocks.contains(kind)) tune = kind
      }
    }
    pleroma(tune)
  }

  /** Application entryway
   *
   *  scala> RuneStone.main(Array("eadgbe", "n0", "j3"))
   */
  def main(args: Array[String]): Unit = {
    val span: Int = 9
    if (args.isEmpty) palette
    else if (args.length > accids.length)
      println("Request denied!")
    else if (args.last == "gamut") {
      val lops: List[String] = (
        args.filter(stem => stem.length < span)
      ).toList
      copious(lops)
    }
    else {
      val numb: Int = args.count(sentinel(_))
      var tune: String = "beadgcf"
      if (numb > 0) println else palette
      for (stem <- args) {
        if (stem.length < span) {
          if (guardian(stem)) tune = stem
          if (sentinel(stem)) display(tune, stem)
        } else {
          val snip: String = stem.slice(0, span - 1)
          println("\t%s.. ?\n".format(snip))
        }
      }
    }
  }

} // terminus

