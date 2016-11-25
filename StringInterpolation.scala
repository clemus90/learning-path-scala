val a = 99
println(s"${a + 3} luftballons floating in the summer sky")

val ticketsCost = 50
val bandName = "Psychedelic Furs"
println(f"The $bandName%s tickets are probably $$$ticketsCost%1.2f")

val percentIncrease = 20
val musicGenre = "New Wave"
println(f"The $bandName%s tickets are probably $$$ticketsCost%1.2f%n That's a $percentIncrease%% bum because everyone likes $musicGenre")
println(f"""The $bandName%s tickets are probably $$$ticketsCost%1.2f
        |That's a $percentIncrease%% bum because everyone likes $musicGenre""".stripMargin)
