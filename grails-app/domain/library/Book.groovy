package library

class Book {

	String title
	String ibsn
	static belongsTo = [author: Author]

    static constraints = {
    	title blank: false, size: 5..150
    	ibsn blank:false, size: 10..13
    	author nullable: false
    }
    

    String toString(){
    	title
    }
}
