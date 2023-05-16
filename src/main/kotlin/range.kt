fun main(){
    for (number in 10..15)
        println(number)
    for (letter in 'c'..'f')
        println(letter)
    for(num in 1..10) {
        println(num)

        if (num == 5) {
            break
        }
    }
    for(let in 'a'..'d'){
        if(let=='c'){
            continue
        }
        println(let)
      

    }


}