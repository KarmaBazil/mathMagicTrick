public class Math {
    public static void main(String[] args) {
        //create an int variable and assign any integer other than 0;
        int myNumber = 7593;
        int magicNumber = myNumber * myNumber;
        /*use the variables and compound assignment operators to create a mathematical magic trick. Any integer assigned to myNumber will return the integer 3 */

        magicNumber += myNumber;
        magicNumber /= myNumber;
        magicNumber += 17;
        magicNumber -= myNumber;
        magicNumber /= 6;

        System.out.println(magicNumber);




    }
}