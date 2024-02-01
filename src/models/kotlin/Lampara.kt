package org.example

class Lampara() {
    // Atributos
    private var estado: Boolean = false
    private var identificador: Array<String> = arrayOf("salón", "cocina", "baño", "dormitorio", "estudio")
    private var color: Array<String> = arrayOf("blanco", "amarillo", "rojo", "púrpura", "cian")
    private var intensidad: Array<Int> = arrayOf(1, 2, 3, 4, 5)


    // Constructores
    constructor(pEstado:Boolean, pIndiceColor:Int, pIndiceIntensidad:Int): this() {
        this.estado = pEstado
        this.color = arrayOf(color[pIndiceColor])
        this.intensidad = arrayOf(intensidad[pIndiceIntensidad])
    }
    constructor(pEstado:Boolean, pIndiceIndentificador:Int, pIndiceColor:Int, pIndiceIntensidad:Int): this() {
        this.estado = pEstado
        this.identificador = arrayOf(identificador[pIndiceIndentificador])
        this.color = arrayOf(color[pIndiceColor])
        this.intensidad = arrayOf(intensidad[pIndiceIntensidad])
    }

    // Métodos
    fun encender() {
        this.estado = true
        return println("encendida")
    }
    fun apagar() {
        this.estado = false
        return println("apagada")
    }

    fun cambiarEstancia(pIndiceIndentificador: Int) {
        if (pIndiceIndentificador in identificador.indices) {
            println(identificador[pIndiceIndentificador])
        } else {
            return println("Estancia no válida")
        }
    }
    fun cambiarColor(pIndiceColor: Int) {
        if (pIndiceColor in color.indices) {
            return println(color[pIndiceColor])
        } else {
            return println("Color no válido")
        }
    }
    fun cambiarIntensidad(pIndiceIntensidad: Int) {
        if (pIndiceIntensidad in intensidad.indices) {
            return println("${intensidad[pIndiceIntensidad]}")
        } else {
            return println("${intensidad[pIndiceIntensidad]}")
        }
    }
}