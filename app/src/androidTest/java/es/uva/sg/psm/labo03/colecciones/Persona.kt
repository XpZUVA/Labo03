package es.uva.sg.psm.labo03.colecciones

class Persona(val nombre: String) {

    val cuentas : MutableSet<Cuenta> = hashSetOf()

    fun agregarCuenta(cuenta: Cuenta) {
        cuentas.add(cuenta)
    }

    fun saldoNeto() : Double {
        var saldo = 0.0
        for(cuenta in cuentas){
            saldo += cuenta.saldoActual()
        }
        return saldo
    }
}