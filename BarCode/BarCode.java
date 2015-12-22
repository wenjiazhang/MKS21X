public class BarCode implements Comparable{
    private String _zip;
    private int _checkDigit;
    private static final String[] symbol = {
	"||:::",
	":::||",
	"::|:|",
	"::||:",
	":|::|",
	":|:|:",
	":||::",
	"|:::|",
	"|::|:",
	"|:|::",
    };

    // constructors
    //precondtion: zip.length() = 5 and zip contains only digits.
    //postcondition: throws a runtime exception zip is not the correct length
    //               or zip contains a non digit
    //               _zip and _checkDigit are initialized.
    public BarCode(String zip) {
	if (zip.length()!=5){
	    throw new IllegalArgumentException();
	}
	for (int i=0;i<5;i++){
	    if (zip.charAt(i)<'0' || zip.charAt(i)>'9'){
		throw new IllegalArgumentException();
	    }
	}
	_zip = zip;
	_checkDigit = checkSum() % 10;
    }

    // postcondition: Creates a copy of a bar code.
    public BarCode(BarCode x){
	_zip = x._zip;
	_checkDigit = x._checkDigit;
    }


    //post: computes and returns the check sum for _zip
    private int checkSum(){
	int sum = 0;
	for (int i=0;i<5;i++){
	    sum += Integer.parseInt(_zip.substring(i,i+1));
	}
	return sum;
    }

    //postcondition: format zip + check digit + barcode 
    //ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
    public String toString(){
	String ans = "||";
	for (int i=0;i<5;i++){
	    ans += symbol[Integer.parseInt(_zip.substring(i,i+1))];
	}
	return ans + symbol[_checkDigit] + "||";
    }

    public boolean equals(Object other){
	if (this == other){
	    return true;
	}
	if (!(other instanceof BarCode) ||
	    !this._zip.equals(((BarCode)other)._zip)){
	    return false;
	}
	return true;
    }
    // postcondition: false if the object is not a BarCode, 
    // false if it is a non-matching barcode
    // true when they match.


    public int compareTo(Object other){
	return 0;
}
    // postcondition: compares the zip + checkdigit 

}
