
fun limparEmails(emails: List<String?>) {
    var contasInvalidas = 0

    for (email in emails) {
        if (email == null || (email?.length ?: 0) == 0) {
            contasInvalidas++
            println("Conta inválida: será apagada")
        } else {
            println("Conta válida: $email")
        }
    }

    println("Contas que precisam ser apagadas: $contasInvalidas")
}

fun main() {
    limparEmails(listOf("yasmim@email.com", null, "", "beatriz@email.com"))
}