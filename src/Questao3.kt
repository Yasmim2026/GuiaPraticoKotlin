
fun validarBioInfantil(bio: String?) {
    val tamanho = bio?.length ?: 0

    if (tamanho <= 50) {
        println("Bio aceita")
    } else {
        println("Bio muito longa")
    }
}

fun main() {
    validarBioInfantil("Oi, meu nome é Yasmim!")
    validarBioInfantil(null)
    validarBioInfantil("Esta é uma biografia com mais de cinquenta caracteres para testar.")
}