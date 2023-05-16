class Persona(var name:String, var age: Int, var job_status:String, var gender:String){

}
fun main(){
    var person1=Persona("Rita",18, "unemployed","Female")
    println(person1.name+" ,"+person1.age+" ,"+person1.job_status)

    var person2=Persona("David",43,"unemployed","Male")
    println(person2.name+" ,"+person2.age+" ,"+person2.job_status)
}

class Avatar{
    var name="Rita"
    var age=18
    var job_status="unemployed"
    var gender="Female"

}

class Bender{
    var name="David"
    var age=43
    var job_status="unemployed"
    var gender="Male"

}