package models

class Lampada {
    private var identificador:String="lampada_1"
    private var apagat:Boolean=true
    private var color:String="lila"
    private var intensitat:Int=0
    constructor(identificador:String){
        this.identificador=identificador.lowercase()
    }

    /**
     * Override of the function toString, now shows all the info that the user could need of the lamp
     * @author N0mbreP
     * @since Commit 1 2024/02/01
     * @return returns a String
     */
    override fun toString(): String {
        var uwu:String=""
        if (this.apagat) uwu="apagada"
        else uwu="encesa"
        return "La lampada $identificador, esta $uwu, de color $color amb el nivell d'intensitat $intensitat ."
    }

    /**
     * The method encendre change the attributes apagat to false and intensitat to 1 only when the attribute apagat
     * is true and inform to the user what changed on the lamp, or it informs that nothing changed and why
     * @author N0mbreP
     * @since Commit 1 2024/02/01
     */
    fun encendre(){
        if (this.apagat){
            this.apagat = false
            this.intensitat = 1
            println("La lampada s'ha ences")
        }else println("La lampada ja esta encesa")
    }

    /**
     * The method apagar change the attributes apagat to tru and intensitat to 0 only when the attribute apagat
     * is false and inform to the user what changed on the lamp, or it informs that nothing changed and why
     * @author N0mbreP
     * @since Commit 1 2024/02/01
     */
    fun apagar(){
        if (!this.apagat){
            this.apagat = true
            this.intensitat = 0
            println("La lampada s'ha apagat")
        }else println("La lampada ja esta apagada")
    }

    /**
     * The methodcanviarColor change the attribute color in a cycle (lila->blau->verd->blanc->lila)
     * and inform to the user what changed on the lamp
     * @author N0mbreP
     * @since Commit 1 2024/02/01
     */
    fun canviarColor(){
        when(this.color){
            "lila"->this.color="blau"
            "blau"->this.color="verd"
            "verd"->this.color="blanc"
            "blanc"->this.color="lila"
        }
        println("El color de la lampada a cambiat a $color")
    }

    /**
     * The pujarIntensitat change the attribute intensitat up to arrive an intensity of 5
     * and inform to the user what changed on the lamp,  or it informs that nothing changed and why
     * @author N0mbreP
     * @since Commit 1 2024/02/01
     */
    fun pujarIntensitat(){
        var uwu:Boolean=false
        if (!this.apagat) {
            when (this.intensitat) {
                1 -> this.intensitat = 2
                2 -> this.intensitat = 3
                3 -> this.intensitat = 4
                4 -> this.intensitat = 5
                5 -> uwu = true
            }
            if (uwu) println("Intensitat maxima arrivada i es la intensitat $intensitat")
            else println("La intensitat a pujat a $intensitat")
        }else println("La lampada esta apagada")
    }

    /**
     * The vaixarIntensitat change the attribute intensitat down to arrive an intensity of 1
     * and inform to the user what changed on the lamp, or it informs that nothing changed and why
     * @author N0mbreP
     * @since Commit 1 2024/02/01
     */
    fun vaixarIntensitat(){
        var uwu:Boolean=false
        if (!this.apagat){
            when(this.intensitat){
                5->this.intensitat=4
                4->this.intensitat=3
                3->this.intensitat=2
                2->this.intensitat=1
                1->uwu=true
            }
            if (uwu) println("Intensitat minima arrivada i es la intensitat $intensitat")
            else println("La intensitat a menguat a $intensitat")
        }else println("La lampada esta apagada")
    }
}