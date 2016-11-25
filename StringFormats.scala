//Java Way
val str = String.format("This is a %s", "Test")
println(str)

//Scala's Style
val str2 = "This is a %s".format("Test")
println(str2)

println("Because you're %3$s, %2$s, %1$s times a lady".format("Three", "Twice", "Once"))

import java.time._
println("We will be eating lunch on %1$tB the %1te in the year %1$tY.".format(LocalDate.now))
printf("We will be eating lunch on %1$tB the %1te in the year %1$tY.",LocalDate.now)

val lyrics = """I see trees of %s.
                @%s roses too,
                @I see them bloom,
                @For me and you,
                @And I think to myself.
                @What a wonderful world""".stripMargin('@').format("green", "red")

println(lyrics)
