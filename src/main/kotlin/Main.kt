fun main() {
    var pick = car("Eclipse cross","Mitsubishi","White",50)
    pick.carry(4)
    pick.identity()
    println(pick.calculateParkingFee(8))


    var bus =  Bus("Passart","VolksWagen","Black",20)
    println(bus.maxTripFare(35.0))

}

//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//- carry(people: Int) : Prints out “Carrying $people passengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//- identity() : Prints out the color, make and model in the following
//format e.g: “I am a white subaru legacy”
//- calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees and multiplying the hours by 20

class car(var make: String, var model: String, var color: String, var capacity: Int){
    fun carry(people:Int){
        var  stmt="Carrying$capacity people passengers"
        println(stmt)
        if(stmt.equals (capacity)){
            println("Carrying $capacity passengers")
        }else
            println("Over capacity by $people people")
        }

    fun identity(){
        println("I am a $color $make $model")

    }

    fun calculateParkingFee(hours:Int):Int{
        var park = hours*20
        return park
    }

    }
//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip. (2 points)
//The bus’ calculateParkingFees method returns the product of hours and
//the capacity of the bus

class Bus(var make: String, var model: String, var color: String, var capacity: Int) {

    fun maxTripFare(fare: Double): Double {
        var trip = fare * capacity
        return trip
    }


    fun calculateParkingFee(hours:Int):Int{
        var fee = hours *capacity
        return fee
    }

    
}
