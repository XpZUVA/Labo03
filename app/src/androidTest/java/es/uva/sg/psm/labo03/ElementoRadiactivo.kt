package es.uva.sg.psm.labo03

import kotlin.math.exp
import kotlin.math.ln

class ElementoRadiactivo(val nombre: String, val lambda: Double) {
    override fun toString(): String {
        return "ElementoRadiactivo(nombre='$nombre', lambda=$lambda)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ElementoRadiactivo

        if (nombre != other.nombre) return false
        if (lambda != other.lambda) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nombre.hashCode()
        result = 31 * result + lambda.hashCode()
        return result
    }


    fun getSemiVida(): Double {
        return ln(2.0) / lambda
    }


    fun getProporcionDesintegracion(t: Double): Double {
        return 1 - exp(-lambda * t)
    }

}


fun main() {
    val elemento = ElementoRadiactivo("Uranio 235",0.000000000000000031229827968)
    println(elemento)
    println(elemento.getSemiVida())
    println(elemento.getProporcionDesintegracion(10.0))
}