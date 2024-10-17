package es.sg.uva.labo03retofunciones.ui.theme

class DiaSemana {

    fun getM(a: Int, m: Int): Int {
        val mesRegular = arrayOf(0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5)
        val mesBisiesto = arrayOf(0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6)

        return if ((a % 4 == 0) && ((a % 100 != 0) || (a % 400 == 0))) {
            mesBisiesto[m - 1]
        } else {
            mesRegular[m - 1]
        }
    }

    fun getDiaSemana(anno: Int, mes: Int, dia: Int): String {

        val diasSemana = arrayOf("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo")
        var key =  ((anno - 1) % 7 +(((anno - 1)/4) - 3 * ((((anno -1) / 100) + 1) / 4)) % 7 + mes + dia % 7) % 7

        /*var a = anno -1
        var b = (anno -1)/4
        var c = (((anno - 1)/100) + 1) / 4

        var key =  (a % 7 + (b - 3 * c) % 7 + mes + dia % 7) % 7*/
        return diasSemana[key -1] // Para evitar error de compilación
    }
}


fun main(){

    print("Introduzca el año:")
    var anno = readlnOrNull()?.toIntOrNull() ?: error("Valor no válido para el año")
    print("Introduzca el mes:")
    var mes = readlnOrNull()?.toIntOrNull() ?: error("Valor no válido para el mes")
    print("Introduzca el dia:")
    var dia = readlnOrNull()?.toIntOrNull() ?: error("Valor no válido para el dia")


    val test1 = DiaSemana()
    mes = test1.getM(anno, mes)

    print("Es: " + test1.getDiaSemana(anno, mes, dia))
}