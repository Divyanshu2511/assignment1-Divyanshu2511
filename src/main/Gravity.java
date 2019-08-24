/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

// import java.util.Scanner;
// uncomment the above line to use input in your program.

import java.util.Scanner;

public class Gravity {

	public static void main(String[] args) {
		double time;
		double gravity = 9.8;
		double speed = 0;
		double distance, d;
		Scanner Keyboard = new Scanner(System.in);
		time = Keyboard.nextDouble();
		d = ( gravity * time * time );
		distance = ( ( .5 ) * d );
		speed = ( distance / time );
		System.out.println("The speed of the object at" + time + "seconds after its release is" + speed + "and the distance the object has travelled in the" + time + "seconds after the relase is" + distance);
	}
}