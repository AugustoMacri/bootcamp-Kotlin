class Customer  //Declaration of the class

class Contact(val id: Int, var email: String)   //Constructor

fun main(){
    val customer = Customer()
    val contact = Contact(1234, "@email.com")

    println(contact.email)
    println(contact.id)
    contact.email = "@gmail.com"
    println(contact.email)
}