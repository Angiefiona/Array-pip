fun main() {
    nums()
    primeNumbers()
    calculateSum()
    strings()


}
//Write a Kotlin program that creates an array of integers and initializes it with the values {1, 2, 3, 4, 5}.
//Print the array to the console.
fun nums(){
    var integers = intArrayOf(1,2,3,4,5)
    println(integers.contentToString())
}
//Write a Kotlin program that creates an array of integers and initializes it with the values {12, 21, 32, 44, 5, 78,35}.
//Use a loop to print out only the even numbers in the array
fun primeNumbers(){
    var values = intArrayOf(12, 21, 32, 44, 5, 78,35)
    for(value in values){
        if(value % 2==0){
            println(value)
        }
    }

}
//Write a Kotlin program that creates an array of integers and initializes it with the values {5, 6, 7, 8, 9}.
//Use a loop to calculate the sum of the numbers in the array and print the result to the console.
fun calculateSum(){
    var calculate = arrayOf(5, 6, 7, 8, 9)
    var sum = 0
    for(cal in calculate){
        sum +=cal
    }
    println(sum)

}
//Write a Kotlin program that creates an array of strings and initializes it with the names of your favorite fruits.
//Use a loop to concatenate all the names together into one long string and print the result to the console.
fun strings(){

    var fruits = arrayOf("apple", "banana", "orange", "grape", "kiwi")
    var concatString = ""

    for (fruit in fruits) {
        concatString += "$fruit "
    }

    println( concatString)
}

