import models.Lampada
import utilities.readInt

fun main() {
    menuPrincipal()
}

fun menuPrincipal(){
    var uwu:Boolean=false
    do{
        var userMP: Int = readInt(
            pMessageIn = "Hola, siusplau introdueix:\n 1 Per veure com es proven dues lampades\n" +
                    " 2 Per poder fer la teva lampada i provarla\n 3 Sortir",
            pMessageErrorDT = "Siusplau introdueix un numero valid",
            pMessageErrorDV = "Siusplau introdueix un numero valid",
            pMax = 3,
            pMin = 1
        )
        when (userMP) {
            1 -> lamapadesAutos()
            2 -> fesLaTevaLampada()
            3 -> uwu = true
        }
    }while (!uwu)
    println("""Deu fins la propera \owo/""")
}

fun lamapadesAutos(){
    lampada1()
    lampada2()
}

fun fesLaTevaLampada(){
    var uwu:Boolean=false
    var lampadaActual:Lampada= Lampada("owo")
    do{
        var userMP: Int = readInt(
            pMessageIn = "Hola, siusplau introdueix:\n 1 Per crear una lampada\n" +
                    " 2 Per encedre la lampada\n 3 Per apagar la lampada\n 4 Per canviar el color de la lampada\n" +
                    " 5 Per augmentar l'intensitat\n 6 Per disminuir l'intensitat\n 7 Sortir (^o^)/",
            pMessageErrorDT = "Siusplau introdueix un numero valid",
            pMessageErrorDV = "Siusplau introdueix un numero valid",
            pMax = 7,
            pMin = 1
        )
        when (userMP) {
            1 -> {println("Introdueix el identificador de la lampada:"); lampadaActual= Lampada(readln())}
            2 -> lampadaActual.encendre()
            3-> lampadaActual.apagar()
            4->lampadaActual.canviarColor()
            5->lampadaActual.pujarIntensitat()
            6->lampadaActual.vaixarIntensitat()
            7 -> uwu = true
        }
    }while (!uwu)
    println("""Deu fins la propera \owo/""")
    println("T'ha agradat trastejar les lamades? Owu")
}

fun lampada1(){
    val lampada1:Lampada=Lampada(identificador = "menjador")
    println("Exemple:\n"+ lampada1.toString() +" :")
    lampada1.encendre()
    for (i in 1..3)lampada1.canviarColor()
    for (i in 1..4)lampada1.pujarIntensitat()
    println("despres de les modificacions la lampada a quedat aixi: "+lampada1.toString())
}

fun lampada2(){
    val lampada2:Lampada=Lampada(identificador = "bany")
    println("Exemple:\n"+ lampada2.toString() +" :")
    lampada2.encendre()
    for (i in 1..2)lampada2.canviarColor()
    for (i in 1..4)lampada2.pujarIntensitat()
    lampada2.apagar()
    lampada2.canviarColor()
    lampada2.encendre()
    lampada2.canviarColor()
    for (i in 1..4)lampada2.pujarIntensitat()
    println("despres de les modificacions la lampada a quedat aixi: "+lampada2.toString())
}