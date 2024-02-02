import org.example.Lampara

fun main() {
    // LÁMPARA 1
    val lampara1a: Lampara = Lampara()
    println("ESTADO INICIAL DE LA LÁMPARA:\n$lampara1a")
    println()

    lampara1a.encender()
    lampara1a.cambiarColor(1)
    lampara1a.cambiarColor(2)
    lampara1a.cambiarColor(3)
    lampara1a.cambiarIntensidad(1)
    lampara1a.cambiarIntensidad(2)
    lampara1a.cambiarIntensidad(3)
    lampara1a.cambiarIntensidad(4)
    println()

    val lampara1b: Lampara = Lampara(true,0,3,4)
    println("ESTADO ACTUAL DE LA LÁMPARA:\n$lampara1b")
    println()

    lampara1b.apagar()
    println()

    //LÁMPARA 2
    val lampara2a: Lampara = Lampara()
    lampara2a.setIdentificador(3)
    println("ESTADO INICIAL DE LA LÁMPARA:\n$lampara2a")
    println()

    lampara2a.encender()
    lampara2a.cambiarColor(1)
    lampara2a.cambiarColor(2)
    lampara2a.cambiarIntensidad(1)
    lampara2a.cambiarIntensidad(2)
    lampara2a.cambiarIntensidad(3)
    lampara2a.cambiarIntensidad(4)

    val lampara2b: Lampara = Lampara(true,3,2,4)
    println("ESTADO ACTUAL DE LA LÁMPARA:\n$lampara2b")
    println()

    lampara2b.apagar()
    println()

    val lampara2c: Lampara = Lampara()
    lampara2c.setColor(4)
    lampara2c.setIdentificador(3)
    println("ESTADO ACTUAL DE LA LÁMPARA:\n$lampara2c")
    println()

    val lampara2d:Lampara = Lampara()
    lampara2d.encender()
    lampara2d.cambiarColor(3)
    lampara2d.cambiarIntensidad(1)
    lampara2d.cambiarIntensidad(2)
    lampara2d.cambiarIntensidad(3)
    lampara2d.cambiarIntensidad(4)
    println()

    val lampara2e: Lampara = Lampara(true, 3, 3, 4)
    println("ESTADO ACTUAL DE LA LÁMPARA:\n$lampara2e")
    println()
}