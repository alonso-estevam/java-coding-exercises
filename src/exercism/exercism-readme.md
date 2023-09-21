# Exercism's exercises
This platform is great! 
There are language tracks with well structured road maps in order to help you keep track of your progress in learning the main concepts. There is a little explanation about the concept and then an exercise. After complete the exercise you can ask for feedback to a mentor, who will give you suggestions on how to improve your code. I really enjoyed the visual and features of this platform.


## Exercises:

### [Cook Your Lasagna](https://exercism.org/tracks/java/exercises/lasagna)
In this exercise I reviewed stuff like Java being a statically typed programming language, how to write and call a method, pass parameters to the method, modifiers (if it is public, private, for example), and some mathematical operators (sum [+] and multiply [*]).

I had to implement three methods envolving the minutes need to cook a lasagna:

✍ 1. Define the expected oven time in minutes

> "Define the `expectedMinutesInOven()` method that does not take any parameters and returns how many minutes the lasagna should be in the oven. According to the cooking book, the expected oven time in minutes is 40."
>
✅ Once the expected minutes in oven is a constant, I declared: 
`private static final int MINUTES_IN_OVEN = 40;`;

And in the method I just returned this constant. This is a safer and more readable code.

✍ 2. Calculate the remaining oven time in minutes

> "Define the `remainingMinutesInOven()` method that takes the actual minutes the lasagna has been in the oven as a parameter and returns how many minutes the lasagna still has to remain in the oven, based on the expected oven time in minutes from the previous task."
>
✅ This method needs to take a int parameter, and then subtract the value passed as argument from the constant `MINUTES_IN_OVEN`:
```
public int remainingMinutesInOven(int minutesPassed){
    return MINUTES_IN_OVEN - minutesPassed;
}
```

✍ 3. Calculate the preparation time in minutes

> "Define the preparationTimeInMinutes() method that takes the number of layers you added to the lasagna as a parameter and returns how many minutes you spent preparing the lasagna, assuming each layer takes you 2 minutes to prepare."
>
✅ For this method I also declared in beginning of the class a constant to avoid the "magic number":
`private static final int LASAGNA_LAYER_PREP_MINUTES = 2;`
Then I multiply the constant with the argument representing the number of layers:

```
public int preparationTimeInMinutes(int numberOfLayers){
    return numberOfLayers * LASAGNA_LAYER_PREP_MINUTES;
}
```

✍ 4. Calculate the total working time in minutes

>"Define `the totalTimeInMinutes()` method that takes two parameters: the first parameter is the number of layers you added to the lasagna, and the second parameter is the number of minutes the lasagna has been in the oven. The function should return how many minutes in total you've worked on cooking the lasagna, which is the sum of the preparation time in minutes, and the time in minutes the lasagna has spent in the oven at the moment."
>
✅ For this I reuse the `preparationTimeInMinutes()` method, passing on the received argument (number of layers) and adding it to the minutes in oven. It's way to DRY - don't repeat yourself.
```
public int totalTimeInMinutes(int numberOfLayers, int minutesInOven){
    return preparationTimeInMinutes(numberOfLayers) + minutesInOven;
}
```
