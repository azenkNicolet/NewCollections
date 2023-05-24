package com.example.newcollections

fun main()
{
    println("This is a test.")
    arrays()
    indexArray()
    objectArrays()
    lists()
    sets()
    maps()
    arrayLists()
}

fun arrays() {
    val numbers: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)

    //type inference
    val numbers1 = intArrayOf(1, 2, 3, 4, 5, 6)

    //Further simplified
    val numbers2 = arrayOf(1, 2, 3, 4, 5, 6)

    //Prints address of array.
    println("The address of the numbers array is: $numbers")

    //Prints contents of array.
    println(numbers.contentToString())

    //Print contents using for loop
    for (i in numbers)
    {
        println("${i + 2}")
    }



}

fun indexArray()
{
    val numbers = arrayOf(1, 2, 3, 4, 5, 6)

    //Indexing
    println(numbers[2])

    //assign new value to item at specified index.
    numbers[0] = 6
    println(numbers[0])
}

fun objectArrays()
{
    val fruits = arrayOf(Fruit("Apple", 2.5), Fruit("Banana", 1.8), Fruit("Pear", 2.2))
    println(fruits.contentToString())

    //Loop through and access each index of array of Fruit Objects.
    for(i in fruits.indices)
    {
        println("${fruits[i].name} is in index $i")
    }

    //Display fruit names without using indices.
    for(fruit in fruits)
    {
        println("${fruit.name}")
    }
}

fun lists()
{
    val months = listOf("Jan", "Feb", "Mar", "Apr", "May")
    val anyTypes = listOf(1, 2, 3, "Monday", "Tuesday", true)

    println(anyTypes.size)

    for(month in months)
    {
        println(month)
    }

    //Convert months list to mutable list
    val additionalMonths = months.toMutableList()
    val newMonths = arrayOf("June", "July", "August")
    additionalMonths.addAll(newMonths)
    additionalMonths.add("September")
    println(additionalMonths)

    val days = mutableListOf<String>("Mon", "Tues", "Weds")
    days.add("Thu")
    println(days)
    days[2] = "Mittwoch"
    println(days)
    days.removeAt(2)
    println(days)
    val removeList = mutableListOf<String>("Mon", "Thu")
    days.removeAll(removeList)
    println(days)
}

fun sets()
{
    val fruits = setOf("Orange", "Apple", "Grape", "Apple")

    //Prints 3 because there are only 3 unique items in the set.
    println(fruits.size)
    println(fruits)
    println(fruits.toSortedSet())

}

fun maps()
{
    val daysOfTheWeek = mapOf(1 to "Monday", 2 to "Tuesday", 3 to "Wednesday")
    println(daysOfTheWeek[2])

    for(key in daysOfTheWeek.keys)
    {
        println("$key is to ${daysOfTheWeek[key]}")
    }
}

fun arrayLists()
{
    val arrayList = ArrayList<String>()
    arrayList.add("One")
    arrayList.add("Two")
    println(arrayList)

    //Print using for loop
    for(i in arrayList)
    {
        println(i)
    }

    //Print using while loop and iterator.
    val itr = arrayList.iterator()
    while(itr.hasNext())
    {
        println(itr.next())
    }

    //Print using get function
    println(arrayList.get(1))

    val doubleList = ArrayList<Double>()
    for(i in 1..5)
    {
        doubleList.add(i.toDouble())
    }

    var sum: Double = 0.0

    for(i in doubleList)
    {
        sum += i
    }

    var average: Double = 0.0
    average = sum / doubleList.size
    println(average)


}

data class Fruit(val name: String, val price: Double)
{

}