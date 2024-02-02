package org.example

class Lampara() {
    // Atributos
    private var estado: Boolean = false
    private var identificador: Array<String> = arrayOf("salón", "cocina", "baño", "dormitorio", "estudio")
    private var color: Array<String> = arrayOf(WHITE_BOLD + "blanco" + RESET, YELLOW_BOLD + "amarillo" + RESET, RED_BOLD + "rojo" + RESET, PURPLE_BOLD + "púrpura" + RESET, CYAN_BOLD + "cian" + RESET)
    private var intensidad: Array<Int> = arrayOf(1, 2, 3, 4, 5)

    // Constructores
    constructor(pEstado:Boolean = false, pIndiceColor:Int = 0, pIndiceIntensidad:Int = 0): this() {
        this.estado = pEstado
        this.color = arrayOf(color[pIndiceColor])
        this.intensidad = arrayOf(intensidad[pIndiceIntensidad])
    }
    constructor(pEstado:Boolean = false, pIndiceIndentificador:Int = 0, pIndiceColor:Int = 0, pIndiceIntensidad:Int = 0): this() {
        this.estado = pEstado
        this.identificador = arrayOf(identificador[pIndiceIndentificador])
        this.color = arrayOf(color[pIndiceColor])
        this.intensidad = arrayOf(intensidad[pIndiceIntensidad])
    }

    // Métodos
    fun encender() {
        this.estado = true
        return println("Lámpara encendida")
    }
    fun apagar() {
        this.estado = false
        return println("Lámpara apagada")
    }

    fun cambiarEstancia(pIndiceIndentificador: Int) {
        return if (pIndiceIndentificador in identificador.indices) {
            println("Estancia: ${identificador[pIndiceIndentificador]}")
        } else {
            println(RED + "Estancia no válida" + RESET)
        }
    }
    fun cambiarColor(pIndiceColor: Int) {
        return if (pIndiceColor in color.indices) {
            println("Color cambiado a : ${color[pIndiceColor]}")
        } else {
            println(RED + "Color no válido" + RESET)
        }
    }
    fun cambiarIntensidad(pIndiceIntensidad: Int) {
        return if (pIndiceIntensidad in intensidad.indices) {
            println("Intensidad cambiada a: ${intensidad[pIndiceIntensidad]}")
        } else {
            println(RED + "Intensidad no válida" + RESET)
        }
    }

    // Funciones Set
    fun setColor(pIndiceColor: Int) {
        this.color = arrayOf(color[pIndiceColor])
    }

    fun setIdentificador(pIndiceIndentificador: Int) {
        this.identificador = arrayOf(identificador[pIndiceIndentificador])
    }

    fun setIntensidad(pIndiceIntensidad: Int) {
        this.intensidad = arrayOf(intensidad[pIndiceIntensidad])
    }

    // Función que sobrescribe la descripción del objeto
    override fun toString():String {
        return "Estado: ${if (!this.estado) "apagada" else "encendida"}\n" +
                "Estancia: ${this.identificador[0]}\n" +
                "Color: ${this.color[0]}\n" +
                "Intensidad: ${this.intensidad[0]}"
    }
}