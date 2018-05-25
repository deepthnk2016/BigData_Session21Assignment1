/*******************************************/
/* Session 21 Assignment 1 - Count total number
   of blank lines using accumulators       */
/*******************************************/

//Create the sharable variable using accumulator
val blankLines=sc.accumulator(0,"blankLines")

//Read the inputfile
//Read each line and check its length, if 0 the increment the variable blankline
sc.textFile("/home/bigdata/deepak/docs/Acadgild/Session21Assignment1/inputfile.txt",4).foreach(line => if (line.length()==0)blankLines+=1)

//Print the total blank lines
println("Total Blank Lines = "+blankLines)


/* Contents of input file - 
Hi Deepak how are you
I am good

Today weather is going to be hot

It seems to be very hot

*/
//So, total number of blanklines = 2
