package es.uva.sg.psm.labo03.colecciones

class Cuenta (val id: String){

    val transacciones : MutableList<Transaccion> = mutableListOf()
    val propietarios : MutableSet<Persona> = hashSetOf()

    fun agregarTransaccion(transaccion: Transaccion) {

        transacciones.add(transaccion)
    }

    fun saldoActual() : Double {
        var saldo = 0.0
        for(transaccion in transacciones){
            if(transaccion.tipo == "depósito"){
                saldo += transaccion.cantidad
            }else{
                saldo -= transaccion.cantidad
            }
        }
        return saldo
    }

}